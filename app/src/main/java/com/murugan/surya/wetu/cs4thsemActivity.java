package com.murugan.surya.wetu;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class cs4thsemActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cs4thsem);

        ////////////////////////////////////////////////////////////////////////////////////////////////////
        /////////////////////////////// csengineeringmathematics4 BUTTON- 1 ///////////////////////////////
        final Button csengineeringmathematics4But = (Button) findViewById(R.id.csengineeringmathematics4button);
        csengineeringmathematics4But.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(cs4thsemActivity.this,WebviewActivity.class);
                intent.putExtra("cs-4thsem-csengineeringmathematics4","file:///android_asset/cs/4thcsengineeringmathematics4.html");
                cs4thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////
/////////////////////////////// csgaphtheoryandcombinatorics BUTTON- 2 ///////////////////////////////
        final Button csgaphtheoryandcombinatoricsBut = (Button) findViewById(R.id.csgaphtheoryandcombinatoricsbutton);
        csgaphtheoryandcombinatoricsBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (cs4thsemActivity.this,WebviewActivity.class);
                intent.putExtra("cs-4thsem-csgaphtheoryandcombinatorics","file:///android_asset/cs/4thcsgaphtheoryandcombinatorics.html");
                cs4thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////
/////////////////////////////// csdesignandanalysisofalgorithms BUTTON- 3 ///////////////////////////////
        final Button csdesignandanalysisofalgorithmsBut = (Button) findViewById(R.id.csdesignandanalysisofalgorithmsbutton);
        csdesignandanalysisofalgorithmsBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (cs4thsemActivity.this,WebviewActivity.class);
                intent.putExtra("cs-4thsem-csdesignandanalysisofalgorithms","file:///android_asset/cs/4thcsdesignandanalysisofalgorithms.html");
                cs4thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////
/////////////////////////////// csunixandshellprogramming BUTTON- 4 ///////////////////////////////
        final Button csunixandshellprogrammingBut = (Button) findViewById(R.id.csunixandshellprogramming2button);
        csunixandshellprogrammingBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (cs4thsemActivity.this,WebviewActivity.class);
                intent.putExtra("cs-4thsem-csunixandshellprogramming2","file:///android_asset/cs/4thcsunixandshellprogramming.html");
                cs4thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////
/////////////////////////////// csmicroprocessors BUTTON- 5 ///////////////////////////////
        final Button csmicroprocessorsBut = (Button) findViewById(R.id.csmicroprocessorsbutton);
        csmicroprocessorsBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (cs4thsemActivity.this,WebviewActivity.class);
                intent.putExtra("cs-4thsem-csmicroprocessors","file:///android_asset/cs/4thcsmicroprocessors.html");
                cs4thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////
/////////////////////////////// cscomputerorganization BUTTON- 6 ///////////////////////////////
        final Button cscomputerorganizationBut = (Button) findViewById(R.id.cscomputerorganization2button);
        cscomputerorganizationBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (cs4thsemActivity.this,WebviewActivity.class);
                intent.putExtra("cs-4thsem-cscomputerorganization2","file:///android_asset/cs/4thcscomputerorganization.html");
                cs4thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////

/////////////////////////////// csdesignandanalysisofalgorithmslaboratory BUTTON- 7 ///////////////////////////////
        final Button csdesignandanalysisofalgorithmslaboratoryBut = (Button) findViewById(R.id.csdesignandanalysisofalgorithmslaboratorybutton);
        csdesignandanalysisofalgorithmslaboratoryBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (cs4thsemActivity.this,WebviewActivity.class);
                intent.putExtra("cs-4thsem-csdesignandanalysisofalgorithmslaboratory","file:///android_asset/cs/4thcsdesignandanalysisofalgorithmslaboratory.html");
                cs4thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////

/////////////////////////////// csmicroprocessorslaboratory BUTTON- 8 ///////////////////////////////
        final Button csmicroprocessorslaboratoryBut = (Button) findViewById(R.id.csmicroprocessorslaboratorybutton);
        csmicroprocessorslaboratoryBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(cs4thsemActivity.this,WebviewActivity.class);
                intent.putExtra("cs-4thsem-csmicroprocessorslaboratory","file:///android_asset/cs/4thcsmicroprocessorslaboratory.html");
                cs4thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////
/////////////////////////////// csadvancedmathematics2 BUTTON- 9 ///////////////////////////////
        final Button csadvancedmathematics2But = (Button) findViewById(R.id.csadvancedmathematics2button);
        csadvancedmathematics2But.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (cs4thsemActivity.this,WebviewActivity.class);
                intent.putExtra("cs-4thsem-csadvancedmathematics2","file:///android_asset/cs/4thcsadvancedmathematics2.html");
                cs4thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////

        ////////////////////////////////////////////// //////////////////////////////////////////////////


    }
}
