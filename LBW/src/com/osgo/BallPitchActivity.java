package com.osgo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class BallPitchActivity extends Activity
{    
 private static String logtag = "CricketApp";				// for use as the tag when logging
   
 	// called when the activity is first created.
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         
        Button buttonOutsideOff = (Button)findViewById(R.id.buttonOutsideOff);        
        buttonOutsideOff.setOnClickListener(outsideOffListener);				// Register the onClick listener with the implementation above
       
        Button buttonInLine = (Button)findViewById(R.id.buttonInLine);        
        buttonInLine.setOnClickListener(inLineListener);				// Register the onClick listener with the implementation above
        
        Button buttonOutsideLeg = (Button)findViewById(R.id.buttonOutsideLeg);        
        buttonOutsideLeg.setOnClickListener(outsideLegListener);		// Register the onClick listener with the implementation above
    } // end method onCreate
    
     
    //Create an anonymous implementation of OnClickListener
    private OnClickListener outsideOffListener = new OnClickListener()
    {
        public void onClick(View view)
        {
        	Log.d(logtag,"onClick() called - website button");              
        	Toast.makeText(BallPitchActivity.this, "Loading website.", Toast.LENGTH_LONG).show();
        	Log.d(logtag,"onClick() ended - website button");
        	
        	Intent intent = new Intent(BallPitchActivity.this, OutsideOffActivity.class);
            startActivity(intent);
        } // end method onClick
    }; // end outsideOffListener
    
     
    // Create an anonymous implementation of OnClickListener
    private OnClickListener inLineListener = new OnClickListener()
    {    	
        public void onClick(View view)
        {
        	Log.d(logtag,"onClick() called - contact button"); 
        	Toast.makeText(BallPitchActivity.this, "Obtaining contact details.", Toast.LENGTH_SHORT).show();
        	Log.d(logtag,"onClick() ended - contact button");
        	
        	Intent intent = new Intent(BallPitchActivity.this, InLineActivity.class);
            startActivity(intent);
        } // method onClick
    }; // end inLineListener
    
    
    // Create an anonymous implementation of OnClickListener
    private OnClickListener outsideLegListener = new OnClickListener()
    {
        public void onClick(View view)
        {
        	Log.d(logtag,"onClick() called - directions button"); 
        	Toast.makeText(BallPitchActivity.this, "Obtaining directions.", Toast.LENGTH_SHORT).show();
        	Log.d(logtag,"onClick() ended - directions button");
        	
        	Intent intent = new Intent(BallPitchActivity.this, OutsideLegActivity.class);
            startActivity(intent);
        } // method onClick
    }; // end outsideLegListener
     
     
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
    
} // end Class MainActivity
