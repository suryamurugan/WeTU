package com.murugan.surya.wetu;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MechbranchmainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mebranch_main);

        ///////////////////////// THIRD SEM ECE ///////////////////////////////
        final Button me3 = (Button) findViewById(R.id.methirdbutton);
        me3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MechbranchmainActivity.this,me3rdsemActivity.class);
                startActivity(intent);
            }
        });
        //////////////////////////////////////////////////////////////////////////
        ///////////////////////// fourth SEM ECE ///////////////////////////////
        final Button me4 = (Button) findViewById(R.id.mefourthbutton);
        me4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent  intent = new Intent(MechbranchmainActivity.this,me4thsemActivity.class);
                startActivity(intent);
            }
        });
        //////////////////////////////////////////////////////////////////////////
        ///////////////////////// FIFTH SEM ECE ///////////////////////////////
        final Button me5 = (Button) findViewById(R.id.mefifthbutton);
        me5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent  intent = new Intent(MechbranchmainActivity.this,me5thsemActivity.class);
                startActivity(intent);
            }
        });
        //////////////////////////////////////////////////////////////////////////
        ///////////////////////// SIXTH SEM ECE ///////////////////////////////
        final Button me6 = (Button) findViewById(R.id.mesixthbutton);
        me6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent  intent = new Intent(MechbranchmainActivity.this,me6thsemActivity.class);
                startActivity(intent);
            }
        });
        //////////////////////////////////////////////////////////////////////////
        ///////////////////////// SEVENTH SEM ECE ///////////////////////////////
        final Button me7 = (Button) findViewById(R.id.meseventhbutton);
        me7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent  intent = new Intent(MechbranchmainActivity.this,me7thsemActivity.class);
                startActivity(intent);
            }
        });
        //////////////////////////////////////////////////////////////////////////
        ///////////////////////// EIGHT SEM ECE ///////////////////////////////
        final Button me8 = (Button) findViewById(R.id.meeigthbutton);
        me8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent  intent = new Intent(MechbranchmainActivity.this,me8thsemActivity.class);
                startActivity(intent);
            }
        });
        //////////////////////////////////////////////////////////////////////////








    }
}
