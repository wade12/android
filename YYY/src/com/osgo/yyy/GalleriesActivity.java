package com.osgo.yyy;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.ImageView;
import android.widget.TextView;

public class GalleriesActivity extends Activity
{
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_galleries);
		
		String text = (String)getIntent().getExtras().get("Galleries");
		int icon = getIntent().getExtras().getInt("icon");
		
		TextView textView = (TextView)findViewById(R.id.text1);
		textView.setText(text);
		
		ImageView image = (ImageView)findViewById(R.id.image_galleries);
		image.setImageDrawable(getResources().getDrawable(icon));
		
	} // end method onCreate

	@Override
	public boolean onCreateOptionsMenu(Menu menu)
	{
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.galleries, menu);
		return true;
	} // end method onCreateOptionsMenu

} // end Class GalleriesActivity