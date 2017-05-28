package com.murugan.surya.wetu;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class CvbranchmainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cvbranch_main);


        ///////////////////////// THIRD SEM ECE ///////////////////////////////
        final Button cv3 = (Button) findViewById(R.id.cvthirdbutton);
        cv3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(CvbranchmainActivity.this,cv3rdsemActivity.class);
                startActivity(intent);
            }
        });
        //////////////////////////////////////////////////////////////////////////
        ///////////////////////// fourth SEM ECE ///////////////////////////////
        final Button cv4 = (Button) findViewById(R.id.cvfourthbutton);
        cv4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent  intent = new Intent(CvbranchmainActivity.this,cv4thsemActivity.class);
                startActivity(intent);
            }
        });
        //////////////////////////////////////////////////////////////////////////
        ///////////////////////// FIFTH SEM ECE ///////////////////////////////
        final Button cv5 = (Button) findViewById(R.id.cvfifthbutton);
        cv5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent  intent = new Intent(CvbranchmainActivity.this,cv5thsemActivity.class);
                startActivity(intent);
            }
        });
        //////////////////////////////////////////////////////////////////////////
        ///////////////////////// SIXTH SEM ECE ///////////////////////////////
        final Button cv6 = (Button) findViewById(R.id.cvsixthbutton);
        cv6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent  intent = new Intent(CvbranchmainActivity.this,cv6thsemActivity.class);
                startActivity(intent);
            }
        });
        //////////////////////////////////////////////////////////////////////////
        ///////////////////////// SEVENTH SEM ECE ///////////////////////////////
        final Button cv7 = (Button) findViewById(R.id.cvseventhbutton);
        cv7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent  intent = new Intent(CvbranchmainActivity.this,cv7thsemActivity.class);
                startActivity(intent);
            }
        });
        //////////////////////////////////////////////////////////////////////////
        ///////////////////////// EIGHT SEM ECE ///////////////////////////////
        final Button cv8 = (Button) findViewById(R.id.cveigthbutton);
        cv8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent  intent = new Intent(CvbranchmainActivity.this,cv8thsemActivity.class);
                startActivity(intent);
            }
        });
        //////////////////////////////////////////////////////////////////////////
    }
}
