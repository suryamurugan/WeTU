package com.murugan.surya.wetu;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by surya on 21/5/17.
 */

public class QuestionsActivity extends Fragment {



    static final Integer WRITE_EXST = 0x1;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.questions_layout, container, false);


        //////////////////////////vtu official site///////////////////////////////
        final Button vtuofficialsiteBut = (Button) rootView.findViewById(R.id.qpvtuofficial);
        vtuofficialsiteBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                askForPermission(android.Manifest.permission.WRITE_EXTERNAL_STORAGE,WRITE_EXST); ////ASKING FOR PERMISSION CALLING ASKFOR PERMISSION FUN

                Intent intent = new Intent(getActivity(),WebviewforquestionsActivity.class);
                intent.putExtra("vtuofficialsite","http://vtu.ac.in/model-question-paper");
                 QuestionsActivity.this.startActivity(intent);
                //Toast.makeText(getContext(), "Please provide storage access to download question papers",
                     //   Toast.LENGTH_LONG).show();
            }
        });
        ////////////////////////////////////////////////////////////////////////



        //////////////////////////vturesourcebut ///////////////////////////////
        final Button qpvturesourceBut = (Button) rootView.findViewById(R.id.qpvtures);
        qpvturesourceBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                askForPermission(android.Manifest.permission.WRITE_EXTERNAL_STORAGE,WRITE_EXST); ////ASKING FOR PERMISSION CALLING ASKFOR PERMISSION FUN

                Intent intent = new Intent (getActivity(),WebviewforquestionsActivity.class);
                intent.putExtra("vturesource","http://www.vturesource.com/vtu-question-papers/");
                QuestionsActivity.this.startActivity(intent);
               // Toast.makeText(getContext(), "Please provide storage access to download question papers",
                   //     Toast.LENGTH_LONG).show();
            }
        });
        ////////////////////////////////////////////////////////////////////////


        //////////////////////////vtubuddybut ///////////////////////////////
        final Button vtubuddyBut = (Button) rootView.findViewById(R.id.qpvtubud);
        vtubuddyBut.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                askForPermission(android.Manifest.permission.WRITE_EXTERNAL_STORAGE,WRITE_EXST); ////ASKING FOR PERMISSION CALLING ASKFOR PERMISSION FUN

                Intent intent = new Intent (getActivity(),WebviewforquestionsActivity.class);
                intent.putExtra("vtubuddy","http://www.vtubuddy.com/vtu-question-papers/");
                QuestionsActivity.this.startActivity(intent);
             //   Toast.makeText(getContext(), "Please provide storage access to download question papers",
                       // Toast.LENGTH_LONG).show();
            }
        });
        ////////////////////////////////////////////////////////////////////////



        //////////////////////////stupidsidbut ///////////////////////////////
        final Button stupidsidBut = (Button) rootView.findViewById(R.id.qpsid);
        stupidsidBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                askForPermission(android.Manifest.permission.WRITE_EXTERNAL_STORAGE,WRITE_EXST); ////ASKING FOR PERMISSION CALLING ASKFOR PERMISSION FUN

                Intent intent = new Intent (getActivity(),WebviewforquestionsActivity.class);
                intent.putExtra("stupidsid","http://www.stupidsid.com/study-resources/documents/university-papers");
                QuestionsActivity.this.startActivity(intent);
                //Toast.makeText(getContext(), "Please provide storage access to download question papers",
                     //   Toast.LENGTH_LONG).show();
            }
        });
        ////////////////////////////////////////////////////////////////////////

        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        return rootView;





    }



    
 ///////////////////////////?FUNCTIONS FOR RUNTIME PERMISSIONS
 /////////////////////////////////////
 private void askForPermission(String permission, Integer requestCode) {
     if (ContextCompat.checkSelfPermission(getActivity(), permission) != PackageManager.PERMISSION_GRANTED) {

         // Should we show an explanation?
         if (ActivityCompat.shouldShowRequestPermissionRationale(getActivity(), permission)) {

             //This is called if user has denied the permission before
             //In this case I am just asking the permission again
             ActivityCompat.requestPermissions(getActivity(), new String[]{permission}, requestCode);

         } else {

             ActivityCompat.requestPermissions(getActivity(), new String[]{permission}, requestCode);
         }
     } else {
         Toast.makeText(getContext(), "" + permission + " is already granted.", Toast.LENGTH_SHORT).show();
     }
 }
    //////////////////////////////
    @Override
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if(ActivityCompat.checkSelfPermission(getContext(), permissions[0]) == PackageManager.PERMISSION_GRANTED){
            Toast.makeText(getContext(), "Permission granted", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(getContext(), "Permission denied", Toast.LENGTH_SHORT).show();
        }
    }

    //////////////////////////////////////

    ////////////////////////////////////////////////////////////


}


