package com.murugan.surya.wetu;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class is5thsemActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.is5thsem);


        /////////////////////////////// issoftwareengineering BUTTON- 1 ///////////////////////////////
        final Button issoftwareengineeringBut = (Button) findViewById(R.id.issoftwareengineeringbutton);
        issoftwareengineeringBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(is5thsemActivity.this,WebviewActivity.class);
                intent.putExtra("is-5thsem-issoftwareengineering","file:///android_asset/is/5thissoftwareengineering.html");
                is5thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////
/////////////////////////////// issystemssoftware BUTTON- 2 ///////////////////////////////
        final Button issystemssoftwareBut = (Button) findViewById(R.id.issystemssoftwarebutton);
        issystemssoftwareBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (is5thsemActivity.this,WebviewActivity.class);
                intent.putExtra("is-5thsem-issystemssoftware","file:///android_asset/is/5thissystemssoftware.html");
                is5thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////

/////////////////////////////// isoperatingsystems BUTTON- 3 ///////////////////////////////
        final Button isoperatingsystemsBut = (Button) findViewById(R.id.isoperatingsystemsbutton);
        isoperatingsystemsBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (is5thsemActivity.this,WebviewActivity.class);
                intent.putExtra("is-5thsem-isoperatingsystems","file:///android_asset/is/5thisoperatingsystems.html");
                is5thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////
/////////////////////////////// isdatabasemanagementsystems BUTTON- 4 ///////////////////////////////
        final Button isdatabasemanagementsystemsBut = (Button) findViewById(R.id.isdatabasemanagementsystemsbutton);
        isdatabasemanagementsystemsBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (is5thsemActivity.this,WebviewActivity.class);
                intent.putExtra("is-5thsem-isdatabasemanagementsystems","file:///android_asset/is/5thisdatabasemanagementsystems.html");
                is5thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////

/////////////////////////////// iscomputernetworks1 BUTTON- 5 ///////////////////////////////
        final Button iscomputernetworks1But = (Button) findViewById(R.id.iscomputernetworks1button);
        iscomputernetworks1But.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (is5thsemActivity.this,WebviewActivity.class);
                intent.putExtra("is-5thsem-iscomputernetworks1","file:///android_asset/is/5thiscomputernetworks1.html");
                is5thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////

/////////////////////////////// isformallanguagesandautomatatheory BUTTON- 6 ///////////////////////////////
        final Button isformallanguagesandautomatatheoryBut = (Button) findViewById(R.id.isformallanguagesandautomatatheorybutton);
        isformallanguagesandautomatatheoryBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (is5thsemActivity.this,WebviewActivity.class);
                intent.putExtra("is-5thsem-isformallanguagesandautomatatheory","file:///android_asset/is/5thisformallanguagesandautomatatheory.html");
                is5thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////

/////////////////////////////// isdatabaseapplicationslaboratory BUTTON- 7 ///////////////////////////////
        final Button isdatabaseapplicationslaboratoryBut = (Button) findViewById(R.id.isdatabaseapplicationslaboratorybutton);
        isdatabaseapplicationslaboratoryBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (is5thsemActivity.this,WebviewActivity.class);
                intent.putExtra("is-5thsem-isdatabaseapplicationslaboratory","file:///android_asset/is/5thisdatabaseapplicationslaboratory.html");
                is5thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////
/////////////////////////////// issystemssoftwareandoperatingsystemslaboratory BUTTON- 8 ///////////////////////////////
        final Button issystemssoftwareandoperatingsystemslaboratoryBut = (Button) findViewById(R.id.issystemssoftwareandoperatingsystemslaboratorybutton);
        issystemssoftwareandoperatingsystemslaboratoryBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (is5thsemActivity.this,WebviewActivity.class);
                intent.putExtra("is-5thsem-issystemssoftwareandoperatingsystemslaboratory","file:///android_asset/is/5thissystemssoftwareandoperatingsystemslaboratory.html");
                is5thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////





    }
}
