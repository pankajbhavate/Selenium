package Logger;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class loggers {
	

	public static void main(String[] args) {
		Logger logger= Logger.getLogger("automation fra");
		PropertyConfigurator.configure("C:\\Users\\DELL\\eclipse-workspace\\Selenium1\\src\\test\\resources\\Config\\log4j.properties");
		logger.info("open browser");
		System.out.println("pankaj");
		logger.info("print he my name is pankaj");
		logger.info("im waiting long time to you and you are reached now");
	}
	

		
	}
	
	
	
	  