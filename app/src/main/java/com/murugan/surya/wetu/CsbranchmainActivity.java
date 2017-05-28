package com.murugan.surya.wetu;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class CsbranchmainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.csbranch_main);
        ///////////////////////// THIRD SEM ECE ///////////////////////////////
        final Button cs3 = (Button) findViewById(R.id.thirdbutton);
        cs3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(CsbranchmainActivity.this,cs3rdsemActivity.class);
                startActivity(intent);
            }
        });
        //////////////////////////////////////////////////////////////////////////
        ///////////////////////// fourth SEM ECE ///////////////////////////////
        final Button cs4 = (Button) findViewById(R.id.fourthbutton);
        cs4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent  intent = new Intent(CsbranchmainActivity.this,cs4thsemActivity.class);
                startActivity(intent);
            }
        });
        //////////////////////////////////////////////////////////////////////////
        ///////////////////////// FIFTH SEM ECE ///////////////////////////////
        final Button cs5 = (Button) findViewById(R.id.fifthbutton);
        cs5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent  intent = new Intent(CsbranchmainActivity.this,cs5thsemActivity.class);
                startActivity(intent);
            }
        });
        //////////////////////////////////////////////////////////////////////////
        ///////////////////////// SIXTH SEM ECE ///////////////////////////////
        final Button cs6 = (Button) findViewById(R.id.sixthbutton);
        cs6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent  intent = new Intent(CsbranchmainActivity.this,cs6thsemActivity.class);
                startActivity(intent);
            }
        });
        //////////////////////////////////////////////////////////////////////////
        ///////////////////////// SEVENTH SEM ECE ///////////////////////////////
        final Button cs7 = (Button) findViewById(R.id.seventhbutton);
        cs7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent  intent = new Intent(CsbranchmainActivity.this,cs7thsemActivity.class);
                startActivity(intent);
            }
        });
        //////////////////////////////////////////////////////////////////////////
        ///////////////////////// EIGHT SEM ECE ///////////////////////////////
        final Button cs8 = (Button) findViewById(R.id.eigthbutton);
        cs8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent  intent = new Intent(CsbranchmainActivity.this,cs8thsemActivity.class);
                startActivity(intent);
            }
        });
        //////////////////////////////////////////////////////////////////////////
    }
}
