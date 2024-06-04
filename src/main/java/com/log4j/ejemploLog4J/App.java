package com.log4j.ejemploLog4J;

import org.apache.logging.log4j.*;

/**
 * Hello world!
 *
 */
public class App 
{
	
	private static final Logger logger = LogManager.getLogger(App.class.getName());
	
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
	    
        logger.trace("Mensaje TRACE");
        logger.debug("Mensaje DEBUG");
        logger.info("Mensaje INFO");
        logger.warn("Mensaje WARN");
        logger.error("Mensaje ERROR");
        logger.fatal("Mensaje FATAL");
        
        //System.err.print("error");
        
        try {
        	int a = 10/0;
        }catch(Exception e) {
        	logger.error("error en la division: {}", e.getMessage());
        }
        
    }
}
