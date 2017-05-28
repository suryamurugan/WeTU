package com.murugan.surya.wetu;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class EcebranchmainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ecebranch_main);


        ///////////////////////// THIRD SEM ECE ///////////////////////////////
        final Button ece3 = (Button) findViewById(R.id.ecethirdbutton);
        ece3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(EcebranchmainActivity.this,ece3rdsemActivity.class);
                startActivity(intent);
            }
        });
        //////////////////////////////////////////////////////////////////////////
        ///////////////////////// fourth SEM ECE ///////////////////////////////
        final Button ece4 = (Button) findViewById(R.id.ecefourthbutton);
        ece4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent  intent = new Intent(EcebranchmainActivity.this,ece4thsemActivity.class);
                startActivity(intent);
            }
        });
        //////////////////////////////////////////////////////////////////////////
        ///////////////////////// FIFTH SEM ECE ///////////////////////////////
        final Button ece5 = (Button) findViewById(R.id.ecefifthbutton);
        ece5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent  intent = new Intent(EcebranchmainActivity.this,ece5thsemActivity.class);
                startActivity(intent);
            }
        });
        //////////////////////////////////////////////////////////////////////////
        ///////////////////////// SIXTH SEM ECE ///////////////////////////////
        final Button ece6 = (Button) findViewById(R.id.ecesixthbutton);
        ece6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent  intent = new Intent(EcebranchmainActivity.this,ece6thsemActivity.class);
                startActivity(intent);
            }
        });
        //////////////////////////////////////////////////////////////////////////
        ///////////////////////// SEVENTH SEM ECE ///////////////////////////////
        final Button ece7 = (Button) findViewById(R.id.eceseventhbutton);
        ece7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent  intent = new Intent(EcebranchmainActivity.this,ece7thsemActivity.class);
                startActivity(intent);
            }
        });
        //////////////////////////////////////////////////////////////////////////
        ///////////////////////// EIGHT SEM ECE ///////////////////////////////
        final Button ece8 = (Button) findViewById(R.id.eceeigthbutton);
        ece8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent  intent = new Intent(EcebranchmainActivity.this,ece8thsemActivity.class);
                startActivity(intent);
            }
        });
        //////////////////////////////////////////////////////////////////////////




    }
}
