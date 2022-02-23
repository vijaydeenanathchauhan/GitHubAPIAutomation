package Utility;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class RestFWLogger {
	
	//Intilize Logger Log4J Logs
	

	private static Logger log = Logger.getLogger(RestFWLogger.class.getName());
	
	public static void initLogger() {
		PropertyConfigurator.configure("log4j.properties");
	} 
	
	public static void startTestCase(String sTestCaseName) {
		
		log.info("****************************************************");
		log.info("****************************************************");
		log.info("$$$$$$$$$$$$$$$$$$$$$$$$"+sTestCaseName+"$$$$$$$$$$$$$$$$$$$$$$$$$");
		log.info("****************************************************");
		log.info("****************************************************");		
	}
	
public static void endTestCase() {
		
		log.info("****************************************************");
		log.info("****************************************************");
		log.info("$$$$$$$$$$$$$$$$$$$$$$$$"+"-END--TESTCASE"+"$$$$$$$$$$$$$$$$$$$$$$$$$");
		log.info("****************************************************");
		log.info("****************************************************");		
	}

public static void info(String message) {
log.info(message);	
}
public static void warn(String message) {
log.info(message);	
}
public static void error(String message) {
log.info(message);	
}
public static void fatal(String message) {
log.info(message);	
}
public static void debug(String message) {
log.info(message);	
}
}
