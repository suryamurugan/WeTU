package com.murugan.surya.wetu;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class cs5thsemActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cs5thsem);

        //////////////////////////////////////////////////////////////
        /////////////////////////////// cssoftwareengineering BUTTON- 1 ///////////////////////////////
        final Button cssoftwareengineeringBut = (Button) findViewById(R.id.cssoftwareengineeringbutton);
        cssoftwareengineeringBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(cs5thsemActivity.this,WebviewActivity.class);
                intent.putExtra("cs-5thsem-cssoftwareengineering","file:///android_asset/cs/5thcssoftwareengineering.html");
                cs5thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////
/////////////////////////////// cssystemssoftware BUTTON- 2 ///////////////////////////////
        final Button cssystemssoftwareBut = (Button) findViewById(R.id.cssystemssoftwarebutton);
        cssystemssoftwareBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (cs5thsemActivity.this,WebviewActivity.class);
                intent.putExtra("cs-5thsem-cssystemssoftware","file:///android_asset/cs/5thcssystemssoftware.html");
                cs5thsemActivity.this.startActivity(intent);
            }
        });
/////////////////////////////////////////////////////////////////////////////////////////////////////// csoperatingsystems BUTTON- 3 ///////////////////////////////
        final Button csoperatingsystemsBut = (Button) findViewById(R.id.csoperatingsystemsbutton);
        csoperatingsystemsBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (cs5thsemActivity.this,WebviewActivity.class);
                intent.putExtra("cs-5thsem-csoperatingsystems","file:///android_asset/cs/5thcsoperatingsystems.html");
                cs5thsemActivity.this.startActivity(intent);
            }
        });
/////////////////////////////////////////////////////////////////////////////////////////////////////// csdatabasemanagementsystems BUTTON- 4 ///////////////////////////////
        final Button csdatabasemanagementsystemsBut = (Button) findViewById(R.id.csdatabasemanagementsystemsbutton);
        csdatabasemanagementsystemsBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (cs5thsemActivity.this,WebviewActivity.class);
                intent.putExtra("cs-5thsem-csdatabasemanagementsystems","file:///android_asset/cs/5thcsdatabasemanagementsystems.html");
                cs5thsemActivity.this.startActivity(intent);
            }
        });
/////////////////////////////////////////////////////////////////////////////////////////////////////// cscomputernetworks1 BUTTON- 5 ///////////////////////////////
        final Button cscomputernetworks1But = (Button) findViewById(R.id.cscomputernetworks1button);
        cscomputernetworks1But.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (cs5thsemActivity.this,WebviewActivity.class);
                intent.putExtra("cs-5thsem-cscomputernetworks1","file:///android_asset/cs/5thcscomputernetworks1.html");
                cs5thsemActivity.this.startActivity(intent);
            }
        });
/////////////////////////////////////////////////////////////////////////////////////////////////////// csformallanguagesandautomatatheory BUTTON- 6 ///////////////////////////////
        final Button csformallanguagesandautomatatheoryBut = (Button) findViewById(R.id.csformallanguagesandautomatatheorybutton);
        csformallanguagesandautomatatheoryBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (cs5thsemActivity.this,WebviewActivity.class);
                intent.putExtra("cs-5thsem-csformallanguagesandautomatatheory","file:///android_asset/cs/5thcsformallanguagesandautomatatheory.html");
                cs5thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////
/////////////////////////////// csdatabaseapplicationslaboratory BUTTON- 7 ///////////////////////////////
        final Button csdatabaseapplicationslaboratoryBut = (Button) findViewById(R.id.csdatabaseapplicationslaboratorybutton);
        csdatabaseapplicationslaboratoryBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (cs5thsemActivity.this,WebviewActivity.class);
                intent.putExtra("cs-5thsem-csdatabaseapplicationslaboratory","file:///android_asset/cs/5thcsdatabaseapplicationslaboratory.html");
                cs5thsemActivity.this.startActivity(intent);
            }
        });
/////////////////////////////////////////////////////////////////////////////////////////////////////// cssystemssoftwareandoperatingsystemslaboratory BUTTON- 8 ///////////////////////////////
        final Button cssystemssoftwareandoperatingsystemslaboratoryBut = (Button) findViewById(R.id.cssystemssoftwareandoperatingsystemslaboratorybutton);
        cssystemssoftwareandoperatingsystemslaboratoryBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (cs5thsemActivity.this,WebviewActivity.class);
                intent.putExtra("cs-5thsem-cssystemssoftwareandoperatingsystemslaboratory","file:///android_asset/cs/5thcssystemssoftwareandoperatingsystemslaboratory.html");
                cs5thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////

    }
}
