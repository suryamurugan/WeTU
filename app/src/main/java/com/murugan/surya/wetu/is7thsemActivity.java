package com.murugan.surya.wetu;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class is7thsemActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.is7thsem);
        /////////////////////////////// isobjectorientedmodelinganddesign BUTTON- 1 ///////////////////////////////
        final Button isobjectorientedmodelinganddesignBut = (Button) findViewById(R.id.isobjectorientedmodelinganddesignbutton);
        isobjectorientedmodelinganddesignBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(is7thsemActivity.this,WebviewActivity.class);
                intent.putExtra("is-7thsem-isobjectorientedmodelinganddesign","file:///android_asset/is/7thisobjectorientedmodelinganddesign.html");
                is7thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////


/////////////////////////////// isinformationsystems BUTTON- 2 ///////////////////////////////
        final Button isinformationsystemsBut = (Button) findViewById(R.id.isinformationsystemsbutton);
        isinformationsystemsBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (is7thsemActivity.this,WebviewActivity.class);
                intent.putExtra("is-7thsem-isinformationsystems","file:///android_asset/is/7thisinformationsystems.html");
                is7thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////

/////////////////////////////// isprogrammingtheweb BUTTON- 3 ///////////////////////////////
        final Button isprogrammingthewebBut = (Button) findViewById(R.id.isprogrammingthewebbutton);
        isprogrammingthewebBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (is7thsemActivity.this,WebviewActivity.class);
                intent.putExtra("is-7thsem-isprogrammingtheweb","file:///android_asset/is/7thisprogrammingtheweb.html");
                is7thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////


/////////////////////////////// isdatawarehousinganddatamining BUTTON- 4 ///////////////////////////////
        final Button isdatawarehousinganddataminingBut = (Button) findViewById(R.id.isdatawarehousinganddataminingbutton);
        isdatawarehousinganddataminingBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (is7thsemActivity.this,WebviewActivity.class);
                intent.putExtra("is-7thsem-isdatawarehousinganddatamining","file:///android_asset/is/7thisdatawarehousinganddatamining.html");
                is7thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////

/////////////////////////////// isadvanceddbms BUTTON- 5 ///////////////////////////////
        final Button isadvanceddbmsBut = (Button) findViewById(R.id.isadvanceddbmsbutton);
        isadvanceddbmsBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (is7thsemActivity.this,WebviewActivity.class);
                intent.putExtra("is-7thsem-isadvanceddbms","file:///android_asset/is/7thisadvanceddbms.html");
                is7thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////


/////////////////////////////// isembeddedcomputingsystems BUTTON- 6 ///////////////////////////////
        final Button isembeddedcomputingsystemsBut = (Button) findViewById(R.id.isembeddedcomputingsystemsbutton);
        isembeddedcomputingsystemsBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (is7thsemActivity.this,WebviewActivity.class);
                intent.putExtra("is-7thsem-isembeddedcomputingsystems","file:///android_asset/is/7thisembeddedcomputingsystems.html");
                is7thsemActivity.this.startActivity(intent);
            }
        });
///////////////////////////////////////////////////////////////////
/////
/////////////////////////////// isjavaandj2ee BUTTON- 7 ///////////////////////////////
        final Button isjavaandj2eeBut = (Button) findViewById(R.id.isjavaandj2eebutton);
        isjavaandj2eeBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (is7thsemActivity.this,WebviewActivity.class);
                intent.putExtra("is-7thsem-isjavaandj2ee","file:///android_asset/is/7thisjavaandj2ee.html");
                is7thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////

/////////////////////////////// ismultimediacomputing BUTTON- 8 ///////////////////////////////
        final Button ismultimediacomputingBut = (Button) findViewById(R.id.ismultimediacomputingbutton);
        ismultimediacomputingBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (is7thsemActivity.this,WebviewActivity.class);
                intent.putExtra("is-7thsem-ismultimediacomputing","file:///android_asset/is/7thismultimediacomputing.html");
                is7thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////

/////////////////////////////// isadvancedsoftwareengineering BUTTON- 9 ///////////////////////////////
        final Button isadvancedsoftwareengineeringBut = (Button) findViewById(R.id.isadvancedsoftwareengineeringbutton);
        isadvancedsoftwareengineeringBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (is7thsemActivity.this,WebviewActivity.class);
                intent.putExtra("is-7thsem-isadvancedsoftwareengineering","file:///android_asset/is/7thisadvancedsoftwareengineering.html");
                is7thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////



/////////////////////////////// isneuralnetworks BUTTON- 10 ///////////////////////////////
        final Button isneuralnetbuttonbut = (Button) findViewById(R.id.isneuralnetbutton);
        isneuralnetbuttonbut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (is7thsemActivity.this,WebviewActivity.class);
                intent.putExtra("is-7thsem-isneuralnet","file:///android_asset/is/7thisneuralnetbuttonbut.html");
                is7thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////

/////////////////////////////// iscsharpprogrammingandgotNet  BUTTON- 11 ///////////////////////////////
        final Button iscsharpprogrammingandgotNetBut = (Button) findViewById(R.id.iscsharpprogrammingandgotNetbutton);
        iscsharpprogrammingandgotNetBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (is7thsemActivity.this,WebviewActivity.class);
                intent.putExtra("is-7thsem-iscsharpprogrammingandgotNet ","file:///android_asset/is/7thiscsharpprogrammingandgotNet .html");
                is7thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////
/////////////////////////////// isdigitalimageprocessing BUTTON- 12 ///////////////////////////////
        final Button isdigitalimageprocessingBut = (Button) findViewById(R.id.isdigitalimageprocessingbutton);
        isdigitalimageprocessingBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (is7thsemActivity.this,WebviewActivity.class);
                intent.putExtra("is-7thsem-isdigitalimageprocessing","file:///android_asset/is/7thisdigitalimageprocessing.html");
                is7thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////
////////////
/////////////////////////////// isgametheory BUTTON- 13 ///////////////////////////////
        final Button isgametheoryBut = (Button) findViewById(R.id.isgametheorybutton);
        isgametheoryBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (is7thsemActivity.this,WebviewActivity.class);
                intent.putExtra("is-7thsem-isgametheory","file:///android_asset/is/7thisgametheory.html");
                is7thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////

/////////////////////////////// isartificialintelligence BUTTON- 14 ///////////////////////////////
        final Button isartificialintelligenceBut = (Button) findViewById(R.id.isartificialintelligencebutton);
        isartificialintelligenceBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (is7thsemActivity.this,WebviewActivity.class);
                intent.putExtra("is-7thsem-isartificialintelligence","file:///android_asset/is/7thisartificialintelligence.html");
                is7thsemActivity.this.startActivity(intent);
            }
        });
//////////////////////////////////////////////////////
//////////////////
/////////////////////////////// isstorageareanetworks BUTTON- 15 ///////////////////////////////
        final Button isstorageareanetworksBut = (Button) findViewById(R.id.isstorageareanetworksbutton);
        isstorageareanetworksBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (is7thsemActivity.this,WebviewActivity.class);
                intent.putExtra("is-7thsem-isstorageareanetworks","file:///android_asset/is/7thisstorageareanetworks.html");
                is7thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////
/////////////////////////////// isfuzzylogic  BUTTON- 16 ///////////////////////////////
        final Button isfuzzylogicBut = (Button) findViewById(R.id.isfuzzylogicbutton);
        isfuzzylogicBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (is7thsemActivity.this,WebviewActivity.class);
                intent.putExtra("is-7thsem-isfuzzylogic ","file:///android_asset/is/7thisfuzzylogic .html");
                is7thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////

/////////////////////////////// isnetworkslaboratory BUTTON- 17 ///////////////////////////////
        final Button isnetworkslaboratoryBut = (Button) findViewById(R.id.isnetworkslaboratorybutton);
        isnetworkslaboratoryBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (is7thsemActivity.this,WebviewActivity.class);
                intent.putExtra("is-7thsem-isnetworkslaboratory","file:///android_asset/is/7thisnetworkslaboratory.html");
                is7thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////

/////////////////////////////// iswebprogramminglaboratory BUTTON- 18 ///////////////////////////////
        final Button iswebprogramminglaboratoryBut = (Button) findViewById(R.id.iswebprogramminglaboratorybutton);
        iswebprogramminglaboratoryBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (is7thsemActivity.this,WebviewActivity.class);
                intent.putExtra("is-7thsem-iswebprogramminglaboratory","file:///android_asset/is/7thiswebprogramminglaboratory.html");
                is7thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////


    }
}
