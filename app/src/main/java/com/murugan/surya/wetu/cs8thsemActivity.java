package com.murugan.surya.wetu;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class cs8thsemActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cs8thsem);

        /////////////////////////////// cssoftwarearchitectures BUTTON- 1 ///////////////////////////////
        final Button cssoftwarearchitecturesBut = (Button) findViewById(R.id.cssoftwarearchitecturesbutton);
        cssoftwarearchitecturesBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (cs8thsemActivity.this,WebviewActivity.class);
                intent.putExtra("cs-8thsem-cssoftwarearchitectures","file:///android_asset/cs/8thcssoftwarearchitectures.html");
                cs8thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////
/////////////////////////////// cssystemmodelingandsimulation BUTTON- 2 ///////////////////////////////
        final Button cssystemmodelingandsimulationBut = (Button) findViewById(R.id.cssystemmodelingandsimulationbutton);
        cssystemmodelingandsimulationBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (cs8thsemActivity.this,WebviewActivity.class);
                intent.putExtra("cs-8thsem-cssystemmodelingandsimulation","file:///android_asset/cs/8thcssystemmodelingandsimulation.html");
                cs8thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////
/////////////////////////////// cswirelessnetworksandmobilecomputing BUTTON- 3 ///////////////////////////////
        final Button cswirelessnetworksandmobilecomputingBut = (Button) findViewById(R.id.cswirelessnetworksandmobilecomputingbutton);
        cswirelessnetworksandmobilecomputingBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (cs8thsemActivity.this,WebviewActivity.class);
                intent.putExtra("cs-8thsem-cswirelessnetworksandmobilecomputing","file:///android_asset/cs/8thcswirelessnetworksandmobilecomputing.html");
                cs8thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////

/////////////////////////////// cswebandrichinternetapplications BUTTON- 4 ///////////////////////////////
        final Button cswebandrichinternetapplicationsBut = (Button) findViewById(R.id.cswebandrichinternetapplicationsbutton);
        cswebandrichinternetapplicationsBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (cs8thsemActivity.this,WebviewActivity.class);
                intent.putExtra("cs-8thsem-cswebandrichinternetapplications","file:///android_asset/cs/8thcswebandrichinternetapplications.html");
                cs8thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////
/////////////////////////////// csvlsidesignandalgorithms BUTTON- 5 ///////////////////////////////
        final Button csvlsidesignandalgorithmsBut = (Button) findViewById(R.id.csvlsidesignandalgorithmsbutton);
        csvlsidesignandalgorithmsBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (cs8thsemActivity.this,WebviewActivity.class);
                intent.putExtra("cs-8thsem-csvlsidesignandalgorithms","file:///android_asset/cs/8thcsvlsidesignandalgorithms.html");
                cs8thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////
/////////////////////////////// csnetworkmanagementsystems BUTTON- 6 ///////////////////////////////
        final Button csnetworkmanagementsystemsBut = (Button) findViewById(R.id.csnetworkmanagementsystemsbutton);
        csnetworkmanagementsystemsBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (cs8thsemActivity.this,WebviewActivity.class);
                intent.putExtra("cs-8thsem-csnetworkmanagementsystems","file:///android_asset/cs/8thcsnetworkmanagementsystems.html");
                cs8thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////

/////////////////////////////// csinformationandnetworksecurity BUTTON- 7 ///////////////////////////////
        final Button csinformationandnetworksecurityBut = (Button) findViewById(R.id.csinformationandnetworksecuritybutton);
        csinformationandnetworksecurityBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (cs8thsemActivity.this,WebviewActivity.class);
                intent.putExtra("cs-8thsem-csinformationandnetworksecurity","file:///android_asset/cs/8thcsinformationandnetworksecurity.html");
                cs8thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////
/////////////////////////////// csmicrocontrollerbasedsystems BUTTON- 8 ///////////////////////////////
        final Button csmicrocontrollerbasedsystemsBut = (Button) findViewById(R.id.csmicrocontrollerbasedsystemsbutton);
        csmicrocontrollerbasedsystemsBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (cs8thsemActivity.this,WebviewActivity.class);
                intent.putExtra("cs-8thsem-csmicrocontrollerbasedsystems","file:///android_asset/cs/8thcsmicrocontrollerbasedsystems.html");
                cs8thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////

/////////////////////////////// csadhocnetworks BUTTON- 9 ///////////////////////////////
        final Button csadhocnetworksBut = (Button) findViewById(R.id.csadhocnetworksbutton);
        csadhocnetworksBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (cs8thsemActivity.this,WebviewActivity.class);
                intent.putExtra("cs-8thsem-csadhocnetworks","file:///android_asset/cs/8thcsadhocnetworks.html");
                cs8thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////
/////////////////////////////// cssoftwaretesting BUTTON- 10 ///////////////////////////////
        final Button cssoftwaretestingBut = (Button) findViewById(R.id.cssoftwaretestingbutton);
        cssoftwaretestingBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (cs8thsemActivity.this,WebviewActivity.class);
                intent.putExtra("cs-8thsem-cssoftwaretesting","file:///android_asset/cs/8thcssoftwaretesting.html");
                cs8thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////

/////////////////////////////// csarmbasedsystemdesign BUTTON- 11 ///////////////////////////////
        final Button csarmbasedsystemdesignBut = (Button) findViewById(R.id.csarmbasedsystemdesignbutton);
        csarmbasedsystemdesignBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (cs8thsemActivity.this,WebviewActivity.class);
                intent.putExtra("cs-8thsem-csarmbasedsystemdesign","file:///android_asset/cs/8thcsarmbasedsystemdesign.html");
                cs8thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////

/////////////////////////////// csservicesorientedarchitecture  BUTTON- 12 ///////////////////////////////
        final Button csservicesorientedarchitectureBut = (Button) findViewById(R.id.csservicesorientedarchitecturebutton);
        csservicesorientedarchitectureBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (cs8thsemActivity.this,WebviewActivity.class);
                intent.putExtra("cs-8thsem-csservicesorientedarchitecture ","file:///android_asset/cs/8thcsservicesorientedarchitecture .html");
                cs8thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////
/////////////////////////////// cscloudsgridsandclusters BUTTON- 13 ///////////////////////////////
        final Button cscloudsgridsandclustersBut = (Button) findViewById(R.id.cscloudsgridsandclustersbutton);
        cscloudsgridsandclustersBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(cs8thsemActivity.this,WebviewActivity.class);
                intent.putExtra("cs-8thsem-cscloudsgridsandclusters","file:///android_asset/cs/8thcscloudsgridsandclusters.html");
                cs8thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////


/////////////////////////////// csmulticorearchitectureandprogramming BUTTON- 14 ///////////////////////////////
        final Button csmulticorearchitectureandprogrammingBut = (Button) findViewById(R.id.csmulticorearchitectureandprogrammingbutton);
        csmulticorearchitectureandprogrammingBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (cs8thsemActivity.this,WebviewActivity.class);
                intent.putExtra("cs-8thsem-csmulticorearchitectureandprogramming","file:///android_asset/cs/8thcsmulticorearchitectureandprogramming.html");
                cs8thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////

    }
}
