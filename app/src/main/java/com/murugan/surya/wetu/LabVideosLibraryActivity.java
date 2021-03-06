package com.murugan.surya.wetu;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.HapticFeedbackConstants;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.ProgressBar;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class LabVideosLibraryActivity extends AppCompatActivity {

    private AdView adViewlab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab_videos_library);


        /////// Ad view

        adViewlab = (AdView) findViewById(R.id.adViewlab);
        AdRequest requestlab = new AdRequest.Builder().build();
        adViewlab.loadAd(requestlab);

        ////////////// FOR LAB VIDEOS BROWSER WORK WITH SCROLL SHIT AND VIDEO SHIT ???


        final WebView webViewnotes = (WebView) findViewById(R.id.noteswebview);
        final ImageView previousButton =(ImageView) findViewById(R.id.previousButton);
        webViewnotes.getSettings().setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NARROW_COLUMNS);

        webViewnotes.getSettings().setSavePassword(true);
        webViewnotes.getSettings().setSaveFormData(true);
        webViewnotes.getSettings().setDatabaseEnabled(true);
        ///////////////////////////////////////
        ////////////////////////////////////////////////////////////////////
        webViewnotes.getSettings().setJavaScriptEnabled(true);
        webViewnotes.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        webViewnotes.getSettings().setSupportZoom(true);
        webViewnotes.getSettings().setBuiltInZoomControls(true);
        webViewnotes.setWebViewClient(new WebViewClient());
        webViewnotes.loadUrl("http://videos.vtu.ac.in/video_groups.php?group=Lab%20Videos");
        ///////////////////////////////////////////////////////////////////////////////////




        ///////////////////////////////////////////////THIS IS FOR PROGRESS BAR//////////////////////////////////////////
        final ProgressBar omgload22  = (ProgressBar) findViewById(R.id.pB22);



        webViewnotes.setWebChromeClient(new WebChromeClient() {
            public void onProgressChanged(WebView view, int progress) {
                if(progress < 100 && omgload22.getVisibility() == ProgressBar.GONE){
                    omgload22.setVisibility(ProgressBar.VISIBLE);

                }

                omgload22.setProgress(progress);
                if(progress == 100) {
                    omgload22.setVisibility(ProgressBar.GONE);

                }
            }
        });

        //////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////FOR BUTTONS////////////////////
        final ImageView  forwardbutton = (ImageView) findViewById(R.id.forwardButton);
        final ImageView prevbutton = (ImageView) findViewById(R.id.previousButton);
        final ImageView reloadbutton = (ImageView) findViewById(R.id.reloadButton);
//////////////forwaed

        forwardbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(webViewnotes.canGoForward()){

                    webViewnotes.goForward();
                    view.performHapticFeedback(HapticFeedbackConstants.VIRTUAL_KEY);

                }

            }

        });
        /////////////////////////
        //////////////back

        prevbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(webViewnotes.canGoBack()){

                    webViewnotes.goBack();
                    view.performHapticFeedback(HapticFeedbackConstants.VIRTUAL_KEY);
                }

            }

        });
        /////////////////////////
        //////////////RELOAD

        reloadbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                webViewnotes.reload();
                view.performHapticFeedback(HapticFeedbackConstants.VIRTUAL_KEY);


            }

        });
        /////////////////////////


        ///////////////////////////////////////////////////////////////////////////////
    }
}
