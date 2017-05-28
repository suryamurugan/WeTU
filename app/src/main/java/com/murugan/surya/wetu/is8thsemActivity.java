package com.murugan.surya.wetu;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class is8thsemActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.is8thsem);

        /////////////////////////////// issoftwarearchitectures BUTTON- 1 ///////////////////////////////
        final Button issoftwarearchitecturesBut = (Button) findViewById(R.id.issoftwarearchitecturesbutton);
        issoftwarearchitecturesBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(is8thsemActivity.this,WebviewActivity.class);
                intent.putExtra("is-8thsem-issoftwarearchitectures","file:///android_asset/is/8thissoftwarearchitectures.html");
                is8thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////


/////////////////////////////// issystemmodelingandsimulation BUTTON- 2 ///////////////////////////////
        final Button issystemmodelingandsimulationBut = (Button) findViewById(R.id.issystemmodelingandsimulationbutton);
        issystemmodelingandsimulationBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (is8thsemActivity.this,WebviewActivity.class);
                intent.putExtra("is-8thsem-issystemmodelingandsimulation","file:///android_asset/is/8thissystemmodelingandsimulation.html");
                is8thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////

/////////////////////////////// iswirelessnetworksandmobilecomputing BUTTON- 3 ///////////////////////////////
        final Button iswirelessnetworksandmobilecomputingBut = (Button) findViewById(R.id.iswirelessnetworksandmobilecomputingbutton);
        iswirelessnetworksandmobilecomputingBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (is8thsemActivity.this,WebviewActivity.class);
                intent.putExtra("is-8thsem-iswirelessnetworksandmobilecomputing","file:///android_asset/is/8thiswirelessnetworksandmobilecomputing.html");
                is8thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////


/////////////////////////////// iswebandrichinternetapplications BUTTON- 4 ///////////////////////////////
        final Button iswebandrichinternetapplicationsBut = (Button) findViewById(R.id.iswebandrichinternetapplicationsbutton);
        iswebandrichinternetapplicationsBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (is8thsemActivity.this,WebviewActivity.class);
                intent.putExtra("is-8thsem-iswebandrichinternetapplications","file:///android_asset/is/8thiswebandrichinternetapplications.html");
                is8thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////
/////////////////////////////// isuserinterfacedesign BUTTON- 5 ///////////////////////////////
        final Button isuserinterfacedesignBut = (Button) findViewById(R.id.isuserinterfacedesignbutton);
        isuserinterfacedesignBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (is8thsemActivity.this,WebviewActivity.class);
                intent.putExtra("is-8thsem-isuserinterfacedesign","file:///android_asset/is/8thisuserinterfacedesign.html");
                is8thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////

/////////////////////////////// isnetworkmanagementsystems BUTTON- 6 ///////////////////////////////
        final Button isnetworkmanagementsystemsBut = (Button) findViewById(R.id.isnetworkmanagementsystemsbutton);
        isnetworkmanagementsystemsBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (is8thsemActivity.this,WebviewActivity.class);
                intent.putExtra("is-8thsem-isnetworkmanagementsystems","file:///android_asset/is/8thisnetworkmanagementsystems.html");
                is8thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////

/////////////////////////////// isinformationandnetworksecurity BUTTON- 7 ///////////////////////////////
        final Button isinformationandnetworksecurityBut = (Button) findViewById(R.id.isinformationandnetworksecuritybutton);
        isinformationandnetworksecurityBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (is8thsemActivity.this,WebviewActivity.class);
                intent.putExtra("is-8thsem-isinformationandnetworksecurity","file:///android_asset/is/8thisinformationandnetworksecurity.html");
                is8thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////
/////////////////////////////// ismicrocontrollerbasedsystems BUTTON- 8 ///////////////////////////////
        final Button ismicrocontrollerbasedsystemsBut = (Button) findViewById(R.id.ismicrocontrollerbasedsystemsbutton);
        ismicrocontrollerbasedsystemsBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (is8thsemActivity.this,WebviewActivity.class);
                intent.putExtra("is-8thsem-ismicrocontrollerbasedsystems","file:///android_asset/is/8thismicrocontrollerbasedsystems.html");
                is8thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////

/////////////////////////////// isadhocnetworks BUTTON- 9 ///////////////////////////////
        final Button isadhocnetworksBut = (Button) findViewById(R.id.isadhocnetworksbutton);
        isadhocnetworksBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (is8thsemActivity.this,WebviewActivity.class);
                intent.putExtra("is-8thsem-isadhocnetworks","file:///android_asset/is/8thisadhocnetworks.html");
                is8thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////

/////////////////////////////// isinformationretrival BUTTON- 10 ///////////////////////////////
        final Button isinformationretrivalBut = (Button) findViewById(R.id.isinformationretrivalbutton);
        isinformationretrivalBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (is8thsemActivity.this,WebviewActivity.class);
                intent.putExtra("is-8thsem-isinformationretrival","file:///android_asset/is/8thisinformationretrival.html");
                is8thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////
/////////////////////////////// Issupplychainmanagement BUTTON- 11 ///////////////////////////////
        final Button IssupplychainmanagementBut = (Button) findViewById(R.id.Issupplychainmanagementbutton);
        IssupplychainmanagementBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (is8thsemActivity.this,WebviewActivity.class);
                intent.putExtra("is-8thsem-issupplychainmanagement","file:///android_asset/is/8thIssupplychainmanagement.html");
                is8thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////


/////////////////////////////// isservicesorientedarchitecture  BUTTON- 12 ///////////////////////////////
        final Button isservicesorientedarchitectureBut = (Button) findViewById(R.id.isservicesorientedarchitecturebutton);
        isservicesorientedarchitectureBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (is8thsemActivity.this,WebviewActivity.class);
                intent.putExtra("is-8thsem-isservicesorientedarchitecture ","file:///android_asset/is/8thisservicesorientedarchitecture .html");
                is8thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////
/////////////////////////////// iscloudsgridsandclusters BUTTON- 13 ///////////////////////////////
        final Button iscloudsgridsandclustersBut = (Button) findViewById(R.id.iscloudsgridsandclustersbutton);
        iscloudsgridsandclustersBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (is8thsemActivity.this,WebviewActivity.class);
                intent.putExtra("is-8thsem-iscloudsgridsandclusters","file:///android_asset/is/8thiscloudsgridsandclusters.html");
                is8thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////
/////////////////////////////// isdecisionsupportsystems BUTTON- 14 ///////////////////////////////
        final Button isdecisionsupportsystemsBut = (Button) findViewById(R.id.isdecisionsupportsystemsbutton);
        isdecisionsupportsystemsBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (is8thsemActivity.this,WebviewActivity.class);
                intent.putExtra("is-8thsem-isdecisionsupportsystems","file:///android_asset/is/8thisdecisionsupportsystems.html");
                is8thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////



    }
}
