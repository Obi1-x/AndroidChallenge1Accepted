package com.example.obi1.androidchallenge1accepted;

import android.net.http.SslError;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.SslErrorHandler;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class AboutAlcActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_alc);

        WebView webView_about_alc = (WebView) findViewById(R.id.about_alc_webview); //Gets a reference to the webview
        webView_about_alc.setWebViewClient(new alc_webview_client()); //setup a webview client
        webView_about_alc.getSettings().setJavaScriptEnabled(true);//Enable Javascript

        //WebView webView_about_alc = new WebView(AboutAlcActivity.this);
        //setContentView(webView_about_alc);

        //webView_about_alc.setWebViewClient(alc_webview_client);

        webView_about_alc.loadUrl(getString(R.string.about_page_url));
    }
}


