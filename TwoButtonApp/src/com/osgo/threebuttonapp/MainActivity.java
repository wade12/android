package com.osgo.threebuttonapp;
 
import com.osgo.threebuttonapp.R;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;
 
public class MainActivity extends Activity
{    
 private static String logtag = "3ButtonApp";				// for use as the tag when logging 
   
 	// called when the activity is first created.
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         
        Button buttonWebsite = (Button)findViewById(R.id.buttonWebsite);        
		buttonWebsite.setOnClickListener(websiteListener);			// Register the onClick listener with the implementation above
       
        Button buttonContact = (Button)findViewById(R.id.buttonContact);        
        buttonContact.setOnClickListener(contactListener);			// Register the onClick listener with the implementation above
        
        Button buttonDirections = (Button)findViewById(R.id.buttonDirections);        
        buttonContact.setOnClickListener(directionsListener);		// Register the onClick listener with the implementation above
    } // end method onCreate
    
     
    //Create an anonymous implementation of OnClickListener
    private OnClickListener websiteListener = new OnClickListener()
    {
        public void onClick(View view)
        {
          Log.d(logtag,"onClick() called - website button");              
          Toast.makeText(MainActivity.this, "Loading website.", Toast.LENGTH_LONG).show();
          Log.d(logtag,"onClick() ended - website button");
        } // end method onClick
    }; // end websiteListener
    
     
    // Create an anonymous implementation of OnClickListener
    private OnClickListener contactListener = new OnClickListener()
    {
        public void onClick(View view)
        {
         Log.d(logtag,"onClick() called - contact button"); 
         Toast.makeText(MainActivity.this, "Obtaining contact details.", Toast.LENGTH_LONG).show();
          Log.d(logtag,"onClick() ended - contact button");
        } // method onClick
    }; // end contactListener
    
    
    // Create an anonymous implementation of OnClickListener
    private OnClickListener directionsListener = new OnClickListener()
    {
        public void onClick(View view)
        {
         Log.d(logtag,"onClick() called - directions button"); 
         Toast.makeText(MainActivity.this, "Obtaining directions.", Toast.LENGTH_LONG).show();
          Log.d(logtag,"onClick() ended - directions button");
        } // method onClick
    }; // end directionsListener
     
     
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
    	Log.d(logtag,"onPause() called");//another activity is currently running (or user has pressed Home)
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
    
} // end Class MainActivity
