package com.osgo.xxx;

import java.util.ArrayList;
import java.util.HashMap;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
 
public class CustomizedListView extends Activity
{
	// All static variables
	// static final String URL = "http://api.androidhive.info/music/music.xml";		// ???
	// XML node keys
	static final String KEY_SONG = "song"; // parent node
	static final String KEY_ID = "id";
	static final String KEY_TITLE = "title";
	static final String KEY_ARTIST = "artist";
	static final String KEY_DURATION = "duration";
	static final String KEY_THUMB_URL = "thumb_url";
	
	ListView list;
    LazyAdapter adapter;

	@Override
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		
		ArrayList<HashMap<String, String>> songsList = new ArrayList<HashMap<String, String>>();
        
		// looping through all song nodes <song>
		for (int i = 0; i < 8; i++)
		{
			// creating new HashMap
			HashMap<String, String> map = new HashMap<String, String>();
//			Element element = (Element) nodelist.item(i);
			// adding each child node to HashMap key => value
			map.put(KEY_ID + i, "AAA");
			map.put(KEY_TITLE, "Sports Headline");
			map.put(KEY_ARTIST, "Text Article");
			map.put(KEY_DURATION, "Author");
			map.put(KEY_THUMB_URL, "EEE");

			// adding HashList to ArrayList
			songsList.add(map);
		} // end for
		

		list = (ListView)findViewById(R.id.list);
		
		// Getting adapter by passing xml data ArrayList
        adapter = new LazyAdapter(this, songsList);        
        list.setAdapter(adapter);
        

        // Click event for single list row
        list.setOnItemClickListener(new OnItemClickListener()
        {

			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id)
			{
			} // end onItemClick
		}); // end OnItemClickListener
        
	} // end method onCreate
	
} // end Class CustomizedListView