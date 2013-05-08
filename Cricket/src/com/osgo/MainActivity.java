package com.osgo;

import com.osgo.R;

import android.os.Bundle;


import android.app.Activity;
import android.app.TabActivity;
import android.content.Context;
import android.view.Menu;
import android.view.View;
import android.view.WindowManager;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;
import android.widget.Toast;


public class MainActivity extends Activity
{
	private static final int FEATURE_NO_TITLE = 0;

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		requestWindowFeature(FEATURE_NO_TITLE);
		setTheme(android.R.style.Theme_Translucent_NoTitleBar_Fullscreen);
	    getWindow().addFlags(WindowManager.LayoutParams.FLAG_SHOW_WALLPAPER);
		setContentView(R.layout.activity_main);
		
		/*
		// Access Tab Host from Main Layout
		TabHost tab_host = (TabHost)findViewById(android.R.id.tabhost);
		   
		   	// Set Tab Specification for Outside-Off Tab
	        TabSpec battery_tab_spec = tab_host.newTabSpec("off_tab");
	        battery_tab_spec.setContent(R.id.battery_tab);
	        battery_tab_spec.setIndicator("Off");
	        tab_host.addTab(battery_tab_spec);
	        
	        // Set Tab Specification for In-line Tab
	        TabSpec network_tab_spec = tab_host.newTabSpec("middle_tab");
	        network_tab_spec.setContent(R.id.network_tab);
	        network_tab_spec.setIndicator("Middle");
	        tab_host.addTab(network_tab_spec);
	        
	        // Set Tab Specification for Outside-Leg Tab
	        TabSpec  device_tab_spec = tab_host.newTabSpec("leg_tab");
	        network_tab_spec.setContent(R.id.device_tab);
	        device_tab_spec.setIndicator("Leg");
	        tab_host.addTab(device_tab_spec);
		 */
	        
	} // end method onCreate
	
	
	public void goButtonClicked(View view)
	{
    	tToast("Play ball!");
    } // end method goButtonClicked

    private void tToast(String s)
    {
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_LONG;
        Toast toast = Toast.makeText(context, s, duration);
        toast.show();
    } // end method tToast
    
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu)
	{
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
		
	} // end method onCreateOptionsMenu

} // end Class MainActivity
