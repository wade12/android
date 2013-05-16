package com.osgo;

import com.osgo.R;
import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends Activity
{
	private static final int FEATURE_NO_TITLE = 0;
	public final static String EXTRA_MESSAGE = "com.osgo.MESSAGE";
	private Button button;

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		requestWindowFeature(FEATURE_NO_TITLE);
		setTheme(android.R.style.Theme_Translucent_NoTitleBar_Fullscreen);
	    getWindow().addFlags(WindowManager.LayoutParams.FLAG_SHOW_WALLPAPER);
		setContentView(R.layout.activity_main);
		
		addListenerOnButton();
	        
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
    
    
    public void addListenerOnButton()
    {
    	button = (Button) findViewById(R.id.enterButton);
 		 
		button.setOnClickListener(new OnClickListener()
		{
			public void onClick(View view)
			{
				Intent intent = new Intent(MainActivity.this, DeliveryActivity.class);
				startActivity(intent);
				
			} // end method onClick
 
		}); //  end setOnClickListener
 
	} // end method addListenerOnButton
    
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu)
	{
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
		
	} // end method onCreateOptionsMenu

} // end Class MainActivity

