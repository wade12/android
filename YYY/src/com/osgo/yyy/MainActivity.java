package com.osgo.yyy;

import android.app.ActionBar;
import android.app.ActionBar.Tab;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
 
public class MainActivity extends FragmentActivity
{
    @Override																										// override annotation
    public void onCreate(Bundle savedInstanceState)																	// called when the activity is 1st created
    {
        super.onCreate(savedInstanceState);      
 
        ActionBar actionBar = getActionBar();
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
 
        actionBar.setDisplayShowTitleEnabled(true);
 
        Tab tab = actionBar.newTab()																				// creating the Trending tab
                .setText("Trending")
                .setTabListener(new CustomTabListener<TrendingFragment>(this, "Trending", TrendingFragment.class))
                .setIcon(R.drawable.trending);
     
            actionBar.addTab(tab);
        
        tab = actionBar.newTab()																					// creating the Latest tab
            .setText("Latest")
            .setTabListener(new CustomTabListener<LatestFragment>(this, "Latest", LatestFragment.class))
            .setIcon(R.drawable.latest);
 
        actionBar.addTab(tab);
        
        tab = actionBar.newTab()																					// creating the Galleries tab
                .setText("Galleries")
                .setTabListener(new CustomTabListener<GalleriesFragment>(this, "Galleries", GalleriesFragment.class))
                .setIcon(R.drawable.galleries);
     
        actionBar.addTab(tab);
             
    } // end method onCreate
    
} // end Class MainActivity