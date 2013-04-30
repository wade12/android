package com.osgo.basicgridview;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
 
public class ImageAdapter extends BaseAdapter
{
    private Context mContext;
 
    // Keep all Images in array
    public Integer[] mThumbIds =
    	{
            R.drawable.menu_tasks, R.drawable.menu_projects,
            R.drawable.menu_diary, R.drawable.menu_performance,
            R.drawable.menu_mydocs, R.drawable.menu_safety,
            R.drawable.menu_tools, R.drawable.menu_sync
    	}; // end array mThumbIds
 
    // Constructor
    public ImageAdapter(Context c)
    {
        mContext = c;
    } // end constructor
 
    @Override
    public int getCount()
    {
        return mThumbIds.length;
    } // end method getCount
 
    @Override
    public Object getItem(int position)
    {
        return mThumbIds[position];
    } // end method getItem
 
    @Override
    public long getItemId(int position)
    {
        return 0;
    } // end method getItemId
 
    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        ImageView imageView = new ImageView(mContext);
        imageView.setImageResource(mThumbIds[position]);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setLayoutParams(new GridView.LayoutParams(300, 300));
        return imageView;
    } // end method getView
 
} // end Class ImageAdapter
