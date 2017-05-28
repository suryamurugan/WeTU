package com.murugan.surya.wetu;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class ChemistrymainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chemistry_main);

        /////////////////STARTING OF CCYCLE BUTTON FUNCTIONS USED TO LOAD CUSTOM URL/HTML FILES//////////////////////
        //////////////////////////math2but ///////////////////////////////
        final Button math2But = (Button) findViewById(R.id.math2Button);
        math2But.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (ChemistrymainActivity.this,WebviewActivity.class);

                intent.putExtra("math2","file:///android_asset/ccycle/maths2.html");
                ChemistrymainActivity.this.startActivity(intent);
            }
        });
        ////////////////////////////////////////////////////////////////////////


        //////////////////////////chembut ///////////////////////////////
        final Button chemBut = (Button) findViewById(R.id.chemButton);
        chemBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (ChemistrymainActivity.this,WebviewActivity.class);
                intent.putExtra("chem","file:///android_asset/ccycle/chemistry1.html");
                ChemistrymainActivity.this.startActivity(intent);
            }
        });
        ////////////////////////////////////////////////////////////////////////


        //////////////////////////pcdut ///////////////////////////////
        final Button pcdBut = (Button) findViewById(R.id.pcdButton);
        pcdBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (ChemistrymainActivity.this,WebviewActivity.class);
                intent.putExtra("pcd","file:///android_asset/ccycle/pcd.html");
                ChemistrymainActivity.this.startActivity(intent);
            }
        });
        ////////////////////////////////////////////////////////////////////////


        //////////////////////////belelectrobut ///////////////////////////////
        final Button belectroBut = (Button) findViewById(R.id.belectrButton);
        belectroBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (ChemistrymainActivity.this,WebviewActivity.class);
                intent.putExtra("belectro","file:///android_asset/ccycle/belect.html");
                ChemistrymainActivity.this.startActivity(intent);
            }
        });
        ////////////////////////////////////////////////////////////////////////

        //////////////////////////caedbut ///////////////////////////////
        final Button caedBut = (Button) findViewById(R.id.caedButton);
        caedBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (ChemistrymainActivity.this,WebviewActivity.class);
                intent.putExtra("caed","file:///android_asset/ccycle/caed.html");
                ChemistrymainActivity.this.startActivity(intent);
            }
        });
        ////////////////////////////////////////////////////////////////////////
        //////////////////////////envbut ///////////////////////////////
        final Button envbut = (Button) findViewById(R.id.envButton);
        envbut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (ChemistrymainActivity.this,WebviewActivity.class);
                intent.putExtra("env","file:///android_asset/ccycle/env.html");
                ChemistrymainActivity.this.startActivity(intent);
            }
        });
        ////////////////////////////////////////////////////////////////////////
        //////////////////////////chemlabbut ///////////////////////////////
        final Button chemlabbut = (Button) findViewById(R.id.chemlaButton);
        chemlabbut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (ChemistrymainActivity.this,WebviewActivity.class);
                intent.putExtra("chemlab","file:///android_asset/ccycle/chemlab.html");
                ChemistrymainActivity.this.startActivity(intent);
            }
        });
        ////////////////////////////////////////////////////////////////////////
        //////////////////////////pcdlabbut ///////////////////////////////
        final Button pcdlabBut = (Button) findViewById(R.id.complabButton);
        pcdlabBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (ChemistrymainActivity.this,WebviewActivity.class);
                intent.putExtra("pcdlab","file:///android_asset/ccycle/pcdlab.html");
                ChemistrymainActivity.this.startActivity(intent);
            }
        });
        ////////////////////////////////////////////////////////////////////////
        //////////////////////////functionalbut ///////////////////////////////
        final Button functionalBut = (Button) findViewById(R.id.engButton);
        functionalBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (ChemistrymainActivity.this,WebviewActivity.class);
                intent.putExtra("eng","file:///android_asset/pcycle/workshop.html");
                ChemistrymainActivity.this.startActivity(intent);
            }
        });
/////////////////////////////////////////////////////////////////////////////////////.//////////////////////////////


    }
}
