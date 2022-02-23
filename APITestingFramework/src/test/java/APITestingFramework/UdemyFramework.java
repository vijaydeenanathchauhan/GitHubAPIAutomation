package APITestingFramework;

import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.Test;

import Utility.RestFWLogger;

public class UdemyFramework {
	
	@Test
	public void Resttest1() {
		PropertyConfigurator.configure("log4j.properties");
		RestFWLogger.startTestCase("RestTest1");
		RestFWLogger.endTestCase();
	}

}
