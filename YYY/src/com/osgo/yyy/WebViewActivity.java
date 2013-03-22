package com.osgo.yyy;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
 

public class WebViewActivity extends Activity
{ 
	private static final String SERVER_URL = null;
	private WebView webView;
 
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.webview);
 
		webView = (WebView) findViewById(R.id.webView1);
		webView.loadUrl(SERVER_URL);
		webView.getSettings().setJavaScriptEnabled(true);
		webView.loadUrl("www.balls.ie");
		
    } // end method onCreate
 
} // end Class WebViewActivity