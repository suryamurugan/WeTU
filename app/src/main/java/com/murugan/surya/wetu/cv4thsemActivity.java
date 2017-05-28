package com.murugan.surya.wetu;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class cv4thsemActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cv4thsem);


        /////////////////////////////// cvengineeringmathematics4 BUTTON- 1 ///////////////////////////////
        final Button cvengineeringmathematics4But = (Button) findViewById(R.id.cvengineeringmathematics4button);
        cvengineeringmathematics4But.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (cv4thsemActivity.this,WebviewActivity.class);
                intent.putExtra("cv-4thsem-cvengineeringmathematics4","file:///android_asset/cv/4thcvengineeringmathematics4.html");
                cv4thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////
/////////////////////////////// cvconcretetechnology BUTTON- 2 ///////////////////////////////
        final Button cvconcretetechnologyBut = (Button) findViewById(R.id.cvconcretetechnologybutton);
        cvconcretetechnologyBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (cv4thsemActivity.this,WebviewActivity.class);
                intent.putExtra("cv-4thsem-cvconcretetechnology","file:///android_asset/cv/4thcvconcretetechnology.html");
                cv4thsemActivity.this.startActivity(intent);
            }
        });
//////////////////////////////////////////////////////////////////////// /////////////////////////////// cvstructralanalysis1 BUTTON- 3 ///////////////////////////////
        final Button cvstructralanalysis1But = (Button) findViewById(R.id.cvstructralanalysis1button);
        cvstructralanalysis1But.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (cv4thsemActivity.this,WebviewActivity.class);
                intent.putExtra("cv-4thsem-cvstructralanalysis1","file:///android_asset/cv/4thcvstructralanalysis1.html");
                cv4thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////
/////////////////////////////// cvsurveying2 BUTTON- 4 ///////////////////////////////
        final Button cvsurveying2But = (Button) findViewById(R.id.cvsurveying2button);
        cvsurveying2But.setOnClickListener(new View.OnClickListener() {   public void onClick(View v) {
            Intent intent = new Intent (cv4thsemActivity.this,WebviewActivity.class);
            intent.putExtra("cv-4thsem-cvsurveying2","file:///android_asset/cv/4thcvsurveying2.html");
            cv4thsemActivity.this.startActivity(intent);
        }
        });
//////////////////////////////////////////////////////////////////////// /////////////////////////////// cvhydraulicsandhydraulicmachines BUTTON- 5 ///////////////////////////////
        final Button cvhydraulicsandhydraulicmachinesBut = (Button) findViewById(R.id.cvhydraulicsandhydraulicmachinesbutton);
        cvhydraulicsandhydraulicmachinesBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (cv4thsemActivity.this,WebviewActivity.class);
                intent.putExtra("cv-4thsem-cvhydraulicsandhydraulicmachines","file:///android_asset/cv/4thcvhydraulicsandhydraulicmachines.html");
                cv4thsemActivity.this.startActivity(intent);
            }
        });
//////////////////////////////////////////////////////////////////////// /////////////////////////////// cvbuildingplaninganddrawing BUTTON- 6 ///////////////////////////////
        final Button cvbuildingplaninganddrawingBut = (Button) findViewById(R.id.cvbuildingplaninganddrawingbutton);
        cvbuildingplaninganddrawingBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (cv4thsemActivity.this,WebviewActivity.class);
                intent.putExtra("cv-4thsem-cvbuildingplaninganddrawing","file:///android_asset/cv/4thcvbuildingplaninganddrawing.html");
                cv4thsemActivity.this.startActivity(intent);
            }
        }); ////////////////////////////////////////////////////////////////////////
/////////////////////////////// cvsurveyingpractice2lab BUTTON- 7 ///////////////////////////////
        final Button cvsurveyingpractice2labBut = (Button) findViewById(R.id.cvsurveyingpractice2labbutton);
        cvsurveyingpractice2labBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (cv4thsemActivity.this,WebviewActivity.class);
                intent.putExtra("cv-4thsem-cvsurveyingpractice2lab","file:///android_asset/cv/4thcvsurveyingpractice2lab.html");
                cv4thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////
/////////////////////////////// cvappliedengineeringgeologylaboratory BUTTON- 8 ///////////////////////////////
        final Button cvappliedengineeringgeologylaboratoryBut = (Button) findViewById(R.id.cvappliedengineeringgeologylaboratorybutton);
        cvappliedengineeringgeologylaboratoryBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(cv4thsemActivity.this,WebviewActivity.class);
                intent.putExtra("cv-4thsem-cvappliedengineeringgeologylaboratory","file:///android_asset/cv/4thcvappliedengineeringgeologylaboratory.html");
                cv4thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////

    }
}
