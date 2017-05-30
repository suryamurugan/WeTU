package com.murugan.surya.wetu;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;

/**
 * Created by surya on 21/5/17.
 */


public class ResultsActivity extends Fragment {



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.results_layout, container, false);


        ////////////////////////////THIS IS FOR WEBVIEW TO LOAD RESULT//////////////////
        WebView webView = (WebView) rootView.findViewById(R.id.webview);

/*
        //////////////optimize////////////////////////////
        webView.getSettings().setRenderPriority(WebSettings.RenderPriority.HIGH);
        webView.getSettings().setCacheMode(WebSettings.LOAD_CACHE_ELSE_NETWORK);
        webView.getSettings().setAppCacheEnabled(true);
        webView.getSettings().setDomStorageEnabled(true);
        webView.getSettings().setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NARROW_COLUMNS);
        webView.getSettings().setUseWideViewPort(true);
        webView.getSettings().setSavePassword(true);
        webView.getSettings().setSaveFormData(true);
        webView.getSettings().setDatabaseEnabled(true);
*/

////////////////////////////////////////////


        webView.getSettings().setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NARROW_COLUMNS);

        webView.getSettings().setSavePassword(true);
        webView.getSettings().setSaveFormData(true);
        webView.getSettings().setDatabaseEnabled(true);
        ///////////////////////////////////////
        ////////////////////////////////////////////////////////////////////
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        webView.getSettings().setSupportZoom(true);
        webView.getSettings().setBuiltInZoomControls(true);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("http://results.vtu.ac.in");
   ///////////////////////////////////////////////////////////////////////////////////




        ///////////////////////////////////////////////THIS IS FOR PROGRESS BAR//////////////////////////////////////////
        final ProgressBar omgload2  = (ProgressBar) rootView.findViewById(R.id.pB2);



        webView.setWebChromeClient(new WebChromeClient() {
            public void onProgressChanged(WebView view, int progress) {
                if(progress < 100 && omgload2.getVisibility() == ProgressBar.GONE){
                    omgload2.setVisibility(ProgressBar.VISIBLE);

                }

                omgload2.setProgress(progress);
                if(progress == 100) {
                    omgload2.setVisibility(ProgressBar.GONE);

                }
            }
        });

//////////////////////////////////////////////////////////////////////////////////////////////////////////////
        return rootView;

    }


}
