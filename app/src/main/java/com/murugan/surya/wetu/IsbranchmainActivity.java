package com.murugan.surya.wetu;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class IsbranchmainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.isbranch_main);


        ///////////////////////// THIRD SEM ECE ///////////////////////////////
        final Button is3 = (Button) findViewById(R.id.isthirdbutton);
        is3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(IsbranchmainActivity.this,is3rdsemActivity.class);
                startActivity(intent);
            }
        });
        //////////////////////////////////////////////////////////////////////////

        ///////////////////////// fourth SEM ECE ///////////////////////////////
        final Button is4 = (Button) findViewById(R.id.isfourthbutton);
        is4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent  intent = new Intent(IsbranchmainActivity.this,is4thsemActivity.class);
                startActivity(intent);
            }
        });
        //////////////////////////////////////////////////////////////////////////
        ///////////////////////// FIFTH SEM ECE ///////////////////////////////
        final Button is5 = (Button) findViewById(R.id.isfifthbutton);
        is5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent  intent = new Intent(IsbranchmainActivity.this,is5thsemActivity.class);
                startActivity(intent);
            }
        });
        //////////////////////////////////////////////////////////////////////////
        ///////////////////////// SIXTH SEM ECE ///////////////////////////////
        final Button is6 = (Button) findViewById(R.id.issixthbutton);
        is6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent  intent = new Intent(IsbranchmainActivity.this,is6thsemActivity.class);
                startActivity(intent);
            }
        });
        //////////////////////////////////////////////////////////////////////////
        ///////////////////////// SEVENTH SEM ECE ///////////////////////////////
        final Button is7 = (Button) findViewById(R.id.isseventhbutton);
        is7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent  intent = new Intent(IsbranchmainActivity.this,is7thsemActivity.class);
                startActivity(intent);
            }
        });
        //////////////////////////////////////////////////////////////////////////
        ///////////////////////// EIGHT SEM ECE ///////////////////////////////
        final Button is8 = (Button) findViewById(R.id.iseigthbutton);
        is8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent  intent = new Intent(IsbranchmainActivity.this,is8thsemActivity.class);
                startActivity(intent);
            }
        });
        //////////////////////////////////////////////////////////////////////////










    }
}
