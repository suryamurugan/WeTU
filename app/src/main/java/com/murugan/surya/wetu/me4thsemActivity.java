package com.murugan.surya.wetu;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.content.Intent;


public class me4thsemActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.me4thsem);

        /////////////////////////////// meappliedthermodynamics BUTTON- 1 ///////////////////////////////
        final Button meappliedthermodynamicsBut = (Button) findViewById(R.id.meappliedthermodynamicsbutton);
        meappliedthermodynamicsBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(me4thsemActivity.this,WebviewActivity.class);
                intent.putExtra("me-4thsem-meappliedthermodynamics","file:///android_asset/me/4thmeappliedthermodynamics.html");
                me4thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////
/////////////////////////////// mekinematicsofmachines BUTTON- 2 ///////////////////////////////
        final Button mekinematicsofmachinesBut = (Button) findViewById(R.id.mekinematicsofmachinesbutton);
        mekinematicsofmachinesBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (me4thsemActivity.this,WebviewActivity.class);
                intent.putExtra("me-4thsem-mekinematicsofmachines","file:///android_asset/me/4thmekinematicsofmachines.html");
                me4thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////
/////////////////////////////// memanufacturingprocess2 BUTTON- 3 ///////////////////////////////
        final Button memanufacturingprocess2But = (Button)findViewById(R.id.memanufacturingprocess2button);
        memanufacturingprocess2But.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (me4thsemActivity.this,WebviewActivity.class);
                intent.putExtra("me-4thsem-memanufacturingprocess2","file:///android_asset/me/4thmemanufacturingprocess2.html");
                me4thsemActivity.this.startActivity(intent);
            }
        });
//////////////////////////////////////////////////////////////////////// /////////////////////////////// meengineeringmathematics4 BUTTON- 4 ///////////////////////////////
        final Button meengineeringmathematics4But = (Button) findViewById(R.id.meengineeringmathematics4button);
        meengineeringmathematics4But.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (me4thsemActivity.this,WebviewActivity.class);
                intent.putExtra("me-4thsem-meengineeringmathematics4","file:///android_asset/me/4thmeengineeringmathematics4.html");
                me4thsemActivity.this.startActivity(intent);
            }
        });
//////////////////////////////////////////////////////////////////////// /////////////////////////////// meadvancedmathematics2 BUTTON- 5 ///////////////////////////////
        final Button meadvancedmathematics2But = (Button) findViewById(R.id.meadvancedmathematics2button);
        meadvancedmathematics2But.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (me4thsemActivity.this,WebviewActivity.class);
                intent.putExtra("me-4thsem-meadvancedmathematics2","file:///android_asset/me/4thmeadvancedmathematics2.html");
                me4thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////



    }
}
