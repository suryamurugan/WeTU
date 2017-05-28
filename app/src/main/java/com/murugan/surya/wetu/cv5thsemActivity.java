package com.murugan.surya.wetu;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class cv5thsemActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cv5thsem);

        /////////////////////////////// cvmanagementandentrepreneurship BUTTON- 1 ///////////////////////////////
        final Button cvmanagementandentrepreneurshipBut = (Button) findViewById(R.id.cvmanagementandentrepreneurshipbutton);
        cvmanagementandentrepreneurshipBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (cv5thsemActivity.this,WebviewActivity.class);
                intent.putExtra("cv-5thsem-cvmanagementandentrepreneurship","file:///android_asset/cv/5thcvmanagementandentrepreneurship.html");
                cv5thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////
/////////////////////////////// cvdesignofrccstructuralelements BUTTON- 2 ///////////////////////////////
        final Button cvdesignofrccstructuralelementsBut = (Button) findViewById(R.id.cvdesignofrccstructuralelementsbutton);
        cvdesignofrccstructuralelementsBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (cv5thsemActivity.this,WebviewActivity.class);
                intent.putExtra("cv-5thsem-cvdesignofrccstructuralelements","file:///android_asset/cv/5thcvdesignofrccstructuralelements.html");
                cv5thsemActivity.this.startActivity(intent);
            }
        });
//////////////////////////////////////////////////////////////////////// /////////////////////////////// cvstructuralanalysis2 BUTTON- 3 ///////////////////////////////
        final Button cvstructuralanalysis2But = (Button) findViewById(R.id.cvstructuralanalysis2button);
        cvstructuralanalysis2But.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (cv5thsemActivity.this,WebviewActivity.class);
                intent.putExtra("cv-5thsem-cvstructuralanalysis2","file:///android_asset/cv/5thcvstructuralanalysis2.html");
                cv5thsemActivity.this.startActivity(intent);
            }
        });
//////////////////////////////////////////////////////////////////////// /////////////////////////////// cvgeotechnicalengineering1 BUTTON- 4 ///////////////////////////////
        final Button cvgeotechengBut = (Button) findViewById(R.id.cvgeotechengbutton);
        cvgeotechengBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (cv5thsemActivity.this,WebviewActivity.class);
                intent.putExtra("cv-5thsem-cvgeotecheng1","file:///android_asset/cv/5thcvgeotechnicalengineering1.html");
                cv5thsemActivity.this.startActivity(intent);
            }
        });
//////////////////////////////////////////////////////////////////////// /////////////////////////////// cvhydrologyandirrigationengineering BUTTON- 5 ///////////////////////////////
        final Button cvhydroandirengbuttonbut = (Button) findViewById(R.id.cvhydroandirengbutton);
        cvhydroandirengbuttonbut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (cv5thsemActivity.this,WebviewActivity.class);
                intent.putExtra("cv-5thsem-cvhydrologyandirrigationengineering","file:///android_asset/cv/5thcvhydrologyandirrigationengineering.html");
                cv5thsemActivity.this.startActivity(intent);
            }
        });
//////////////////////////////////////////////////////////////////////// /////////////////////////////// cvtransportationengineering1 BUTTON- 6 ///////////////////////////////
        final Button cvtransporteng123buttonbut = (Button) findViewById(R.id.cvtransporteng123button);
        cvtransporteng123buttonbut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (cv5thsemActivity.this,WebviewActivity.class);
                intent.putExtra("cv-5thsem-cvtransportationengineering1","file:///android_asset/cv/5thcvtransportationengineering1.html");
                cv5thsemActivity.this.startActivity(intent);
            }
        });
//////////////////////////////////////////////////////////////////////// /////////////////////////////// cvhydraulicsandhydraulicmachinerylab BUTTON- 7 ///////////////////////////////
        final Button cvhydraulicsandhydraulicmachinerylabBut = (Button) findViewById(R.id.cvhydraulicsandhydraulicmachinerylabbutton);
        cvhydraulicsandhydraulicmachinerylabBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (cv5thsemActivity.this,WebviewActivity.class);
                intent.putExtra("cv-5thsem-cvhydraulicsandhydraulicmachinerylab","file:///android_asset/cv/5thcvhydraulicsandhydraulicmachinerylab.html");
                cv5thsemActivity.this.startActivity(intent);
            }
        });
//////////////////////////////////////////////////////////////////////// /////////////////////////////// cvcomputeraideddesignlab BUTTON- 8 ///////////////////////////////
        final Button cvcomputeraideddesignlabBut = (Button) findViewById(R.id.cvcomputeraideddesignlabbutton);
        cvcomputeraideddesignlabBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(cv5thsemActivity.this,WebviewActivity.class);
                intent.putExtra("cv-5thsem-cvcomputeraideddesignlab","file:///android_asset/cv/5thcvcomputeraideddesignlab.html");
                cv5thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////



/////////////////////////////////////////////////////////////////////////



    }
}
