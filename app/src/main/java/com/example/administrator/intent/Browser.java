package com.example.administrator.intent;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Browser extends Activity {
    WebView webView;
    String browser_url;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.browser);
        Bundle bundle = this.getIntent().getExtras();
       browser_url =bundle.getString("URL");
        init();
    }
    private void init(){
        webView = (WebView) findViewById(R.id.webView);
        webView.loadUrl(browser_url);
        webView.setWebViewClient(new WebViewClient(){
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                view.loadUrl(url);
                return true;
            }
        });
    }
}