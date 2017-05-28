package com.murugan.surya.wetu;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class me7thsemActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.me7thsem);
        /////////////////////////////// meeconomics BUTTON- 1 ///////////////////////////////
        final Button meeconomicsBut = (Button) findViewById(R.id.meeconomicsbutton);
        meeconomicsBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(me7thsemActivity.this,WebviewActivity.class);
                intent.putExtra("me-7thsem-meeconomics","file:///android_asset/me/7thmeeconomics.html");
                me7thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////
/////////////////////////////// mechanicalvibrations BUTTON- 2 ///////////////////////////////
        final Button mechanicalvibrationsBut = (Button) findViewById(R.id.mechanicalvibrationsbutton);
        mechanicalvibrationsBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (me7thsemActivity.this,WebviewActivity.class);
                intent.putExtra("me-7thsem-mechanicalvibrations","file:///android_asset/me/7thmechanicalvibrations.html");
                me7thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////
/////////////////////////////// mehydraulicsandpneumatics BUTTON- 3 ///////////////////////////////
        final Button mehydraulicsandpneumaticsBut = (Button) findViewById(R.id.mehydraulicsandpneumaticsbutton);
        mehydraulicsandpneumaticsBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (me7thsemActivity.this,WebviewActivity.class);
                intent.putExtra("me-7thsem-mehydraulicsandpneumatics","file:///android_asset/me/7thmehydraulicsandpneumatics.html");
                me7thsemActivity.this.startActivity(intent);
            }
        });
//////////////////////////////////////////////////////////////////////// /////////////////////////////// meoperationsresearch BUTTON- 4 ///////////////////////////////
        final Button meoperationsresearchBut = (Button) findViewById(R.id.meoperationsresearchbutton);
        meoperationsresearchBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (me7thsemActivity.this,WebviewActivity.class);
                intent.putExtra("me-7thsem-meoperationsresearch","file:///android_asset/me/7thmeoperationsresearch.html");
                me7thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////
/////////////////////////////// medesignlaboratory BUTTON- 5 ///////////////////////////////
        final Button medesignlaboratoryBut = (Button) findViewById(R.id.medesignlaboratorybutton);
        medesignlaboratoryBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (me7thsemActivity.this,WebviewActivity.class);
                intent.putExtra("me-7thsem-medesignlaboratory","file:///android_asset/me/7thmedesignlaboratory.html");
                me7thsemActivity.this.startActivity(intent);
            }
        });
//////////////////////////////////////////////////////////////////////// /////////////////////////////// mecimandautomationlab BUTTON- 6 ///////////////////////////////
        final Button mecimandautomationlabBut = (Button) findViewById(R.id.mecimandautomationlabbutton);
        mecimandautomationlabBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (me7thsemActivity.this,WebviewActivity.class);
                intent.putExtra("me-7thsem-mecimandautomationlab","file:///android_asset/me/7thmecimandautomationlab.html");
                me7thsemActivity.this.startActivity(intent);
            }
        });
//////////////////////////////////////////////////////////////////////// /////////////////////////////// mechanismdesign BUTTON- 7 ///////////////////////////////
        final Button mechanismdesignBut = (Button) findViewById(R.id.mechanismdesignbutton);
        mechanismdesignBut.setOnClickListener(new View.OnClickListener() {   public void onClick(View v) {
            Intent intent = new Intent (me7thsemActivity.this,WebviewActivity.class);
            intent.putExtra("me-7thsem-mechanismdesign","file:///android_asset/me/7thmechanismdesign.html");
            me7thsemActivity.this.startActivity(intent);
        }
        });
//////////////////////////////////////////////////////////////////////// /////////////////////////////// metheoryofplasticity BUTTON- 8 ///////////////////////////////
        final Button metheoryofplasticityBut = (Button) findViewById(R.id.metheoryofplasticitybutton);
        metheoryofplasticityBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (me7thsemActivity.this,WebviewActivity.class);
                intent.putExtra("me-7thsem-metheoryofplasticity","file:///android_asset/me/7thmetheoryofplasticity.html");
                me7thsemActivity.this.startActivity(intent);
            }
        });
//////////////////////////////////////////////////////////////////////// /////////////////////////////// meengineeringdesign BUTTON- 9 ///////////////////////////////
        final Button meengineeringdesignBut = (Button) findViewById(R.id.meengineeringdesignbutton);
        meengineeringdesignBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (me7thsemActivity.this,WebviewActivity.class);
                intent.putExtra("me-7thsem-meengineeringdesign","file:///android_asset/me/7thmeengineeringdesign.html");
                me7thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////
/////////////////////////////// menonconventionalenergysources BUTTON- 10 ///////////////////////////////
        final Button menonconventionalenergysourcesBut = (Button) findViewById(R.id.menonconventionalenergysourcesbutton);
        menonconventionalenergysourcesBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (me7thsemActivity.this,WebviewActivity.class);
                intent.putExtra("me-7thsem-menonconventionalenergysources","file:///android_asset/me/7thmenonconventionalenergysources.html");
                me7thsemActivity.this.startActivity(intent);
            }
        });
//////////////////////////////////////////////////////////////////////// /////////////////////////////// megasdynamics BUTTON- 11 ///////////////////////////////
        final Button megasdynamicsBut = (Button) findViewById(R.id.megasdynamicsbutton);
        megasdynamicsBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (me7thsemActivity.this,WebviewActivity.class);
                intent.putExtra("me-7thsem-megasdynamics","file:///android_asset/me/7thmegasdynamics.html");
                me7thsemActivity.this.startActivity(intent);
            }
        });
//////////////////////////////////////////////////////////////////////// /////////////////////////////// memanagementinformationsystem BUTTON- 12 ///////////////////////////////
        final Button memanagementinformationsystemBut = (Button) findViewById(R.id.memanagementinformationsystembutton);
        memanagementinformationsystemBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (me7thsemActivity.this,WebviewActivity.class);
                intent.putExtra("me-7thsem-memanagementinformationsystem","file:///android_asset/me/7thmemanagementinformationsystem.html");
                me7thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////
/////////////////////////////// meautomationinmanufacturing BUTTON- 13 ///////////////////////////////
        final Button meautomationinmanufacturingBut = (Button) findViewById(R.id.meautomationinmanufacturingbutton);
        meautomationinmanufacturingBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (me7thsemActivity.this,WebviewActivity.class);
                intent.putExtra("me-7thsem-meautomationinmanufacturing","file:///android_asset/me/7thmeautomationinmanufacturing.html");
                me7thsemActivity.this.startActivity(intent);
            }
        });
//////////////////////////////////////////////////////////////////////// /////////////////////////////// metotalqualitymanagement BUTTON- 14 ///////////////////////////////
        final Button metotalqualitymanagementBut = (Button) findViewById(R.id.metotalqualitymanagementbutton);
        metotalqualitymanagementBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {      Intent intent = new Intent (me7thsemActivity.this,WebviewActivity.class);
                intent.putExtra("me-7thsem-metotalqualitymanagement","file:///android_asset/me/7thmetotalqualitymanagement.html");
                me7thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////
/////////////////////////////// meexperimentalstressanalysis BUTTON- 15 ///////////////////////////////
        final Button meexperimentalstressanalysisBut = (Button) findViewById(R.id.meexperimentalstressanalysisbutton);
        meexperimentalstressanalysisBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (me7thsemActivity.this,WebviewActivity.class);
                intent.putExtra("me-7thsem-meexperimentalstressanalysis","file:///android_asset/me/7thmeexperimentalstressanalysis.html");
                me7thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////

/////////////////////////////// metooldesign BUTTON- 16 ///////////////////////////////
        final Button metooldesignBut = (Button) findViewById(R.id.metooldesignbutton);
        metooldesignBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (me7thsemActivity.this,WebviewActivity.class);
                intent.putExtra("me-7thsem-metooldesign","file:///android_asset/me/7thmetooldesign.html");
                me7thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////
/////////////////////////////// mecryogenics BUTTON- 17 ///////////////////////////////
        final Button mecryogenBut = (Button) findViewById(R.id.mecryogenbutton);
        mecryogenBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (me7thsemActivity.this,WebviewActivity.class);
                intent.putExtra("me-7thsem-mecryogen","file:///android_asset/me/7thcvcryogenics.html");
                me7thsemActivity.this.startActivity(intent);
            }
        });
//////////////////////////////////////////////////////////////////////// /////////////////////////////// mesmartmaterials BUTTON- 18 ///////////////////////////////
        final Button mesmartmaterialsBut = (Button) findViewById(R.id.mesmartmaterialsbutton);
        mesmartmaterialsBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (me7thsemActivity.this,WebviewActivity.class);
                intent.putExtra("me-7thsem-mesmartmaterials","file:///android_asset/me/7thmesmartmaterials.html");
                me7thsemActivity.this.startActivity(intent);
            }
        });
//////////////////////////////////////////////////////////////////////// /////////////////////////////// meagilemanufacturing BUTTON- 19 ///////////////////////////////
        final Button meagilemanufacturingBut = (Button) findViewById(R.id.meagilemanufacturingbutton); meagilemanufacturingBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (me7thsemActivity.this,WebviewActivity.class);
                intent.putExtra("me-7thsem-meagilemanufacturing","file:///android_asset/me/7thmeagilemanufacturing.html");
                me7thsemActivity.this.startActivity(intent);
            }
        });
//////////////////////////////////////////////////////////////////////// /////////////////////////////// merobotics BUTTON- 20 ///////////////////////////////
        final Button meroboticsBut = (Button) findViewById(R.id.meroboticsbutton);
        meroboticsBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (me7thsemActivity.this,WebviewActivity.class);
                intent.putExtra("me-7thsem-merobotics","file:///android_asset/me/7thmerobotics.html");
                me7thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////
/////////////////////////////// mefinancemanagement BUTTON- 21 ///////////////////////////////
        final Button mefinancemanagementBut = (Button) findViewById(R.id.mefinancemanagementbutton);
        mefinancemanagementBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (me7thsemActivity.this,WebviewActivity.class);
                intent.putExtra("me-7thsem-mefinancemanagement","file:///android_asset/me/7thmefinancemanagement.html");
                me7thsemActivity.this.startActivity(intent);
            }
        });
//////////////////////////////////////////////////////////////////////// /////////////////////////////// memicroandsmartsystemtechnology BUTTON- 22 ///////////////////////////////
        final Button memicroandsmartsystemtechnologyBut = (Button) findViewById(R.id.memicroandsmartsystemtechnologybutton);
        memicroandsmartsystemtechnologyBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (me7thsemActivity.this,WebviewActivity.class);
                intent.putExtra("me-7thsem-memicroandsmartsystemtechnology","file:///android_asset/me/7thmemicroandsmartsystemtechnology.html");
                me7thsemActivity.this.startActivity(intent);
            }
        });
//////////////////////////////////////////////////////////////////////// /////////////////////////////// meproductlifecyclemanagement BUTTON- 23 ///////////////////////////////
        final Button meproductlifecyclemanagementBut = (Button) findViewById(R.id.meproductlifecyclemanagementbutton);
        meproductlifecyclemanagementBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (me7thsemActivity.this,WebviewActivity.class);
                intent.putExtra("me-7thsem-meproductlifecyclemanagement","file:///android_asset/me/7thmeproductlifecyclemanagement.html");
                me7thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////



    }
}
