package com.murugan.surya.wetu;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class cs6thsemActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cs6thsem);

        /////////////////////////////// csprogramminglanguages BUTTON- 1 ///////////////////////////////
        final Button csprogramminglanguagesBut = (Button) findViewById(R.id.csprogramminglanguagesbutton);
        csprogramminglanguagesBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(cs6thsemActivity.this,WebviewActivity.class);
                intent.putExtra("cs-6thsem-csprogramminglanguages","file:///android_asset/cs/6thcsprogramminglanguages.html");
                cs6thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////

/////////////////////////////// cscompilerdesign BUTTON- 2 ///////////////////////////////
        final Button cscompilerdesignBut = (Button) findViewById(R.id.cscompilerdesignbutton);
        cscompilerdesignBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (cs6thsemActivity.this,WebviewActivity.class);
                intent.putExtra("cs-6thsem-cscompilerdesign","file:///android_asset/cs/6thcscompilerdesign.html");
                cs6thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////
/////////////////////////////// cscomputernetworks2 BUTTON- 3 ///////////////////////////////
        final Button cscomputernetworks2But = (Button) findViewById(R.id.cscomputernetworks2button);
        cscomputernetworks2But.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (cs6thsemActivity.this,WebviewActivity.class);
                intent.putExtra("cs-6thsem-cscomputernetworks2","file:///android_asset/cs/6thcscomputernetworks2.html");
                cs6thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////

/////////////////////////////// cscomputergraphicsandvisualization BUTTON- 4 ///////////////////////////////
        final Button cscomputergraphicsandvisualizationBut = (Button) findViewById(R.id.cscomputergraphicsandvisualizationbutton);
        cscomputergraphicsandvisualizationBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (cs6thsemActivity.this,WebviewActivity.class);
                intent.putExtra("cs-6thsem-cscomputergraphicsandvisualization","file:///android_asset/cs/6thcscomputergraphicsandvisualization.html");
                cs6thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////
        /////////////////////////////// csoperationsresearch BUTTON- 5 ///////////////////////////////
        final Button csoperationsresearchBut = (Button) findViewById(R.id.csoperationsresearchbutton);
        csoperationsresearchBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (cs6thsemActivity.this,WebviewActivity.class);
                intent.putExtra("cs-6thsem-csoperationsresearch","file:///android_asset/cs/6thcsoperationsresearch.html");
                cs6thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////
/////////////////////////////// cssignalsandsystems BUTTON- 6 ///////////////////////////////
        final Button cssignalsandsystemsBut = (Button) findViewById(R.id.cssignalsandsystemsbutton);
        cssignalsandsystemsBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (cs6thsemActivity.this,WebviewActivity.class);
                intent.putExtra("cs-6thsem-cssignalsandsystems","file:///android_asset/cs/6thcssignalsandsystems.html");
                cs6thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////
/////////////////////////////// csdatacompression BUTTON- 7 ///////////////////////////////
        final Button csdatacompressionBut = (Button) findViewById(R.id.csdatacompressionbutton);
        csdatacompressionBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (cs6thsemActivity.this,WebviewActivity.class);
                intent.putExtra("cs-6thsem-csdatacompression","file:///android_asset/cs/6thcsdatacompression.html");
                cs6thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////
/////////////////////////////// cspatternrecognition BUTTON- 8 ///////////////////////////////
        final Button cspatternrecognitionBut = (Button) findViewById(R.id.cspatternrecognitionbutton);
        cspatternrecognitionBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (cs6thsemActivity.this,WebviewActivity.class);
                intent.putExtra("cs-6thsem-cspatternrecognition","file:///android_asset/cs/6thcspatternrecognition.html");
                cs6thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////
///////////////////////////////
        ////////////////// csstochasticmodelsandapplications BUTTON- 9 ///////////////////////////////
        final Button csstochasticmodelsandapplicationsBut = (Button) findViewById(R.id.csstochasticmodelsandapplicationsbutton);
        csstochasticmodelsandapplicationsBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (cs6thsemActivity.this,WebviewActivity.class);
                intent.putExtra("cs-6thsem-csstochasticmodelsandapplications","file:///android_asset/cs/6thcsstochasticmodelsandapplications.html");
                cs6thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////
/////////////////////////////// csprogramminglanguages BUTTON- 10 ///////////////////////////////
        final Button csprogramming2languagesBut = (Button) findViewById(R.id.csprogramming2languagesbutton);
        csprogramming2languagesBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (cs6thsemActivity.this,WebviewActivity.class);
                intent.putExtra("cs-6thsem-csprogramminglanguages","file:///android_asset/cs/6thcsprogramminglanguages.html");
                cs6thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////

/////////////////////////////// cscomputergraphicsandvisualizationlaboratorty BUTTON- 11 ///////////////////////////////
        final Button cscomputergraphicsandvisualizationlaboratortyBut = (Button) findViewById(R.id.cscomputergraphicsandvisualizationlaboratortybutton);
        cscomputergraphicsandvisualizationlaboratortyBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (cs6thsemActivity.this,WebviewActivity.class);
                intent.putExtra("cs-6thsem-cscomputergraphicsandvisualizationlaboratorty","file:///android_asset/cs/6thcscomputergraphicsandvisualizationlaboratorty.html");
                cs6thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////

/////////////////////////////// csunixsystemsprogrammingandcompilerdesignlaboratory BUTTON- 12 ///////////////////////////////
        final Button csunixsystemsprogrammingandcompilerdesignlaboratoryBut = (Button) findViewById(R.id.csunixsystemsprogrammingandcompilerdesignlaboratorybutton);
        csunixsystemsprogrammingandcompilerdesignlaboratoryBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (cs6thsemActivity.this,WebviewActivity.class);
                intent.putExtra("cs-6thsem-csunixsystemsprogrammingandcompilerdesignlaboratory","file:///android_asset/cs/6thcsunixsystemsprogrammingandcompilerdesignlaboratory.html");
                cs6thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////


    }
}
