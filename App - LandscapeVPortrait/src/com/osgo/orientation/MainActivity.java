package com.osgo.orientation;

import android.os.Bundle;
import android.app.Activity;
import android.content.pm.ActivityInfo;
import android.content.res.Configuration;
import android.util.Log;
import android.view.Menu;

public class MainActivity extends Activity
{
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}
 
	@Override
	public void onConfigurationChanged(Configuration newConfig)
	{
		// TODO Auto-generated method stub
		super.onConfigurationChanged(newConfig);
 
		if(newConfig.orientation==Configuration.ORIENTATION_LANDSCAPE)
		{
			Log.e("On Config Change","LANDSCAPE");
			setContentView(R.layout.activity_main);
		}
		else
		{
			Log.e("On Config Change","PORTRAIT");
			setContentView(R.layout.activity_main);
		}
	}
 
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu)
	{
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
 
}

