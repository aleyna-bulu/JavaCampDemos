package inheritance2;

public class LogManager {
	
	//loglama bir projenin içinde bir dosya vardır oraya atarsın log nedir kim ne zamann ne yaptı
			//birbirinin alternatifi olan kodlar için if yaızlmaz
			
	
    public void log(int logType) {
    	if (logType==1) {
    		System.out.println("Veritabanı loglandı");
    		
    	}else if (logType==2) {
    		System.out.println("dosya loglandı");
    	}else {
    		System.out.println("Email loglandı");
    		
    	}
    }
    
}

//1-database
//2-dosya ya loglama
//3-email loglama