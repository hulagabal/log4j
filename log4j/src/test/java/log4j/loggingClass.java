package log4j;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class loggingClass {
	
	private static Logger log=LogManager.getLogger("loggingClass");
	
	public static void main(String[] args) {
		PropertyConfigurator.configure("Log4j2.properties");
		log.info("Massage");
	}

}
