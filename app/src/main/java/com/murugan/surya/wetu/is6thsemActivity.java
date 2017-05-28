package com.murugan.surya.wetu;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class is6thsemActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.is6thsem);

              /*
/////////////////////////////// ismanagementandentrepreneurship BUTTON- 1 ///////////////////////////////
        final Button ismanagementandentrepreneurshipBut = (Button) findViewById(R.id.ismanagementandentrepreneurshipbutton);
        ismanagementandentrepreneurshipBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(is6thsemActivity.this,WebviewActivity.class);
                intent.putExtra("is-6thsem-ismanagementandentrepreneurship","file:///android_asset/is/6thismanagementandentrepreneurship.html");
                is6thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////
        */

/////////////////////////////// isunixsystemprogramming BUTTON- 2 ///////////////////////////////
        final Button isunixsystemprogrammingBut = (Button) findViewById(R.id.isunixsystemprogrammingbutton);
        isunixsystemprogrammingBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (is6thsemActivity.this,WebviewActivity.class);
                intent.putExtra("is-6thsem-isunixsystemprogramming","file:///android_asset/is/6thisunixsystemprogramming.html");
                is6thsemActivity.this.startActivity(intent);
            }
        });
//////////////////////////////////////////////////////////////////////// /////////////////////////////// isfilestructures BUTTON- 3 ///////////////////////////////
        final Button isfilestructuresBut = (Button) findViewById(R.id.isfilestructuresbutton);
        isfilestructuresBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (is6thsemActivity.this,WebviewActivity.class);
                intent.putExtra("is-6thsem-isfilestructures","file:///android_asset/is/6thisfilestructures.html");
                is6thsemActivity.this.startActivity(intent);
            }
        });
//////////////////////////////////////////////////////////////////////// /////////////////////////////// iscomputernetworks2 BUTTON- 4 ///////////////////////////////
        final Button iscomputernetworks2But = (Button) findViewById(R.id.iscomputernetworks2button);
        iscomputernetworks2But.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (is6thsemActivity.this,WebviewActivity.class);
                intent.putExtra("is-6thsem-iscomputernetworks2","file:///android_asset/is/6thiscomputernetworks2.html");
                is6thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////

/////////////////////////////// issoftwaretesting BUTTON- 5 ///////////////////////////////
        final Button issoftwaretestingBut = (Button) findViewById(R.id.issoftwaretestingbutton);
        issoftwaretestingBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (is6thsemActivity.this,WebviewActivity.class);
                intent.putExtra("is-6thsem-issoftwaretesting","file:///android_asset/is/6thissoftwaretesting.html");
                is6thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////
/////////////////////////////// isoperationsresearch BUTTON- 6 ///////////////////////////////
        final Button isoperationsresearchBut = (Button) findViewById(R.id.isoperationsresearchizbutton);
        isoperationsresearchBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (is6thsemActivity.this,WebviewActivity.class);
                intent.putExtra("is-6thsem-isoperationsresearch","file:///android_asset/is/6thisoperationsresearch .html");
                is6thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////
/////////////////////////////// iscompilerdesign BUTTON- 7 ///////////////////////////////
        final Button iscompilerdesignBut = (Button) findViewById(R.id.iscompilerdesignbutton);
        iscompilerdesignBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (is6thsemActivity.this,WebviewActivity.class);
                intent.putExtra("is-6thsem-iscompilerdesign","file:///android_asset/is/6thiscompilerdesign.html");
                is6thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////
/////////////////////////////// isdatacompression BUTTON- 8 ///////////////////////////////
        final Button isdatacompressionBut = (Button) findViewById(R.id.isdatacompressionbutton);
        isdatacompressionBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (is6thsemActivity.this,WebviewActivity.class);
                intent.putExtra("is-6thsem-isdatacompression","file:///android_asset/is/6thisdatacompression.html");
                is6thsemActivity.this.startActivity(intent);
            }
        });
//////////////////////////////////////////////////////////////////////// /////////////////////////////// ispatternrecognition BUTTON- 9 ///////////////////////////////
        final Button ispatternrecognitionBut = (Button) findViewById(R.id.ispatternrecognitionbutton);
        ispatternrecognitionBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (is6thsemActivity.this,WebviewActivity.class);
                intent.putExtra("is-6thsem-ispatternrecognition","file:///android_asset/is/6thispatternrecognition.html");
                is6thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////
/////////////////////////////// iscomputergraphicsandvisualization BUTTON- 10 ///////////////////////////////
        final Button iscomputergraphicsandvisualizationBut = (Button) findViewById(R.id.iscomputergraphicsandvisualizationbutton);
        iscomputergraphicsandvisualizationBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (is6thsemActivity.this,WebviewActivity.class);
                intent.putExtra("is-6thsem-iscomputergraphicsandvisualization","file:///android_asset/is/6thiscomputergraphicsandvisualization.html");
                is6thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////

/////////////////////////////// isprogramminglanguages BUTTON- 11 ///////////////////////////////
        final Button isprogramminglanguagesBut = (Button) findViewById(R.id.isprogramminglanguagesbutton);
        isprogramminglanguagesBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (is6thsemActivity.this,WebviewActivity.class);
                intent.putExtra("is-6thsem-isprogramminglanguages","file:///android_asset/is/6thisprogramminglanguages.html");
                is6thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////
/////////////////////////////// isfilestructureslaboratory BUTTON- 12 ///////////////////////////////
        final Button isfilestructureslaboratoryBut = (Button) findViewById(R.id.isfilestructureslaboratorybutton);
        isfilestructureslaboratoryBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (is6thsemActivity.this,WebviewActivity.class);
                intent.putExtra("is-6thsem-isfilestructureslaboratory","file:///android_asset/is/6thisfilestructureslaboratory.html");
                is6thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////

/////////////////////////////// issoftwaretestinglaboratory BUTTON- 13 ///////////////////////////////
        final Button issoftwaretestinglaboratoryBut = (Button) findViewById(R.id.issoftwaretestinglaboratorybutton);
        issoftwaretestinglaboratoryBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (is6thsemActivity.this,WebviewActivity.class);
                intent.putExtra("is-6thsem-issoftwaretestinglaboratory","file:///android_asset/is/6thissoftwaretestinglaboratory.html");
                is6thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////


    }
}
