package com.murugan.surya.wetu;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class PhysicsmainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.physics_main);



        /////////////////STARTING OF PCYCLE BUTTON FUNCTIONS USED TO LOAD CUSTOM URL/HTML FILES////////////
        ///////////////////////////////startting of physics cycle bbutton thingy/////////////////////////////////////

        //////////////////////////mathbut ///////////////////////////////
        final Button pcycmaathBut = (Button) findViewById(R.id.mathButton);
        pcycmaathBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(PhysicsmainActivity.this,WebviewActivity.class);
                intent.putExtra("math1","file:///android_asset/pcycle/math1.html");
                PhysicsmainActivity.this.startActivity(intent);
            }
        });
        ////////////////////////////////////////////////////////////////////////


        //////////////////////////phybut ///////////////////////////////
        final Button phyBut = (Button) findViewById(R.id.physcisButton);
        phyBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (PhysicsmainActivity.this,WebviewActivity.class);
                intent.putExtra("phy","file:///android_asset/pcycle/phy.html");
                PhysicsmainActivity.this.startActivity(intent);
            }
        });
        ////////////////////////////////////////////////////////////////////////
        //////////////////////////civilbut ///////////////////////////////
        final Button civilBut = (Button) findViewById(R.id.civilButton);
        civilBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (PhysicsmainActivity.this,WebviewActivity.class);
                intent.putExtra("math1","file:///android_asset/pcycle/civil.html");
                PhysicsmainActivity.this.startActivity(intent);
            }
        });
        ////////////////////////////////////////////////////////////////////////

        //////////////////////////mechbut ///////////////////////////////
        final Button mechBut = (Button) findViewById(R.id.mechButton);
        mechBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (PhysicsmainActivity.this,WebviewActivity.class);
                intent.putExtra("mech","file:///android_asset/pcycle/mech.html");
                PhysicsmainActivity.this.startActivity(intent);
            }
        });
        ////////////////////////////////////////////////////////////////////////


        //////////////////////////elebut ///////////////////////////////
        final Button eleBut = (Button) findViewById(R.id.beleButton);
        eleBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (PhysicsmainActivity.this,WebviewActivity.class);
                intent.putExtra("ele","file:///android_asset/pcycle/electrical.html");
                PhysicsmainActivity.this.startActivity(intent);
            }
        });
        ////////////////////////////////////////////////////////////////////////
        //////////////////////////constbut ///////////////////////////////
        final Button constBut = (Button) findViewById(R.id.consButton);
        constBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (PhysicsmainActivity.this,WebviewActivity.class);
                intent.putExtra("const","file:///android_asset/pcycle/constution.html");
                PhysicsmainActivity.this.startActivity(intent);
            }
        });
        ////////////////////////////////////////////////////////////////////////

        //////////////////////////phylabbut ///////////////////////////////
        final Button phylabBut = (Button) findViewById(R.id.phylaButton);
        phylabBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (PhysicsmainActivity.this,WebviewActivity.class);
                intent.putExtra("phylab","file:///android_asset/pcycle/phylab.html");
                PhysicsmainActivity.this.startActivity(intent);
            }
        });
        ////////////////////////////////////////////////////////////////////////
        //////////////////////////wrkshopbut ///////////////////////////////
        final Button wrkshoplBut = (Button) findViewById(R.id.workButton);
        wrkshoplBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (PhysicsmainActivity.this,WebviewActivity.class);
                intent.putExtra("wrkshop","file:///android_asset/pcycle/workshop.html");
                PhysicsmainActivity.this.startActivity(intent);
            }
        });
        ////////////////////////////////////////////////////////////////////////

        //////////////////////////kanbut ///////////////////////////////
        final Button kanBut = (Button) findViewById(R.id.kannadaButton);
        kanBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (PhysicsmainActivity.this,WebviewActivity.class);
                intent.putExtra("kan","file:///android_asset/pcycle/kannada.html");
                PhysicsmainActivity.this.startActivity(intent);
            }
        });
        /////////////////////////////////////////////////////////////////////////////////////////////////









    }



        
}
