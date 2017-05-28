package com.murugan.surya.wetu;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class ece3rdsemActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ece3rdsem);

        //////////////////////STARTING OF third sem  BUTTON FUNCTIONS USED TO LOAD CUSTOM URL/HTML FILES//////////////////////
        ///////////////////////// ANALOG ELECTROONICS BUTTON -1///////////////////////////////
        final Button analogeleBut = (Button) findViewById(R.id.analogecbutton);
        analogeleBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (ece3rdsemActivity.this,WebviewActivity.class);

                intent.putExtra("ece-3rdsem-analogelectronics","file:///android_asset/ece/3analog_ele.html");
                ece3rdsemActivity.this.startActivity(intent);
            }
        });
        ////////////////////////////////////////////////////////////////////////
        ///////////////////////// DIGITAL ELECTROONICS BUTTON -2///////////////////////////////
        final Button digitaleleBut = (Button) findViewById(R.id.digitalecbutton);
        digitaleleBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (ece3rdsemActivity.this,WebviewActivity.class);

                intent.putExtra("ece-3rdsem-digitalelectronics","file:///android_asset/ece/3digitale.html");
                ece3rdsemActivity.this.startActivity(intent);
            }
        });
        ////////////////////////////////////////////////////////////////////////
        ///////////////////////// NETWORK ANALYSIS BUTTON -3///////////////////////////////
        final Button netanaBut = (Button) findViewById(R.id.networkanabutton);
        netanaBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (ece3rdsemActivity.this,WebviewActivity.class);

                intent.putExtra("ece-3rdsem-networkanalysis","file:///android_asset/ece/3networkana.html");
                ece3rdsemActivity.this.startActivity(intent);
            }
        });
        ////////////////////////////////////////////////////////////////////////
        ///////////////////////// ELECTRONICS INSRUMENTATION - BUTTON 4///////////////////////////////
        final Button electronicsinstruBut = (Button) findViewById(R.id.eceinstrubutton);
        electronicsinstruBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (ece3rdsemActivity.this,WebviewActivity.class);

                intent.putExtra("ece-3rdsem-electronicsinstru","file:///android_asset/ece/3elecinstru.html");
                ece3rdsemActivity.this.startActivity(intent);
            }
        });
        ////////////////////////////////////////////////////////////////////////
        ///////////////////////// ENGINEERING ELECTROMAGNETS - BUTTON 5///////////////////////////////
        final Button engineeringemagsBut = (Button) findViewById(R.id.engecemagbutton);
        engineeringemagsBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (ece3rdsemActivity.this,WebviewActivity.class);

                intent.putExtra("ece-3rdsem-engineeringelemag","file:///android_asset/ece/3electromag.html");
                ece3rdsemActivity.this.startActivity(intent);
            }
        });
        ////////////////////////////////////////////////////////////////////////
        /////////////////////////ANALOG ELCTRONICS LAB - BUTTON 6///////////////////////////////
        final Button analogelelabBut = (Button) findViewById(R.id.anaglogecelabbutton);
        analogelelabBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (ece3rdsemActivity.this,WebviewActivity.class);

                intent.putExtra("ece-3rdsem-analogelectronicslab","file:///android_asset/ece/3analoglab.html");
                ece3rdsemActivity.this.startActivity(intent);
            }
        });
        ////////////////////////////////////////////////////////////////////////
        /////////////////////////DIGITAL ELECTRONICS LAB BUTTON -7////////////////////////////////
        final Button digitalelelabBut = (Button) findViewById(R.id.digitaleclabbutton);
        digitalelelabBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (ece3rdsemActivity.this,WebviewActivity.class);

                intent.putExtra("ece-3rdsem-digitalelectronicslab","file:///android_asset/ece/3digielectrlabo.html");
                ece3rdsemActivity.this.startActivity(intent);
            }
        });
        ////////////////////////////////////////////////////////////////////////
        ///////////////////////// ENGINEERING MATHEMATICS BUTTON -8///////////////////////////////
        final Button engmath3But = (Button) findViewById(R.id.engmaths3button);
        engmath3But.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (ece3rdsemActivity.this,WebviewActivity.class);

                intent.putExtra("ece-3rdsem-engineeringmaths3","file:///android_asset/ece/3engmath3.html");
                ece3rdsemActivity.this.startActivity(intent);
            }
        });
        ////////////////////////////////////////////////////////////////////////



    }
}
