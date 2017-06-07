package com.murugan.surya.wetu;

import android.app.DownloadManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.support.v4.app.Fragment;
import android.view.HapticFeedbackConstants;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.CookieManager;
import android.webkit.DownloadListener;
import android.webkit.URLUtil;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

import static android.content.Context.DOWNLOAD_SERVICE;
import static android.widget.Toast.LENGTH_LONG;
import static android.widget.Toast.makeText;

/**
 * Created by surya on 21/5/17.
 */


public class UpdatesActivity extends Fragment {



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.updates_layout, container, false);


        ////////////////////////////THIS IS FOR WEBVIEW TO LOAD RESULT//////////////////
        final WebView webView22 = (WebView) rootView.findViewById(R.id.updateswebview);

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


        webView22.getSettings().setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NARROW_COLUMNS);

        webView22.getSettings().setSavePassword(true);
        webView22.getSettings().setSaveFormData(true);
        webView22.getSettings().setDatabaseEnabled(true);
        ///////////////////////////////////////
        ////////////////////////////////////////////////////////////////////
        webView22.getSettings().setJavaScriptEnabled(true);
        webView22.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        webView22.getSettings().setSupportZoom(true);
        webView22.getSettings().setBuiltInZoomControls(true);
        webView22.setWebViewClient(new WebViewClient());
        webView22.loadUrl("http://weturadar.com/");

   ///////////////////////////////////////////////////////////////////////////////////


        ///////////////////////////////////////////////////////////////////////////
////////////THIS IS FOR DDOWNLOADING////////////////////////
        webView22.setDownloadListener(new DownloadListener()
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
                DownloadManager dm = (DownloadManager) getActivity().getSystemService(DOWNLOAD_SERVICE);
                dm.enqueue(request);
                makeText(getActivity().getApplicationContext(), "Downloading File",
                        LENGTH_LONG).show();

            }});


/////////////////////////////////////////////FOR BUTTONS////////////////////
        final Button  forwardbutton22 = (Button) rootView.findViewById(R.id.forwardButton22);
        final Button prevbutton22 = (Button) rootView.findViewById(R.id.previousButton22);
        final Button reloadbutton22 = (Button) rootView.findViewById(R.id.reloadButton22);
//////////////forwaed

        forwardbutton22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(webView22.canGoForward()){

                    webView22.goForward();
                    view.performHapticFeedback(HapticFeedbackConstants.VIRTUAL_KEY);

                }

            }

        });
        /////////////////////////
        //////////////back

        prevbutton22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(webView22.canGoBack()){

                    webView22.goBack();
                    view.performHapticFeedback(HapticFeedbackConstants.VIRTUAL_KEY);
                }

            }

        });
        /////////////////////////
        //////////////RELOAD

        reloadbutton22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                webView22.reload();
                view.performHapticFeedback(HapticFeedbackConstants.VIRTUAL_KEY);


            }

        });



        return rootView;

    }


}
