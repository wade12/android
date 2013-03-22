package com.osgo.yyy;

import android.app.ActionBar.Tab;
import android.app.ActionBar.TabListener;
import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentTransaction;

public class CustomTabListener<T extends Fragment> implements TabListener
{
	private Fragment mFragment;
	private final Activity mActivity;
	private final String mTag;
	private final Class<T> mClass;
	
	public CustomTabListener(Activity activity, String tag, Class<T> clz)
	{
		mActivity = activity;
		mTag = tag;
		mClass = clz;
		
	} // end method CustomTabListener
	

	@Override
	public void onTabReselected(Tab tab, FragmentTransaction ft)
	{
		// Nothing special to do here for this application
	} // end method onTabReselected

	@Override
	public void onTabSelected(Tab tab, FragmentTransaction ft)
	{
		if(mFragment==null)
		{
			mFragment = Fragment.instantiate(mActivity, mClass.getName());
			ft.add(android.R.id.content,mFragment, mTag);
			
		} // end if
		else
		{
			ft.attach(mFragment);
		} // end else
		
	} // end method onTabSelected

	@Override
	public void onTabUnselected(Tab tab, FragmentTransaction ft)
	{
		if(mFragment!=null)
			ft.detach(mFragment);		
	} //  end method onTabUnselected

} // end Class CustomTabListener