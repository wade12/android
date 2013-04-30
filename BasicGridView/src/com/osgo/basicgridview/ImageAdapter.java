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
            R.drawable.sample_0, R.drawable.sample_1,
            R.drawable.sample_2, R.drawable.sample_3,
            R.drawable.sample_4, R.drawable.sample_5,
            R.drawable.sample_6, R.drawable.sample_7
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
        imageView.setLayoutParams(new GridView.LayoutParams(200, 200));
        return imageView;
    } // end method getView
 
} // end Class ImageAdapter
