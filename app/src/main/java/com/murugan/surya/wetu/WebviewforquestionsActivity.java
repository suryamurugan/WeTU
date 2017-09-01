package com.murugan.surya.wetu;

import android.app.DownloadManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.view.HapticFeedbackConstants;
import android.view.View;
import android.webkit.CookieManager;
import android.webkit.DownloadListener;
import android.webkit.URLUtil;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ProgressBar;

import static android.widget.Toast.LENGTH_LONG;
import static android.widget.Toast.makeText;


public class WebviewforquestionsActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.webviewquestions);
        ///////////////////////////////config for webiew////////////////
        final WebView mWebView = (WebView) findViewById(R.id.mywebviewforquestions);
        //WebView mWebView = (WebView) findViewById(R.id.mywebviewforquestions); //This is the id you gave
        mWebView.getSettings().setJavaScriptEnabled(true);
        mWebView.getSettings().setCacheMode(WebSettings.LOAD_CACHE_ELSE_NETWORK);
        mWebView.getSettings().setSupportZoom(true);       //Zoom Control on web (You don't need this
        //if ROM supports Multi-Touch
        mWebView.getSettings().setBuiltInZoomControls(true); //Enable Multitouch if supported by ROM
        mWebView.setWebViewClient(new WebViewClient());
        mWebView.reload();

        Bundle extras = getIntent().getExtras();


///////////////////////////////////////////////THIS IS FOR PROGRESS BAR//////////////////////////////////////////
        final ProgressBar Pbarque;
        Pbarque = (ProgressBar) findViewById(R.id.pBqeustions);

        mWebView.setWebChromeClient(new WebChromeClient() {
            public void onProgressChanged(WebView view, int progress) {
                if(progress < 100 && Pbarque.getVisibility() == ProgressBar.GONE){
                    Pbarque.setVisibility(ProgressBar.VISIBLE);

                }

                Pbarque.setProgress(progress);
                if(progress == 100) {
                    Pbarque.setVisibility(ProgressBar.GONE);

                }
            }
        });


///////////////////////////////////////////////////////////////////////////
////////////THIS IS FOR DDOWNLOADING////////////////////////
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


////////////////////////////////// THIS IS TO GET THE DATA OR URL FROM OTHER ACTIVITIES///////////////////
        if (extras != null) {
////////////////////////////////DEFINING STRINGS////////////////////////////////////////////////
            /////////////THIS IS FOR QUESTION PAPERS /////////////////////
            String vtuofficialsiteurl = extras.getString("vtuofficialsite");
            String vturesourceurl = extras.getString("vturesource");
            String vtubuddyurl = extras.getString("vtubuddy");
            String stupidsidurl = extras.getString("stupidsid");
            String weturadarcontactsurl = extras.getString("WETURADAR");


///////////////////////////////////////////////////////////////////////////////////////////

//////////////////////////ACTUAL LOADING OF URL HAPPENS HERE ///////////////////////////////////////////////////
       if (vtuofficialsiteurl !=null)
                mWebView.loadUrl(vtuofficialsiteurl);
            else if (vturesourceurl !=null)
                mWebView.loadUrl(vturesourceurl);
            else if (vtubuddyurl !=null)
                mWebView.loadUrl(vtubuddyurl);
            else if (stupidsidurl !=null)
                mWebView.loadUrl(stupidsidurl);
            else if(weturadarcontactsurl != null)
                mWebView.loadUrl(weturadarcontactsurl);



/////////////////////////////////////END OF  URL LOADING //////////////////////////////////

        }




        /////////////////////////////////////////////FOR BUTTONS////////////////////
        final Button forwardbutton22 = (Button) findViewById(R.id.forwardButton121);
        final Button prevbutton22 = (Button) findViewById(R.id.previousButton121);
        final ImageButton reloadbutton22 = (ImageButton) findViewById(R.id.reloadButton121);
//////////////forwaed

        forwardbutton22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mWebView.canGoForward()){

                    mWebView.goForward();
                    view.performHapticFeedback(HapticFeedbackConstants.VIRTUAL_KEY);

                }

            }

        });
        /////////////////////////
        //////////////back

        prevbutton22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(mWebView.canGoBack()){

                    mWebView.goBack();
                    view.performHapticFeedback(HapticFeedbackConstants.VIRTUAL_KEY);
                }

            }

        });
        /////////////////////////
        //////////////RELOAD

        reloadbutton22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mWebView.reload();
                view.performHapticFeedback(HapticFeedbackConstants.VIRTUAL_KEY);


            }

        });



        /////////////////////////






    }











}

