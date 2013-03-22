package com.osgo.yyy;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

// a fragment that displays a WebView.
// the WebView is automatically paused or resumed when the Fragment is paused or resumed.

public class WebViewFragment extends Fragment
{
    private WebView mWebView;
    private boolean mIsWebViewAvailable;

    public WebViewFragment()
    {
    } // end method WebViewFragment

    
// called to instantiate the view. Creates and returns the WebView.
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        if (mWebView != null)
        {
            mWebView.destroy();
        } // end if
        mWebView = new WebView(getActivity());
        mIsWebViewAvailable = true;
        mWebView.getSettings().setJavaScriptEnabled(true);
		mWebView.loadUrl("http://www.balls.ie");
        return mWebView;
    } // end method onCreateView

    
// called when the fragment is visible to the user and actively running. Resumes the WebView.
    @Override
    public void onPause()
    {
        super.onPause();
        mWebView.onPause();
    } // end method onPause

    
// called when the fragment is no longer resumed. Pauses the WebView.
    @Override
    public void onResume()
    {
        mWebView.onResume();
        super.onResume();
    } // end method onResume

    
// called when the WebView has been detached from the fragment. The WebView is no longer available after this time.
    @Override
    public void onDestroyView()
    {
        mIsWebViewAvailable = false;
        super.onDestroyView();
    } // end method onDestroyView

    
// called when the fragment is no longer in use. Destroys the internal state of the WebView.
    @Override
    public void onDestroy()
    {
        if (mWebView != null)
        {
            mWebView.destroy();
            mWebView = null;
        } // end if
        super.onDestroy();
    } // end method onDestroy

    
// gets the WebView.
    public WebView getWebView()
    {
        return (mIsWebViewAvailable ? mWebView : null);
    } // end method getWebView
    
} // end Class WebViewFragment