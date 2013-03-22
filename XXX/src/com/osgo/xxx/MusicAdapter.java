package com.osgo.xxx;

import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class MusicAdapter extends ArrayAdapter<Music>
{
	private List<Music> songs;

    public MusicAdapter(Context context, int view, List<Music> passedSongs)
    {
            super(context, view, passedSongs);
            songs = passedSongs;
    } // end constructor

    @Override
    public int getCount()
    {
        return songs.size();
    } // end method getCount

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
            View currentView = convertView;
            LayoutInflater currentViewInflater = (LayoutInflater)getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            currentView = currentViewInflater.inflate(android.R.layout.simple_list_item_1, null);
            Music currentContract = songs.get(position);
            TextView text = (TextView) currentView.findViewById(android.R.id.text1);
            text.setText(currentContract.getSong());
            return currentView;
            
    } // end method getView
    
} // end Class MusicAdapter
