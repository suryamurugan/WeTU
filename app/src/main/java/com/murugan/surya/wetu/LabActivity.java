package com.murugan.surya.wetu;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.HapticFeedbackConstants;
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
        final Button previousButton =(Button) rootView.findViewById(R.id.previousButton);
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

   //////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////FOR BUTTONS////////////////////
        final Button  forwardbutton = (Button) rootView.findViewById(R.id.forwardButton);
        final Button prevbutton = (Button) rootView.findViewById(R.id.previousButton);
        final Button reloadbutton = (Button) rootView.findViewById(R.id.reloadButton);
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



        return rootView;
    }
}
