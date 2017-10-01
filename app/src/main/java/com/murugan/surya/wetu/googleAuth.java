package com.murugan.surya.wetu;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.auth.api.Auth;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.GoogleSignInResult;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.SignInButton;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.GoogleAuthProvider;

public class googleAuth extends AppCompatActivity {


    private static final int RC_SIGN_IN =2;
    SignInButton button;

    ////////////// for mail

   private EditText editTextMail;
    private EditText editTextPassword;
    // ///////

    Button SignUpbutton;
    Button LogIn;

    FirebaseAuth mAuth;
    private GoogleApiClient mGoogleApiClient;

    FirebaseAuth.AuthStateListener mAuthListner;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_google_auth);

        //VIEWS
        final EditText editTextMail = (EditText)findViewById(R.id.editTextusername);
       final EditText editTextPassword = (EditText)findViewById(R.id.editText2password);
        SignUpbutton = (Button)findViewById(R.id.createaccount);
        LogIn = (Button)findViewById(R.id.login);

         SignUpbutton.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 String email = editTextMail.getText().toString().trim();
                 String password = editTextPassword.getText().toString().trim();

                 if (TextUtils.isEmpty(email)){

                     Toast.makeText(googleAuth.this, "Enter email address", Toast.LENGTH_SHORT).show();
                 }
                 if(TextUtils.isEmpty(password)){

                     Toast.makeText(googleAuth.this, "Enter password", Toast.LENGTH_SHORT).show();
                 }
                 if (password.length()<6 && password.length()>1){


                     Toast.makeText(googleAuth.this, "Password is too short", Toast.LENGTH_SHORT).show();

                 }

                 if (!email.isEmpty() && !password.isEmpty())
                 {

                     /////////////// Creating user
                     mAuth.createUserWithEmailAndPassword(email,password)
                             .addOnCompleteListener(googleAuth.this, new OnCompleteListener<AuthResult>() {
                                 @Override
                                 public void onComplete(@NonNull Task<AuthResult> task) {

                                     Toast.makeText(googleAuth.this, "createUserWithEmail:onComplete:" + task.isSuccessful(), Toast.LENGTH_SHORT).show();
                                     //progressBar.setVisibility(View.GONE);
                                     // If sign in fails, display a message to the user. If sign in succeeds
                                     // the auth state listener will be notified and logic to handle the
                                     // signed in user can be handled in the listener.
                                     if (!task.isSuccessful()) {
                                         Toast.makeText(googleAuth.this, "Authentication failed." + task.getException(),
                                                 Toast.LENGTH_SHORT).show();
                                     }

                                     else {
                             startActivity(new Intent(googleAuth.this, MainActivity.class));
                                                                finish();
                                                          }

                                 }
                             });





                 }





                 
                 
                 
             }
         });

        ///////////////// this is for login

        LogIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = editTextMail.getText().toString();
                final String password = editTextPassword.getText().toString();

                if (TextUtils.isEmpty(email)) {
                    Toast.makeText(getApplicationContext(), "Enter email address!", Toast.LENGTH_SHORT).show();
                    return;
                }

                if (TextUtils.isEmpty(password)) {
                    Toast.makeText(getApplicationContext(), "Enter password!", Toast.LENGTH_SHORT).show();
                    return;
                }

                //progressBar.setVisibility(View.VISIBLE);

                //authenticate user
                mAuth.signInWithEmailAndPassword(email, password)
                        .addOnCompleteListener(googleAuth.this, new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {
                                // If sign in fails, display a message to the user. If sign in succeeds
                                // the auth state listener will be notified and logic to handle the
                                // signed in user can be handled in the listener.
                               // progressBar.setVisibility(View.GONE);


                                if (!task.isSuccessful()) {
                                    // there was an error
                                    if (password.length() < 6) {
                                        Toast.makeText(googleAuth.this, "Password is too short", Toast.LENGTH_SHORT).show();
                                    } else {
                                        Toast.makeText(googleAuth.this, "Authentication failed.",Toast.LENGTH_SHORT).show();
                                    }
                                } else {
                                    Intent intent = new Intent(googleAuth.this, MainActivity.class);
                                    startActivity(intent);
                                    finish();
                                }
                            }
                        });
            }
        });














        /////////



        button = (SignInButton) findViewById(R.id.googlebtn);

        mAuth = FirebaseAuth.getInstance();

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                signIn();
            }
        });
        ///////////////////////////////////////////////
        // THIS IS FOR NEW USER CREATION


        /////////////////////////////////////////////////////

        mAuthListner = new FirebaseAuth.AuthStateListener() {
            @Override
            public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth) {

                if (firebaseAuth.getCurrentUser()!=null){


                    startActivity(new Intent(googleAuth.this,MainActivity.class));
                    finish();


                }

                /*else{

                    Log.d("TAG","signed out");

                }
                FirebaseUser user  =firebaseAuth.getCurrentUser();

                UpdateUI(user);

*/
            }
        };



        //////////////////////////////

        GoogleSignInOptions gso = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
                .requestIdToken(getString(R.string.default_web_client_id))
                .requestEmail()
                .build();

        mGoogleApiClient = new GoogleApiClient.Builder(this)
                .enableAutoManage(this /* FragmentActivity */, new GoogleApiClient.OnConnectionFailedListener() {
                    @Override
                    public void onConnectionFailed(@NonNull ConnectionResult connectionResult) {
                        Toast.makeText(googleAuth.this, "Something went wrong", Toast.LENGTH_SHORT).show();
                    }
                })
                .addApi(Auth.GOOGLE_SIGN_IN_API, gso)
                .build();



        //////////////




    }

  /*  public void createAccount(String email, String password){
        Log.d("TAG","createAccount:"+email);
        if(!validateForm()){

            return;
        }

       // mAuth.createUserWithEmailAndPassword(email,password).addOnCompleteListener(this,)

    }
*/
    @Override
    protected void onStart() {
        super.onStart();

        mAuth.addAuthStateListener(mAuthListner);
    }


/*
    @Override
    protected void onStop() {
        super.onStop();
        if (mAuthListner !=null)
            mAuth.removeAuthStateListener(mAuthListner);
    }

*/

    private void signIn() {
        Intent signInIntent = Auth.GoogleSignInApi.getSignInIntent(mGoogleApiClient);
        startActivityForResult(signInIntent, RC_SIGN_IN);
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        // Result returned from launching the Intent from GoogleSignInApi.getSignInIntent(...);
        if (requestCode == RC_SIGN_IN) {
            GoogleSignInResult result = Auth.GoogleSignInApi.getSignInResultFromIntent(data);
            if (result.isSuccess()) {
                // Google Sign In was successful, authenticate with Firebase
                GoogleSignInAccount account = result.getSignInAccount();
                firebaseAuthWithGoogle(account);
            } else {
                // Google Sign In failed, update UI appropriately
                // ...

                Toast.makeText(this, "Dude !! Sign in to continue", Toast.LENGTH_SHORT).show();
            }
        }
    }

    private void firebaseAuthWithGoogle(GoogleSignInAccount account) {


        AuthCredential credential = GoogleAuthProvider.getCredential(account.getIdToken(), null);
        mAuth.signInWithCredential(credential)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            // Sign in success, update UI with the signed-in user's information
                            Log.d("TAG", "signInWithCredential:success");
                            Toast.makeText(googleAuth.this, "Sign in Successful !", Toast.LENGTH_SHORT).show();
                            FirebaseUser user = mAuth.getCurrentUser();
                           // updateUI(user);
                        } else {
                            // If sign in fails, display a message to the user.
                            Log.w("TAG", "signInWithCredential:failure", task.getException());
                            Toast.makeText(googleAuth.this, "Please check your internet connection",
                                    Toast.LENGTH_SHORT).show();
                            //updateUI(null);
                        }

                        // ...
                    }
                });

    }



}
