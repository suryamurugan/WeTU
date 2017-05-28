package com.murugan.surya.wetu;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class cv7thsemActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cv7thsem);

        /////////////////////////////// cvenvironmentalengineering2 BUTTON- 1 ///////////////////////////////
        final Button cvenvironmentalengineering2But = (Button) findViewById(R.id.cvenvironmentalengineering2button);
        cvenvironmentalengineering2But.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(cv7thsemActivity.this,WebviewActivity.class);
                intent.putExtra("cv-7thsem-cvenvironmentalengineering2","file:///android_asset/cv/7thcvenvironmentalengineering2.html");
                cv7thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////
/////////////////////////////// cvdesignofsteelstructures BUTTON- 2 ///////////////////////////////
        final Button cvdesignofsteelstructuresBut = (Button) findViewById(R.id.cvdesignofsteelstructuresbutton);
        cvdesignofsteelstructuresBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (cv7thsemActivity.this,WebviewActivity.class);
                intent.putExtra("cv-7thsem-cvdesignofsteelstructures","file:///android_asset/cv/7thcvdesignofsteelstructures.html");
                cv7thsemActivity.this.startActivity(intent);
            }
        });
//////////////////////////////////////////////////////////////////////// /////////////////////////////// cvestimationandvaluation BUTTON- 3 ///////////////////////////////
        final Button cvestimationandvaluationBut = (Button) findViewById(R.id.cvestimationandvaluationbutton);
        cvestimationandvaluationBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (cv7thsemActivity.this,WebviewActivity.class);
                intent.putExtra("cv-7thsem-cvestimationandvaluation","file:///android_asset/cv/7thcvestimationandvaluation.html");
                cv7thsemActivity.this.startActivity(intent);
            }
        });
//////////////////////////////////////////////////////////////////////// /////////////////////////////// cvdesignofprestressedconcretestructures BUTTON- 4 ///////////////////////////////
        final Button cvdesignofprestressedconcretestructuresBut = (Button) findViewById(R.id.cvdesignofprestressedconcretestructuresbutton);
        cvdesignofprestressedconcretestructuresBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (cv7thsemActivity.this,WebviewActivity.class);
                intent.putExtra("cv-7thsem-cvdesignofprestressedconcretestructures","file:///android_asset/cv/7thcvdesignofprestressedconcretestructures.html");
                cv7thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////
/////////////////////////////// cvmatrixmethodsofstructuralanalysis BUTTON- 5 ///////////////////////////////
        final Button cvmatrixmethodsofstructuralanalysisBut = (Button) findViewById(R.id.cvmatrixmethodsofstructuralanalysisbutton);
        cvmatrixmethodsofstructuralanalysisBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (cv7thsemActivity.this,WebviewActivity.class);
                intent.putExtra("cv-7thsem-cvmatrixmethodsofstructuralanalysis","file:///android_asset/cv/7thcvmatrixmethodsofstructuralanalysis.html");
                cv7thsemActivity.this.startActivity(intent);
            }
        });
//////////////////////////////////////////////////////////////////////// /////////////////////////////// cvadvancedesignofrcstructures BUTTON- 6 ///////////////////////////////
        final Button cvadvancedesignofrcstructuresBut = (Button) findViewById(R.id.cvadvancedesignofrcstructuresbutton);
        cvadvancedesignofrcstructuresBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (cv7thsemActivity.this,WebviewActivity.class);
                intent.putExtra("cv-7thsem-cvadvancedesignofrcstructures","file:///android_asset/cv/7thcvadvancedesignofrcstructures.html");
                cv7thsemActivity.this.startActivity(intent);
            }
        });
//////////////////////////////////////////////////////////////////////// /////////////////////////////// cvdesignofmasonrystructures BUTTON- 7 ///////////////////////////////
        final Button cvdesignofmasonrystructuresBut = (Button) findViewById(R.id.cvdesignofmasonrystructuresbutton);
        cvdesignofmasonrystructuresBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (cv7thsemActivity.this,WebviewActivity.class);
                intent.putExtra("cv-7thsem-cvdesignofmasonrystructures","file:///android_asset/cv/7thcvdesignofmasonrystructures.html");
                cv7thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////
/////////////////////////////// cvearthandearthreatiningstructures BUTTON- 8 ///////////////////////////////
        final Button cvearthandearthreatiningstructures22But = (Button) findViewById(R.id.cvearthandearthreatiningstructures112button);
        cvearthandearthreatiningstructures22But.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (cv7thsemActivity.this,WebviewActivity.class);
                intent.putExtra("cv-7thsem-cvearthandearthreatiningstructures222","file:///android_asset/cv/7thcvearthandearthreatiningstructures.html");
                cv7thsemActivity.this.startActivity(intent);
            }
        });
//////////////////////////////////////////////////////////////////////// /////////////////////////////// cvhighwaygeometricdesign1 BUTTON- 9 ///////////////////////////////
        final Button cvhighwaygeometricdesign1But = (Button) findViewById(R.id.cvhighwaygeometricdesign1button);
        cvhighwaygeometricdesign1But.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (cv7thsemActivity.this,WebviewActivity.class);
                intent.putExtra("cv-7thsem-cvhighwaygeometricdesign1","file:///android_asset/cv/7thcvhighwaygeometricdesign1.html");
                cv7thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////


/////////////////////////////// cvopenchannelhydraulics BUTTON- 10 ///////////////////////////////
        final Button cvopenchannelhydraulicsBut = (Button) findViewById(R.id.cvopenchannelhydraulicsbutton);
        cvopenchannelhydraulicsBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (cv7thsemActivity.this,WebviewActivity.class);
                intent.putExtra("cv-7thsem-cvopenchannelhydraulics","file:///android_asset/cv/7thcvopenchannelhydraulics.html");
                cv7thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////
/////////////////////////////// cvsolidwastemanagement BUTTON- 11 ///////////////////////////////
        final Button cvsolidwastemanagementBut = (Button) findViewById(R.id.cvsolidwastemanagementbutton);
        cvsolidwastemanagementBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (cv7thsemActivity.this,WebviewActivity.class);
                intent.putExtra("cv-7thsem-cvsolidwastemanagement","file:///android_asset/cv/7thcvsolidwastemanagement.html");
                cv7thsemActivity.this.startActivity(intent);
            }
        });
//////////////////////////////////////////////////////////////////////// /////////////////////////////// cvnumericalmethodsincivilengineering BUTTON- 12 ///////////////////////////////
        final Button cvnumericalmethodsincivilengineeringBut = (Button) findViewById(R.id.cvnumericalmethodsincivilengineeringbutton);
        cvnumericalmethodsincivilengineeringBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (cv7thsemActivity.this,WebviewActivity.class);
                intent.putExtra("cv-7thsem-cvnumericalmethodsincivilengineering","file:///android_asset/cv/7thcvnumericalmethodsincivilengineering.html");
                cv7thsemActivity.this.startActivity(intent);
            }
        });
//////////////////////////////////////////////////////////////////////// /////////////////////////////// cvrockmechanics1 BUTTON- 13 ///////////////////////////////
        final Button cvrockmechanics1But = (Button) findViewById(R.id.cvrockmechanics1button);
        cvrockmechanics1But.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (cv7thsemActivity.this,WebviewActivity.class);
                intent.putExtra("cv-7thsem-cvrockmechanics1","file:///android_asset/cv/7thcvrockmechanics1.html");
                cv7thsemActivity.this.startActivity(intent);
            }
        });
//////////////////////////////////////////////////////////////////////// /////////////////////////////// cvpavementmaterialsandconstruction BUTTON- 14 ///////////////////////////////
        final Button cvpavementmaterialsandconstructionBut = (Button) findViewById(R.id.cvpavementmaterialsandconstructionbutton);
        cvpavementmaterialsandconstructionBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (cv7thsemActivity.this,WebviewActivity.class);
                intent.putExtra("cv-7thsem-cvpavementmaterialsandconstruction","file:///android_asset/cv/7thcvpavementmaterialsandconstruction.html");
                cv7thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////
/////////////////////////////// cvphotogrammetryandremote BUTTON- 15 ///////////////////////////////
        final Button cvphotogrammetryandremoteBut = (Button) findViewById(R.id.cvphotogrammetryandremotebutton);
        cvphotogrammetryandremoteBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (cv7thsemActivity.this,WebviewActivity.class);
                intent.putExtra("cv-7thsem-cvphotogrammetryandremote","file:///android_asset/cv/7thcvphotogrammetryandremote.html");
                cv7thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////

/////////////////////////////// cvairpollutionandcontrol BUTTON-1 6 ///////////////////////////////
        final Button cvairpollutionandcontrolBut = (Button) findViewById(R.id.cvairpollutionandcontrolbutton);
        cvairpollutionandcontrolBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (cv7thsemActivity.this,WebviewActivity.class);
                intent.putExtra("cv-7thsem-cvairpollutionandcontrol","file:///android_asset/cv/7thcvairpollutionandcontrol.html");
                cv7thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////
/////////////////////////////// cvdesignanddraiwingofbridges BUTTON- 17 ///////////////////////////////
        final Button cvdesignanddraiwingofbridgesBut = (Button) findViewById(R.id.cvdesignanddraiwingofbridgesbutton);
        cvdesignanddraiwingofbridgesBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (cv7thsemActivity.this,WebviewActivity.class);
                intent.putExtra("cv-7thsem-cvdesignanddraiwingofbridges","file:///android_asset/cv/7thcvdesignanddraiwingofbridges.html");
                cv7thsemActivity.this.startActivity(intent);
            }
        });
//////////////////////////////////////////////////////////////////////// /////////////////////////////// cvstructuraldynamics BUTTON-1 8 ///////////////////////////////
        final Button cvstructuraldynamicsBut = (Button) findViewById(R.id.cvstructuraldynamicsbutton);
        cvstructuraldynamicsBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (cv7thsemActivity.this,WebviewActivity.class);
                intent.putExtra("cv-7thsem-cvstructuraldynamics","file:///android_asset/cv/7thcvstructuraldynamics.html");
                cv7thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////
/////////////////////////////// cvenvironmentalengineeringlab BUTTON- 19 ///////////////////////////////
        final Button cvenvironmentalengineeringlabBut = (Button) findViewById(R.id.cvenvironmentalengineeringlabbutton); cvenvironmentalengineeringlabBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (cv7thsemActivity.this,WebviewActivity.class);
                intent.putExtra("cv-7thsem-cvenvironmentalengineeringlab","file:///android_asset/cv/7thcvenvironmentalengineeringlab.html");
                cv7thsemActivity.this.startActivity(intent);
            }
        });
//////////////////////////////////////////////////////////////////////// /////////////////////////////// cvconcreteandhighwaymaterialslab BUTTON- 20 ///////////////////////////////
        final Button cvconcreteandhighwaymaterialslabBut = (Button) findViewById(R.id.cvconcreteandhighwaymaterialslabbutton);
        cvconcreteandhighwaymaterialslabBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (cv7thsemActivity.this,WebviewActivity.class);
                intent.putExtra("cv-7thsem-cvconcreteandhighwaymaterialslab","file:///android_asset/cv/7thcvconcreteandhighwaymaterialslab.html");
                cv7thsemActivity.this.startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////


    }
}
