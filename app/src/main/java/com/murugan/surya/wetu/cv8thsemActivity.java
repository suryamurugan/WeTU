package com.murugan.surya.wetu;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class cv8thsemActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cv8thsem);

        /////////////////////////////// cvadvanceconcretetechnology BUTTON- 1 ///////////////////////////////
        final Button cvadvanceconcretetechnologyBut = (Button) findViewById(R.id.cvadvanceconcretetechnology23button);
        cvadvanceconcretetechnologyBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(cv8thsemActivity.this,WebviewActivity.class);
                intent.putExtra("cv-8thsem-cvadvanceconcretetechnology","file:///android_asset/cv/8thcvadvanceconcretetechnology.html");
                cv8thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////
/////////////////////////////// cvdesignanddrawingofsteelstructures BUTTON- 2 ///////////////////////////////
        final Button cvdesignanddrawingofsteelstructuresBut = (Button) findViewById(R.id.cvdesignanddrawingofsteelstructuresbutton);
        cvdesignanddrawingofsteelstructuresBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (cv8thsemActivity.this,WebviewActivity.class);
                intent.putExtra("cv-8thsem-cvdesignanddrawingofsteelstructures","file:///android_asset/cv/8thcvdesignanddrawingofsteelstructures.html");
                cv8thsemActivity.this.startActivity(intent);
            }
        });
//////////////////////////////////////////////////////////////////////// /////////////////////////////// cvadvanceprestressedconcretestructures BUTTON- 3 ///////////////////////////////
        final Button cvadvanceprestrconcretestrbutton = (Button) findViewById(R.id.cvadvanceprestrconcretestrbutton);
        cvadvanceprestrconcretestrbutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (cv8thsemActivity.this,WebviewActivity.class);
                intent.putExtra("cv-8thsem-cvadvanceprestrconcretestrbutton","file:///android_asset/cv/8thcvadvanceprestressedconcretestructures.html");
                cv8thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////
/////////////////////////////// cvadvancedfoundationdesign BUTTON- 4 ///////////////////////////////
        final Button cvadvancedfoundationdesignBut = (Button) findViewById(R.id.cvadvancedfoundationdesignbutton);
        cvadvancedfoundationdesignBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (cv8thsemActivity.this,WebviewActivity.class);
                intent.putExtra("cv-8thsem-cvadvancedfoundationdesign","file:///android_asset/cv/8thcvadvancedfoundationdesign.html");
                cv8thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////
/////////////////////////////// cvpavementdesign BUTTON- 5 ///////////////////////////////
        final Button cvpavementdesignBut = (Button) findViewById(R.id.cvpavementdesignbutton);
        cvpavementdesignBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (cv8thsemActivity.this,WebviewActivity.class);
                intent.putExtra("cv-8thsem-cvpavementdesign","file:///android_asset/cv/8thcvpavementdesign.html");
                cv8thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////

/////////////////////////////// cvearthquakeresistantdesignofstructures BUTTON- 6 ///////////////////////////////
        final Button cvearthquakeresistdesignofstrBut = (Button) findViewById(R.id.cvearthquakeresistdesignofstrbutton);
        cvearthquakeresistdesignofstrBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (cv8thsemActivity.this,WebviewActivity.class);
                intent.putExtra("cv-8thsem-cvearthquakeresistdesignofstr","file:///android_asset/cv/8thcvearthquakeresistantdesignofstructures.html");
                cv8thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////
/////////////////////////////// cvindustrialwastewatertreatment BUTTON- 7 ///////////////////////////////
        final Button cvindustrialwastewatertreatmentBut = (Button) findViewById(R.id.cvindustrialwastewatertreatmentbutton);
        cvindustrialwastewatertreatmentBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (cv8thsemActivity.this,WebviewActivity.class);
                intent.putExtra("cv-8thsem-cvindustrialwastewatertreatment","file:///android_asset/cv/8thcvindustrialwastewatertreatment.html");
                cv8thsemActivity.this.startActivity(intent);
            }
        });
//////////////////////////////////////////////////////////////////////// /////////////////////////////// cvqualitymanagementsystemincivilengineering BUTTON- 8 ///////////////////////////////
        final Button cvqualitymanagementsysincivilengineeringBut = (Button) findViewById(R.id.cvqualitymanagementsystemincivilengineeringbutton);
        cvqualitymanagementsysincivilengineeringBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (cv8thsemActivity.this,WebviewActivity.class);
                intent.putExtra("cv-8thsem-cvqualitymanagementsystemincivilengineering","file:///android_asset/cv/8thcvqualitymanagementsystemincivilengineering.html");
                cv8thsemActivity.this.startActivity(intent);
            } });
////////////////////////////////////////////////////////////////////////

/////////////////////////////// cvfiniteelementalysis BUTTON- 9 ///////////////////////////////
        final Button cvfiniteearthanalButon = (Button) findViewById(R.id.cvfiniteelementanaiiibutton);
        cvfiniteearthanalButon.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (cv8thsemActivity.this,WebviewActivity.class);
                intent.putExtra("cv-8thsem-cvfnalysis","file:///android_asset/cv/8thcvfiniteelementanalysis.html");
                cv8thsemActivity.this.startActivity(intent);
            }
        });
//////////////////////////////////////////////////////////////////////// /////////////////////////////// cvreinforcesearthstructures BUTTON- 10 ///////////////////////////////
        final Button cvreinforcesearthstructuresBut = (Button) findViewById(R.id.cvreinforcesearthstructuresbutton);
        cvreinforcesearthstructuresBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (cv8thsemActivity.this,WebviewActivity.class);
                intent.putExtra("cv-8thsem-cvreinforcesearthstructures","file:///android_asset/cv/8thcvreinforcesearthstructures.html");
                cv8thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////
/////////////////////////////// cvurbantransportplanning BUTTON- 11 ///////////////////////////////
        final Button cvurbantransportplanningBut = (Button) findViewById(R.id.cvurbantransportplanningbutton);
        cvurbantransportplanningBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (cv8thsemActivity.this,WebviewActivity.class);
                intent.putExtra("cv-8thsem-cvurbantransportplanning","file:///android_asset/cv/8thcvurbantransportplanning.html");
                cv8thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////
/////////////////////////////// cvgeographicinformationsystem BUTTON- 12 ///////////////////////////////
        final Button cvgeographicinformationsystemBut = (Button) findViewById(R.id.cvgeographicinformationsystembutton);
        cvgeographicinformationsystemBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (cv8thsemActivity.this,WebviewActivity.class);
                intent.putExtra("cv-8thsem-cvgeographicinformationsystem","file:///android_asset/cv/8thcvgeographicinformationsystem.html");
                cv8thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////
/////////////////////////////// cvadvancedesignofsteelstructures BUTTON- 13 ///////////////////////////////
        final Button cvadvancedesignofsteelstructuresBut = (Button)findViewById(R.id.cvadvancedesignofsteelstructuresbutton);
        cvadvancedesignofsteelstructuresBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (cv8thsemActivity.this,WebviewActivity.class);
                intent.putExtra("cv-8thsem-cvadvancedesignofsteelstructures","file:///android_asset/cv/8thcvadvancedesignofsteelstructures.html");
                cv8thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////
/////////////////////////////// cvwaterresourcesengineering BUTTON- 14 ///////////////////////////////
        final Button cvwaterresourcesengineeringBut = (Button) findViewById(R.id.cvwaterresourcesengineeringbutton);
        cvwaterresourcesengineeringBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (cv8thsemActivity.this,WebviewActivity.class);
                intent.putExtra("cv-8thsem-cvwaterresourcesengineering","file:///android_asset/cv/8thcvwaterresourcesengineering.html");
                cv8thsemActivity.this.startActivity(intent);
            }
        });
//////////////////////////////////////////////////////////////////////// /////////////////////////////// cvenvironmentalimpactassessment BUTTON- 15 ///////////////////////////////
        final Button cvenvironmentalimpactassessmentBut = (Button) findViewById(R.id.cvenvironmentalimpactassessmentbutton);
        cvenvironmentalimpactassessmentBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (cv8thsemActivity.this,WebviewActivity.class);
                intent.putExtra("cv-8thsem-cvenvironmentalimpactassessment","file:///android_asset/cv/8thcvenvironmentalimpactassessment.html");
                cv8thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////


    }
}
