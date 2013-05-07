package com.osgo;

import com.osgo.R;

import android.os.Bundle;


import android.app.Activity;
import android.app.TabActivity;
import android.view.Menu;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;


public class MainActivity extends TabActivity
{
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		// Access Tab Host from Main Layout
		   TabHost tab_host = (TabHost)findViewById(android.R.id.tabhost);
		   // Set Tab Specification for Battery Tab
		   
	        TabSpec battery_tab_spec = tab_host.newTabSpec("battery_tab");
	        
	        battery_tab_spec.setContent(R.id.battery_tab);
	        battery_tab_spec.setIndicator("Off");
	        tab_host.addTab(battery_tab_spec);
	        
	        // Set Tab Specification for Network Tab
	        TabSpec network_tab_spec = tab_host.newTabSpec("network_tab");
	        
	        network_tab_spec.setContent(R.id.network_tab);
	        network_tab_spec.setIndicator("Middle");
	        tab_host.addTab(network_tab_spec);
	        
	        // Set Tab Specification for Device Tab
	        TabSpec  device_tab_spec = tab_host.newTabSpec("device_tab");
	        
	        device_tab_spec.setContent(R.id.device_tab);
	        device_tab_spec.setIndicator("Leg");
	        tab_host.addTab(device_tab_spec);
	        
	} // end method onCreate
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu)
	{
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
		
	} // end method onCreateOptionsMenu

} // end Class MainActivity
