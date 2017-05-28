package com.murugan.surya.wetu;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.content.Intent;


public class me5thsemActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.me5thsem);

        /////////////////////////////// medesignofmachineelements1 BUTTON- 1 ///////////////////////////////
        final Button medesignofmachineelements1But = (Button) findViewById(R.id.medesignofmachineelements1button);
        medesignofmachineelements1But.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (me5thsemActivity.this,WebviewActivity.class);
                intent.putExtra("me-5thsem-medesignofmachineelements1","file:///android_asset/me/5thmedesignofmachineelements1.html");
                me5thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////
/////////////////////////////// meenergyengineering BUTTON- 2 ///////////////////////////////
        final Button meenergyengineeringBut = (Button) findViewById(R.id.meenergyengineeringbutton);
        meenergyengineeringBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (me5thsemActivity.this,WebviewActivity.class);
                intent.putExtra("me-5thsem-meenergyengineering","file:///android_asset/me/5thmeenergyengineering.html");
                me5thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////
/////////////////////////////// medynamicsofmachines BUTTON- 3 ///////////////////////////////
        final Button medynamicsofmachinesBut = (Button) findViewById(R.id.medynamicsofmachinesbutton);
        medynamicsofmachinesBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (me5thsemActivity.this,WebviewActivity.class);
                intent.putExtra("me-5thsem-medynamicsofmachines","file:///android_asset/me/5thmedynamicsofmachines.html");
                me5thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////
/////////////////////////////// memanufacturingprocess3 BUTTON- 4 ///////////////////////////////
        final Button memanufacturingprocess3But = (Button) findViewById(R.id.memanufacturingprocess3button);
        memanufacturingprocess3But.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (me5thsemActivity.this,WebviewActivity.class);
                intent.putExtra("me-5thsem-memanufacturingprocess3","file:///android_asset/me/5thmemanufacturingprocess3.html");
                me5thsemActivity.this.startActivity(intent);
            }  });
////////////////////////////////////////////////////////////////////////
/////////////////////////////// meturbomachines BUTTON- 5 ///////////////////////////////
        final Button meturbomachinesBut = (Button) findViewById(R.id.meturbomachinesbutton);
        meturbomachinesBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (me5thsemActivity.this,WebviewActivity.class);
                intent.putExtra("me-5thsem-meturbomachines","file:///android_asset/me/5thmeturbomachines.html");
                me5thsemActivity.this.startActivity(intent);
            }
        });
//////////////////////////////////////////////////////////////////////// /////////////////////////////// mefluidmechanicsandmachineslaboratory BUTTON- 6 ///////////////////////////////
        final Button mefluidmechanicsandmachineslaboratoryBut = (Button) findViewById(R.id.mefluidmechanicsandmachineslaboratorybutton);
        mefluidmechanicsandmachineslaboratoryBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (me5thsemActivity.this,WebviewActivity.class);
                intent.putExtra("me-5thsem-mefluidmechanicsandmachineslaboratory","file:///android_asset/me/5thmefluidmechanicsandmachineslaboratory.html");
                me5thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////
/////////////////////////////// meenergyconversionengineeringlaboratory BUTTON- 7 ///////////////////////////////
        final Button meenergyconversionengineeringlaboratoryBut = (Button) findViewById(R.id.meenergyconversionengineeringlaboratorybutton);
        meenergyconversionengineeringlaboratoryBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (me5thsemActivity.this,WebviewActivity.class);
                intent.putExtra("me-5thsem-meenergyconversionengineeringlaboratory","file:///android_asset/me/5thmeenergyconversionengineeringlaboratory.html");
                me5thsemActivity.this.startActivity(intent);
            }
        });
//////////////////////////////////////////////////////////////////////// /////////////////////////////// memanagementandentrepreneurship BUTTON- 8 ///////////////////////////////
        final Button memanagementandentrepreneurshipBut = (Button) findViewById(R.id.memanagementandentrepreneurshipbutton);
        memanagementandentrepreneurshipBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (me5thsemActivity.this,WebviewActivity.class);
                intent.putExtra("me-5thsem-memanagementandentrepreneurship","file:///android_asset/me/5thmemanagementandentrepreneurship.html");    me5thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////



    }
}
