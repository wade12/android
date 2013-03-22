package com.osgo.xxx;

import java.util.ArrayList;
import java.util.HashMap;
 
import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
 
public class LazyAdapter extends BaseAdapter
{
    
    private Activity activity;
    private ArrayList<HashMap<String, String>> data;
    private static LayoutInflater inflater = null;
    public ImageLoader imageLoader; 
    
    public LazyAdapter(Activity a, ArrayList<HashMap<String, String>> d)
    {
        activity = a;
        data = d;
        inflater = (LayoutInflater)activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        imageLoader = new ImageLoader(activity.getApplicationContext());
    } // end constructor

    public int getCount()
    {
        return data.size();
    } // end method getCount

    public Object getItem(int position)
    {
        return position;
    } // end method getItem

    public long getItemId(int position)
    {
        return position;
    } // end method getItemId
    
    public View getView(int position, View convertView, ViewGroup parent)
    {
        View view = convertView;
        if(convertView == null)
            view = inflater.inflate(R.layout.list_row, null);

        TextView title = (TextView)view.findViewById(R.id.title); // title
        TextView artist = (TextView)view.findViewById(R.id.artist); // artist name
        TextView duration = (TextView)view.findViewById(R.id.duration); // duration
        ImageView thumb_image = (ImageView)view.findViewById(R.id.list_image); // thumb image
        
        HashMap<String, String> song = new HashMap<String, String>();
        song = data.get(position);
        
        // Setting all values in listview
        title.setText(song.get(CustomizedListView.KEY_TITLE));
        artist.setText(song.get(CustomizedListView.KEY_ARTIST));
        duration.setText(song.get(CustomizedListView.KEY_DURATION));
        imageLoader.DisplayImage(song.get(CustomizedListView.KEY_THUMB_URL), thumb_image);
        return view;
    } // end method getView
    
} // end Class LazyAdapter