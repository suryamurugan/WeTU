package com.murugan.surya.wetu;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class ece6thsemActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ece6thsem);

        /////////////////////////////// digitalcommunictaion BUTTON- 1 ///////////////////////////////
        final Button digitalcommunictaionBut = (Button) findViewById(R.id.digitalcommunictaionbutton);
        digitalcommunictaionBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(ece6thsemActivity.this,WebviewActivity.class);
                intent.putExtra("ece-6thsem-digitalcommunictaion","file:///android_asset/ece/6thdigitalcommunictaion.html");
                ece6thsemActivity.this.startActivity(intent);
            }
        });
        /////////////////////////////////////////////////////////////////////////////////////
        /////////////////////////////// microprocessors BUTTON- 2 ///////////////////////////////
        final Button microprocessorsBut = (Button) findViewById(R.id.microprocessorsbutton);
        microprocessorsBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (ece6thsemActivity.this,WebviewActivity.class);
                intent.putExtra("ece-6thsem-microprocessors","file:///android_asset/ece/6thmicroprocessors.html");
                ece6thsemActivity.this.startActivity(intent);
            }
        });
        ////////////////////////////////////////////////////////////////////////

        /////////////////////////////// microelectronicscircuits BUTTON- 3 ///////////////////////////////
        final Button microelectronicscircuitsBut = (Button) findViewById(R.id.microelectronicscircuitsbutton);
        microelectronicscircuitsBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (ece6thsemActivity.this,WebviewActivity.class);
                intent.putExtra("ece-6thsem-microelectronicscircuits","file:///android_asset/ece/6thmicroelectronicscircuits.html");
                ece6thsemActivity.this.startActivity(intent);
            }
        });
        ////////////////////////////////////////////////////////////////////////
        /////////////////////////////// antennasandpropagation BUTTON- 4 ///////////////////////////////
        final Button antennasandpropagationBut = (Button) findViewById(R.id.antennasandpropagationbutton);
        antennasandpropagationBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (ece6thsemActivity.this,WebviewActivity.class);
                intent.putExtra("ece-6thsem-antennasandpropagation","file:///android_asset/ece/6thantennasandpropagation.html");
                ece6thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////
        /////////////////////////////// operatingsystems BUTTON- 5 ///////////////////////////////
        final Button operatingsystemsBut = (Button) findViewById(R.id.operatingsystemsbutton);
        operatingsystemsBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (ece6thsemActivity.this,WebviewActivity.class);
                intent.putExtra("ece-6thsem-operatingsystems","file:///android_asset/ece/6thoperatingsystems.html");
                ece6thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////
        /////////////////////////////// analogandmixedmodevlsidesign BUTTON- 6 ///////////////////////////////
        final Button analogandmixedmodevlsidesignBut = (Button) findViewById(R.id.analogandmixedmodevlsidesignbutton);
        analogandmixedmodevlsidesignBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (ece6thsemActivity.this,WebviewActivity.class);
                intent.putExtra("ece-6thsem-analogandmixedmodevlsidesign","file:///android_asset/ece/6thanalogamixedmodevlsidesign.html");
                ece6thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////
/////////////////////////////// satellitecommunications BUTTON- 7 ///////////////////////////////
        final Button satellitecommunicationsBut = (Button) findViewById(R.id.satellitecommunicationsbutton);
        satellitecommunicationsBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (ece6thsemActivity.this,WebviewActivity.class);
                intent.putExtra("ece-6thsem-satellitecommunications","file:///android_asset/ece/6thsatellitecommunications.html");
                ece6thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////
/////////////////////////////// randomprocesses BUTTON- 8 ///////////////////////////////
        final Button randomprocessesBut = (Button) findViewById(R.id.randomprocessesbutton);
        randomprocessesBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (ece6thsemActivity.this,WebviewActivity.class);
                intent.putExtra("ece-6thsem-randomprocesses","file:///android_asset/ece/6thrandomprocesses.html");
                ece6thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////
        /////////////////////////////// lowpowervlsidesign BUTTON- 9 ///////////////////////////////
        final Button lowpowervlsidesignBut = (Button) findViewById(R.id.lowpowervlsidesignbutton);
        lowpowervlsidesignBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (ece6thsemActivity.this,WebviewActivity.class);
                intent.putExtra("ece-6thsem-lowpowervlsidesign","file:///android_asset/ece/6thlowpowervlsidesign.html");
                ece6thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////
        /////////////////////////////// programmingincplus BUTTON- 10 ///////////////////////////////
        final Button programmingincplusBut = (Button) findViewById(R.id.programmingincplusbutton);
        programmingincplusBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (ece6thsemActivity.this,WebviewActivity.class);
                intent.putExtra("ece-6thsem-programmingincplus","file:///android_asset/ece/6thprogrammingincplus.html");
                ece6thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////
        /////////////////////////////// digitalsystemdesignusingverilog BUTTON- 11 ///////////////////////////////
        final Button digitalsystemdesignusingverilogBut = (Button) findViewById(R.id.digitalsystemdesignusingverilogbutton);
        digitalsystemdesignusingverilogBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (ece6thsemActivity.this,WebviewActivity.class);
                intent.putExtra("ece-6thsem-digitalsystemdesignusingverilog","file:///android_asset/ece/6thdigitalsystemdesignusingverilog.html");
                ece6thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////

        /////////////////////////////// virtualinstrumentation BUTTON- 12 ///////////////////////////////
        final Button virtualinstrumentationBut = (Button) findViewById(R.id.virtualinstrumentationbutton);
        virtualinstrumentationBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (ece6thsemActivity.this,WebviewActivity.class);
                intent.putExtra("ece-6thsem-virtualinstrumentation","file:///android_asset/ece/6thvirtualinstrumentation.html");
                ece6thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////
        /////////////////////////////// advancedcommunicationlab BUTTON- 13 ///////////////////////////////
        final Button advancedcommunicationlabBut = (Button) findViewById(R.id.advancedcommunicationlabbutton);
        advancedcommunicationlabBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (ece6thsemActivity.this,WebviewActivity.class);
                intent.putExtra("ece-6thsem-advancedcommunicationlab","file:///android_asset/ece/6thadvancedcommunicationlab.html");
                ece6thsemActivity.this.startActivity(intent);
            }
        });
///////////////////////////////////////////////////////////////////////





    }
}
