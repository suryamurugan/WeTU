package com.murugan.surya.wetu;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class me6thsemActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.me6thsem);

        /////////////////////////////// mecomputerintegratedmanufacturing BUTTON- 1 ///////////////////////////////
        final Button mecomputerintegratedmanufacturingBut = (Button) findViewById(R.id.mecomputerintegratedmanufacturingbutton);
        mecomputerintegratedmanufacturingBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(me6thsemActivity.this,WebviewActivity.class);
                intent.putExtra("me-6thsem-mecomputerintegratedmanufacturing","file:///android_asset/me/6thmecomputerintegratedmanufacturing.html");
                me6thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////

/////////////////////////////// medesignofmachineelements2 BUTTON- 2 ///////////////////////////////
        final Button medesignofmachineelements2But = (Button) findViewById(R.id.medesignofmachineelements2button);
        medesignofmachineelements2But.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (me6thsemActivity.this,WebviewActivity.class);
                intent.putExtra("me-6thsem-medesignofmachineelements2","file:///android_asset/me/6thmedesignofmachineelements2.html");
                me6thsemActivity.this.startActivity(intent);    }
        });
////////////////////////////////////////////////////////////////////////
/////////////////////////////// meheatandmasstransfer BUTTON- 3 ///////////////////////////////
        final Button meheatandmasstransferBut = (Button) findViewById(R.id.meheatandmasstransferbutton);
        meheatandmasstransferBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (me6thsemActivity.this,WebviewActivity.class);
                intent.putExtra("me-6thsem-meheatandmasstransfer","file:///android_asset/me/6thmeheatandmasstransfer.html");
                me6thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////
/////////////////////////////// mefiniteelementmethods BUTTON- 4 ///////////////////////////////
        final Button mefiniteelementmethodsBut = (Button) findViewById(R.id.mefiniteelementmethodsbutton);
        mefiniteelementmethodsBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (me6thsemActivity.this,WebviewActivity.class);
                intent.putExtra("me-6thsem-mefiniteelementmethods","file:///android_asset/me/6thmefiniteelementmethods.html");
                me6thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////
/////////////////////////////// mechatronicsandmicroprocessor BUTTON- 5 ///////////////////////////////
        final Button mechatronicsandmicroprocessorBut = (Button) findViewById(R.id.mechatronicsandmicroprocessorbutton);
        mechatronicsandmicroprocessorBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (me6thsemActivity.this,WebviewActivity.class);
                intent.putExtra("me-6thsem-mechatronicsandmicroprocessor","file:///android_asset/me/6thmechatronicsandmicroprocessor.html");
                me6thsemActivity.this.startActivity(intent);
            }
        });
//////////////////////////////////////////////////////////////////////// /////////////////////////////// meheatandmasstransferlaboratory BUTTON- 6 ///////////////////////////////
        final Button meheatandmasstransferlaboratoryBut = (Button) findViewById(R.id.meheatandmasstransferlaboratorybutton);
        meheatandmasstransferlaboratoryBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (me6thsemActivity.this,WebviewActivity.class);
                intent.putExtra("me-6thsem-meheatandmasstransferlaboratory","file:///android_asset/me/6thmeheatandmasstransferlab.html");
                me6thsemActivity.this.startActivity(intent);
            }
        });
//////////////////////////////////////////////////////////////////////// /////////////////////////////// mecomputeraidedmodelingandanalysislaboratory BUTTON- 7 ///////////////////////////////
        final Button mecomputeraidedmodelingandanalysislaboratoryBut = (Button) findViewById(R.id.mecomputeraidedmodelingandanalysislaboratorybutton);
        mecomputeraidedmodelingandanalysislaboratoryBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (me6thsemActivity.this,WebviewActivity.class);
                intent.putExtra("me-6thsem-mecomputeraidedmodelingandanalysislaboratory","file:///android_asset/me/6thmecomputeraidedmodelingandanalysislaboratory.html");
                me6thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////

/////////////////////////////// metheoryofelasticity BUTTON- 8 ///////////////////////////////
        final Button metheoryofelasticityBut = (Button) findViewById(R.id.metheoryofelasticitybutton);
        metheoryofelasticityBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (me6thsemActivity.this,WebviewActivity.class);
                intent.putExtra("me-6thsem-metheoryofelasticity","file:///android_asset/me/6thmetheoryofelasticity.html");
                me6thsemActivity.this.startActivity(intent);
            }
        });
//////////////////////////////////////////////////////////////////////// /////////////////////////////// memechnaicsofcompositematerials BUTTON- 9 ///////////////////////////////
        final Button memechnaicsofcompositematerialsBut = (Button) findViewById(R.id.memechnofcobutton);
        memechnaicsofcompositematerialsBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (me6thsemActivity.this,WebviewActivity.class);
                intent.putExtra("me-6thsem-memechncompositema","file:///android_asset/me/6thmechanicsofcompositematerials.html");
                me6thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////
/////////////////////////////// merefrigerationandairconditioning BUTTON- 10 ///////////////////////////////
        final Button merefrigerationandairconditioningBut = (Button) findViewById(R.id.merefrigerationandairconditioningbutton);
        merefrigerationandairconditioningBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (me6thsemActivity.this,WebviewActivity.class);
                intent.putExtra("me-6thsem-merefrigerationandairconditioning","file:///android_asset/me/6thmerefrigerationandairconditioning.html");
                me6thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////
/////////////////////////////// medesignofheatexchangers BUTTON- 11 ///////////////////////////////
        final Button medesignofheatexchangersBut = (Button) findViewById(R.id.medesignofheatexchangersbutton);
        medesignofheatexchangersBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (me6thsemActivity.this,WebviewActivity.class);
                intent.putExtra("me-6thsem-medesignofheatexchangers","file:///android_asset/me/6thmedesignofheatexchangers.html");
                me6thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////
/////////////////////////////// menontraditionalmachining BUTTON- 12 ///////////////////////////////
        final Button menontraditionalmachiningBut = (Button) findViewById(R.id.menontraditionalmachiningbutton);
        menontraditionalmachiningBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (me6thsemActivity.this,WebviewActivity.class);
                intent.putExtra("me-6thsem-menontraditionalmachining","file:///android_asset/me/6thmenontraditionalmachining.html");
                me6thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////
/////////////////////////////// meknowledgemanagement BUTTON- 13 ///////////////////////////////
        final Button meknowledgemanagementBut = (Button) findViewById(R.id.meknowledgemanagementbutton);
        meknowledgemanagementBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (me6thsemActivity.this,WebviewActivity.class);
                intent.putExtra("me-6thsem-meknowledgemanagement","file:///android_asset/me/6thmeknowledgemanagement.html");
                me6thsemActivity.this.startActivity(intent);
            }
        });
//////////////////////////////////////////////////////////////////////// /////////////////////////////// meprojectmanagement BUTTON- 14 ///////////////////////////////
        final Button meprojectmanagementBut = (Button) findViewById(R.id.meprojectmanagementbutton);
        meprojectmanagementBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (me6thsemActivity.this,WebviewActivity.class);
                intent.putExtra("me-6thsem-meprojectmanagement","file:///android_asset/me/6thmeprojectmanagement.html");
                me6thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////

/////////////////////////////// mestatisticalqualitycontrol BUTTON- 15 ///////////////////////////////
        final Button mestatisticalqualitycontrolBut = (Button) findViewById(R.id.mestatisticalqualitycontrolbutton);
        mestatisticalqualitycontrolBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (me6thsemActivity.this,WebviewActivity.class);
                intent.putExtra("me-6thsem-mestatisticalqualitycontrol","file:///android_asset/me/6thmestatisticalqualitycontrol.html");
                me6thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////


    }
}
