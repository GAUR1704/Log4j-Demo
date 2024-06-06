package com.prowings.main;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4j2Demo {
	
	private static final Logger logger = LogManager.getLogger(Log4j2Demo.class);
	
	public static void main(String[] args) throws InterruptedException {
		
		logger.trace("This is a TRACE message.");
        logger.debug("This is a DEBUG message.");
        logger.info("This is an INFO message.");
        logger.warn("This is a WARN message.");
        logger.error("This is an ERROR message.");
        logger.fatal("This is a FATAL message.");
        
        Thread.sleep(65000);
        
        logger.trace("This is a TRACE message.");
        logger.debug("This is a DEBUG message.");
        logger.info("This is an INFO message.");
        logger.warn("This is a WARN message.");
        logger.error("This is an ERROR message.");
        logger.fatal("This is a FATAL message.");
	}
	

}