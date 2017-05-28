package com.murugan.surya.wetu;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class cv6thsemActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cv6thsem);
        /////////////////////////////// cvenvironmentalengineering1 BUTTON- 1 ///////////////////////////////
        final Button cvenvironmentalengineering1But = (Button) findViewById(R.id.cvenvironmentalengineering1button);
        cvenvironmentalengineering1But.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (cv6thsemActivity.this,WebviewActivity.class);
                intent.putExtra("cv-6thsem-cvenvironmentalengineering1","file:///android_asset/cv/6thcvenvironmentalengineering1.html");
                cv6thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////
/////////////////////////////// cvdesignanddrawingofrc BUTTON- 2 ///////////////////////////////
        final Button cvdesignanddrawingofrcBut = (Button) findViewById(R.id.cvdesignanddrawingofrcbutton);
        cvdesignanddrawingofrcBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (cv6thsemActivity.this,WebviewActivity.class);
                intent.putExtra("cv-6thsem-cvdesignanddrawingofrc","file:///android_asset/cv/6thcvdesignanddrawingofrc.html");
                cv6thsemActivity.this.startActivity(intent);
            }  });
////////////////////////////////////////////////////////////////////////
/////////////////////////////// cvtransportationengineering2 BUTTON- 3 ///////////////////////////////
        final Button cvtransportationengineering2But = (Button) findViewById(R.id.cvtransportationengineering2button);
        cvtransportationengineering2But.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (cv6thsemActivity.this,WebviewActivity.class);
                intent.putExtra("cv-6thsem-cvtransportationengineering2","file:///android_asset/cv/6thcvtransportationengineering2.html");
                cv6thsemActivity.this.startActivity(intent);
            }
        });
//////////////////////////////////////////////////////////////////////// /////////////////////////////// cvgeotechnicalengineering2 BUTTON- 4 ///////////////////////////////
        final Button cvgeotechnicalengineering2But = (Button) findViewById(R.id.cvgeotechnicalengineering2button);
        cvgeotechnicalengineering2But.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (cv6thsemActivity.this,WebviewActivity.class);
                intent.putExtra("cv-6thsem-cvgeotechnicalengineering2","file:///android_asset/cv/6thcvgeotechnicalengineering2.html");
                cv6thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////
/////////////////////////////// cvhydraulicstructuresandirrigationdesigndrawing BUTTON- 5 ///////////////////////////////
        final Button cvhydraulicstructuresandirrigationdesigndrawingBut = (Button) findViewById(R.id.cvhydraulicstructuresandirrigationdesigndrawingbutton);
        cvhydraulicstructuresandirrigationdesigndrawingBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (cv6thsemActivity.this,WebviewActivity.class);
                intent.putExtra("cv-6thsem-cvhydraulicstructuresandirrigationdesigndrawing","file:///android_asset/cv/6thcvhydraulicstructuresandirrigationdesigndrawing.html");
                cv6thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////
/////////////////////////////// cvtheoryofelasticity BUTTON- 6 ///////////////////////////////
        final Button cvtheoryofelasticityBut = (Button) findViewById(R.id.cvtheoryofelasticitybutton);
        cvtheoryofelasticityBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (cv6thsemActivity.this,WebviewActivity.class);
                intent.putExtra("cv-6thsem-cvtheoryofelasticity","file:///android_asset/cv/6thcvtheoryofelasticity.html");
                cv6thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////
/////////////////////////////// cvalternativebuildingmaterialsandtechnologies BUTTON- 7 ///////////////////////////////
        final Button cvalternativebuildingmaterialsandtechnologiesBut = (Button) findViewById(R.id.cvalternativebuildingmaterialsandtechnologiesbutton);
        cvalternativebuildingmaterialsandtechnologiesBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (cv6thsemActivity.this,WebviewActivity.class);
                intent.putExtra("cv-6thsem-cvalternativebuildingmaterialsandtechnologies","file:///android_asset/cv/6thcvalternativebuildingmaterialsandtechnologies.html");
                cv6thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////
/////////////////////////////// cvgroundimprovementtechniques BUTTON- 8 ///////////////////////////////
        final Button cvgroundimprovementtechniquesBut = (Button) findViewById(R.id.cvgroundimprovementtechniquesbutton);
        cvgroundimprovementtechniquesBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (cv6thsemActivity.this,WebviewActivity.class);
                intent.putExtra("cv-6thsem-cvgroundimprovementtechniques","file:///android_asset/cv/6thcvgroundimprovementtechniques.html");
                cv6thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////
/////////////////////////////// cvadvancesurveying BUTTON- 9 ///////////////////////////////
        final Button cvadvancesurveyingBut = (Button) findViewById(R.id.cvadvancesurveyingbutton);
        cvadvancesurveyingBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (cv6thsemActivity.this,WebviewActivity.class);
                intent.putExtra("cv-6thsem-cvadvancesurveying","file:///android_asset/cv/6thcvadvancesurveying.html");
                cv6thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////
/////////////////////////////// cvgroundwaterhydrology BUTTON- 10 ///////////////////////////////
        final Button cvgroundwaterhydrologyBut = (Button) findViewById(R.id.cvgroundwaterhydrologybutton);
        cvgroundwaterhydrologyBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (cv6thsemActivity.this,WebviewActivity.class);
                intent.putExtra("cv-6thsem-cvgroundwaterhydrology","file:///android_asset/cv/6thcvgroundwaterhydrology.html");
                cv6thsemActivity.this.startActivity(intent);
            }
        });
/*//////////////////////////////////////////////////////////////////////// /////////////////////////////// cvruralwaterhydrology BUTTON- 11 ///////////////////////////////
        final Button cvruralwaterhydrologyBut = (Button) findViewById(R.id.cvgroundwaterhydrologybutton);
        cvruralwaterhydrologyBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (cv6thsemActivity.this,WebviewActivity.class);
                intent.putExtra("cv-6thsem-cvruralwaterhydrology","file:///android_asset/cv/6thcvruralwaterhydrology.html");
                cv6thsemActivity.this.startActivity(intent);
            }
        });
//////////////////////////////////////////////////////////////////////// */
/////////////////////////////// cvruralwatersupplyandsanitation BUTTON- 12 ///////////////////////////////
        final Button cvruralwatersupplyandsanitationBut = (Button) findViewById(R.id.cvruralwatersupplyandsanitationbutton);
        cvruralwatersupplyandsanitationBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (cv6thsemActivity.this,WebviewActivity.class);
                intent.putExtra("cv-6thsem-cvruralwatersupplyandsanitation","file:///android_asset/cv/6thcvruralwatersupplyandsanitation.html");
                cv6thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////
/////////////////////////////// cvtrafficengineering BUTTON- 13 ///////////////////////////////
        final Button cvtrafficengineeringBut = (Button) findViewById(R.id.cvtrafficengineeringbutton);
        cvtrafficengineeringBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (cv6thsemActivity.this,WebviewActivity.class);
                intent.putExtra("cv-6thsem-cvtrafficengineering","file:///android_asset/cv/6thcvtrafficengineering.html");
                cv6thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////
/////////////////////////////// cvgeotechnicalengineeringlab BUTTON- 14 ///////////////////////////////
        final Button cvgeotechnicalengineeringlabBut = (Button) findViewById(R.id.cvgeotechnicalengineeringlabbutton);
        cvgeotechnicalengineeringlabBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (cv6thsemActivity.this,WebviewActivity.class);
                intent.putExtra("cv-6thsem-cvgeotechnicalengineeringlab","file:///android_asset/cv/6thcvgeotechnicalengineeringlab.html");
                cv6thsemActivity.this.startActivity(intent);
            }
        });
//////////////////////////////////////////////////////////////////////// /////////////////////////////// cvextensivesurveyvivavoce BUTTON- 15 ///////////////////////////////
        final Button cvextensivesurveyvivavoceBut = (Button) findViewById(R.id.cvextensivesurveyvivavocebutton);
        cvextensivesurveyvivavoceBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (cv6thsemActivity.this,WebviewActivity.class);
                intent.putExtra("cv-6thsem-cvextensivesurveyvivavoce","file:///android_asset/cv/6thcvextensivesurveyvivavoce.html");
                cv6thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////

    }
}
