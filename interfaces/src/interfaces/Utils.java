package interfaces;

public class Utils {
	//utilties araçlar demek sıklıkla kullanacağımız araçları buraya ekliyoruz.
	
	public static void runLoggers(Logger [] loggers,String message) {
		for(Logger logger:loggers) {
			logger.log(message);
	}

   }
}