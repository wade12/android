package com.osgo.basicgridview;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.GridView;


public class AndroidGridLayoutActivity extends Activity
{
 
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.grid_layout);
 
        GridView gridView = (GridView) findViewById(R.id.grid_view);
 
        // Instance of ImageAdapter Class
        gridView.setAdapter(new ImageAdapter(this));
        
        // On Click event for Single Gridview Item
        gridView.setOnItemClickListener(new OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> parent, View v, int position, long id)
            {
                // Sending image id to FullScreenActivity
                Intent i = new Intent(getApplicationContext(), FullImageActivity.class);
                // passing array index
                i.putExtra("id", position);
                startActivity(i);
            } // end method onItemClick
        }); // end OnItemClickListener

    } // end method onCreate
    
    /*@Override
    public void onConfigurationChanged(Configuration newConfig)
    {

        super.onConfigurationChanged(newConfig);
        if (newConfig.orientation == Configuration.ORIENTATION_PORTRAIT)
        {
            setContentView(R.layout.vertical);
        } // end if
        else if (newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE)
        {
            setContentView(R.layout.horizontal);
        } // end else if

    }; // end onConfigurationChanged
*/    
} // end Class AndroidGridLayoutActivity   
