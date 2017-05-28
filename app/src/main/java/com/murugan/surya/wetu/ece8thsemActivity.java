package com.murugan.surya.wetu;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class ece8thsemActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ece8thsem);
        /////////////////////////////// wirelesscommunication BUTTON- 1 ///////////////////////////////
        final Button wirelesscommunicationBut = (Button) findViewById(R.id.wirelesscommunicationbutton);
        wirelesscommunicationBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (ece8thsemActivity.this,WebviewActivity.class);
                intent.putExtra("ece-8thsem-wirelesscommunication","file:///android_asset/ece/8thwirelesscommunication.html");
                ece8thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////

/////////////////////////////// digitalswitchingsystems BUTTON- 2 ///////////////////////////////
        final Button digitalswitchingsystemsBut = (Button) findViewById(R.id.digitalswitchingsystemsbutton);
        digitalswitchingsystemsBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (ece8thsemActivity.this,WebviewActivity.class);
                intent.putExtra("ece-8thsem-digitalswitchingsystems","file:///android_asset/ece/8thdigitalswitchingsystems.html");
                ece8thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////

/////////////////////////////// distributedsystems BUTTON- 3 ///////////////////////////////
        final Button distributedsystemsBut = (Button) findViewById(R.id.distributedsystemsbutton);
        distributedsystemsBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (ece8thsemActivity.this,WebviewActivity.class);
                intent.putExtra("ece-8thsem-distributedsystems","file:///android_asset/ece/8thdistributedsystems.html");
                ece8thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////
/////////////////////////////// networksecurity BUTTON- 4 ///////////////////////////////
        final Button networksecurityBut = (Button) findViewById(R.id.networksecuritybutton);
        networksecurityBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (ece8thsemActivity.this,WebviewActivity.class);
                intent.putExtra("ece-8thsem-networksecurity","file:///android_asset/ece/8thnetworksecurity.html");
                ece8thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////
/////////////////////////////// opticalnetworks BUTTON- 5 ///////////////////////////////
        final Button opticalnetworksBut = (Button) findViewById(R.id.opticalnetworksbutton);
        opticalnetworksBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (ece8thsemActivity.this,WebviewActivity.class);
                intent.putExtra("ece-8thsem-opticalnetworks","file:///android_asset/ece/8thopticalnetworks.html");
                ece8thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////
/////////////////////////////// highperformancecomputingnetworks BUTTON- 6 ///////////////////////////////
        final Button highperformancecomputingnetworksBut = (Button) findViewById(R.id.highperformancecomputingnetworksbutton);
        highperformancecomputingnetworksBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (ece8thsemActivity.this,WebviewActivity.class);
                intent.putExtra("ece-8thsem-highperformancecomputingnetworks","file:///android_asset/ece/8thhighperformancecomputingnetworks.html");
                ece8thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////
/////////////////////////////// internetengineering BUTTON- 7 ///////////////////////////////
        final Button internetengineeringBut = (Button) findViewById(R.id.internetengineeringbutton);
        internetengineeringBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (ece8thsemActivity.this,WebviewActivity.class);
                intent.putExtra("ece-8thsem-internetengineering","file:///android_asset/ece/8thinternetengineering.html");
                ece8thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////
/////////////////////////////// multimediacommunication BUTTON- 8 ///////////////////////////////
        final Button multimediacommunicationBut = (Button) findViewById(R.id.multimediacommunicationbutton);
        multimediacommunicationBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (ece8thsemActivity.this,WebviewActivity.class);
                intent.putExtra("ece-8thsem-multimediacommunication","file:///android_asset/ece/8thmultimediacommunication.html");
                ece8thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////
/////////////////////////////// realtimeoperatingsystems BUTTON- 9 ///////////////////////////////
        final Button realtimeoperatingsystemsBut = (Button) findViewById(R.id.realtimeoperatingsystemsbutton);
        realtimeoperatingsystemsBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (ece8thsemActivity.this,WebviewActivity.class);
                intent.putExtra("ece-8thsem-realtimeoperatingsystems","file:///android_asset/ece/8threaltimeoperatingsystems.html");
                ece8thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////
/////////////////////////////// gsm BUTTON- 10 ///////////////////////////////
        final Button gsmBut = (Button) findViewById(R.id.gsmbutton);
        gsmBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (ece8thsemActivity.this,WebviewActivity.class);
                intent.putExtra("ece-8thsem-gsm","file:///android_asset/ece/8thgsm.html");
                ece8thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////
/////////////////////////////// adhocwirelessnetworks BUTTON- 11 ///////////////////////////////
        final Button adhocwirelessnetworksBut = (Button) findViewById(R.id.adhocwirelessnetworksbutton);
        adhocwirelessnetworksBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (ece8thsemActivity.this,WebviewActivity.class);
                intent.putExtra("ece-8thsem-adhocwirelessnetworks","file:///android_asset/ece/8thadhocwirelessnetworks.html");
                ece8thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////
/////////////////////////////// opticalcomputing BUTTON- 12 ///////////////////////////////
        final Button opticalcomputingBut = (Button) findViewById(R.id.opticalcomputingbutton);
        opticalcomputingBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (ece8thsemActivity.this,WebviewActivity.class);
                intent.putExtra("ece-8thsem-opticalcomputing","file:///android_asset/ece/8thopticalcomputing.html");
                ece8thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////

    }
}
