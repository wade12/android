package com.osgo.twobuttonapp;
 
import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;
 
public class MainActivity extends Activity
{    
 private static String logtag = "TwoButtonApp";//for use as the tag when logging 
   
 /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         
        Button buttonStart = (Button)findViewById(R.id.buttonStart);        
     buttonStart.setOnClickListener(startListener); // Register the onClick listener with the implementation above
       
     Button buttonStop = (Button)findViewById(R.id.buttonStop);        
     buttonStop.setOnClickListener(stopListener); // Register the onClick listener with the implementation above
    } // end method onCreate
    
     
    //Create an anonymous implementation of OnClickListener
    private OnClickListener startListener = new OnClickListener()
    {
        public void onClick(View view)
        {
          Log.d(logtag,"onClick() called - start button");              
          Toast.makeText(MainActivity.this, "The Start button was clicked.", Toast.LENGTH_LONG).show();
          Log.d(logtag,"onClick() ended - start button");
        } // end method onClick
    }; // end OnClickListener
    
     
    // Create an anonymous implementation of OnClickListener
    private OnClickListener stopListener = new OnClickListener()
    {
        public void onClick(View view)
        {
         Log.d(logtag,"onClick() called - stop button"); 
         Toast.makeText(MainActivity.this, "The Stop button was clicked.", Toast.LENGTH_LONG).show();
          Log.d(logtag,"onClick() ended - stop button");
        } // method onClick
    }; // end stopListener
     
     
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
