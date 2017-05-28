package com.murugan.surya.wetu;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class is3rdsemActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.is3rdsem);


        /////////////////////////////// isanaloganddigitalelectronics BUTTON- 1 ///////////////////////////////
        final Button isanaloganddigitalelectronicsBut = (Button) findViewById(R.id.isanaloganddigitalelectronicsbutton);
        isanaloganddigitalelectronicsBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (is3rdsemActivity.this,WebviewActivity.class);
                intent.putExtra("is-3rdsem-isanaloganddigitalelectronics","file:///android_asset/is/3rdisanaloganddigitalelectronics.html");
                is3rdsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////

/////////////////////////////// isdatastructuresandapplications BUTTON- 2 ///////////////////////////////
        final Button isdatastructuresandapplicationsolaBut = (Button) findViewById(R.id.isdatastructuresandapplicationsdyambutton);
        isdatastructuresandapplicationsolaBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (is3rdsemActivity.this,WebviewActivity.class);
                intent.putExtra("is-3rdsem-isdatastructuresandapplications","file:///android_asset/is/3rdisdatastructuresandapplications.html");
                is3rdsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////
/////////////////////////////// iscomputerorganization BUTTON- 3 ///////////////////////////////
        final Button iscomputerorganizationBut = (Button) findViewById(R.id.iscomputerorganizationbutton);
        iscomputerorganizationBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (is3rdsemActivity.this,WebviewActivity.class);
                intent.putExtra("is-3rdsem-iscomputerorganization","file:///android_asset/is/3rdiscomputerorganization.html");
                is3rdsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////


/////////////////////////////// isunixandshellprogramming BUTTON- 4 ///////////////////////////////
        final Button isunixandshellprogrammingBut = (Button) findViewById(R.id.isunixandshellprogrammingusbutton);
        isunixandshellprogrammingBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (is3rdsemActivity.this,WebviewActivity.class);
                intent.putExtra("is-3rdsem-isunixandshellprogramming","file:///android_asset/is/3rdisunixandshellprogramming.html");
                is3rdsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////
/////////////////////////////// isdiscretemathematicalstructures BUTTON- 5 ///////////////////////////////
        final Button isdiscretemathematicalstructuresBut = (Button) findViewById(R.id.isdiscretemathematicalstructuresbutton);
        isdiscretemathematicalstructuresBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (is3rdsemActivity.this,WebviewActivity.class);
                intent.putExtra("is-3rdsem-isdiscretemathematicalstructures","file:///android_asset/is/3rdisdiscretemathematicalstructures.html");
                is3rdsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////

/////////////////////////////// isanaloganddigitalelectronicslaboratory  BUTTON- 6 ///////////////////////////////
        final Button isanaloganddigitalelectronicslaboratoryolaBut = (Button) findViewById(R.id.isanaloganddigitalelectronicslaboratoryolabutton);
        isanaloganddigitalelectronicslaboratoryolaBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (is3rdsemActivity.this,WebviewActivity.class);
                intent.putExtra("is-3rdsem-isanaloganddigitalelectronicslaboratory","file:///android_asset/is/3rdisanaloganddigitalelectronicslaboratory.html");
                is3rdsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////
/////////////////////////////// isdatastructureslaboratory BUTTON- 7 ///////////////////////////////
        final Button isdatastructureslaboratoryBut = (Button) findViewById(R.id.isdatastructureslaboratorybutton);
        isdatastructureslaboratoryBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (is3rdsemActivity.this,WebviewActivity.class);
                intent.putExtra("is-3rdsem-isdatastructureslaboratory","file:///android_asset/is/3rdisdatastructureslaboratory.html");
                is3rdsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////
/////////////////////////////// isengineeringmathematics3 BUTTON- 8 ///////////////////////////////
        final Button isengineeringmathematics3But = (Button) findViewById(R.id.isengineeringmathematics3button);
        isengineeringmathematics3But.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (is3rdsemActivity.this,WebviewActivity.class);
                intent.putExtra("is-3rdsem-isengineeringmathematics3","file:///android_asset/is/3rdisengineeringmathematics3.html");
                is3rdsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////



    }
}
