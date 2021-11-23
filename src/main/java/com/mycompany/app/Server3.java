package com.mycompany.app;

import javax.crypto.Cipher;
import java.lang.Exception;

/**
 * Hello world!
 *
 */
public class Server3
{
    public void bar()
    {
        System.out.println( "Hello World!" );
    }
  
    private void cipher(String s) throws Exception
    {
        Cipher c = Cipher.getInstance(s);
    }

}
