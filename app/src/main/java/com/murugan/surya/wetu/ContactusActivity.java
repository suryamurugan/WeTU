package com.murugan.surya.wetu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ContactusActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contactus_layout);





        //////////////////////////WETU RADAR CONTACT US PAGE official site///////////////////////////////
        final Button vtuofficialsiteBut = (Button) findViewById(R.id.contactusbutton);
        vtuofficialsiteBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent intent = new Intent(ContactusActivity.this,WebviewforquestionsActivity.class);
                intent.putExtra("WETURADAR","http://weturadar.com/contact-us/");
                ContactusActivity.this.startActivity(intent);
                //Toast.makeText(getContext(), "Please provide storage access to download question papers",
                //   Toast.LENGTH_LONG).show();
            }
        });
        ////////////////////////////////////////////////////////////////////////









    }
}
