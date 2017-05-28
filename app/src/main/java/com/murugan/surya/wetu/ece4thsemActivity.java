package com.murugan.surya.wetu;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class ece4thsemActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ece4thsem);
        //////////////////////STARTING OF fourth sem  BUTTON FUNCTIONS USED TO LOAD CUSTOM URL/HTML FILES//////////////////////
        ///////////////////////// MICROCONTROLLERS BUTTON -1///////////////////////////////
        final Button mcuBut = (Button) findViewById(R.id.mcubutton);
        mcuBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (ece4thsemActivity.this,WebviewActivity.class);

                intent.putExtra("ece-4thsem-mcu","file:///android_asset/ece/4MCU.html");
                ece4thsemActivity.this.startActivity(intent);
            }
        });
        ////////////////////////////////////////////////////////////////////////
        /////////////////////////  CONTROL SYSTEMS BUTTON -2///////////////////////////////
        final Button contsysBut = (Button) findViewById(R.id.consysbutton);
        contsysBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (ece4thsemActivity.this,WebviewActivity.class);

                intent.putExtra("ece-4thsem-controlsystems","file:///android_asset/ece/4CONTROLSYS.html");
                ece4thsemActivity.this.startActivity(intent);
            }
        });
        ////////////////////////////////////////////////////////////////////////
        ///////////////////////// SIGNALS AND SYSTEMS BUTTON -3///////////////////////////////
        final Button sigsysBut = (Button) findViewById(R.id.signsysbutton);
        sigsysBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (ece4thsemActivity.this,WebviewActivity.class);

                intent.putExtra("ece-4thsem-signalandsystems","file:///android_asset/ece/4signsys.html");
                ece4thsemActivity.this.startActivity(intent);
            }
        });
        ////////////////////////////////////////////////////////////////////////
        ///////////////////////// FUNDAMENTALS OF HDL -4///////////////////////////////
        final Button funhdlBut = (Button) findViewById(R.id.funhdlbutton);
        funhdlBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (ece4thsemActivity.this,WebviewActivity.class);

                intent.putExtra("ece-4thsem-funofhdl","file:///android_asset/ece/4FUNOFHDL.html");
                ece4thsemActivity.this.startActivity(intent);
            }
        });
        ////////////////////////////////////////////////////////////////////////
        ///////////////////////// LINEAR ICS AND APPS BUTTON -5///////////////////////////////
        final Button linicBut = (Button) findViewById(R.id.linicappsbutton);
        linicBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (ece4thsemActivity.this,WebviewActivity.class);

                intent.putExtra("ece-4thsem-linearicsandapps","file:///android_asset/ece/4linearicapp.html");
                ece4thsemActivity.this.startActivity(intent);
            }
        });
        ////////////////////////////////////////////////////////////////////////
        ///////////////////////// MICROCONTROLLERS LAB BUTTON -6///////////////////////////////
        final Button mculabBut = (Button) findViewById(R.id.mculabbutton);
        mculabBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (ece4thsemActivity.this,WebviewActivity.class);

                intent.putExtra("ece-4thsem-mculab","file:///android_asset/ece/4mculab.html");
                ece4thsemActivity.this.startActivity(intent);
            }
        });
        ////////////////////////////////////////////////////////////////////////
        ///////////////////////// HDL LAB BUTTON -7///////////////////////////////
        final Button hdllabBut = (Button) findViewById(R.id.hdllabbutton);
        hdllabBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (ece4thsemActivity.this,WebviewActivity.class);

                intent.putExtra("ece-4thsem-hdllab","file:///android_asset/ece/4HDLLAB.html");
                ece4thsemActivity.this.startActivity(intent);
            }
        });
        ////////////////////////////////////////////////////////////////////////
        /// ///////////////////////// ENGINEERING MATHS4  BUTTON -8///////////////////////////////
        final Button engmath4But = (Button) findViewById(R.id.engmaths4button);
        engmath4But.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (ece4thsemActivity.this,WebviewActivity.class);

                intent.putExtra("ece-4thsem-engineeringmaths4","file:///android_asset/ece/4engmath4.html");
                ece4thsemActivity.this.startActivity(intent);
            }
        });
        ////////////////////////////////////////////////////////////////////////
        /// ///////////////////////// ADVANCE MATHS 2 BUTTON -9///////////////////////////////
        final Button advmath2But = (Button) findViewById(R.id.advanmath2button);
        advmath2But.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (ece4thsemActivity.this,WebviewActivity.class);

                intent.putExtra("ece-4thsem-advancemaths2","file:///android_asset/ece/4advmath2.html");
                ece4thsemActivity.this.startActivity(intent);
            }
        });
        ////////////////////////////////////////////////////////////////////////



    }
}
