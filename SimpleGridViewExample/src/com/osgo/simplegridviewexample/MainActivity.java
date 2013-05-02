package com.osgo.simplegridviewexample;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

/*public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
*/

import android.widget.ArrayAdapter;
import android.widget.GridView;
 
public class MainActivity extends Activity
{
	GridView gridView;
 
    String[] listContent = {
 
          "January",
 
          "February",
 
          "March",
 
          "April",
 
          "May",
 
          "June",
 
          "July",
 
          "August",
 
          "September",
 
          "October",
 
          "November",
 
          "December"
 
  };
 
     
 
    // Called when the activity is first created.
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
    	super.onCreate(savedInstanceState);
    	setContentView(R.layout.activity_main);

    	gridView = (GridView)findViewById(R.id.grid);
 
    	ArrayAdapter<String> adapter
      		= new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, listContent);
 
    	gridView.setAdapter(adapter);
    } // end method onCreate
 
} // end Class MainActivity
