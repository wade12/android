package com.osgo.yyy;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.ImageView;
import android.widget.TextView;

public class LatestActivity extends Activity
{
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_latest);
		
		String text = (String)getIntent().getExtras().get("Latest");
		int icon = getIntent().getExtras().getInt("icon");
		
		TextView textView = (TextView)findViewById(R.id.text1);
		textView.setText(text);
		
		ImageView image = (ImageView)findViewById(R.id.image_latest);
		image.setImageDrawable(getResources().getDrawable(icon));
		
	} // end method onCreate

	@Override
	public boolean onCreateOptionsMenu(Menu menu)
	{
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.latest, menu);
		return true;
	} // end method onCreateOptionsMenu

} // end Class LatestActivity