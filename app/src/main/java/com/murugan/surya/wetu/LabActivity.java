package com.murugan.surya.wetu;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.ProgressBar;

public class LabActivity extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.labs_main, container, false);

        final WebView webViewnotes = (WebView) rootView.findViewById(R.id.noteswebview);



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
        final ProgressBar omgload22  = (ProgressBar) rootView.findViewById(R.id.pB22);



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

//////////////////////////////////////////////////////////////////////////////////////////////////////////////

        final Button previousButton =(Button) rootView.findViewById(R.id.previousButton);

        previousButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub

                if(webViewnotes.canGoBack()){
                    webViewnotes.goBack();
                }
            }
        });
        final Button forwardButton =(Button) rootView.findViewById(R.id.forwardButton);

        forwardButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub

                if(webViewnotes.canGoForward()){
                    webViewnotes.goForward();
                }
            }
        });
        webViewnotes.setWebViewClient( new WebViewClient() {



            @Override
            public void onPageStarted(WebView view, String url, Bitmap favicon) {
                // TODO Auto-generated method stub
                super.onPageStarted(view, url, favicon);
            }

            @Override
            public void onPageFinished( WebView view, String url ) {

                super.onPageFinished(webViewnotes, url );

                previousButton.setEnabled(view.canGoBack());
                forwardButton.setEnabled(view.canGoForward());

            }

            @Override
            public void onReceivedError( WebView view, int errorCode, String description, String failingUrl ) {

                super.onReceivedError( webViewnotes, errorCode, description, failingUrl );
              /*  Toast.makeText(LabActivity.class, description, Toast.LENGTH_LONG ); */
            }
        } );













        /////////////////////////


        return rootView;
    }
}
