package com.murugan.surya.wetu;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class cv3rdsemActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cv3rdsem);

        /////////////////////////////// cvengineeringmathematics3 BUTTON- 1 ///////////////////////////////
        final Button cvengineeringmath3But = (Button) findViewById(R.id.cvengineeringmaths3button);
        cvengineeringmath3But.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(cv3rdsemActivity.this,WebviewActivity.class);
                intent.putExtra("cv-3rdsem-cvengineeringmath3","file:///android_asset/cv/3rdcvengineeringmathematics3.html");
                cv3rdsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////
/////////////////////////////// cvstrengthofmaterials BUTTON- 2 ///////////////////////////////
        final Button cvstrengthofmatbuttonbut = (Button) findViewById(R.id.cvstrengthofmatbutton);
        cvstrengthofmatbuttonbut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (cv3rdsemActivity.this,WebviewActivity.class);
                intent.putExtra("3rdcvstrengthofmaterials.html","file:///android_asset/cv/3rdcvstrengthofmaterials.html");
                cv3rdsemActivity.this.startActivity(intent);
            }
        });
//////////////////////////////////////////////////////////////////////// /////////////////////////////cvfluidmechanics BUTTON- 3 ///////////////////////////////
        final Button cvfluidmechbuttonbut = (Button) findViewById(R.id.cvfluidmechbutton);
        cvfluidmechbuttonbut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (cv3rdsemActivity.this,WebviewActivity.class);
                intent.putExtra("cv-3rdsem-cvfluidmech","file:///android_asset/cv/3rdcvfluidmechanics.html");
                cv3rdsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////
/////////////////////////////// cvbasicsurveying BUTTON- 4 ///////////////////////////////
        final Button cvbasicsurbuttonbut = (Button) findViewById(R.id.cvbasicsurbutton);
        cvbasicsurbuttonbut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (cv3rdsemActivity.this,WebviewActivity.class);
                intent.putExtra("cv-3rdsem-cvbasicsurvey","file:///android_asset/cv/3rdcvbasicsurveying.html");
                cv3rdsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////
/////////////////////////////// cvengineeringgeology BUTTON- 5 ///////////////////////////////
        final Button cvengineeringgeobuttonbut = (Button) findViewById(R.id.cvengineeringgeobutton);
        cvengineeringgeobuttonbut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (cv3rdsemActivity.this,WebviewActivity.class);
                intent.putExtra("cv-3rdsem-cvengineeringgeo","file:///android_asset/cv/3rdcvengineeringgeology.html");
                cv3rdsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////

/////////////////////////////// cvbuildingmaterialsandconstruction BUTTON- 6 ///////////////////////////////
        final Button cvbuildingmaterialsandconsbuttonbut = (Button) findViewById(R.id.cvbuildingmaterialsandconsbutton);
        cvbuildingmaterialsandconsbuttonbut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (cv3rdsemActivity.this,WebviewActivity.class);
                intent.putExtra("cv-3rdsem-cvbuildingmaterialsandcons","file:///android_asset/cv/3rdcvbuildingmaterialsandconstruction.html");
                cv3rdsemActivity.this.startActivity(intent);
            }
        });
//////////////////////////////////////////////////////////////////////// /////////////////////////////// cvbuildingmaterialstestinglaboratory BUTTON- 7 ///////////////////////////////
        final Button cvbuildingmaterialstestinglabbuttonbut = (Button) findViewById(R.id.cvbuildingmaterialstestinglabbutton);
        cvbuildingmaterialstestinglabbuttonbut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (cv3rdsemActivity.this,WebviewActivity.class);
                intent.putExtra("cv-3rdsem-cvbuildingmaterialstestinglab","file:///android_asset/cv/3rdcvbuildingmaterialstestinglaboratory.html");
                cv3rdsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////
/////////////////////////////// cvbasicsurveyingpractice BUTTON- 8 ///////////////////////////////
        final Button cvbasicsurveyingpracticeBut = (Button) findViewById(R.id.cvbasicsurveyingprabutton);
        cvbasicsurveyingpracticeBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (cv3rdsemActivity.this,WebviewActivity.class);
                intent.putExtra("cv-3rdsem-cvbasicsurveyingpra","file:///android_asset/cv/3rdcvbasicsurveyingpractice.html");
                cv3rdsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////


    }
}
