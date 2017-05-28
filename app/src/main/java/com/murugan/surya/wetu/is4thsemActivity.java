package com.murugan.surya.wetu;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class is4thsemActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.is4thsem);

        /////////////////////////////// isengineeringmathematics4 BUTTON- 1 ///////////////////////////////
        final Button isengineeringmathematics4But = (Button) findViewById(R.id.isengineeringmathematics4button);
        isengineeringmathematics4But.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (is4thsemActivity.this,WebviewActivity.class);
                intent.putExtra("is-4thsem-isengineeringmathematics4","file:///android_asset/is/4thisengineeringmathematics4.html");
                is4thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////
/////////////////////////////// isgraphtheoryandcombinatorics BUTTON- 2 ///////////////////////////////
        final Button isgraphtheoryandcombinatoricsBut = (Button) findViewById(R.id.isgraphtheoryandcombinatoricsbutton);
        isgraphtheoryandcombinatoricsBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (is4thsemActivity.this,WebviewActivity.class);
                intent.putExtra("is-4thsem-isgraphtheoryandcombinatorics","file:///android_asset/is/4thisgraphtheoryandcombinatorics.html");
                is4thsemActivity.this.startActivity(intent);
            }
        });
///////////////////////////////////////////////////////////////////////
/////////////////////////////// isdesignandanalysisofalgorithms BUTTON- 3 ///////////////////////////////
        final Button isdesignandanalysisofalgorithmsBut = (Button) findViewById(R.id.isdesignandanalysisofalgorithmsbutton);
        isdesignandanalysisofalgorithmsBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (is4thsemActivity.this,WebviewActivity.class);
                intent.putExtra("is-4thsem-isdesignandanalysisofalgorithms","file:///android_asset/is/4thisdesignandanalysisofalgorithms.html");
                is4thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////



/////////////////////////////// ismicroprocessors BUTTON- 5 ///////////////////////////////
        final Button ismicroprocessorsBut = (Button) findViewById(R.id.ismicroprocessorsbutton);
        ismicroprocessorsBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (is4thsemActivity.this,WebviewActivity.class);
                intent.putExtra("is-4thsem-ismicroprocessors","file:///android_asset/is/4thismicroprocessors.html");
                is4thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////

/////////////////////////////// iscomputerorganization BUTTON- 6 ///////////////////////////////
        final Button iscomporgbuttonbut = (Button) findViewById(R.id.iscomporgbutton);
        iscomporgbuttonbut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (is4thsemActivity.this,WebviewActivity.class);
                intent.putExtra("is-4thsem-iscomporga","file:///android_asset/is/4thiscomporga.html");
                is4thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////
/////////////////////////////// isdesignandanalysisofalgorithmslaboratory BUTTON- 7 ///////////////////////////////
        final Button isdesignandanalysisofalgorithmslaboratoryBut = (Button) findViewById(R.id.isdesignandanalysisofalgorithmslaboratorybutton);
        isdesignandanalysisofalgorithmslaboratoryBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(is4thsemActivity.this,WebviewActivity.class);
                intent.putExtra("is-4thsem-isdesignandanalysisofalgorithmslaboratory","file:///android_asset/is/4thisdesignandanalysisofalgorithmslaboratory.html");
                is4thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////
/////////////////////////////// ismicroprocessorslaboratory BUTTON- 8 ///////////////////////////////
        final Button ismicroprocessorslaboratoryBut = (Button) findViewById(R.id.ismicroprocessorslaboratorybutton);
        ismicroprocessorslaboratoryBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (is4thsemActivity.this,WebviewActivity.class);
                intent.putExtra("is-4thsem-ismicroprocessorslaboratory","file:///android_asset/is/4thismicroprocessorslaboratory.html");
                is4thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////

        ///////////////////////UNIX AND SHEELL PROGRAMMIN///////////////
        final Button isunixandshellprogrammingforisbut = (Button)  findViewById(R.id.infosunixandshellbutton);
        isunixandshellprogrammingforisbut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (is4thsemActivity.this,WebviewActivity.class);
                intent.putExtra("is-4thsem-isunixnshell","file:///android_asset/is/4unixnshell.html");
                is4thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////

    }
}
