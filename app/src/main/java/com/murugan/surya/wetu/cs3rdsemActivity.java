package com.murugan.surya.wetu;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import static com.murugan.surya.wetu.R.layout.cs3rdsem;


public class cs3rdsemActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(cs3rdsem);

        //////////////////////////////////////////////////////////////////////////////////////////////////////////
        /////////////////////////////// csanaloganddigitalelectronics BUTTON- 1 ///////////////////////////////
        final Button csanaloganddigitalelectronicsBut = (Button) findViewById(R.id.csanaloganddigitalelectronicsbutton);
        csanaloganddigitalelectronicsBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(cs3rdsemActivity.this,WebviewActivity.class);
                intent.putExtra("cs-3rdsem-csanaloganddigitalelectronics","file:///android_asset/cs/3rdcsanaloganddigitalelectronics.html");
                cs3rdsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////
/////////////////////////////// csdatastructuresandapplications BUTTON- 2 ///////////////////////////////
        final Button csdatastructuresandapplicationsBut = (Button) findViewById(R.id.csdatastructuresandapplicationsbutton);
        csdatastructuresandapplicationsBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (cs3rdsemActivity.this,WebviewActivity.class);
                intent.putExtra("cs-3rdsem-csdatastructuresandapplications","file:///android_asset/cs/3rdcsdatastructuresandapplications.html");
                cs3rdsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////
/////////////////////////////// cscomputerorganization BUTTON- 3 ///////////////////////////////
        final Button cscomputerorganizationBut = (Button) findViewById(R.id.cscomputerorganizationbutton);
        cscomputerorganizationBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (cs3rdsemActivity.this,WebviewActivity.class);
                intent.putExtra("cs-3rdsem-cscomputerorganization","file:///android_asset/cs/3rdcscomputerorganization.html");
                cs3rdsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////

/////////////////////////////// csunixandshellprogramming BUTTON- 4 ///////////////////////////////
        final Button csunixandshellprogrammingBut = (Button) findViewById(R.id.csunixandshellprogrammingbutton);
        csunixandshellprogrammingBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (cs3rdsemActivity.this,WebviewActivity.class);
                intent.putExtra("cs-3rdsem-csunixandshellprogramming","file:///android_asset/cs/3rdcsunixandshellprogramming.html");
                cs3rdsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////

/////////////////////////////// csdiscretemathematicalstructures BUTTON- 5 ///////////////////////////////
        final Button csdiscretemathematicalstructuresBut = (Button) findViewById(R.id.csdiscretemathematicalstructuresbutton);
        csdiscretemathematicalstructuresBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (cs3rdsemActivity.this,WebviewActivity.class);
                intent.putExtra("cs-3rdsem-csdiscretemathematicalstructures","file:///android_asset/cs/3rdcsdiscretemathematicalstructures.html");
                cs3rdsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////

/////////////////////////////// csanaloganddigitalelectronicslaboratory  BUTTON- 6 ///////////////////////////////
        final Button csanaloganddigitalelectronicslaboratoryBut = (Button) findViewById(R.id.csanaloganddigitalelectronicslaboratorybutton);
        csanaloganddigitalelectronicslaboratoryBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (cs3rdsemActivity.this,WebviewActivity.class);
                intent.putExtra("cs-3rdsem-csanaloganddigitalelectronicslaboratory","file:///android_asset/cs/3rdcsanaloganddigitalelectronicslaboratory.html");
                cs3rdsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////
/////////////////////////////// csdatastructureslaboratory BUTTON- 7 ///////////////////////////////
        final Button csdatastructureslaboratoryBut = (Button) findViewById(R.id.csdatastructureslaboratorybutton);
        csdatastructureslaboratoryBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(cs3rdsemActivity.this,WebviewActivity.class);
                intent.putExtra("cs-3rdsem-csdatastructureslaboratory","file:///android_asset/cs/3rdcsdatastructureslaboratory.html");
                cs3rdsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////
/////////////////////////////// csengineeringmathematics3 BUTTON- 8 ///////////////////////////////
        final Button csengineeringmathematics3But = (Button) findViewById(R.id.csengineeringmathematics3button);
        csengineeringmathematics3But.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (cs3rdsemActivity.this,WebviewActivity.class);
                intent.putExtra("cs-3rdsem-csengineeringmathematics3","file:///android_asset/cs/3rdcsengineeringmathematics3.html");
                cs3rdsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////


        //////////////////////////////////////////////////////////////////////////////////////////////////////////

    }
}
