package com.murugan.surya.wetu;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.content.Intent;


public class me8thsemActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.me8thsem);
        /////////////////////////////// meoperationsmanagement BUTTON- 1 ///////////////////////////////
        final Button meopermanagementbuttonbut = (Button) findViewById(R.id.meopermanagementbutton);
        meopermanagementbuttonbut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(me8thsemActivity.this,WebviewActivity.class);
                intent.putExtra("me-8thsem-meoperationsman","file:///android_asset/me/8thmeoperationsmanagement.html");
                me8thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////
/////////////////////////////// mecontrolengineering BUTTON- 2 ///////////////////////////////
        final Button mecontrolengineeringBut = (Button) findViewById(R.id.mecontrolengineeringbutton);
        mecontrolengineeringBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (me8thsemActivity.this,WebviewActivity.class);
                intent.putExtra("me-8thsem-mecontrolengineering","file:///android_asset/me/8thmecontrolengineering.html");
                me8thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////
/////////////////////////////// metribology BUTTON- 3 ///////////////////////////////
        final Button metribologyBut = (Button) findViewById(R.id.metribologybutton);
        metribologyBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (me8thsemActivity.this,WebviewActivity.class);
                intent.putExtra("me-8thsem-metribology","file:///android_asset/me/8thmetribology.html");
                me8thsemActivity.this.startActivity(intent);
            }
        }); //////////////////////////////////////////////////////////////////////// /////////////////////////////// mefracturemechanics BUTTON- 4 ///////////////////////////////
        final Button mefracturemechanicsBut = (Button) findViewById(R.id.mefracturemechanicsbutton);
        mefracturemechanicsBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (me8thsemActivity.this,WebviewActivity.class);
                intent.putExtra("me-8thsem-mefracturemechanics","file:///android_asset/me/8thmefracturemechanics.html");
                me8thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////
/////////////////////////////// mepowerplantengineering BUTTON- 5 ///////////////////////////////
        final Button mepowerplantengineeringBut = (Button) findViewById(R.id.mepowerplantengineeringbutton);
        mepowerplantengineeringBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (me8thsemActivity.this,WebviewActivity.class);
                intent.putExtra("me-8thsem-mepowerplantengineering","file:///android_asset/me/8thmepowerplantengineering.html");
                me8thsemActivity.this.startActivity(intent);
            }
        });
//////////////////////////////////////////////////////////////////////// /////////////////////////////// menanotechnology BUTTON- 6 ///////////////////////////////
        final Button menanotechnologyBut = (Button) findViewById(R.id.menanotechnologybutton);
        menanotechnologyBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (me8thsemActivity.this,WebviewActivity.class);
                intent.putExtra("me-8thsem-menanotechnology","file:///android_asset/me/8thmenanotechnology.html");
                me8thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////
/////////////////////////////// meorganisationalbehaviourandprofessinalcommunication BUTTON- 7 ///////////////////////////////
        final Button meorganisationalbehaviourandprofessinalcommunicationBut = (Button) findViewById(R.id.meorganisationalbehaviourandprofessinalcommunicationbutton);
        meorganisationalbehaviourandprofessinalcommunicationBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (me8thsemActivity.this,WebviewActivity.class);
                intent.putExtra("me-8thsem-meorganisationalbehaviourandprofessinalcommunication","file:///android_asset/me/8thmeorganisationalbehaviourandprofessinalcommunication.html");
                me8thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////
/////////////////////////////// mecomputergraphics BUTTON- 8 ///////////////////////////////
        final Button mecomputergraphicsBut = (Button) findViewById(R.id.mecomputergraphicsbutton);
        mecomputergraphicsBut.setOnClickListener(new View.OnClickListener() {     public void onClick(View v) {
            Intent intent = new Intent (me8thsemActivity.this,WebviewActivity.class);
            intent.putExtra("me-8thsem-mecomputergraphics","file:///android_asset/me/8thmecomputergraphics.html");
            me8thsemActivity.this.startActivity(intent);
        }
        });
//////////////////////////////////////////////////////////////////////// /////////////////////////////// merapidprototyping BUTTON- 9 ///////////////////////////////
        final Button merapidprototypingBut = (Button) findViewById(R.id.merapidprototypingbutton);
        merapidprototypingBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (me8thsemActivity.this,WebviewActivity.class);
                intent.putExtra("me-8thsem-merapidprototyping","file:///android_asset/me/8thmerapidprototyping.html");
                me8thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////
/////////////////////////////// mefoundarytechnology BUTTON- 10 ///////////////////////////////
        final Button mefoundarytechnologyBut = (Button) findViewById(R.id.mefoundarytechnologybutton);
        mefoundarytechnologyBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (me8thsemActivity.this,WebviewActivity.class);
                intent.putExtra("me-8thsem-mefoundarytechnology","file:///android_asset/me/8thmefoundarytechnology.html");
                me8thsemActivity.this.startActivity(intent);
            }
        });
//////////////////////////////////////////////////////////////////////// /////////////////////////////// memachinetooldesign BUTTON- 11 ///////////////////////////////
        final Button memachinetooldesignBut = (Button) findViewById(R.id.memachinetooldesignbutton);
        memachinetooldesignBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (me8thsemActivity.this,WebviewActivity.class);
                intent.putExtra("me-8thsem-memachinetooldesign","file:///android_asset/me/8thmemachinetooldesign.html");
                me8thsemActivity.this.startActivity(intent);
            }
        });
//////////////////////////////////////////////////////////////////////// /////////////////////////////// meindustrialengineeringandergonomics BUTTON- 12 ///////////////////////////////
        final Button meindustrialengineeringandergonomicsBut = (Button) findViewById(R.id.meindustrialengineeringandergonomicsbutton);
        meindustrialengineeringandergonomicsBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (me8thsemActivity.this,WebviewActivity.class);
                intent.putExtra("me-8thsem-meindustrialengineeringandergonomics","file:///android_asset/me/8thmeindustrialengineeringandergonomics.html");
                me8thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////
/////////////////////////////// mebiomassenergysystems BUTTON- 13 ///////////////////////////////
        final Button mebiomassenergysystemsBut = (Button) findViewById(R.id.mebiomassenergysystemsbutton);
        mebiomassenergysystemsBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (me8thsemActivity.this,WebviewActivity.class);
                intent.putExtra("me-8thsem-mebiomassenergysystems","file:///android_asset/me/8thmebiomassenergysystems.html");
                me8thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////
/////////////////////////////// meautomotiveengineering BUTTON- 14 ///////////////////////////////
        final Button meautomotiveengineeringBut = (Button) findViewById(R.id.meautomotiveengineeringbutton);
        meautomotiveengineeringBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (me8thsemActivity.this,WebviewActivity.class);
                intent.putExtra("me-8thsem-meautomotiveengineering","file:///android_asset/me/8thmeautomotiveengineering.html");
                me8thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////
/////////////////////////////// medatabasenanagementsystem BUTTON- 15 ///////////////////////////////
        final Button medatabasenanagementsystemBut = (Button) findViewById(R.id.medatabasenanagementsystembutton);
        medatabasenanagementsystemBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {    Intent intent = new Intent (me8thsemActivity.this,WebviewActivity.class);
                intent.putExtra("me-8thsem-medatabasenanagementsystem","file:///android_asset/me/8thmedatabasenanagementsystem.html");
                me8thsemActivity.this.startActivity(intent);
            }
        });
//////////////////////////////////////////////////////////////////////// /////////////////////////////// meartificialintelligence BUTTON- 16 ///////////////////////////////
        final Button meartificialintelligenceBut = (Button) findViewById(R.id.meartificialintelligencebutton);
        meartificialintelligenceBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (me8thsemActivity.this,WebviewActivity.class);
                intent.putExtra("me-8thsem-meartificialintelligence","file:///android_asset/me/8thmeartificialintelligence.html");
                me8thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////
/////////////////////////////// medesignofexperiments BUTTON- 17 ///////////////////////////////
        final Button medesignofexperimentsBut = (Button) findViewById(R.id.medesignofexperimentsbutton);
        medesignofexperimentsBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (me8thsemActivity.this,WebviewActivity.class);
                intent.putExtra("me-8thsem-medesignofexperiments","file:///android_asset/me/8thmedesignofexperiments.html");
                me8thsemActivity.this.startActivity(intent);
            }
        });
//////////////////////////////////////////////////////////////////////// /////////////////////////////// medesignformanufactureandassembly BUTTON- 18 ///////////////////////////////
        final Button medesignformanufactureandassemblyBut = (Button) findViewById(R.id.medesignformanufactureandassemblybutton);
        medesignformanufactureandassemblyBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (me8thsemActivity.this,WebviewActivity.class);
                intent.putExtra("me-8thsem-medesignformanufactureandassembly","file:///android_asset/me/8thmedesignformanufactureandassembly.html");
                me8thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////



    }
}
