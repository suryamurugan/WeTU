package com.murugan.surya.wetu;

import android.app.DownloadManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.webkit.CookieManager;
import android.webkit.DownloadListener;
import android.webkit.URLUtil;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import android.widget.TextView;

import static android.widget.Toast.LENGTH_LONG;
import static android.widget.Toast.makeText;


public class WebviewActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.webviewsem);
        ///////////////////////////////config for webiew////////////////

        WebView mWebView = (WebView) findViewById(R.id.mywebview); //This is the id you gave
        mWebView.getSettings().setJavaScriptEnabled(true);
        mWebView.getSettings().setCacheMode(WebSettings.LOAD_CACHE_ELSE_NETWORK);
        mWebView.getSettings().setSupportZoom(true);       //Zoom Control on web (You don't need this
        //if ROM supports Multi-Touch
        mWebView.getSettings().setBuiltInZoomControls(true); //Enable Multitouch if supported by ROM
        mWebView.setWebViewClient(new WebViewClient());
        mWebView.reload();

        Bundle extras = getIntent().getExtras();
///////////////////////////////////////////////THIS IS FOR PROGRESS BAR//////////////////////////////////////////
        final ProgressBar Pbar;
        final TextView txtview = (TextView)findViewById(R.id.tV1);
        Pbar = (ProgressBar) findViewById(R.id.pB1);

        mWebView.setWebChromeClient(new WebChromeClient() {
            public void onProgressChanged(WebView view, int progress) {
                if(progress < 100 && Pbar.getVisibility() == ProgressBar.GONE){
                    Pbar.setVisibility(ProgressBar.VISIBLE);
                    txtview.setVisibility(View.VISIBLE);
                }

                Pbar.setProgress(progress);
                if(progress == 100) {
                    Pbar.setVisibility(ProgressBar.GONE);
                    txtview.setVisibility(View.GONE);
                }
            }
        });




        /////////////THIS IS FOR DDOWNLOADING////////////////////////
        mWebView.setDownloadListener(new DownloadListener()
        {

            @Override
            public void onDownloadStart(String url, String userAgent,
                                        String contentDisposition, String mimeType,
                                        long contentLength) {


                DownloadManager.Request request = new DownloadManager.Request(
                        Uri.parse(url));
                        request.setMimeType(mimeType);


                        String cookies = CookieManager.getInstance().getCookie(url);


                        request.addRequestHeader("cookie", cookies);


                        request.addRequestHeader("User-Agent", userAgent);


                        request.setDescription("Downloading file...");


                        request.setTitle(URLUtil.guessFileName(url, contentDisposition,
                                mimeType));


                        request.allowScanningByMediaScanner();


                        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                        request.setDestinationInExternalPublicDir(
                                Environment.DIRECTORY_DOWNLOADS, URLUtil.guessFileName(
                                        url, contentDisposition, mimeType));
                        DownloadManager dm = (DownloadManager) getSystemService(DOWNLOAD_SERVICE);
                        dm.enqueue(request);
                        makeText(getApplicationContext(), "Downloading File",
                                LENGTH_LONG).show();

            }});


////////////////////////////////// THIS IS TO GET THE DATA OR URL FROM OTHER ACTIVITIES///////////////////
        if (extras != null) {
////////////////////////////////DEFINING STRINGS////////////////////////////////////////////////
            /////////////THIS IS FOR QUESTION PAPERS /////////////////////
            String vtuofficialsiteurl = extras.getString("vtuofficialsite");
            String vturesourceurl = extras.getString("vturesource");
            String vtubuddyurl = extras.getString("vtubuddy");
            String stupidsidurl = extras.getString("stupidsid");

            ///////////////////this is for pcycle//////////////////////////////
            String mathurl = extras.getString("math1");
            String phyurl = extras.getString("phy");
            String civilurl= extras.getString("civil");
            String mechurl = extras.getString("mech");
            String eleurl = extras.getString("ele");
            String consturl= extras.getString("const");
            String phylaburl = extras.getString("phylab");
            String wrkshopurl= extras.getString("wrkshop");
            String kanurl = extras.getString("kan");
            ////////////this is for cycle//////////////////////
            String math2url= extras.getString("math2");
            String chemurl= extras.getString("chem");
            String pcdurl= extras.getString("pcd");
            String belectrourl= extras.getString("belectro");
            String caedurl= extras.getString("caed");
            String envurl= extras.getString("env");
            String chemlaburl= extras.getString("chemlab");
            String pcdlaburl= extras.getString("pcdlab");
            String engurl= extras.getString("eng");
//////////////////////////////////THIS IS FOR ECE ///////////////////////////
            //THIS IS FOR 3RD SEM //
            String analogeleurl = extras.getString("ece-3rdsem-analogelectronics");
            String digitaleleurl = extras.getString("ece-3rdsem-digitalelectronics");
            String networkanaurl = extras.getString("ece-3rdsem-networkanalysis");
            String eleinstrumurl = extras.getString("ece-3rdsem-electronicsinstru");
            String engelemagurl = extras.getString("ece-3rdsem-engineeringelemag");
            String analogelelaburl = extras.getString("ece-3rdsem-analogelectronicslab");
            String digitalelelaburl = extras.getString("ece-3rdsem-digitalelectronicslab");
            String engmath3url = extras.getString("ece-3rdsem-engineeringmaths3");
            //this sem is done here//

            //THIS IS FOR 4th SEM //
            String mcuurl = extras.getString("ece-4thsem-mcu");
            String controlsystemsurl = extras.getString("ece-4thsem-controlsystems");
            String signalandsystemsurl = extras.getString("ece-4thsem-signalandsystems");
            String funofhdlurl = extras.getString("ece-4thsem-funofhdl");
            String linearicappurl = extras.getString("ece-4thsem-linearicsandapps");
            String mculaburl = extras.getString("ece-4thsem-mculab");
            String hdllaburl = extras.getString("ece-4thsem-hdllab");
            String engmath4url = extras.getString("ece-4thsem-engineeringmaths4");
            String advancemath2 = extras.getString("ece-4thsem-advancemaths2");
            //this sem is done here//
            //THIS  IS FOR 5TH SEM////
            String managementandentrepreneurshipurl = extras.getString("ece-5thsem-managementandentrepreneurship");
            String digitalsignalprocessingurl = extras.getString("ece-5thsem-digitalsignalprocessing");
            String analogcommunicationurl = extras.getString("ece-5thsem-analogcommunication");
            String microwavesandradarurl = extras.getString("ece-5thsem-microwavesandradar");

            String informationtheoryandcodingurl = extras.getString("ece-5thsem-informationtheoryandcoding");
            String analogelectronicslaburl = extras.getString("ece-5thsem-analogelectronicslab");
            String fundamentalsofcmosvlsiurl = extras.getString("ece-5thsem-fundamentalsofcmosvlsi");
            String dsplaburl = extras.getString("ece-5thsem-dsplab");
            String analogcommunictaionlabliclaburl = extras.getString("ece-5thsem-analogcommunictaionlabliclab");
            ///this sem is done ////

            //this is for 6th sem///
            String digitalcommunictaionurl = extras.getString("ece-6thsem-digitalcommunictaion");
            String microprocessorsurl = extras.getString("ece-6thsem-microprocessors");
            String microelectronicscircuitsurl = extras.getString("ece-6thsem-microelectronicscircuits");
            String antennasandpropagationurl = extras.getString("ece-6thsem-antennasandpropagation");
            String operatingsystemsurl = extras.getString("ece-6thsem-operatingsystems");
            String analogandmixedmodevlsidesignurl = extras.getString("ece-6thsem-analogandmixedmodevlsidesign");
            String satellitecommunicationsurl = extras.getString("ece-6thsem-satellitecommunications");
            String randomprocessesurl = extras.getString("ece-6thsem-randomprocesses");
            String lowpowervlsidesignurl = extras.getString("ece-6thsem-lowpowervlsidesign");
            String programmingincplusurl = extras.getString("ece-6thsem-programmingincplus");
            String digitalsystemdesignusingverilogurl = extras.getString("ece-6thsem-digitalsystemdesignusingverilog");
            String virtualinstrumentationurl = extras.getString("ece-6thsem-virtualinstrumentation");
            String advancedcommunicationlaburl = extras.getString("ece-6thsem-advancedcommunicationlab");
            /////THIS SEM IS DONE//

            ///THIS IS FOR 7TH SEM//
            String computercommunicationnetworksurl = extras.getString("ece-7thsem-computercommunicationnetworks");
            String opticalfibercommunicationurl = extras.getString("ece-7thsem-opticalfibercommunication");
            String powerelectronicsurl = extras.getString("ece-7thsem-powerelectronics");
            String embeddedsystemdesignurl = extras.getString("ece-7thsem-embeddedsystemdesign");
            String dspalgorithmsandarchitectureurl = extras.getString("ece-7thsem-dspalgorithmsandarchitecture");
            String microandsmartsystemstechnologyurl = extras.getString("ece-7thsem-microandsmartsystemstechnology");
            String artificialneuralnetworkurl = extras.getString("ece-7thsem-artificialneuralnetwork");
            String cadforvlsiurl = extras.getString("ece-7thsem-cadforvlsi");
            String appliedembeddedsystemdesignurl = extras.getString("ece-7thsem-appliedembeddedsystemdesign");
            String speechprocessingurl = extras.getString("ece-7thsem-speechprocessing");
            String datastructureusingcplusurl = extras.getString("ece-7thsem-datastructureusingcplus");
            String realtimesystemsurl = extras.getString("ece-7thsem-realtimesystems");
            String imageprocessingurl = extras.getString("ece-7thsem-imageprocessing");
            String radiofrequencyintegratedcircuitsurl = extras.getString("ece-7thsem-radiofrequencyintegratedcircuits");
            String wavelettransformsurl = extras.getString("ece-7thsem-wavelettransforms");
            String modelingandsimulationofdatanetworksurl = extras.getString("ece-7thsem-modelingandsimulationofdatanetworks");
            //////////end of 7th sem////////////////////////


            //////////////////////////////////////////THIS IS FOR 8TH SEM///////////////////////////////////
            String wirelesscommunicationurl = extras.getString("ece-8thsem-wirelesscommunication");
            String digitalswitchingsystemsurl = extras.getString("ece-8thsem-digitalswitchingsystems");
            String distributedsystemsurl = extras.getString("ece-8thsem-distributedsystems");
            String networksecurityurl = extras.getString("ece-8thsem-networksecurity");
            String opticalnetworksurl = extras.getString("ece-8thsem-opticalnetworks");
            String highperformancecomputingnetworksurl = extras.getString("ece-8thsem-highperformancecomputingnetworks");
            String internetengineeringurl = extras.getString("ece-8thsem-internetengineering");
            String multimediacommunicationurl = extras.getString("ece-8thsem-multimediacommunication");
            String realtimeoperatingsystemsurl = extras.getString("ece-8thsem-realtimeoperatingsystems");
            String gsmurl = extras.getString("ece-8thsem-gsm");
            String adhocwirelessnetworksurl = extras.getString("ece-8thsem-adhocwirelessnetworks");
            String opticalcomputingurl = extras.getString("ece-8thsem-opticalcomputing");
            /////////////////////END OF 8TH SEM//////////////////////////////////////////////////

            /////////////////THIS IS  FOR COMPUTER SCIENCE ENGINEERING ///////////////////////////////////////
            ///////////////3RD SEM///////////////////////////
            String csanaloganddigitalelectronicsurl = extras.getString("cs-3rdsem-csanaloganddigitalelectronics");

            String csdatastructuresandapplicationsurl = extras.getString("cs-3rdsem-csdatastructuresandapplications");
            String cscomputerorganizationurl = extras.getString("cs-3rdsem-cscomputerorganization");
            String csunixandshellprogrammingurl = extras.getString("cs-3rdsem-csunixandshellprogramming");
            String csdiscretemathematicalstructuresurl = extras.getString("cs-3rdsem-csdiscretemathematicalstructures");
            String csanaloganddigitalelectronicslaboratoryurl = extras.getString("cs-3rdsem-csanaloganddigitalelectronicslaboratory");
            String csdatastructureslaboratoryurl = extras.getString("cs-3rdsem-csdatastructureslaboratory");
            String csengineeringmathematics3url = extras.getString("cs-3rdsem-csengineeringmathematics3");


            ///////////////////////////////////////////////
            //////////4th sem//////////////
            String csengineeringmathematics4url = extras.getString("cs-4thsem-csengineeringmathematics4");
            String csgaphtheoryandcombinatoricsurl = extras.getString("cs-4thsem-csgaphtheoryandcombinatorics");
            String csdesignandanalysisofalgorithmsurl = extras.getString("cs-4thsem-csdesignandanalysisofalgorithms");
            String csunixandshellprogramming2url = extras.getString("cs-4thsem-csunixandshellprogramming2");
            String csmicroprocessorsurl = extras.getString("cs-4thsem-csmicroprocessors");
            String cscomputerorganization2url = extras.getString("cs-4thsem-cscomputerorganization2");
            String csdesignandanalysisofalgorithmslaboratoryurl = extras.getString("cs-4thsem-csdesignandanalysisofalgorithmslaboratory");
            String csmicroprocessorslaboratoryurl = extras.getString("cs-4thsem-csmicroprocessorslaboratory");
            String csadvancedmathematics2url = extras.getString("cs-4thsem-csadvancedmathematics2");
            ///////5th////////////////
            String cssoftwareengineeringurl = extras.getString("cs-5thsem-cssoftwareengineering");
            String cssystemssoftwareurl = extras.getString("cs-5thsem-cssystemssoftware");
            String csoperatingsystemsurl = extras.getString("cs-5thsem-csoperatingsystems");
            String csdatabasemanagementsystemsurl = extras.getString("cs-5thsem-csdatabasemanagementsystems");
            String cscomputernetworks1url = extras.getString("cs-5thsem-cscomputernetworks1");
            String csformallanguagesandautomatatheoryurl = extras.getString("cs-5thsem-csformallanguagesandautomatatheory");
            String csdatabaseapplicationslaboratoryurl = extras.getString("cs-5thsem-csdatabaseapplicationslaboratory");
            String cssystemssoftwareandoperatingsystemslaboratoryurl = extras.getString("cs-5thsem-cssystemssoftwareandoperatingsystemslaboratory");
            ////////////////6th sem
            String csprogramminglanguagesurl = extras.getString("cs-6thsem-csprogramminglanguages");
            String cscompilerdesignurl = extras.getString("cs-6thsem-cscompilerdesign");
            String cscomputernetworks2url = extras.getString("cs-6thsem-cscomputernetworks2");
            String cscomputergraphicsandvisualizationurl = extras.getString("cs-6thsem-cscomputergraphicsandvisualization");
            String csoperationsresearchurl = extras.getString("cs-6thsem-csoperationsresearch");
            String cssignalsandsystemsurl = extras.getString("cs-6thsem-cssignalsandsystems");
            String csdatacompressionurl = extras.getString("cs-6thsem-csdatacompression");
            String cspatternrecognitionurl = extras.getString("cs-6thsem-cspatternrecognition");
            String csstochasticmodelsandapplicationsurl = extras.getString("cs-6thsem-csstochasticmodelsandapplications");
            String csprogramming2languagesurl = extras.getString("cs-6thsem-csprogramminglanguages");
            String cscomputergraphicsandvisualizationlaboratortyurl = extras.getString("cs-6thsem-cscomputergraphicsandvisualizationlaboratorty");
            String csunixsystemsprogrammingandcompilerdesignlaboratoryurl = extras.getString("cs-6thsem-csunixsystemsprogrammingandcompilerdesignlaboratory");
            /////////////7th sem
            String csobjectorientedmodelinganddesignurl = extras.getString("cs-7thsem-csobjectorientedmodelinganddesign");
            String csembeddedcomputingsystemsurl = extras.getString("cs-7thsem-csembeddedcomputingsystems");
            String csprogrammingtheweburl = extras.getString("cs-7thsem-csprogrammingtheweb");
            String csdvancedcomputerarchitecturesurl = extras.getString("cs-7thsem-csdvancedcomputerarchitectures");
            String csadvanceddatabasemanagementsystemsurl = extras.getString("cs-7thsem-csadvanceddatabasemanagementsystems");
            String csdigitalsignalprocessingurl = extras.getString("cs-7thsem-csdigitalsignalprocessing");
            String csjavaandj2eeurl = extras.getString("cs-7thsem-csjavaandj2ee");
            String  csmultimediacomputingurl = extras.getString("cs-7thsem-csmultimediacomputing");
            String csdatawarehousinganddataminingurl = extras.getString("cs-7thsem-csdatawarehousinganddatamining");
            String csneuralnetworksurl = extras.getString("cs-7thsem-csneuralnetworks");
            String cscsharpprogramminganddotneturl = extras.getString("cs-7thsem-cscsharpprogramminganddotnet ");
            String csdigitalimageprocessingurl = extras.getString("cs-7thsem-csdigitalimageprocessing");
            String csgametheoryurl = extras.getString("cs-7thsem-csgametheory");
            String csartificialintelligenceurl = extras.getString("cs-7thsem-csartificialintelligence");
            String csstorageareanetworksurl = extras.getString("cs-7thsem-csstorageareanetworks");
            String csfuzzylogicurl = extras.getString("cs-7thsem-csfuzzylogic ");
            String csnetworkslaboratoryurl = extras.getString("cs-7thsem-csnetworkslaboratory");
            String cswebprogramminglaboratoryurl = extras.getString("cs-7thsem-cswebprogramminglaboratory");
            ///////8th sem

            String cssoftwarearchitecturesurl = extras.getString("cs-8thsem-cssoftwarearchitectures");
            String cssystemmodelingandsimulationurl = extras.getString("cs-8thsem-cssystemmodelingandsimulation");
            String cswirelessnetworksandmobilecomputingurl = extras.getString("cs-8thsem-cswirelessnetworksandmobilecomputing");
            String cswebandrichinternetapplicationsurl = extras.getString("cs-8thsem-cswebandrichinternetapplications");
            String csvlsidesignandalgorithmsurl = extras.getString("cs-8thsem-csvlsidesignandalgorithms");
            String csnetworkmanagementsystemsurl = extras.getString("cs-8thsem-csnetworkmanagementsystems");
            String csinformationandnetworksecurityurl = extras.getString("cs-8thsem-csinformationandnetworksecurity");
            String csmicrocontrollerbasedsystemsurl = extras.getString("cs-8thsem-csmicrocontrollerbasedsystems");
            String csadhocnetworksurl = extras.getString("cs-8thsem-csadhocnetworks");
            String cssoftwaretestingurl = extras.getString("cs-8thsem-cssoftwaretesting");
            String csarmbasedsystemdesignurl = extras.getString("cs-8thsem-csarmbasedsystemdesign");
            String csservicesorientedarchitectureurl = extras.getString("cs-8thsem-csservicesorientedarchitecture ");
            String cscloudsgridsandclustersurl = extras.getString("cs-8thsem-cscloudsgridsandclusters");
            String csmulticorearchitectureandprogrammingurl = extras.getString("cs-8thsem-csmulticorearchitectureandprogramming");
            /////////////////////this is for ISE//////////
            ///////////////////3rd sem///////////////
            String isanaloganddigitalelectronicsurl = extras.getString("is-3rdsem-isanaloganddigitalelectronics");
            String isdatastructuresandapplicationsolaurl = extras.getString("is-3rdsem-isdatastructuresandapplications");
            String iscomputerorganizationurl = extras.getString("is-3rdsem-iscomputerorganization");
            String isunixandshellprogrammingurl = extras.getString("is-3rdsem-isunixandshellprogramming");
            String isdiscretemathematicalstructuresurl = extras.getString("is-3rdsem-isdiscretemathematicalstructures");
            String isanaloganddigitalelectronicslaboratoryolaurl = extras.getString("is-3rdsem-isanaloganddigitalelectronicslaboratory");
            String isdatastructureslaboratoryurl = extras.getString("is-3rdsem-isdatastructureslaboratory");
            String isengineeringmathematics3url = extras.getString("is-3rdsem-isengineeringmathematics3");
            ///////////////4th sem///////////////
            String isengineeringmathematics4url = extras.getString("is-4thsem-isengineeringmathematics4");
            String isgraphtheoryandcombinatoricsurl = extras.getString("is-4thsem-isgraphtheoryandcombinatorics");
            String isdesignandanalysisofalgorithmsurl = extras.getString("is-4thsem-isdesignandanalysisofalgorithms");
            String isunixnshellprogurl = extras.getString("is-4thsem-isunixnshell");
            String ismicroprocessorsurl = extras.getString("is-4thsem-ismicroprocessors");
            String iscomporgurl = extras.getString("is-4thsem-iscomporga");
            String isdesignandanalysisofalgorithmslaboratoryurl = extras.getString("is-4thsem-isdesignandanalysisofalgorithmslaboratory");
            String ismicroprocessorslaboratoryurl = extras.getString("is-4thsem-ismicroprocessorslaboratory");

////////////////////////////5th sem../
            String issoftwareengineeringurl = extras.getString("is-5thsem-issoftwareengineering");
            String issystemssoftwareurl = extras.getString("is-5thsem-issystemssoftware");
            String isoperatingsystemsurl = extras.getString("is-5thsem-isoperatingsystems");
            String isdatabasemanagementsystemsurl = extras.getString("is-5thsem-isdatabasemanagementsystems");
            String iscomputernetworks1url = extras.getString("is-5thsem-iscomputernetworks1");
            String isformallanguagesandautomatatheoryurl = extras.getString("is-5thsem-isformallanguagesandautomatatheory");
            String isdatabaseapplicationslaboratoryurl = extras.getString("is-5thsem-isdatabaseapplicationslaboratory");
            String issystemssoftwareandoperatingsystemslaboratoryurl = extras.getString("is-5thsem-issystemssoftwareandoperatingsystemslaboratory");
////////////////////////////////6th sem//////////////////////////////

            String ismanagementandentrepreneurshipurl = extras.getString("is-6thsem-ismanagementandentrepreneurship");
            String isunixsystemprogrammingurl = extras.getString("is-6thsem-isunixsystemprogramming");
            String isfilestructuresurl = extras.getString("is-6thsem-isfilestructures");
            String iscomputernetworks2url = extras.getString("is-6thsem-iscomputernetworks2");
            String issoftwaretestingurl = extras.getString("is-6thsem-issoftwaretesting");
            String isoperationsresearchurl = extras.getString("is-6thsem-isoperationsresearch");
            String iscompilerdesignurl = extras.getString("is-6thsem-iscompilerdesign");
            String isdatacompressionurl = extras.getString("is-6thsem-isdatacompression");
            String ispatternrecognitionurl = extras.getString("is-6thsem-ispatternrecognition");
            String iscomputergraphicsandvisualizationurl = extras.getString("is-6thsem-iscomputergraphicsandvisualization");
            String isprogramminglanguagesurl = extras.getString("is-6thsem-isprogramminglanguages");
            String isfilestructureslaboratoryurl = extras.getString("is-6thsem-isfilestructureslaboratory");
            String issoftwaretestinglaboratoryurl = extras.getString("is-6thsem-issoftwaretestinglaboratory");
            //////////////????7th sem/////////////////////////////////////
            String isobjectorientedmodelinganddesignurl = extras.getString("is-7thsem-isobjectorientedmodelinganddesign");
            String isinformationsystemsurl = extras.getString("is-7thsem-isinformationsystems");
            String isprogrammingtheweburl = extras.getString("is-7thsem-isprogrammingtheweb");
            String isdatawarehousinganddataminingurl = extras.getString("is-7thsem-isdatawarehousinganddatamining");
            String isadvanceddbmsurl = extras.getString("is-7thsem-isadvanceddbms");
            String isembeddedcomputingsystemsurl = extras.getString("is-7thsem-isembeddedcomputingsystems");
            String isjavaandj2eeurl = extras.getString("is-7thsem-isjavaandj2ee");
            String ismultimediacomputingurl = extras.getString("is-7thsem-ismultimediacomputing");
            String isadvancedsoftwareengineeringurl = extras.getString("is-7thsem-isadvancedsoftwareengineering");
            String isneuralneturl = extras.getString("is-7thsem-isneuralnet");
            String iscsharpprogrammingandgotNeturl = extras.getString("is-7thsem-iscsharpprogrammingandgotNet ");
            String isdigitalimageprocessingurl = extras.getString("is-7thsem-isdigitalimageprocessing");
            String isgametheoryurl = extras.getString("is-7thsem-isgametheory");
            String isartificialintelligenceurl = extras.getString("is-7thsem-isartificialintelligence");
            String isstorageareanetworksurl = extras.getString("is-7thsem-isstorageareanetworks");
            String isfuzzylogicurl = extras.getString("is-7thsem-isfuzzylogic ");
            String isnetworkslaboratoryurl = extras.getString("is-7thsem-isnetworkslaboratory");
            String iswebprogramminglaboratoryurl = extras.getString("is-7thsem-iswebprogramminglaboratory");
            ////////////8th semester //////////////////

            String issoftwarearchitecturesurl = extras.getString("is-8thsem-issoftwarearchitectures");
            String issystemmodelingandsimulationurl = extras.getString("is-8thsem-issystemmodelingandsimulation");
            String iswirelessnetworksandmobilecomputingurl = extras.getString("is-8thsem-iswirelessnetworksandmobilecomputing");
            String iswebandrichinternetapplicationsurl = extras.getString("is-8thsem-iswebandrichinternetapplications");
            String isuserinterfacedesignurl = extras.getString("is-8thsem-isuserinterfacedesign");
            String isnetworkmanagementsystemsurl = extras.getString("is-8thsem-isnetworkmanagementsystems");
            String isinformationandnetworksecurityurl = extras.getString("is-8thsem-isinformationandnetworksecurity");
            String ismicrocontrollerbasedsystemsurl = extras.getString("is-8thsem-ismicrocontrollerbasedsystems");
            String isadhocnetworksurl = extras.getString("is-8thsem-isadhocnetworks");
            String isinformationretrivalurl = extras.getString("is-8thsem-isinformationretrival");
            String Issupplychainmanagementurl = extras.getString("is-8thsem-issupplychainmanagement");
            String isservicesorientedarchitectureurl = extras.getString("is-8thsem-isservicesorientedarchitecture ");
            String iscloudsgridsandclustersurl = extras.getString("is-8thsem-iscloudsgridsandclusters");
            String isdecisionsupportsystemsurl = extras.getString("is-8thsem-isdecisionsupportsystems");

            ////////////////////////////////////////// THIS IS FOR MECHANICAL ENGINEERING ////////////////////////////////////

            ///////////////////3rd SEMESTER////////////////////////
            String meengineeringmathematics3url = extras.getString("me-3rdsem-meengineeringmathematics3");
            String memateriicalscienceurl = extras.getString("me-3rdsem-memateriicalscience");
            String mebasicthermodynaurl = extras.getString("me-3rdsem-mebasicThermodyna");
            String memechanicsofmaterialsurl = extras.getString("me-3rdsem-memechanicsofmaterials");
            String memetalCastingAndWeldingurl = extras.getString("me-3rdsem-memetalCastingAndWelding");
            String memachineToolsAndOperationsurl = extras.getString("me-3rdsem-memachineToolsAndOperations");
            String mecomputeraidedmachinedrawingurl = extras.getString("me-3rdsem-mecomputeraidedmachinedrawing");
            String memechanicalMeasurementsAndMetrologyurl = extras.getString("me-3rdsem-memechanicalMeasurementsAndMetrology");
            String mematerialsTestingLaburl = extras.getString("me-3rdsem-mematerialsTestingLab");
            String memechanicalmeasurementsandmetrologylaburl = extras.getString("me-3rdsem-memechanicalmeasurementsandmetrologylab");
            String mefoundryAndForgingLaburl = extras.getString("me-3rdsem-mefoundryAndForgingLab");
            //////////// 4TH SEMESTER/////////
            String meappliedthermodynamicsurl = extras.getString("me-4thsem-meappliedthermodynamics");
            String mekinematicsofmachinesurl = extras.getString("me-4thsem-mekinematicsofmachines");
            String memanufacturingprocess2url = extras.getString("me-4thsem-memanufacturingprocess2");
            String meengineeringmathematics4url = extras.getString("me-4thsem-meengineeringmathematics4");
            String meadvancedmathematics2url = extras.getString("me-4thsem-meadvancedmathematics2");
            ////////////5th SEMESTER
            String medesignofmachineelements1url = extras.getString("me-5thsem-medesignofmachineelements1");
            String meenergyengineeringurl = extras.getString("me-5thsem-meenergyengineering");
            String medynamicsofmachinesurl = extras.getString("me-5thsem-medynamicsofmachines");
            String memanufacturingprocess3url = extras.getString("me-5thsem-memanufacturingprocess3");
            String meturbomachinesurl = extras.getString("me-5thsem-meturbomachines");
            String mefluidmechanicsandmachineslaboratoryurl = extras.getString("me-5thsem-mefluidmechanicsandmachineslaboratory");
            String meenergyconversionengineeringlaboratoryurl = extras.getString("me-5thsem-meenergyconversionengineeringlaboratory");
            String memanagementandentrepreneurshipurl = extras.getString("me-5thsem-memanagementandentrepreneurship");

            ////////////6th SEMESTER/////////////////
            String mecomputerintegratedmanufacturingurl = extras.getString("me-6thsem-mecomputerintegratedmanufacturing");
            String medesignofmachineelements2url = extras.getString("me-6thsem-medesignofmachineelements2");
            String meheatandmasstransferurl = extras.getString("me-6thsem-meheatandmasstransfer");
            String mefiniteelementmethodsurl = extras.getString("me-6thsem-mefiniteelementmethods");
            String mechatronicsandmicroprocessorurl = extras.getString("me-6thsem-mechatronicsandmicroprocessor");
            String meheatandmasstransferlaboratoryurl = extras.getString("me-6thsem-meheatandmasstransferlaboratory");
            String mecomputeraidedmodelingandanalysislaboratoryurl = extras.getString("me-6thsem-mecomputeraidedmodelingandanalysislaboratory");
            String metheoryofelasticityurl = extras.getString("me-6thsem-metheoryofelasticity");
            String memechnaicsofcomposurl = extras.getString("me-6thsem-memechncompositema");
            String merefrigerationandairconditioningurl = extras.getString("me-6thsem-merefrigerationandairconditioning");
            String medesignofheatexchangersurl = extras.getString("me-6thsem-medesignofheatexchangers");
            String menontraditionalmachiningurl = extras.getString("me-6thsem-menontraditionalmachining");
            String meknowledgemanagementurl = extras.getString("me-6thsem-meknowledgemanagement");
            String meprojectmanagementurl = extras.getString("me-6thsem-meprojectmanagement");
            String mestatisticalqualitycontrolurl = extras.getString("me-6thsem-mestatisticalqualitycontrol");
            /////////////7TH SEMESTER////////////
            String meeconomicsurl = extras.getString("me-7thsem-meeconomics");
            String mechanicalvibrationsurl = extras.getString("me-7thsem-mechanicalvibrations");
            String mehydraulicsandpneumaticsurl = extras.getString("me-7thsem-mehydraulicsandpneumatics");
            String meoperationsresearchurl = extras.getString("me-7thsem-meoperationsresearch");
            String medesignlaboratoryurl = extras.getString("me-7thsem-medesignlaboratory");
            String mecimandautomationlaburl = extras.getString("me-7thsem-mecimandautomationlab");
            String mechanismdesignurl = extras.getString("me-7thsem-mechanismdesign");
            String metheoryofplasticityurl = extras.getString("me-7thsem-metheoryofplasticity");
            String meengineeringdesignurl = extras.getString("me-7thsem-meengineeringdesign");
            String menonconventionalenergysourcesurl = extras.getString("me-7thsem-menonconventionalenergysources");
            String megasdynamicsurl = extras.getString("me-7thsem-megasdynamics");
            String memanagementinformationsystemurl = extras.getString("me-7thsem-memanagementinformationsystem");
            String meautomationinmanufacturingurl = extras.getString("me-7thsem-meautomationinmanufacturing");
            String metotalqualitymanagementurl = extras.getString("me-7thsem-metotalqualitymanagement");
            String meexperimentalstressanalysisurl = extras.getString("me-7thsem-meexperimentalstressanalysis");
            String metooldesignurl = extras.getString("me-7thsem-metooldesign");
            String mecryogenurl = extras.getString("me-7thsem-mecryogen");
            String mesmartmaterialsurl = extras.getString("me-7thsem-mesmartmaterials");
            String meagilemanufacturingurl = extras.getString("me-7thsem-meagilemanufacturing");
            String meroboticsurl = extras.getString("me-7thsem-merobotics");
            String mefinancemanagementurl = extras.getString("me-7thsem-mefinancemanagement");
            String memicroandsmartsystemtechnologyurl = extras.getString("me-7thsem-memicroandsmartsystemtechnology");
            String meproductlifecyclemanagementurl = extras.getString("me-7thsem-meproductlifecyclemanagement");
            //////////////8th SEMESTER//////////////
            String meoperationsmanurl = extras.getString("me-8thsem-meoperationsman");
            String mecontrolengineeringurl = extras.getString("me-8thsem-mecontrolengineering");
            String metribologyurl = extras.getString("me-8thsem-metribology");
            String mefracturemechanicsurl = extras.getString("me-8thsem-mefracturemechanics");
            String mepowerplantengineeringurl = extras.getString("me-8thsem-mepowerplantengineering");
            String menanotechnologyurl = extras.getString("me-8thsem-menanotechnology");
            String meorganisationalbehaviourandprofessinalcommunicationurl = extras.getString("me-8thsem-meorganisationalbehaviourandprofessinalcommunication");
            String mecomputergraphicsurl = extras.getString("me-8thsem-mecomputergraphics");
            String merapidprototypingurl = extras.getString("me-8thsem-merapidprototyping");
            String mefoundarytechnologyurl = extras.getString("me-8thsem-mefoundarytechnology");
            String memachinetooldesignurl = extras.getString("me-8thsem-memachinetooldesign");
            String meindustrialengineeringandergonomicsurl = extras.getString("me-8thsem-meindustrialengineeringandergonomics");
            String mebiomassenergysystemsurl = extras.getString("me-8thsem-mebiomassenergysystems");
            String meautomotiveengineeringurl = extras.getString("me-8thsem-meautomotiveengineering");
            String medatabasenanagementsystemurl = extras.getString("me-8thsem-medatabasenanagementsystem");
            String meartificialintelligenceurl = extras.getString("me-8thsem-meartificialintelligence");
            String medesignofexperimentsurl = extras.getString("me-8thsem-medesignofexperiments");
            String medesignformanufactureandassemblyurl = extras.getString("me-8thsem-medesignformanufactureandassembly");

//////////////////////////THIS IS FOR CIVIL ENGIN///////////
//////////////////////////////////////////3rd sem//////
            String cvengmathurl = extras.getString("cv-3rdsem-cvengineeringmath3");
            String cvstrengthofmaturl = extras.getString("3rdcvstrengthofmaterials.html");
            String cvfluidmechurl = extras.getString("cv-3rdsem-cvfluidmech");
            String cvbasicsruurl = extras.getString("cv-3rdsem-cvbasicsurvey");
            String cvengineeringgeourl = extras.getString("cv-3rdsem-cvengineeringgeo");
            String cvbuildingmaterialsandconsurl = extras.getString("cv-3rdsem-cvbuildingmaterialsandcons");
            String cvbuildingmaterialstestinglaburl = extras.getString("cv-3rdsem-cvbuildingmaterialstestinglab");
            String cvbasicsurveyingpracturl = extras.getString("cv-3rdsem-cvbasicsurveyingpra");
////////////////////////////////4th sem////////
            String cvengineeringmathematics4url = extras.getString("cv-4thsem-cvengineeringmathematics4");
            String cvconcretetechnologyurl = extras.getString("cv-4thsem-cvconcretetechnology");
            String cvstructralanalysis1url = extras.getString("cv-4thsem-cvstructralanalysis1");
            String cvsurveying2url = extras.getString("cv-4thsem-cvsurveying2");
            String cvhydraulicsandhydraulicmachinesurl = extras.getString("cv-4thsem-cvhydraulicsandhydraulicmachines");
            String cvbuildingplaninganddrawingurl = extras.getString("cv-4thsem-cvbuildingplaninganddrawing");
            String cvsurveyingpractice2laburl = extras.getString("cv-4thsem-cvsurveyingpractice2lab");
            String cvappliedengineeringgeologylaboratoryurl = extras.getString("cv-4thsem-cvappliedengineeringgeologylaboratory");

/////////////////////////////////5th sem//////
            String cvmanagementandentrepreneurshipurl = extras.getString("cv-5thsem-cvmanagementandentrepreneurship");
            String cvdesignofrccstructuralelementsurl = extras.getString("cv-5thsem-cvdesignofrccstructuralelements");
            String cvstructuralanalysis2url = extras.getString("cv-5thsem-cvstructuralanalysis2");
            String cvgeotecheng1url = extras.getString("cv-5thsem-cvgeotecheng1");
            String cvhydrologyandirrigationengineeringurl = extras.getString("cv-5thsem-cvhydrologyandirrigationengineering");
            String cvtransportationengineering1url = extras.getString("cv-5thsem-cvtransportationengineering1");
            String cvhydraulicsandhydraulicmachinerylaburl = extras.getString("cv-5thsem-cvhydraulicsandhydraulicmachinerylab");
            String cvcomputeraideddesignlaburl = extras.getString("cv-5thsem-cvcomputeraideddesignlab");

//////////////////////////////6th sem//////////////
            String cvenvironmentalengineering1url = extras.getString("cv-6thsem-cvenvironmentalengineering1");
            String cvdesignanddrawingofrcurl = extras.getString("cv-6thsem-cvdesignanddrawingofrc");
            String cvtransportationengineering2url = extras.getString("cv-6thsem-cvtransportationengineering2");
            String cvgeotechnicalengineering2url = extras.getString("cv-6thsem-cvgeotechnicalengineering2");
            String cvhydraulicstructuresandirrigationdesigndrawingurl = extras.getString("cv-6thsem-cvhydraulicstructuresandirrigationdesigndrawing");
            String cvtheoryofelasticityurl = extras.getString("cv-6thsem-cvtheoryofelasticity");
            String cvalternativebuildingmaterialsandtechnologiesurl = extras.getString("cv-6thsem-cvalternativebuildingmaterialsandtechnologies");
            String cvgroundimprovementtechniquesurl = extras.getString("cv-6thsem-cvgroundimprovementtechniques");
            String cvadvancesurveyingurl = extras.getString("cv-6thsem-cvadvancesurveying");
            String cvgroundwaterhydrologyurl = extras.getString("cv-6thsem-cvgroundwaterhydrology");
            String cvruralwaterhydrologyurl = extras.getString("cv-6thsem-cvruralwaterhydrology");
            String cvruralwatersupplyandsanitationurl = extras.getString("cv-6thsem-cvruralwatersupplyandsanitation");
            String cvtrafficengineeringurl = extras.getString("cv-6thsem-cvtrafficengineering");
            String cvgeotechnicalengineeringlaburl = extras.getString("cv-6thsem-cvgeotechnicalengineeringlab");
            String cvextensivesurveyvivavoceurl = extras.getString("cv-6thsem-cvextensivesurveyvivavoce");


//////////////////////////////////7th sem./////
            String cvenvironmentalengineering2url = extras.getString("cv-7thsem-cvenvironmentalengineering2");
            String cvdesignofsteelstructuresurl = extras.getString("cv-7thsem-cvdesignofsteelstructures");
            String cvdesignofprestressedconcretestructuresurl = extras.getString("cv-7thsem-cvdesignofprestressedconcretestructures");
            String cvmatrixmethodsofstructuralanalysisurl = extras.getString("cv-7thsem-cvmatrixmethodsofstructuralanalysis");
            String cvadvancedesignofrcstructuresurl = extras.getString("cv-7thsem-cvadvancedesignofrcstructures");
            String cvdesignofmasonrystructuresurl = extras.getString("cv-7thsem-cvdesignofmasonrystructures");
            String cvestimationandvaluationurl = extras.getString("cv-7thsem-cvestimationandvaluation");
            String cvearthandearthreatiningstructures222url = extras.getString("cv-7thsem-cvearthandearthreatiningstructures222");
            String cvhighwaygeometricdesign1url = extras.getString("cv-7thsem-cvhighwaygeometricdesign1");
            String cvopenchannelhydraulicsurl = extras.getString("cv-7thsem-cvopenchannelhydraulics");
            String cvsolidwastemanagementurl = extras.getString("cv-7thsem-cvsolidwastemanagement");
            String cvnumericalmethodsincivilengineeringurl = extras.getString("cv-7thsem-cvnumericalmethodsincivilengineering");
            String cvrockmechanics1url = extras.getString("cv-7thsem-cvrockmechanics1");
            String cvpavementmaterialsandconstructionurl = extras.getString("cv-7thsem-cvpavementmaterialsandconstruction");
            String cvphotogrammetryandremoteurl = extras.getString("cv-7thsem-cvphotogrammetryandremote");
            String cvairpollutionandcontrolurl = extras.getString("cv-7thsem-cvairpollutionandcontrol");
            String cvdesignanddraiwingofbridgesurl = extras.getString("cv-7thsem-cvdesignanddraiwingofbridges");
            String cvstructuraldynamicsurl = extras.getString("cv-7thsem-cvstructuraldynamics");
            String cvenvironmentalengineeringlaburl = extras.getString("cv-7thsem-cvenvironmentalengineeringlab");
            String cvconcreteandhighwaymaterialslaburl = extras.getString("cv-7thsem-cvconcreteandhighwaymaterialslab");

//////////////////////////////////8th sem//////////
            String cvadvanceconcretetechnologyurl = extras.getString("cv-8thsem-cvadvanceconcretetechnology");
            String cvdesignanddrawingofsteelstructuresurl = extras.getString("cv-8thsem-cvdesignanddrawingofsteelstructures");
            String cvadvancedprestressconcstrurl = extras.getString("cv-8thsem-cvadvanceprestrconcretestrbutton");
            String cvadvancedfoundationdesignurl = extras.getString("cv-8thsem-cvadvancedfoundationdesign");
            String cvpavementdesignurl = extras.getString("cv-8thsem-cvpavementdesign");
            String cvearthquakeresistantdesignofstructuresurl = extras.getString("cv-8thsem-cvearthquakeresistdesignofstr");
            String cvindustrialwastewatertreatmenturl = extras.getString("cv-8thsem-cvindustrialwastewatertreatment");
            String cvqualitymanagementsystemincivilengineeringurl = extras.getString("cv-8thsem-cvqualitymanagementsystemincivilengineering");
            String cvfiniteearthanalysisurl = extras.getString("cv-8thsem-cvfnalysis");
            String cvreinforcesearthstructuresurl = extras.getString("cv-8thsem-cvreinforcesearthstructures");
            String cvurbantransportplanningurl = extras.getString("cv-8thsem-cvurbantransportplanning");
            String cvgeographicinformationsystemurl = extras.getString("cv-8thsem-cvgeographicinformationsystem");
            String cvadvancedesignofsteelstructuresurl = extras.getString("cv-8thsem-cvadvancedesignofsteelstructures");
            String cvwaterresourcesengineeringurl = extras.getString("cv-8thsem-cvwaterresourcesengineering");
            String cvenvironmentalimpactassessmenturl = extras.getString("cv-8thsem-cvenvironmentalimpactassessment");

















///////////////////////////////////////////////////////////////////////////////////////////

//////////////////////////ACTUAL LOADING OF URL HAPPENS HERE ///////////////////////////////////////////////////
            /////////////////for pcyycle///////////////
            if (mathurl!=null)
                mWebView.loadUrl(mathurl);
            else if (phyurl !=null)
                mWebView.loadUrl(phyurl);
            else if (civilurl != null)
                mWebView.loadUrl(civilurl);
            else if (mechurl!=null)
                mWebView.loadUrl(mechurl);
            else if(eleurl != null)
                mWebView.loadUrl(eleurl);
            else if (consturl !=null)
                mWebView.loadUrl(consturl);
            else if (phylaburl!=null)
                mWebView.loadUrl(phylaburl);
            else if (wrkshopurl !=null)
                mWebView.loadUrl(wrkshopurl);
            else if (kanurl!=null)
                mWebView.loadUrl(kanurl);
                /////////end of pcycle //////////////////
                ////////////start of ccycle////////////////////
            else if (math2url !=null)
                mWebView.loadUrl(math2url);
            else if (chemurl !=null)
                mWebView.loadUrl(chemurl);
            else if (pcdurl !=null)
                mWebView.loadUrl(pcdurl);
            else if (belectrourl !=null)
                mWebView.loadUrl(belectrourl);
            else if (caedurl!=null)
                mWebView.loadUrl(caedurl);
            else if (envurl !=null)
                mWebView.loadUrl(envurl);
            else if (chemlaburl !=null)
                mWebView.loadUrl(chemlaburl);
            else if (pcdlaburl !=null)
                mWebView.loadUrl(pcdlaburl);
            else if (engurl !=null)
                mWebView.loadUrl(engurl);
                ///////////////////this is for ece////////////////////
                //this is for 3rd sem////////////////
            else if(analogeleurl !=null)
                mWebView.loadUrl(analogeleurl);
            else if(digitaleleurl !=null)
                mWebView.loadUrl(digitaleleurl);

            else if(networkanaurl !=null)
                mWebView.loadUrl(networkanaurl);

            else if(eleinstrumurl !=null)
                mWebView.loadUrl(eleinstrumurl);

            else if(engelemagurl !=null)
                mWebView.loadUrl(engelemagurl);

            else if(analogelelaburl !=null)
                mWebView.loadUrl(analogelelaburl);
            else if(digitalelelaburl !=null)
                mWebView.loadUrl(digitalelelaburl);

            else if(engmath3url !=null)
                mWebView.loadUrl(engmath3url);
                ///////end of third  sem/////

                //this is for 4th sem////////////////
            else if(mcuurl !=null)
                mWebView.loadUrl(mcuurl);
            else if(controlsystemsurl !=null)
                mWebView.loadUrl(controlsystemsurl);

            else if(signalandsystemsurl!=null)
                mWebView.loadUrl(signalandsystemsurl);

            else if(funofhdlurl !=null)
                mWebView.loadUrl(funofhdlurl);

            else if(linearicappurl !=null)
                mWebView.loadUrl(linearicappurl);

            else if(mculaburl !=null)
                mWebView.loadUrl(mculaburl);
            else if(hdllaburl!=null)
                mWebView.loadUrl(hdllaburl);

            else if(engmath4url!=null)
                mWebView.loadUrl(engmath4url);
            else if(advancemath2 !=null)
                mWebView.loadUrl(advancemath2);
                ///////end of fourth  sem/////
                /////this is for 5th sem///////////////////
            else if (managementandentrepreneurshipurl !=null)
                mWebView.loadUrl(managementandentrepreneurshipurl);
            else if (digitalsignalprocessingurl !=null)
                mWebView.loadUrl(digitalsignalprocessingurl);
            else if (analogcommunicationurl !=null)
                mWebView.loadUrl(analogcommunicationurl);
            else if (microwavesandradarurl !=null)
                mWebView.loadUrl(microwavesandradarurl);
            else if (informationtheoryandcodingurl !=null)
                mWebView.loadUrl(informationtheoryandcodingurl);
            else if (analogelectronicslaburl !=null)
                mWebView.loadUrl(analogelectronicslaburl);
            else if (fundamentalsofcmosvlsiurl !=null)
                mWebView.loadUrl(fundamentalsofcmosvlsiurl);
            else if (dsplaburl !=null)
                mWebView.loadUrl(dsplaburl);
            else if (analogcommunictaionlabliclaburl !=null)
                mWebView.loadUrl(analogcommunictaionlabliclaburl);
                ////end of th sem///

                /////THIS IS FOR 6TH sem//
            else if (digitalcommunictaionurl !=null)
                mWebView.loadUrl(digitalcommunictaionurl);
            else if (microprocessorsurl !=null)
                mWebView.loadUrl(microprocessorsurl);
            else if (microelectronicscircuitsurl !=null)
                mWebView.loadUrl(microelectronicscircuitsurl);
            else if (antennasandpropagationurl !=null)
                mWebView.loadUrl(antennasandpropagationurl);
            else if (operatingsystemsurl !=null)
                mWebView.loadUrl(operatingsystemsurl);
            else if (analogandmixedmodevlsidesignurl !=null)
                mWebView.loadUrl(analogandmixedmodevlsidesignurl);
            else if (satellitecommunicationsurl !=null)
                mWebView.loadUrl(satellitecommunicationsurl);
            else if (randomprocessesurl !=null)
                mWebView.loadUrl(randomprocessesurl);
            else if (lowpowervlsidesignurl !=null)
                mWebView.loadUrl(lowpowervlsidesignurl);
            else if (programmingincplusurl !=null)
                mWebView.loadUrl(programmingincplusurl);
            else if (digitalsystemdesignusingverilogurl !=null)
                mWebView.loadUrl(digitalsystemdesignusingverilogurl);
            else if (virtualinstrumentationurl !=null)
                mWebView.loadUrl(virtualinstrumentationurl);
            else if (advancedcommunicationlaburl !=null)
                mWebView.loadUrl(advancedcommunicationlaburl);
                //////////////////////////////////////////////////
                ///////////////THIS IS FOR 7TH SEM ////////////
            else if(computercommunicationnetworksurl!=null)
                mWebView.loadUrl(computercommunicationnetworksurl);
            else if(opticalfibercommunicationurl!=null)
                mWebView.loadUrl(opticalfibercommunicationurl);
            else if (powerelectronicsurl !=null)
                mWebView.loadUrl(powerelectronicsurl);
            else if (embeddedsystemdesignurl !=null)
                mWebView.loadUrl(embeddedsystemdesignurl);
            else if (dspalgorithmsandarchitectureurl !=null)
                mWebView.loadUrl(dspalgorithmsandarchitectureurl);
            else if (microandsmartsystemstechnologyurl !=null)
                mWebView.loadUrl(microandsmartsystemstechnologyurl);
            else if (artificialneuralnetworkurl !=null)
                mWebView.loadUrl(artificialneuralnetworkurl);
            else if (cadforvlsiurl !=null)
                mWebView.loadUrl(cadforvlsiurl);
            else if (appliedembeddedsystemdesignurl !=null)
                mWebView.loadUrl(appliedembeddedsystemdesignurl);
            else if (speechprocessingurl !=null)
                mWebView.loadUrl(speechprocessingurl);
            else if (datastructureusingcplusurl !=null)
                mWebView.loadUrl(datastructureusingcplusurl);
            else if (realtimesystemsurl !=null)
                mWebView.loadUrl(realtimesystemsurl);
            else if (imageprocessingurl !=null)
                mWebView.loadUrl(imageprocessingurl);
            else if (radiofrequencyintegratedcircuitsurl !=null)
                mWebView.loadUrl(radiofrequencyintegratedcircuitsurl);
            else if (wavelettransformsurl !=null)
                mWebView.loadUrl(wavelettransformsurl);
            else if (modelingandsimulationofdatanetworksurl !=null)
                mWebView.loadUrl(modelingandsimulationofdatanetworksurl);
                /////////////////////////////////////////////////////
                //////////////////////////////////////////THIS IS FOR 8TH SEM///////////////////////////////////
            else if (wirelesscommunicationurl !=null)
                mWebView.loadUrl(wirelesscommunicationurl);
            else if (digitalswitchingsystemsurl !=null)
                mWebView.loadUrl(digitalswitchingsystemsurl);
            else if (distributedsystemsurl !=null)
                mWebView.loadUrl(distributedsystemsurl);
            else if (networksecurityurl !=null)
                mWebView.loadUrl(networksecurityurl);
            else if (opticalnetworksurl !=null)
                mWebView.loadUrl(opticalnetworksurl);
            else if (highperformancecomputingnetworksurl !=null)
                mWebView.loadUrl(highperformancecomputingnetworksurl);
            else if (internetengineeringurl !=null)
                mWebView.loadUrl(internetengineeringurl);
            else if (multimediacommunicationurl !=null)
                mWebView.loadUrl(multimediacommunicationurl);
            else if (realtimeoperatingsystemsurl !=null)
                mWebView.loadUrl(realtimeoperatingsystemsurl);
            else if (gsmurl !=null)
                mWebView.loadUrl(gsmurl);
            else if (adhocwirelessnetworksurl !=null)
                mWebView.loadUrl(adhocwirelessnetworksurl);
            else if (opticalcomputingurl !=null)
                mWebView.loadUrl(opticalcomputingurl);
/////////////////////////////////END OF 8TH SEM/////////////////////////////////////////////

                //////////////////////////////////////THIS IS FOR COMPUTER SCIENCE ENGINEERING ///////////////////////
                ////////////////////THIRD SEMSTER//////////////
            else if (csanaloganddigitalelectronicsurl !=null)
                mWebView.loadUrl(csanaloganddigitalelectronicsurl);
            else if (csdatastructuresandapplicationsurl !=null)
                mWebView.loadUrl(csdatastructuresandapplicationsurl);
            else if (cscomputerorganizationurl !=null)
                mWebView.loadUrl(cscomputerorganizationurl);
            else if (csunixandshellprogrammingurl !=null)
                mWebView.loadUrl(csunixandshellprogrammingurl);
            else if (csdiscretemathematicalstructuresurl !=null)
                mWebView.loadUrl(csdiscretemathematicalstructuresurl);
            else if (csanaloganddigitalelectronicslaboratoryurl !=null)
                mWebView.loadUrl(csanaloganddigitalelectronicslaboratoryurl);
            else if (csdatastructureslaboratoryurl !=null)
                mWebView.loadUrl(csdatastructureslaboratoryurl);
            else if (csengineeringmathematics3url !=null)
                mWebView.loadUrl(csengineeringmathematics3url);
////////////////////////////////4th sem

            else if (csengineeringmathematics4url !=null)
                mWebView.loadUrl(csengineeringmathematics4url);
            else if (csgaphtheoryandcombinatoricsurl !=null)
                mWebView.loadUrl(csgaphtheoryandcombinatoricsurl);
            else if (csdesignandanalysisofalgorithmsurl !=null)
                mWebView.loadUrl(csdesignandanalysisofalgorithmsurl);
            else if (csunixandshellprogramming2url!=null)
                mWebView.loadUrl(csunixandshellprogramming2url);
            else if (csmicroprocessorsurl !=null)
                mWebView.loadUrl(csmicroprocessorsurl);
            else if (cscomputerorganization2url !=null)
                mWebView.loadUrl(cscomputerorganization2url);
            else if (csdesignandanalysisofalgorithmslaboratoryurl !=null)
                mWebView.loadUrl(csdesignandanalysisofalgorithmslaboratoryurl);
            else if (csmicroprocessorslaboratoryurl !=null)
                mWebView.loadUrl(csmicroprocessorslaboratoryurl);
            else if (csadvancedmathematics2url !=null)
                mWebView.loadUrl(csadvancedmathematics2url);
                /////////////5th sem//////////////////////

            else if (cssoftwareengineeringurl !=null)
                mWebView.loadUrl(cssoftwareengineeringurl);
            else if (cssystemssoftwareurl !=null)
                mWebView.loadUrl(cssystemssoftwareurl);
            else if (csoperatingsystemsurl !=null)
                mWebView.loadUrl(csoperatingsystemsurl);
            else if (csdatabasemanagementsystemsurl !=null)
                mWebView.loadUrl(csdatabasemanagementsystemsurl);
            else if (cscomputernetworks1url !=null)
                mWebView.loadUrl(cscomputernetworks1url);
            else if (csformallanguagesandautomatatheoryurl !=null)
                mWebView.loadUrl(csformallanguagesandautomatatheoryurl);
            else if (csdatabaseapplicationslaboratoryurl !=null)
                mWebView.loadUrl(csdatabaseapplicationslaboratoryurl);
            else if (cssystemssoftwareandoperatingsystemslaboratoryurl !=null)
                mWebView.loadUrl(cssystemssoftwareandoperatingsystemslaboratoryurl);
                ////////////6th sem //////
            else if (csprogramminglanguagesurl !=null)
                mWebView.loadUrl(csprogramminglanguagesurl);
            else if (cscompilerdesignurl !=null)
                mWebView.loadUrl(cscompilerdesignurl);
            else if (cscomputernetworks2url !=null)
                mWebView.loadUrl(cscomputernetworks2url);
            else if (cscomputergraphicsandvisualizationurl !=null)
                mWebView.loadUrl(cscomputergraphicsandvisualizationurl);
            else if (csoperationsresearchurl !=null)
                mWebView.loadUrl(csoperationsresearchurl);
            else if (cssignalsandsystemsurl !=null)
                mWebView.loadUrl(cssignalsandsystemsurl);
            else if (csdatacompressionurl !=null)
                mWebView.loadUrl(csdatacompressionurl);
            else if (cspatternrecognitionurl !=null)
                mWebView.loadUrl(cspatternrecognitionurl);
            else if (csstochasticmodelsandapplicationsurl !=null)
                mWebView.loadUrl(csstochasticmodelsandapplicationsurl);
            else if (csprogramming2languagesurl !=null)
                mWebView.loadUrl(csprogramming2languagesurl);
            else if (cscomputergraphicsandvisualizationlaboratortyurl !=null)
                mWebView.loadUrl(cscomputergraphicsandvisualizationlaboratortyurl);
            else if (csunixsystemsprogrammingandcompilerdesignlaboratoryurl !=null)
                mWebView.loadUrl(csunixsystemsprogrammingandcompilerdesignlaboratoryurl);
                ///7th sem

            else if (csobjectorientedmodelinganddesignurl !=null)
                mWebView.loadUrl(csobjectorientedmodelinganddesignurl);
            else if (csembeddedcomputingsystemsurl !=null)
                mWebView.loadUrl(csembeddedcomputingsystemsurl);
            else if (csprogrammingtheweburl !=null)
                mWebView.loadUrl(csprogrammingtheweburl);
            else if (csdvancedcomputerarchitecturesurl !=null)
                mWebView.loadUrl(csdvancedcomputerarchitecturesurl);
            else if (csadvanceddatabasemanagementsystemsurl !=null)
                mWebView.loadUrl(csadvanceddatabasemanagementsystemsurl);
            else if (csdigitalsignalprocessingurl !=null)
                mWebView.loadUrl(csdigitalsignalprocessingurl);
            else if (csjavaandj2eeurl !=null)
                mWebView.loadUrl(csjavaandj2eeurl);
            else if ( csmultimediacomputingurl !=null)
                mWebView.loadUrl( csmultimediacomputingurl);
            else if (csdatawarehousinganddataminingurl !=null)
                mWebView.loadUrl(csdatawarehousinganddataminingurl);
            else if (csneuralnetworksurl !=null)
                mWebView.loadUrl(csneuralnetworksurl);
            else if (cscsharpprogramminganddotneturl !=null)
                mWebView.loadUrl(cscsharpprogramminganddotneturl);
            else if (csdigitalimageprocessingurl !=null)
                mWebView.loadUrl(csdigitalimageprocessingurl);
            else if (csgametheoryurl !=null)
                mWebView.loadUrl(csgametheoryurl);
            else if (csartificialintelligenceurl !=null)
                mWebView.loadUrl(csartificialintelligenceurl);
            else if (csstorageareanetworksurl !=null)
                mWebView.loadUrl(csstorageareanetworksurl);
            else if (csfuzzylogicurl !=null)
                mWebView.loadUrl(csfuzzylogicurl);
            else if (csnetworkslaboratoryurl !=null)
                mWebView.loadUrl(csnetworkslaboratoryurl);
            else if (cswebprogramminglaboratoryurl !=null)
                mWebView.loadUrl(cswebprogramminglaboratoryurl);
                ///////////8th sem


            else if (cssoftwarearchitecturesurl !=null)
                mWebView.loadUrl(cssoftwarearchitecturesurl);
            else if (cssystemmodelingandsimulationurl !=null)
                mWebView.loadUrl(cssystemmodelingandsimulationurl);
            else if (cswirelessnetworksandmobilecomputingurl !=null)
                mWebView.loadUrl(cswirelessnetworksandmobilecomputingurl);
            else if (cswebandrichinternetapplicationsurl !=null)
                mWebView.loadUrl(cswebandrichinternetapplicationsurl);
            else if (csvlsidesignandalgorithmsurl !=null)
                mWebView.loadUrl(csvlsidesignandalgorithmsurl);
            else if (csnetworkmanagementsystemsurl !=null)
                mWebView.loadUrl(csnetworkmanagementsystemsurl);
            else if (csinformationandnetworksecurityurl !=null)
                mWebView.loadUrl(csinformationandnetworksecurityurl);
            else if (csmicrocontrollerbasedsystemsurl !=null)
                mWebView.loadUrl(csmicrocontrollerbasedsystemsurl);
            else if (csadhocnetworksurl !=null)
                mWebView.loadUrl(csadhocnetworksurl);
            else if (cssoftwaretestingurl !=null)
                mWebView.loadUrl(cssoftwaretestingurl);
            else if (csarmbasedsystemdesignurl !=null)
                mWebView.loadUrl(csarmbasedsystemdesignurl);
            else if (csservicesorientedarchitectureurl !=null)
                mWebView.loadUrl(csservicesorientedarchitectureurl);
            else if (cscloudsgridsandclustersurl !=null)
                mWebView.loadUrl(cscloudsgridsandclustersurl);
            else if (csmulticorearchitectureandprogrammingurl !=null)
                mWebView.loadUrl(csmulticorearchitectureandprogrammingurl);
                ///////////////////this is for ISE//////////////
                /////////this is for 3rd sem////////////////

            else if (isanaloganddigitalelectronicsurl !=null)
                mWebView.loadUrl(isanaloganddigitalelectronicsurl);
            else if (isdatastructuresandapplicationsolaurl !=null)
                mWebView.loadUrl(isdatastructuresandapplicationsolaurl);
            else if (iscomputerorganizationurl !=null)
                mWebView.loadUrl(iscomputerorganizationurl);
            else if (isunixandshellprogrammingurl !=null)
                mWebView.loadUrl(isunixandshellprogrammingurl);
            else if (isdiscretemathematicalstructuresurl !=null)
                mWebView.loadUrl(isdiscretemathematicalstructuresurl);
            else if (isanaloganddigitalelectronicslaboratoryolaurl !=null)
                mWebView.loadUrl(isanaloganddigitalelectronicslaboratoryolaurl);
            else if (isdatastructureslaboratoryurl !=null)
                mWebView.loadUrl(isdatastructureslaboratoryurl);
            else if (isengineeringmathematics3url !=null)
                mWebView.loadUrl(isengineeringmathematics3url);
                ///////////this is for 4th sem////////////////////
            else if (isengineeringmathematics4url !=null)
                mWebView.loadUrl(isengineeringmathematics4url);
            else if (isgraphtheoryandcombinatoricsurl !=null)
                mWebView.loadUrl(isgraphtheoryandcombinatoricsurl);
            else if (isdesignandanalysisofalgorithmsurl !=null)
                mWebView.loadUrl(isdesignandanalysisofalgorithmsurl);
            else if (isunixnshellprogurl !=null)
                mWebView.loadUrl(isunixnshellprogurl);
            else if (ismicroprocessorsurl !=null)
                mWebView.loadUrl(ismicroprocessorsurl);
            else if (iscomporgurl !=null)
                mWebView.loadUrl(iscomporgurl);
            else if (isdesignandanalysisofalgorithmslaboratoryurl !=null)
                mWebView.loadUrl(isdesignandanalysisofalgorithmslaboratoryurl);
            else if (ismicroprocessorslaboratoryurl !=null)
                mWebView.loadUrl(ismicroprocessorslaboratoryurl);

////////////////////////////////5th sem/////////////////////////////////
            else if (issoftwareengineeringurl !=null)
                mWebView.loadUrl(issoftwareengineeringurl);
            else if (issystemssoftwareurl !=null)
                mWebView.loadUrl(issystemssoftwareurl);
            else if (isoperatingsystemsurl !=null)
                mWebView.loadUrl(isoperatingsystemsurl);
            else if (isdatabasemanagementsystemsurl !=null)
                mWebView.loadUrl(isdatabasemanagementsystemsurl);
            else if (iscomputernetworks1url !=null)
                mWebView.loadUrl(iscomputernetworks1url);
            else if (isformallanguagesandautomatatheoryurl !=null)
                mWebView.loadUrl(isformallanguagesandautomatatheoryurl);
            else if (isdatabaseapplicationslaboratoryurl !=null)
                mWebView.loadUrl(isdatabaseapplicationslaboratoryurl);
            else if (issystemssoftwareandoperatingsystemslaboratoryurl !=null)
                mWebView.loadUrl(issystemssoftwareandoperatingsystemslaboratoryurl);

//////////////////////////6th sem///////////////////////////////////////////////////

            else if (ismanagementandentrepreneurshipurl !=null)
                mWebView.loadUrl(ismanagementandentrepreneurshipurl);
            else if (isunixsystemprogrammingurl !=null)
                mWebView.loadUrl(isunixsystemprogrammingurl);
            else if (isfilestructuresurl !=null)
                mWebView.loadUrl(isfilestructuresurl);
            else if (iscomputernetworks2url !=null)
                mWebView.loadUrl(iscomputernetworks2url);
            else if (issoftwaretestingurl !=null)
                mWebView.loadUrl(issoftwaretestingurl);
            else if (isoperationsresearchurl !=null)
                mWebView.loadUrl(isoperationsresearchurl);
            else if (iscompilerdesignurl !=null)
                mWebView.loadUrl(iscompilerdesignurl);
            else if (isdatacompressionurl !=null)
                mWebView.loadUrl(isdatacompressionurl);
            else if (ispatternrecognitionurl !=null)
                mWebView.loadUrl(ispatternrecognitionurl);
            else if (iscomputergraphicsandvisualizationurl !=null)
                mWebView.loadUrl(iscomputergraphicsandvisualizationurl);
            else if (isprogramminglanguagesurl !=null)
                mWebView.loadUrl(isprogramminglanguagesurl);
            else if (isfilestructureslaboratoryurl !=null)
                mWebView.loadUrl(isfilestructureslaboratoryurl);
            else if (issoftwaretestinglaboratoryurl !=null)
                mWebView.loadUrl(issoftwaretestinglaboratoryurl);
                ///This is for 7th semester///////////////////////////
            else if (isobjectorientedmodelinganddesignurl !=null)
                mWebView.loadUrl(isobjectorientedmodelinganddesignurl);
            else if (isinformationsystemsurl !=null)
                mWebView.loadUrl(isinformationsystemsurl);
            else if (isprogrammingtheweburl !=null)
                mWebView.loadUrl(isprogrammingtheweburl);
            else if (isdatawarehousinganddataminingurl !=null)
                mWebView.loadUrl(isdatawarehousinganddataminingurl);
            else if (isadvanceddbmsurl !=null)
                mWebView.loadUrl(isadvanceddbmsurl);
            else if (isembeddedcomputingsystemsurl !=null)
                mWebView.loadUrl(isembeddedcomputingsystemsurl);
            else if (isjavaandj2eeurl !=null)
                mWebView.loadUrl(isjavaandj2eeurl);
            else if (ismultimediacomputingurl !=null)
                mWebView.loadUrl(ismultimediacomputingurl);
            else if (isadvancedsoftwareengineeringurl !=null)
                mWebView.loadUrl(isadvancedsoftwareengineeringurl);
            else if (isneuralneturl !=null)
                mWebView.loadUrl(isneuralneturl);
            else if (iscsharpprogrammingandgotNeturl !=null)
                mWebView.loadUrl(iscsharpprogrammingandgotNeturl);
            else if (isdigitalimageprocessingurl !=null)
                mWebView.loadUrl(isdigitalimageprocessingurl);
            else if (isgametheoryurl !=null)
                mWebView.loadUrl(isgametheoryurl);
            else if (isartificialintelligenceurl !=null)
                mWebView.loadUrl(isartificialintelligenceurl);
            else if (isstorageareanetworksurl !=null)
                mWebView.loadUrl(isstorageareanetworksurl);
            else if (isfuzzylogicurl !=null)
                mWebView.loadUrl(isfuzzylogicurl);
            else if (isnetworkslaboratoryurl !=null)
                mWebView.loadUrl(isnetworkslaboratoryurl);
            else if (iswebprogramminglaboratoryurl !=null)
                mWebView.loadUrl(iswebprogramminglaboratoryurl);
                ///////////////// 8TH Semester ///////////////////////////////////////////////
            else if (issoftwarearchitecturesurl !=null)
                mWebView.loadUrl(issoftwarearchitecturesurl);
            else if (issystemmodelingandsimulationurl !=null)
                mWebView.loadUrl(issystemmodelingandsimulationurl);
            else if (iswirelessnetworksandmobilecomputingurl !=null)
                mWebView.loadUrl(iswirelessnetworksandmobilecomputingurl);
            else if (iswebandrichinternetapplicationsurl !=null)
                mWebView.loadUrl(iswebandrichinternetapplicationsurl);
            else if (isuserinterfacedesignurl !=null)
                mWebView.loadUrl(isuserinterfacedesignurl);
            else if (isnetworkmanagementsystemsurl !=null)
                mWebView.loadUrl(isnetworkmanagementsystemsurl);
            else if (isinformationandnetworksecurityurl !=null)
                mWebView.loadUrl(isinformationandnetworksecurityurl);
            else if (ismicrocontrollerbasedsystemsurl !=null)
                mWebView.loadUrl(ismicrocontrollerbasedsystemsurl);
            else if (isadhocnetworksurl !=null)
                mWebView.loadUrl(isadhocnetworksurl);
            else if (isinformationretrivalurl !=null)
                mWebView.loadUrl(isinformationretrivalurl);
            else if (Issupplychainmanagementurl !=null)
                mWebView.loadUrl(Issupplychainmanagementurl);
            else if (isservicesorientedarchitectureurl !=null)
                mWebView.loadUrl(isservicesorientedarchitectureurl);
            else if (iscloudsgridsandclustersurl !=null)
                mWebView.loadUrl(iscloudsgridsandclustersurl);
            else if (isdecisionsupportsystemsurl !=null)
                mWebView.loadUrl(isdecisionsupportsystemsurl);
/////////////////////END OF INFORMATION SCIENCE ENGINEERING///////////////////////////////////////////////
///////////////////////// THIS IS FOR MECHANICAL ENGINEERING ////////////////////////////////////
                /////////////////3rd sem..////////////
            else if (meengineeringmathematics3url !=null)
                mWebView.loadUrl(meengineeringmathematics3url);
            else if (memateriicalscienceurl !=null)
                mWebView.loadUrl(memateriicalscienceurl);
            else if (mebasicthermodynaurl !=null)
                mWebView.loadUrl(mebasicthermodynaurl);
            else if (memechanicsofmaterialsurl !=null)
                mWebView.loadUrl(memechanicsofmaterialsurl);
            else if (memetalCastingAndWeldingurl !=null)
                mWebView.loadUrl(memetalCastingAndWeldingurl);
            else if (memachineToolsAndOperationsurl !=null)
                mWebView.loadUrl(memachineToolsAndOperationsurl);
            else if (mecomputeraidedmachinedrawingurl !=null)
                mWebView.loadUrl(mecomputeraidedmachinedrawingurl);
            else if (memechanicalMeasurementsAndMetrologyurl !=null)
                mWebView.loadUrl(memechanicalMeasurementsAndMetrologyurl);
            else if (mematerialsTestingLaburl !=null)
                mWebView.loadUrl(mematerialsTestingLaburl);
            else if (memechanicalmeasurementsandmetrologylaburl !=null)
                mWebView.loadUrl(memechanicalmeasurementsandmetrologylaburl);
            else if (mefoundryAndForgingLaburl !=null)
                mWebView.loadUrl(mefoundryAndForgingLaburl);
                //////////// 4th SEMESTER//////////
            else if (meappliedthermodynamicsurl !=null)
                mWebView.loadUrl(meappliedthermodynamicsurl);
            else if (mekinematicsofmachinesurl !=null)
                mWebView.loadUrl(mekinematicsofmachinesurl);
            else if (memanufacturingprocess2url !=null)
                mWebView.loadUrl(memanufacturingprocess2url);
            else if (meengineeringmathematics4url !=null)
                mWebView.loadUrl(meengineeringmathematics4url);
            else if (meadvancedmathematics2url !=null)
                mWebView.loadUrl(meadvancedmathematics2url);


                ////////5th SEMESTER

            else if (medesignofmachineelements1url !=null)
                mWebView.loadUrl(medesignofmachineelements1url);
            else if (meenergyengineeringurl !=null)
                mWebView.loadUrl(meenergyengineeringurl);
            else if (medynamicsofmachinesurl !=null)
                mWebView.loadUrl(medynamicsofmachinesurl);
            else if (memanufacturingprocess3url !=null)
                mWebView.loadUrl(memanufacturingprocess3url);
            else if (meturbomachinesurl !=null)
                mWebView.loadUrl(meturbomachinesurl);
            else if (mefluidmechanicsandmachineslaboratoryurl !=null)
                mWebView.loadUrl(mefluidmechanicsandmachineslaboratoryurl);
            else if (meenergyconversionengineeringlaboratoryurl !=null)
                mWebView.loadUrl(meenergyconversionengineeringlaboratoryurl);
            else if (memanagementandentrepreneurshipurl !=null)
                mWebView.loadUrl(memanagementandentrepreneurshipurl);
                ////////6th SEMESTER//////////
            else if (mecomputerintegratedmanufacturingurl !=null)
                mWebView.loadUrl(mecomputerintegratedmanufacturingurl);
            else if (medesignofmachineelements2url !=null)
                mWebView.loadUrl(medesignofmachineelements2url);
            else if (meheatandmasstransferurl !=null)
                mWebView.loadUrl(meheatandmasstransferurl);
            else if (mefiniteelementmethodsurl !=null)
                mWebView.loadUrl(mefiniteelementmethodsurl);
            else if (mechatronicsandmicroprocessorurl !=null)
                mWebView.loadUrl(mechatronicsandmicroprocessorurl);
            else if (meheatandmasstransferlaboratoryurl !=null)
                mWebView.loadUrl(meheatandmasstransferlaboratoryurl);
            else if (mecomputeraidedmodelingandanalysislaboratoryurl !=null)
                mWebView.loadUrl(mecomputeraidedmodelingandanalysislaboratoryurl);
            else if (metheoryofelasticityurl !=null)
                mWebView.loadUrl(metheoryofelasticityurl);
            else if (memechnaicsofcomposurl !=null)
                mWebView.loadUrl(memechnaicsofcomposurl);
            else if (merefrigerationandairconditioningurl !=null)
                mWebView.loadUrl(merefrigerationandairconditioningurl);
            else if (medesignofheatexchangersurl !=null)
                mWebView.loadUrl(medesignofheatexchangersurl);
            else if (menontraditionalmachiningurl !=null)
                mWebView.loadUrl(menontraditionalmachiningurl);
            else if (meknowledgemanagementurl !=null)
                mWebView.loadUrl(meknowledgemanagementurl);
            else if (meprojectmanagementurl !=null)
                mWebView.loadUrl(meprojectmanagementurl);
            else if (mestatisticalqualitycontrolurl !=null)
                mWebView.loadUrl(mestatisticalqualitycontrolurl);
                /////////////////7th SEMESTER///////////////
            else if (meeconomicsurl !=null)
                mWebView.loadUrl(meeconomicsurl);
            else if (mechanicalvibrationsurl !=null)
                mWebView.loadUrl(mechanicalvibrationsurl);
            else if (mehydraulicsandpneumaticsurl !=null)
                mWebView.loadUrl(mehydraulicsandpneumaticsurl);
            else if (meoperationsresearchurl !=null)
                mWebView.loadUrl(meoperationsresearchurl);
            else if (medesignlaboratoryurl !=null)
                mWebView.loadUrl(medesignlaboratoryurl);
            else if (mecimandautomationlaburl !=null)
                mWebView.loadUrl(mecimandautomationlaburl);
            else if (mechanismdesignurl !=null)
                mWebView.loadUrl(mechanismdesignurl);
            else if (metheoryofplasticityurl !=null)
                mWebView.loadUrl(metheoryofplasticityurl);
            else if (meengineeringdesignurl !=null)
                mWebView.loadUrl(meengineeringdesignurl);
            else if (menonconventionalenergysourcesurl !=null)
                mWebView.loadUrl(menonconventionalenergysourcesurl);
            else if (megasdynamicsurl !=null)
                mWebView.loadUrl(megasdynamicsurl);
            else if (memanagementinformationsystemurl !=null)
                mWebView.loadUrl(memanagementinformationsystemurl);
            else if (meautomationinmanufacturingurl !=null)
                mWebView.loadUrl(meautomationinmanufacturingurl);
            else if (metotalqualitymanagementurl !=null)
                mWebView.loadUrl(metotalqualitymanagementurl);
            else if (meexperimentalstressanalysisurl !=null)
                mWebView.loadUrl(meexperimentalstressanalysisurl);
            else if (metooldesignurl !=null)
                mWebView.loadUrl(metooldesignurl);
            else if (mecryogenurl !=null)
                mWebView.loadUrl(mecryogenurl);
            else if (mesmartmaterialsurl !=null)
                mWebView.loadUrl(mesmartmaterialsurl);
            else if (meagilemanufacturingurl !=null)
                mWebView.loadUrl(meagilemanufacturingurl);
            else if (meroboticsurl !=null)
                mWebView.loadUrl(meroboticsurl);
            else if (mefinancemanagementurl !=null)
                mWebView.loadUrl(mefinancemanagementurl);
            else if (memicroandsmartsystemtechnologyurl !=null)
                mWebView.loadUrl(memicroandsmartsystemtechnologyurl);
            else if (meproductlifecyclemanagementurl !=null)
                mWebView.loadUrl(meproductlifecyclemanagementurl);
                ////////////////8th SEMESTER///////////

            else if (meoperationsmanurl !=null)
                mWebView.loadUrl(meoperationsmanurl);
            else if (mecontrolengineeringurl !=null)
                mWebView.loadUrl(mecontrolengineeringurl);
            else if (metribologyurl !=null)
                mWebView.loadUrl(metribologyurl);
            else if (mefracturemechanicsurl !=null)
                mWebView.loadUrl(mefracturemechanicsurl);
            else if (mepowerplantengineeringurl !=null)
                mWebView.loadUrl(mepowerplantengineeringurl);
            else if (menanotechnologyurl !=null)
                mWebView.loadUrl(menanotechnologyurl);
            else if (meorganisationalbehaviourandprofessinalcommunicationurl !=null)
                mWebView.loadUrl(meorganisationalbehaviourandprofessinalcommunicationurl);
            else if (mecomputergraphicsurl !=null)
                mWebView.loadUrl(mecomputergraphicsurl);
            else if (merapidprototypingurl !=null)
                mWebView.loadUrl(merapidprototypingurl);
            else if (mefoundarytechnologyurl !=null)
                mWebView.loadUrl(mefoundarytechnologyurl);
            else if (memachinetooldesignurl !=null)
                mWebView.loadUrl(memachinetooldesignurl);
            else if (meindustrialengineeringandergonomicsurl !=null)
                mWebView.loadUrl(meindustrialengineeringandergonomicsurl);
            else if (mebiomassenergysystemsurl !=null)
                mWebView.loadUrl(mebiomassenergysystemsurl);
            else if (meautomotiveengineeringurl !=null)
                mWebView.loadUrl(meautomotiveengineeringurl);
            else if (medatabasenanagementsystemurl !=null)
                mWebView.loadUrl(medatabasenanagementsystemurl);
            else if (meartificialintelligenceurl !=null)
                mWebView.loadUrl(meartificialintelligenceurl);
            else if (medesignofexperimentsurl !=null)
                mWebView.loadUrl(medesignofexperimentsurl);
            else if (medesignformanufactureandassemblyurl !=null)
                mWebView.loadUrl(medesignformanufactureandassemblyurl);
//////////////////////////THIS IS FOR CIVIL ENGIN///////////
//////////////////////////////////////////////////3rd sem//////
            else if (cvengmathurl !=null)
                mWebView.loadUrl(cvengmathurl);
            else if (cvstrengthofmaturl !=null)
                mWebView.loadUrl(cvstrengthofmaturl);
            else if (cvfluidmechurl !=null)
                mWebView.loadUrl(cvfluidmechurl);
            else if (cvbasicsruurl !=null)
                mWebView.loadUrl(cvbasicsruurl);
            else if (cvengineeringgeourl !=null)
                mWebView.loadUrl(cvengineeringgeourl);
            else if (cvbuildingmaterialsandconsurl !=null)
                mWebView.loadUrl(cvbuildingmaterialsandconsurl);
            else if (cvbuildingmaterialstestinglaburl !=null)
                mWebView.loadUrl(cvbuildingmaterialstestinglaburl);
            else if (cvbasicsurveyingpracturl !=null)
                mWebView.loadUrl(cvbasicsurveyingpracturl);

///////////////////////////4th sem////////

            else if (cvengineeringmathematics4url !=null)
                mWebView.loadUrl(cvengineeringmathematics4url);
            else if (cvconcretetechnologyurl !=null)
                mWebView.loadUrl(cvconcretetechnologyurl);
            else if (cvstructralanalysis1url !=null)
                mWebView.loadUrl(cvstructralanalysis1url);
            else if (cvsurveying2url !=null)
                mWebView.loadUrl(cvsurveying2url);
            else if (cvhydraulicsandhydraulicmachinesurl !=null)
                mWebView.loadUrl(cvhydraulicsandhydraulicmachinesurl);
            else if (cvbuildingplaninganddrawingurl !=null)
                mWebView.loadUrl(cvbuildingplaninganddrawingurl);
            else if (cvsurveyingpractice2laburl !=null)
                mWebView.loadUrl(cvsurveyingpractice2laburl);
            else if (cvappliedengineeringgeologylaboratoryurl !=null)
                mWebView.loadUrl(cvappliedengineeringgeologylaboratoryurl);


////////////////////5th sem//////

            else if (cvmanagementandentrepreneurshipurl !=null)
                mWebView.loadUrl(cvmanagementandentrepreneurshipurl);
            else if (cvdesignofrccstructuralelementsurl !=null)
                mWebView.loadUrl(cvdesignofrccstructuralelementsurl);
            else if (cvstructuralanalysis2url !=null)
                mWebView.loadUrl(cvstructuralanalysis2url);
            else if (cvgeotecheng1url !=null)
                mWebView.loadUrl(cvgeotecheng1url);
            else if (cvhydrologyandirrigationengineeringurl !=null)
                mWebView.loadUrl(cvhydrologyandirrigationengineeringurl);
            else if (cvtransportationengineering1url !=null)
                mWebView.loadUrl(cvtransportationengineering1url);
            else if (cvhydraulicsandhydraulicmachinerylaburl !=null)
                mWebView.loadUrl(cvhydraulicsandhydraulicmachinerylaburl);
            else if (cvcomputeraideddesignlaburl !=null)
                mWebView.loadUrl(cvcomputeraideddesignlaburl);

////////////////////////////6th sem//////////////

            else if (cvenvironmentalengineering1url !=null)
                mWebView.loadUrl(cvenvironmentalengineering1url);
            else if (cvdesignanddrawingofrcurl !=null)
                mWebView.loadUrl(cvdesignanddrawingofrcurl);
            else if (cvtransportationengineering2url !=null)
                mWebView.loadUrl(cvtransportationengineering2url);
            else if (cvgeotechnicalengineering2url !=null)
                mWebView.loadUrl(cvgeotechnicalengineering2url);
            else if (cvhydraulicstructuresandirrigationdesigndrawingurl !=null)
                mWebView.loadUrl(cvhydraulicstructuresandirrigationdesigndrawingurl);
            else if (cvtheoryofelasticityurl !=null)
                mWebView.loadUrl(cvtheoryofelasticityurl);
            else if (cvalternativebuildingmaterialsandtechnologiesurl !=null)
                mWebView.loadUrl(cvalternativebuildingmaterialsandtechnologiesurl);
            else if (cvgroundimprovementtechniquesurl !=null)
                mWebView.loadUrl(cvgroundimprovementtechniquesurl);
            else if (cvadvancesurveyingurl !=null)
                mWebView.loadUrl(cvadvancesurveyingurl);
            else if (cvgroundwaterhydrologyurl !=null)
                mWebView.loadUrl(cvgroundwaterhydrologyurl);
            else if (cvruralwaterhydrologyurl !=null)
                mWebView.loadUrl(cvruralwaterhydrologyurl);
            else if (cvruralwatersupplyandsanitationurl !=null)
                mWebView.loadUrl(cvruralwatersupplyandsanitationurl);
            else if (cvtrafficengineeringurl !=null)
                mWebView.loadUrl(cvtrafficengineeringurl);
            else if (cvgeotechnicalengineeringlaburl !=null)
                mWebView.loadUrl(cvgeotechnicalengineeringlaburl);
            else if (cvextensivesurveyvivavoceurl !=null)
                mWebView.loadUrl(cvextensivesurveyvivavoceurl);

///////////////////////////////////7th sem./////

            else if (cvenvironmentalengineering2url !=null)
                mWebView.loadUrl(cvenvironmentalengineering2url);
            else if (cvdesignofsteelstructuresurl !=null)
                mWebView.loadUrl(cvdesignofsteelstructuresurl);
            else if (cvestimationandvaluationurl !=null)
                mWebView.loadUrl(cvestimationandvaluationurl);
            else if (cvdesignofprestressedconcretestructuresurl !=null)
                mWebView.loadUrl(cvdesignofprestressedconcretestructuresurl);
            else if (cvmatrixmethodsofstructuralanalysisurl !=null)
                mWebView.loadUrl(cvmatrixmethodsofstructuralanalysisurl);
            else if (cvadvancedesignofrcstructuresurl !=null)
                mWebView.loadUrl(cvadvancedesignofrcstructuresurl);
            else if (cvdesignofmasonrystructuresurl !=null)
                mWebView.loadUrl(cvdesignofmasonrystructuresurl);
            else if (cvearthandearthreatiningstructures222url !=null)
                mWebView.loadUrl(cvearthandearthreatiningstructures222url);
            else if (cvhighwaygeometricdesign1url !=null)
                mWebView.loadUrl(cvhighwaygeometricdesign1url);
            else if (cvopenchannelhydraulicsurl !=null)
                mWebView.loadUrl(cvopenchannelhydraulicsurl);
            else if (cvsolidwastemanagementurl !=null)
                mWebView.loadUrl(cvsolidwastemanagementurl);
            else if (cvnumericalmethodsincivilengineeringurl !=null)
                mWebView.loadUrl(cvnumericalmethodsincivilengineeringurl);
            else if (cvrockmechanics1url !=null)
                mWebView.loadUrl(cvrockmechanics1url);
            else if (cvpavementmaterialsandconstructionurl !=null)
                mWebView.loadUrl(cvpavementmaterialsandconstructionurl);
            else if (cvphotogrammetryandremoteurl !=null)
                mWebView.loadUrl(cvphotogrammetryandremoteurl);
            else if (cvairpollutionandcontrolurl !=null)
                mWebView.loadUrl(cvairpollutionandcontrolurl);
            else if (cvdesignanddraiwingofbridgesurl !=null)
                mWebView.loadUrl(cvdesignanddraiwingofbridgesurl);
            else if (cvstructuraldynamicsurl !=null)
                mWebView.loadUrl(cvstructuraldynamicsurl);
            else if (cvenvironmentalengineeringlaburl !=null)
                mWebView.loadUrl(cvenvironmentalengineeringlaburl);
            else if (cvconcreteandhighwaymaterialslaburl !=null)
                mWebView.loadUrl(cvconcreteandhighwaymaterialslaburl);

//////////////////////////////8th sem//////////

            else if (cvadvanceconcretetechnologyurl !=null)
                mWebView.loadUrl(cvadvanceconcretetechnologyurl);
            else if (cvdesignanddrawingofsteelstructuresurl !=null)
                mWebView.loadUrl(cvdesignanddrawingofsteelstructuresurl);
            else if (cvadvancedprestressconcstrurl !=null)
                mWebView.loadUrl(cvadvancedprestressconcstrurl);
            else if (cvadvancedfoundationdesignurl !=null)
                mWebView.loadUrl(cvadvancedfoundationdesignurl);
            else if (cvpavementdesignurl !=null)
                mWebView.loadUrl(cvpavementdesignurl);
            else if (cvearthquakeresistantdesignofstructuresurl !=null)
                mWebView.loadUrl(cvearthquakeresistantdesignofstructuresurl);
            else if (cvindustrialwastewatertreatmenturl !=null)
                mWebView.loadUrl(cvindustrialwastewatertreatmenturl);
            else if (cvqualitymanagementsystemincivilengineeringurl !=null)
                mWebView.loadUrl(cvqualitymanagementsystemincivilengineeringurl);
            else if (cvfiniteearthanalysisurl !=null)
                mWebView.loadUrl(cvfiniteearthanalysisurl);
            else if (cvreinforcesearthstructuresurl !=null)
                mWebView.loadUrl(cvreinforcesearthstructuresurl);
            else if (cvurbantransportplanningurl !=null)
                mWebView.loadUrl(cvurbantransportplanningurl);
            else if (cvgeographicinformationsystemurl !=null)
                mWebView.loadUrl(cvgeographicinformationsystemurl);
            else if (cvadvancedesignofsteelstructuresurl !=null)
                mWebView.loadUrl(cvadvancedesignofsteelstructuresurl);
            else if (cvwaterresourcesengineeringurl !=null)
                mWebView.loadUrl(cvwaterresourcesengineeringurl);
            else if (cvenvironmentalimpactassessmenturl !=null)
                mWebView.loadUrl(cvenvironmentalimpactassessmenturl);

//////////////////////////////??THis is for question papers//////////////


            else if (vtuofficialsiteurl !=null)
                mWebView.loadUrl(vtuofficialsiteurl);
            else if (vturesourceurl !=null)
                mWebView.loadUrl(vturesourceurl);
            else if (vtubuddyurl !=null)
                mWebView.loadUrl(vtubuddyurl);
            else if (stupidsidurl !=null)
                mWebView.loadUrl(stupidsidurl);














/////////////////////////////////////END OF  URL LOADING //////////////////////////////////

        }





    }






}

