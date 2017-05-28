package com.murugan.surya.wetu;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class cs7thsemActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cs7thsem);

        /////////////////////////////// csobjectorientedmodelinganddesign BUTTON- 1 ///////////////////////////////
        final Button csobjectorientedmodelinganddesignBut = (Button) findViewById(R.id.csobjectorientedmodelinganddesignbutton);
        csobjectorientedmodelinganddesignBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (cs7thsemActivity.this,WebviewActivity.class);
                intent.putExtra("cs-7thsem-csobjectorientedmodelinganddesign","file:///android_asset/cs/7thcsobjectorientedmodelinganddesign.html");
                cs7thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////
/////////////////////////////// csembeddedcomputingsystems BUTTON- 2 ///////////////////////////////
        final Button csembeddedcomputingsystemsBut = (Button) findViewById(R.id.csembeddedcomputingsystemsbutton);
        csembeddedcomputingsystemsBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (cs7thsemActivity.this,WebviewActivity.class);
                intent.putExtra("cs-7thsem-csembeddedcomputingsystems","file:///android_asset/cs/7thcsembeddedcomputingsystems.html");
                cs7thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////
/////////////////////////////// csprogrammingtheweb BUTTON- 3 ///////////////////////////////
        final Button csprogrammingthewebBut = (Button) findViewById(R.id.csprogrammingthewebbutton);
        csprogrammingthewebBut.setOnClickListener(new View.OnClickListener() {  public void onClick(View v) {
            Intent intent = new Intent (cs7thsemActivity.this,WebviewActivity.class);
            intent.putExtra("cs-7thsem-csprogrammingtheweb","file:///android_asset/cs/7thcsprogrammingtheweb.html");
            cs7thsemActivity.this.startActivity(intent);
        }
        });
////////////////////////////////////////////////////////////////////////
/////////////////////////////// csdvancedcomputerarchitectures BUTTON- 4 ///////////////////////////////
        final Button csdvancedcomputerarchitecturesBut = (Button) findViewById(R.id.csdvancedcomputerarchitecturesbutton);
        csdvancedcomputerarchitecturesBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (cs7thsemActivity.this,WebviewActivity.class);
                intent.putExtra("cs-7thsem-csdvancedcomputerarchitectures","file:///android_asset/cs/7thcsdvancedcomputerarchitectures.html");
                cs7thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////
/////////////////////////////// csadvanceddatabasemanagementsystems BUTTON- 5 ///////////////////////////////
        final Button csadvanceddatabasemanagementsystemsBut = (Button) findViewById(R.id.csadvanceddatabasemanagementsystemsbutton);
        csadvanceddatabasemanagementsystemsBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (cs7thsemActivity.this,WebviewActivity.class);
                intent.putExtra("cs-7thsem-csadvanceddatabasemanagementsystems","file:///android_asset/cs/7thcsadvanceddatabasemanagementsystems.html");    cs7thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////
/////////////////////////////// csdigitalsignalprocessing BUTTON- 6 ///////////////////////////////
        final Button csdigitalsignalprocessingBut = (Button) findViewById(R.id.csdigitalsignalprocessingbutton);
        csdigitalsignalprocessingBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (cs7thsemActivity.this,WebviewActivity.class);
                intent.putExtra("cs-7thsem-csdigitalsignalprocessing","file:///android_asset/cs/7thcsdigitalsignalprocessing.html");
                cs7thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////
/////////////////////////////// csjavaandj2ee BUTTON- 7 ///////////////////////////////
        final Button csjavaandj2eeBut = (Button) findViewById(R.id.csjavaandj2eebutton);
        csjavaandj2eeBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (cs7thsemActivity.this,WebviewActivity.class);
                intent.putExtra("cs-7thsem-csjavaandj2ee","file:///android_asset/cs/7thcsjavaandj2ee.html");
                cs7thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////// /////////////////////////////csmultimediacomputingBUTTON- 8 ///////////////////////////////
        final Button csmultimediacomputingBut = (Button) findViewById(R.id.csmultimediacomputingbutton);
        csmultimediacomputingBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (cs7thsemActivity.this,WebviewActivity.class);
                intent.putExtra("cs-7thsem-csmultimediacomputing","file:///android_asset/cs/7thcsmultimediacomputing.html");
                cs7thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////
/////////////////////////////// csdatawarehousinganddatamining BUTTON- 9 ///////////////////////////////
        final Button csdatawarehousinganddataminingBut = (Button) findViewById(R.id.csdatawarehousinganddataminingbutton);
        csdatawarehousinganddataminingBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (cs7thsemActivity.this,WebviewActivity.class);
                intent.putExtra("cs-7thsem-csdatawarehousinganddatamining","file:///android_asset/cs/7thcsdatawarehousinganddatamining.html");
                cs7thsemActivity.this.startActivity(intent);
            }
        });
//////////////////////////////////////////////////////////////////////// /////////////////////////////// csneuralnetworks BUTTON- 10 ///////////////////////////////
        final Button csneuralnetworksBut = (Button) findViewById(R.id.csneuralnetworksbutton);
        csneuralnetworksBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (cs7thsemActivity.this,WebviewActivity.class);
                intent.putExtra("cs-7thsem-csneuralnetworks","file:///android_asset/cs/7thcsneuralnetworks.html");
                cs7thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////
/////////////////////////////// cscsharpprogramminganddotnet  BUTTON- 11 ///////////////////////////////
        final Button cscsharpprogramminganddotnetBut = (Button) findViewById(R.id.cscsharpprogramminganddotnetbutton);
        cscsharpprogramminganddotnetBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (cs7thsemActivity.this,WebviewActivity.class);
                intent.putExtra("cs-7thsem-cscsharpprogramminganddotnet ","file:///android_asset/cs/7thcscsharpprogramminganddotnet .html");
                cs7thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////
/////////////////////////////// csdigitalimageprocessing BUTTON- 12///////////////////////////////
        final Button csdigitalimageprocessingBut = (Button) findViewById(R.id.csdigitalimageprocessingbutton);
        csdigitalimageprocessingBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (cs7thsemActivity.this,WebviewActivity.class);
                intent.putExtra("cs-7thsem-csdigitalimageprocessing","file:///android_asset/cs/7thcsdigitalimageprocessing.html");
                cs7thsemActivity.this.startActivity(intent);
            }
        });
//////////////////////////////////////////////////////////////////////// /////////////////////////////// csgametheory BUTTON- 13 ///////////////////////////////
        final Button csgametheoryBut = (Button) findViewById(R.id.csgametheorybutton);
        csgametheoryBut.setOnClickListener(new View.OnClickListener() { public void onClick(View v) {
            Intent intent = new Intent (cs7thsemActivity.this,WebviewActivity.class);
            intent.putExtra("cs-7thsem-csgametheory","file:///android_asset/cs/7thcsgametheory.html");
            cs7thsemActivity.this.startActivity(intent);
        }
        });
//////////////////////////////////////////////////////////////////////// /////////////////////////////// csartificialintelligence BUTTON- 14///////////////////////////////
        final Button csartificialintelligenceBut = (Button) findViewById(R.id.csartificialintelligencebutton);
        csartificialintelligenceBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (cs7thsemActivity.this,WebviewActivity.class);
                intent.putExtra("cs-7thsem-csartificialintelligence","file:///android_asset/cs/7thcsartificialintelligence.html");
                cs7thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////
/////////////////////////////// csstorageareanetworks BUTTON- 15 ///////////////////////////////
        final Button csstorageareanetworksBut = (Button) findViewById(R.id.csstorageareanetworksbutton);
        csstorageareanetworksBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (cs7thsemActivity.this,WebviewActivity.class);
                intent.putExtra("cs-7thsem-csstorageareanetworks","file:///android_asset/cs/7thcsstorageareanetworks.html");
                cs7thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////
/////////////////////////////// csfuzzylogic  BUTTON- 16 ///////////////////////////////
        final Button csfuzzylogicBut = (Button) findViewById(R.id.csfuzzylogicbutton);
        csfuzzylogicBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (cs7thsemActivity.this,WebviewActivity.class);
                intent.putExtra("cs-7thsem-csfuzzylogic ","file:///android_asset/cs/7thcsfuzzylogic .html");
                cs7thsemActivity.this.startActivity(intent);
            }
        });
//////////////////////////////////////////////////////////////////////// /////////////////////////////// csnetworkslaboratory BUTTON- 17 ///////////////////////////////
        final Button csnetworkslaboratoryBut = (Button) findViewById(R.id.csnetworkslaboratorybutton);
        csnetworkslaboratoryBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(cs7thsemActivity.this,WebviewActivity.class);
                intent.putExtra("cs-7thsem-csnetworkslaboratory","file:///android_asset/cs/7thcsnetworkslaboratory.html");
                cs7thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////
/////////////////////////////// cswebprogramminglaboratory BUTTON- 18 ///////////////////////////////
        final Button cswebprogramminglaboratoryBut = (Button) findViewById(R.id.cswebprogramminglaboratorybutton);
        cswebprogramminglaboratoryBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(cs7thsemActivity.this,WebviewActivity.class);
                intent.putExtra("cs-7thsem-cswebprogramminglaboratory","file:///android_asset/cs/7thcswebprogramminglaboratory.html");
                cs7thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////
    }
}
