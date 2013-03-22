package com.osgo.yyy;

import android.app.ListFragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;
 

public class LatestFragment extends ListFragment											// this is a listfragment Class
{ 
    String latest_versions[] = new String[]												// a string array of items to display in ArrayList
    		{
    		"Latest News 1",
    		"Latest News 2",
    		"Latest News 3",
    		"Latest News 4",
    		"Latest News 5"
    		};																			// populate array
 
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        return super.onCreateView(inflater, container, savedInstanceState);
    } // end method onCreateView
 
    @Override
    public void onStart()
    {
        super.onStart();
 
        // setting the single-select choice mode for the listview
        getListView().setChoiceMode(ListView.CHOICE_MODE_SINGLE);
    } //  end method onStart
    
    @Override
    public void onActivityCreated(Bundle savedInstanceState)
    {

    	super.onActivityCreated(savedInstanceState);
    	
    	// creating array adapter to set data in listview
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity().getBaseContext(), android.R.layout.simple_list_item_1, latest_versions);
 
        // setting the array adapter to the listview
        setListAdapter(adapter);
        
        final ListView lv = getListView();
        
        lv.setTextFilterEnabled(true);
        		
        lv.setOnItemClickListener(new OnItemClickListener()
        {
        	public void onItemClick(AdapterView<?> parent, View view, int position, long id)
        	{
        		//code specific to list item selected
        		String textToPass = (String) lv.getAdapter().getItem(position);
        		Intent myIntent = new Intent(getView().getContext(), LatestActivity.class);
        		
        		if (position == 0)
        			myIntent.putExtra("icon",R.drawable.balls);
        		if (position == 1)
        			myIntent.putExtra("icon",R.drawable.balls);
        		if (position == 2)
        			myIntent.putExtra("icon",R.drawable.balls);
        		if (position == 3)
        			myIntent.putExtra("icon",R.drawable.balls);
        		if (position == 4)
        			myIntent.putExtra("icon",R.drawable.balls);
        		
        		myIntent.putExtra("Latest", textToPass);
        		startActivityForResult(myIntent, 0);
        		
        	} // end method onItemClick 
        	
        }); // end setOnItemClickListener
        
    } // end method onActivityCreated
 
} // end Class LatestFragment