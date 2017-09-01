package com.murugan.surya.wetu;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class QuestionPapersLibraryActivity extends AppCompatActivity {


    static final Integer WRITE_EXST = 0x1; /// requirement unknown may be for runtime permisson

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_papers_library);

        //////////////////////// Content of layout Button TO WEBPAGES /////////////////////////
        //////////////////////////vtu official site///////////////////////////////
        final Button vtuofficialsiteBut = (Button) findViewById(R.id.qpvtuofficial);
        vtuofficialsiteBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                askForPermission(android.Manifest.permission.WRITE_EXTERNAL_STORAGE,WRITE_EXST); ////ASKING FOR PERMISSION CALLING ASKFOR PERMISSION FUN

                Intent intent = new Intent(QuestionPapersLibraryActivity.this,WebviewforquestionsActivity.class);
                intent.putExtra("vtuofficialsite","http://vtu.ac.in/model-question-paper");
                QuestionPapersLibraryActivity.this.startActivity(intent);
                //Toast.makeText(getContext(), "Please provide storage access to download question papers",
                //   Toast.LENGTH_LONG).show();
            }
        });
        ////////////////////////////////////////////////////////////////////////



        //////////////////////////vturesourcebut ///////////////////////////////
        final Button qpvturesourceBut = (Button) findViewById(R.id.qpvtures);
        qpvturesourceBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                askForPermission(android.Manifest.permission.WRITE_EXTERNAL_STORAGE,WRITE_EXST); ////ASKING FOR PERMISSION CALLING ASKFOR PERMISSION FUN

                Intent intent = new Intent (QuestionPapersLibraryActivity.this,WebviewforquestionsActivity.class);
                intent.putExtra("vturesource","http://www.vturesource.com/vtu-question-papers/");
                QuestionPapersLibraryActivity.this.startActivity(intent);
                // Toast.makeText(getContext(), "Please provide storage access to download question papers",
                //     Toast.LENGTH_LONG).show();
            }
        });
        ////////////////////////////////////////////////////////////////////////


        //////////////////////////vtubuddybut ///////////////////////////////
        final Button vtubuddyBut = (Button) findViewById(R.id.qpvtubud);
        vtubuddyBut.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                askForPermission(android.Manifest.permission.WRITE_EXTERNAL_STORAGE,WRITE_EXST); ////ASKING FOR PERMISSION CALLING ASKFOR PERMISSION FUN

                Intent intent = new Intent (QuestionPapersLibraryActivity.this,WebviewforquestionsActivity.class);
                intent.putExtra("vtubuddy","http://www.vtubuddy.com/vtu-question-papers/");
                QuestionPapersLibraryActivity.this.startActivity(intent);
                //   Toast.makeText(getContext(), "Please provide storage access to download question papers",
                // Toast.LENGTH_LONG).show();
            }
        });
        ////////////////////////////////////////////////////////////////////////



        //////////////////////////stupidsidbut ///////////////////////////////
        final Button stupidsidBut = (Button) findViewById(R.id.qpsid);
        stupidsidBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                askForPermission(android.Manifest.permission.WRITE_EXTERNAL_STORAGE,WRITE_EXST); ////ASKING FOR PERMISSION CALLING ASKFOR PERMISSION FUN

                Intent intent = new Intent (QuestionPapersLibraryActivity.this,WebviewforquestionsActivity.class);
                intent.putExtra("stupidsid","http://www.stupidsid.com/study-resources/documents/university-papers");
                QuestionPapersLibraryActivity.this.startActivity(intent);
                //Toast.makeText(getContext(), "Please provide storage access to download question papers",
                //   Toast.LENGTH_LONG).show();
            }
        });
        ////////////////////////////////////////////////////////////////////////














        ///////////////////////////////////////////////////////////////////////////////////////


    }


//////////////////////// THIS IS FOR RUN TIME PERMISSIONS ?////////////////////////////////

    ///////////////////////////?FUNCTIONS FOR RUNTIME PERMISSIONS
    /////////////////////////////////////
    private void askForPermission(String permission, Integer requestCode) {
        if (ContextCompat.checkSelfPermission(QuestionPapersLibraryActivity.this, permission) != PackageManager.PERMISSION_GRANTED) {

            // Should we show an explanation?
            if (ActivityCompat.shouldShowRequestPermissionRationale(QuestionPapersLibraryActivity.this, permission)) {

                //This is called if user has denied the permission before
                //In this case I am just asking the permission again
                ActivityCompat.requestPermissions(QuestionPapersLibraryActivity.this, new String[]{permission}, requestCode);

            } else {

                ActivityCompat.requestPermissions(QuestionPapersLibraryActivity.this, new String[]{permission}, requestCode);
            }
        } else {
            Toast.makeText(QuestionPapersLibraryActivity.this, "" + permission + " is already granted.", Toast.LENGTH_SHORT).show();
        }
    }
    //////////////////////////////
    @Override
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if(ActivityCompat.checkSelfPermission(QuestionPapersLibraryActivity.this, permissions[0]) == PackageManager.PERMISSION_GRANTED){
            Toast.makeText(QuestionPapersLibraryActivity.this, "Permission granted", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(QuestionPapersLibraryActivity.this, "Permission denied", Toast.LENGTH_SHORT).show();
        }
    }

    //////////////////////////////////////

    ////////////////////////////////////////////////////////////
    //////////////////////////////////////////////////////////////////////////////////////



}
