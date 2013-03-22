package com.osgo.xxx;

import java.io.InputStream;
import java.io.OutputStream;
 
public class Utils
{
    public static void CopyStream(InputStream istream, OutputStream ostream)
    {
        final int buffer_size = 1024;
        try
        {
            byte[] bytes=new byte[buffer_size];
            for(;;)
            {
              int count = istream.read(bytes, 0, buffer_size);
              if(count == -1)
                  break;
              ostream.write(bytes, 0, count);
            } // end for
            
        } // end try
        
        catch(Exception ex)
        {}// end empty catch
        
    } // end method CopyStream
    
} // end Class Utils