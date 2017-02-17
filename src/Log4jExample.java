package com.dineshsriram.Log4jExample;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import java.io.*;


public final class Log4jExample
{
    static final Logger logger = LogManager.getLogger(Log4jExample.class);
    
    Log4jExample()
    {
        System.out.println("Starting up!");
        
    }
    public static void main(String[] args)
    {
        new Log4jExample();
    }

}
