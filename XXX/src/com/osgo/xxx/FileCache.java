package com.osgo.xxx;

import java.io.File;
import android.content.Context;
 
public class FileCache
{
 
    private File cacheDir;
 
    public FileCache(Context context)
    {
        //Find the dir to save cached images
        if (android.os.Environment.getExternalStorageState().equals(android.os.Environment.MEDIA_MOUNTED))
            cacheDir = new File(android.os.Environment.getExternalStorageDirectory(),"LazyList");
        else
            cacheDir = context.getCacheDir();
        if(!cacheDir.exists())
            cacheDir.mkdirs();
    } // end constructor
 
    public File getFile(String url)
    {
        //I identify images by hashcode. Not a perfect solution, good for the demo.
        String filename = String.valueOf(url.hashCode());
        //Another possible solution (thanks to grantland)
        //String filename = URLEncoder.encode(url);
        File file = new File(cacheDir, filename);
        return file;
 
    } // end method getFile
 
    public void clear()
    {
        File[] files = cacheDir.listFiles();
        if(files == null)
            return;
        for(File file:files)
            file.delete();
    } // end method clear
 
} // end Class FileCache