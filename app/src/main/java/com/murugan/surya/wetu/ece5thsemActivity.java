package com.murugan.surya.wetu;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.content.Intent;


public class ece5thsemActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ece5thsem);
        ///////////////////////// managementandentrepreneurship BUTTON- 1 ///////////////////////////////
        final Button managementandentrepreneurshipBut = (Button) findViewById(R.id.managementandentrepreneurshipbutton);
        managementandentrepreneurshipBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (ece5thsemActivity.this,WebviewActivity.class);
                intent.putExtra("ece-5thsem-managementandentrepreneurship","file:///android_asset/ece/5thmanagementandentrepreneurship.html");
                ece5thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////////////////////////////////
        /////////////////////////////// digitalsignalprocessing BUTTON- 2 ///////////////////////////////
        final Button digitalsignalprocessingBut = (Button) findViewById(R.id.digitalsignalprocessingbutton);
        digitalsignalprocessingBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (ece5thsemActivity.this,WebviewActivity.class);
                intent.putExtra("ece-5thsem-digitalsignalprocessing","file:///android_asset/ece/5thdigitalsignalprocessing.html");
                ece5thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////
/////////////////////////////// analogcommunication BUTTON- 3 ///////////////////////////////
        final Button analogcommunicationBut = (Button) findViewById(R.id.analogcommunicationbutton);
        analogcommunicationBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (ece5thsemActivity.this,WebviewActivity.class);
                intent.putExtra("ece-5thsem-analogcommunication","file:///android_asset/ece/5thanalogcommunication.html");
                ece5thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////
/////////////////////////////// microwavesandradar BUTTON- 4 ///////////////////////////////
        final Button microwavesandradarBut = (Button) findViewById(R.id.microwavesandradarbutton);
        microwavesandradarBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (ece5thsemActivity.this,WebviewActivity.class);
                intent.putExtra("ece-5thsem-microwavesandradar","file:///android_asset/ece/5thmicrowavesandradar.html");
                ece5thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////
        /////////////////////////////// informationtheoryandcoding BUTTON- 5 ///////////////////////////////
        final Button informationtheoryandcodingBut = (Button) findViewById(R.id.informationtheoryandcodingbutton);
        informationtheoryandcodingBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (ece5thsemActivity.this,WebviewActivity.class);
                intent.putExtra("ece-5thsem-informationtheoryandcoding","file:///android_asset/ece/5thinformationtheoryandcoding.html");
                ece5thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////
/////////////////////////////// analogelectronicslab BUTTON- 6 ///////////////////////////////
        final Button analogelectronicslabBut = (Button) findViewById(R.id.analogelectronicslabbutton);
        analogelectronicslabBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (ece5thsemActivity.this,WebviewActivity.class);
                intent.putExtra("ece-5thsem-analogelectronicslab","file:///android_asset/ece/5thanalogelectronicslab.html");
                ece5thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////
        /////////////////////////////// fundamentalsofcmosvlsi BUTTON- 7 ///////////////////////////////
        final Button fundamentalsofcmosvlsiBut = (Button) findViewById(R.id.fundamentalsofcmosvlsibutton);
        fundamentalsofcmosvlsiBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (ece5thsemActivity.this,WebviewActivity.class);
                intent.putExtra("ece-5thsem-fundamentalsofcmosvlsi","file:///android_asset/ece/5thfundamentalsofcmosvlsi.html");
                ece5thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////
        /////////////////////////////// dsplab BUTTON- 8 ///////////////////////////////
        final Button dsplabBut = (Button) findViewById(R.id.dsplabbutton);
        dsplabBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (ece5thsemActivity.this,WebviewActivity.class);
                intent.putExtra("ece-5thsem-dsplab","file:///android_asset/ece/5thdsplab.html");
                ece5thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////
/////////////////////////////// analogcommunictaionlabliclab BUTTON- 9 ///////////////////////////////
        final Button analogcommunictaionlabliclabBut = (Button) findViewById(R.id.analogcommunictaionlabliclabbutton);
        analogcommunictaionlabliclabBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (ece5thsemActivity.this,WebviewActivity.class);
                intent.putExtra("ece-5thsem-analogcommunictaionlabliclab","file:///android_asset/ece/5thanalogcommunictaionlabliclab.html");
                ece5thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////




    }
}
