package com.murugan.surya.wetu;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class me3rdsemActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.me3rdsem);

        /////////////////////////////// meengineeringmathematics3 BUTTON- 1 ///////////////////////////////
        final Button meengineeringmathematics3But = (Button) findViewById(R.id.meengineeringmathematics3button);
        meengineeringmathematics3But.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(me3rdsemActivity.this,WebviewActivity.class);
                intent.putExtra("me-3rdsem-meengineeringmathematics3","file:///android_asset/me/3rdmeengineeringmathematics3.html");
                me3rdsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////
/////////////////////////////// memateriicalscience BUTTON- 2 ///////////////////////////////
        final Button memateriicalscienceBut = (Button) findViewById(R.id.memateriicalsciencebutton);
        memateriicalscienceBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (me3rdsemActivity.this,WebviewActivity.class);
                intent.putExtra("me-3rdsem-memateriicalscience","file:///android_asset/me/3rdmemateriicalscience.html");
                me3rdsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////
/////////////////////////////// mebasicThermodynamics BUTTON- 3 ///////////////////////////////
        final Button mebasicthermodynabut = (Button)findViewById(R.id.mebasicthermodynabutton);
        mebasicthermodynabut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (me3rdsemActivity.this,WebviewActivity.class);
                intent.putExtra("me-3rdsem-mebasicThermodyna","file:///android_asset/me/3rdmebasicthermodynamics.html");
                me3rdsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////

/////////////////////////////// memechanicsofmaterials BUTTON- 4 ///////////////////////////////
        final Button memechanicsofmaterialsBut = (Button) findViewById(R.id.memechanicsofmaterialsbutton);
        memechanicsofmaterialsBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (me3rdsemActivity.this,WebviewActivity.class);
                intent.putExtra("me-3rdsem-memechanicsofmaterials","file:///android_asset/me/3rdmemechanicsofmaterials.html");
                me3rdsemActivity.this.startActivity(intent);
            }
        });
//////////////////////////////////////////////////////////////////////// /////////////////////////////// memetalCastingAndWelding BUTTON- 5 ///////////////////////////////
        final Button memetalCastingAndWeldingBut = (Button) findViewById(R.id.memetalCastingAndWeldingbutton);
        memetalCastingAndWeldingBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (me3rdsemActivity.this,WebviewActivity.class);
                intent.putExtra("me-3rdsem-memetalCastingAndWelding","file:///android_asset/me/3rdmemetalcastingandwelding.html");
                me3rdsemActivity.this.startActivity(intent);
            }  });
////////////////////////////////////////////////////////////////////////
/////////////////////////////// memachineToolsAndOperations BUTTON- 6 ///////////////////////////////
        final Button memachineToolsAndOperationsBut = (Button) findViewById(R.id.memachineToolsAndOperationsbutton);
        memachineToolsAndOperationsBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (me3rdsemActivity.this,WebviewActivity.class);
                intent.putExtra("me-3rdsem-memachineToolsAndOperations","file:///android_asset/me/3rdmemachinetoolsandoperations.html");
                me3rdsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////
/////////////////////////////// mecomputeraidedmachinedrawing BUTTON- 7 ///////////////////////////////
        final Button mecomputeraidedmachinedrawingBut = (Button) findViewById(R.id.mecomputeraidedmachinedrawingbutton);
        mecomputeraidedmachinedrawingBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (me3rdsemActivity.this,WebviewActivity.class);
                intent.putExtra("me-3rdsem-mecomputeraidedmachinedrawing","file:///android_asset/me/3rdmecomputeraidedmachinedrawing.html");
                me3rdsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////
/////////////////////////////// memechanicalMeasurementsAndMetrology BUTTON- 8 ///////////////////////////////
        final Button memechanicalMeasurementsAndMetrologyBut = (Button) findViewById(R.id.memechanicalMeasurementsAndMetrologybutton);
        memechanicalMeasurementsAndMetrologyBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (me3rdsemActivity.this,WebviewActivity.class);
                intent.putExtra("me-3rdsem-memechanicalMeasurementsAndMetrology","file:///android_asset/me/3rdmemechanicalmeasurementsandmetrology.html");
                me3rdsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////


/////////////////////////////// mematerialsTestingLab BUTTON- 9 ///////////////////////////////
        final Button mematerialsTestingLabBut = (Button) findViewById(R.id.mematerialsTestingLabbutton);
        mematerialsTestingLabBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (me3rdsemActivity.this,WebviewActivity.class);
                intent.putExtra("me-3rdsem-mematerialsTestingLab","file:///android_asset/me/3rdmematerialsTestingLab.html");
                me3rdsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////
/////////////////////////////// memechanicalmeasurementsandmetrologylab BUTTON- 10 ///////////////////////////////
        final Button memechanicalmeasurementsandmetrologylabBut = (Button) findViewById(R.id.memechanicalmeasurementsandmetrologylabbutton);
        memechanicalmeasurementsandmetrologylabBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (me3rdsemActivity.this,WebviewActivity.class);
                intent.putExtra("me-3rdsem-memechanicalmeasurementsandmetrologylab","file:///android_asset/me/3rdmemechanicalmeasurementsandmetrologylab.html");
                me3rdsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////


/////////////////////////////// mefoundryAndForgingLab BUTTON- 11 ///////////////////////////////
        final Button mefoundryAndForgingLabBut = (Button) findViewById(R.id.mefoundryAndForgingLabbutton);
        mefoundryAndForgingLabBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (me3rdsemActivity.this,WebviewActivity.class);
                intent.putExtra("me-3rdsem-mefoundryAndForgingLab","file:///android_asset/me/3rdmefoundryAndForgingLab.html");
                me3rdsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////


    }
}
