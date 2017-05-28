package com.murugan.surya.wetu;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class ece7thsemActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ece7thsem);
        /////////////////////////////// computercommunicationnetworks BUTTON- 1 ///////////////////////////////
        final Button computercommunicationnetworksBut = (Button) findViewById(R.id.computercommunicationnetworksbutton);
        computercommunicationnetworksBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (ece7thsemActivity.this,WebviewActivity.class);
                intent.putExtra("ece-7thsem-computercommunicationnetworks","file:///android_asset/ece/7thcomputercommunicationnetworks.html");
                ece7thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////
        /////////////////////////////// opticalfibercommunication BUTTON- 2 ///////////////////////////////
        final Button opticalfibercommunicationBut = (Button) findViewById(R.id.opticalfibercommunicationbutton);
        opticalfibercommunicationBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (ece7thsemActivity.this,WebviewActivity.class);
                intent.putExtra("ece-7thsem-opticalfibercommunication","file:///android_asset/ece/7thopticalfibercommunication.html");
                ece7thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////
        /////////////////////////////// powerelectronics BUTTON- 3 ///////////////////////////////
        final Button powerelectronicsBut = (Button) findViewById(R.id.powerelectronicsbutton);
        powerelectronicsBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (ece7thsemActivity.this,WebviewActivity.class);
                intent.putExtra("ece-7thsem-powerelectronics","file:///android_asset/ece/7thpowerelectronics.html");
                ece7thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////
        /////////////////////////////// embeddedsystemdesign BUTTON- 4 ///////////////////////////////
        final Button embeddedsystemdesignBut = (Button) findViewById(R.id.embeddedsystemdesignbutton);
        embeddedsystemdesignBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (ece7thsemActivity.this,WebviewActivity.class);
                intent.putExtra("ece-7thsem-embeddedsystemdesign","file:///android_asset/ece/7thembeddedsystemdesign.html");
                ece7thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////
        /////////////////////////////// dspalgorithmsandarchitecture BUTTON- 5 ///////////////////////////////
        final Button dspalgorithmsandarchitectureBut = (Button) findViewById(R.id.dspalgorithmsandarchitecturebutton);
        dspalgorithmsandarchitectureBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (ece7thsemActivity.this,WebviewActivity.class);
                intent.putExtra("ece-7thsem-dspalgorithmsandarchitecture","file:///android_asset/ece/7thdspalgorithmsandarchitecture.html");
                ece7thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////
        /////////////////////////////// microandsmartsystemstechnology BUTTON- 6 ///////////////////////////////
        final Button microandsmartsystemstechnologyBut = (Button) findViewById(R.id.microandsmartsystemstechnologybutton);
        microandsmartsystemstechnologyBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (ece7thsemActivity.this,WebviewActivity.class);
                intent.putExtra("ece-7thsem-microandsmartsystemstechnology","file:///android_asset/ece/7thmicroandsmartsystemstechnology.html");
                ece7thsemActivity.this.startActivity(intent);
            }
        });
///////////////////////////////////////////////////////////////////////
        /////////////////////////////// artificialneuralnetwork BUTTON- 7 ///////////////////////////////
        final Button artificialneuralnetworkBut = (Button) findViewById(R.id.artificialneuralnetworkbutton);
        artificialneuralnetworkBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (ece7thsemActivity.this,WebviewActivity.class);
                intent.putExtra("ece-7thsem-artificialneuralnetwork","file:///android_asset/ece/7thartificialneuralnetwork.html");
                ece7thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////
        /////////////////////////////// cadforvlsi BUTTON- 8 ///////////////////////////////
        final Button cadforvlsiBut = (Button) findViewById(R.id.cadforvlsibutton);
        cadforvlsiBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (ece7thsemActivity.this,WebviewActivity.class);
                intent.putExtra("ece-7thsem-cadforvlsi","file:///android_asset/ece/7thcadforvlsi.html");
                ece7thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////
        /////////////////////////////// appliedembeddedsystemdesign BUTTON- 9 ///////////////////////////////
        final Button appliedembeddedsystemdesignBut = (Button) findViewById(R.id.appliedembeddedsystemdesignbutton);
        appliedembeddedsystemdesignBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (ece7thsemActivity.this,WebviewActivity.class);
                intent.putExtra("ece-7thsem-appliedembeddedsystemdesign","file:///android_asset/ece/7thappliedembeddedsystemdesign.html");
                ece7thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////
        /////////////////////////////// speechprocessing BUTTON- 10 ///////////////////////////////
        final Button speechprocessingBut = (Button) findViewById(R.id.speechprocessingbutton);
        speechprocessingBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (ece7thsemActivity.this,WebviewActivity.class);
                intent.putExtra("ece-7thsem-speechprocessing","file:///android_asset/ece/7thspeechprocessing.html");
                ece7thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////
        /////////////////////////////// datastructureusingcplus BUTTON- 11 ///////////////////////////////
        final Button datastructureusingcplusBut = (Button) findViewById(R.id.datastructureusingcplusbutton);
        datastructureusingcplusBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (ece7thsemActivity.this,WebviewActivity.class);
                intent.putExtra("ece-7thsem-datastructureusingcplus","file:///android_asset/ece/7thdatastructureusingcplus.html");
                ece7thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////
        /////////////////////////////// realtimesystems BUTTON- 12 ///////////////////////////////
        final Button realtimesystemsBut = (Button) findViewById(R.id.realtimesystemsbutton);
        realtimesystemsBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (ece7thsemActivity.this,WebviewActivity.class);
                intent.putExtra("ece-7thsem-realtimesystems","file:///android_asset/ece/7threaltimesystems.html");
                ece7thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////
        /////////////////////////////// imageprocessing BUTTON- 13 ///////////////////////////////
        final Button imageprocessingBut = (Button) findViewById(R.id.imageprocessingbutton);
        imageprocessingBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (ece7thsemActivity.this,WebviewActivity.class);
                intent.putExtra("ece-7thsem-imageprocessing","file:///android_asset/ece/7thimageprocessing.html");
                ece7thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////
        /////////////////////////////// radiofrequencyintegratedcircuits BUTTON- 14 ///////////////////////////////
        final Button radiofrequencyintegratedcircuitsBut = (Button) findViewById(R.id.radiofrequencyintegratedcircuitsbutton);
        radiofrequencyintegratedcircuitsBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (ece7thsemActivity.this,WebviewActivity.class);
                intent.putExtra("ece-7thsem-radiofrequencyintegratedcircuits","file:///android_asset/ece/7thradiofrequencyintegratedcircuits.html");
                ece7thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////
        /////////////////////////////// wavelettransforms BUTTON- 15 ///////////////////////////////
        final Button wavelettransformsBut = (Button) findViewById(R.id.wavelettransformsbutton);
        wavelettransformsBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (ece7thsemActivity.this,WebviewActivity.class);
                intent.putExtra("ece-7thsem-wavelettransforms","file:///android_asset/ece/7thwavelettransforms.html");
                ece7thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////
        /////////////////////////////// modelingandsimulationofdatanetworks BUTTON- 16 ///////////////////////////////
        final Button modelingandsimulationofdatanetworksBut = (Button) findViewById(R.id.modelingandsimulationofdatanetworksbutton);
        modelingandsimulationofdatanetworksBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (ece7thsemActivity.this,WebviewActivity.class);
                intent.putExtra("ece-7thsem-modelingandsimulationofdatanetworks","file:///android_asset/ece/7thmodelingandsimulationofdatanetworks.html");
                ece7thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////








    }
}
