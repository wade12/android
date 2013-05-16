package com.osgo;

import com.osgo.R;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class DirectionsActivity extends Activity
{	 		
	private static String logtag = "DublinBracesApp";				// for use as the tag when logging
	
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_directions);
		
        Button buttonBlackrock = (Button)findViewById(R.id.buttonBlackrock);        
        buttonBlackrock.setOnClickListener(blackrockListener);				// Register the onClick listener with the implementation above
       
        Button buttonCityWest = (Button)findViewById(R.id.buttonCitywest);        
        buttonCityWest.setOnClickListener(citywestListener);				// Register the onClick listener with the implementation above
        
        Button buttonLucan = (Button)findViewById(R.id.buttonLucan);        
        buttonLucan.setOnClickListener(lucanListener);						// Register the onClick listener with the implementation above
    } // end method onCreate
    
     
    //Create an anonymous implementation of OnClickListener
    private OnClickListener blackrockListener = new OnClickListener()
    {
        public void onClick(View view)
        {
        	Log.d(logtag,"onClick() called - blackrock button");              
        	Toast.makeText(DirectionsActivity.this, "Loading website.", Toast.LENGTH_LONG).show();
        	Log.d(logtag,"onClick() ended - blackrock button");
        	
        	Intent intent = new Intent(DirectionsActivity.this, OutsideOffActivity.class);
            startActivity(intent);
        } // end method onClick
    }; // end blackrockListener
    
     
    // Create an anonymous implementation of OnClickListener
    private OnClickListener citywestListener = new OnClickListener()
    {    	
        public void onClick(View view)
        {
        	Log.d(logtag,"onClick() called - citywest button"); 
        	Toast.makeText(DirectionsActivity.this, "Obtaining contact details.", Toast.LENGTH_SHORT).show();
        	Log.d(logtag,"onClick() ended - citywest button");
        	
        	Intent intent = new Intent(DirectionsActivity.this, InLineActivity.class);
            startActivity(intent);
        } // method onClick
    }; // end citywestListener
    
    
    // Create an anonymous implementation of OnClickListener
    private OnClickListener lucanListener = new OnClickListener()
    {
        public void onClick(View view)
        {
        	Log.d(logtag,"onClick() called - lucan button"); 
        	Toast.makeText(DirectionsActivity.this, "Obtaining directions.", Toast.LENGTH_SHORT).show();
        	Log.d(logtag,"onClick() ended - lucan button");
        	
        	Intent intent = new Intent(DirectionsActivity.this, OutsideLegActivity.class);
            startActivity(intent);
        } // method onClick
    }; // end lucanListener
     
     
    @Override
    protected void onStart()
    {//activity is started and visible to the user
    		Log.d(logtag,"onStart() called");
    		super.onStart();  
    } // end method onStart
    
    
    @Override
    protected void onResume()
    {//activity was resumed and is visible again
    	Log.d(logtag,"onResume() called");
    	super.onResume();
    } // end method onResume
    
    
    @Override
    protected void onPause()
    { //device goes to sleep or another activity appears
    	Log.d(logtag,"onPause() called");	//another activity is currently running (or user has pressed Home)
    	super.onPause();
    } // end method onPause
 
    
    @Override
    protected void onStop()
    { //the activity is not visible anymore
    	Log.d(logtag,"onStop() called");
    	super.onStop();
    } // end method onStop
 
    
    @Override
    protected void onDestroy()
    {//android has killed this activity
    	Log.d(logtag,"onDestroy() called");
    	super.onDestroy();
    } // end method onDestroy
    	
} // end Class DirectionsActivity
