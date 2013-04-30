package com.osgo.basicgridview;

import android.app.Activity;
import android.os.Bundle;
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
    } // end method onCreate
    
} // end Class AndroidGridLayoutActivity
