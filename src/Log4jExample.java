package com.dineshsriram.Log4jExample;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.core.config.LoggerConfig;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.LoggerContext;

import java.io.*;


public final class Log4jExample
{
    static final Logger logger = LogManager.getLogger(Log4jExample.class);

    Log4jExample()
    {
      logger.info("a info msg");
      logger.warn("a warn msg");
      logger.debug("a debug msg");
    }

    public static void main(String[] args)
    {
        new Log4jExample();

        LoggerContext ctx = (LoggerContext) LogManager.getContext(false);
        ctx.getConfiguration().getLoggerConfig(LogManager.ROOT_LOGGER_NAME).setLevel(Level.DEBUG);
        ctx.updateLoggers(); 

        logger.info("b info msg");
        logger.warn("b warn msg");
        logger.debug("b debug msg");


    }
}
