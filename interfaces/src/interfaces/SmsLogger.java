package interfaces;

public class SmsLogger implements Logger {
	//loggerı sms loggera uyarla demek implemente e.yani gerekli olan kodları yaz.
		//ama inheritance ta gerekli olan kodları yazmak zorunda değiliz istersek override ederek üzerine yazabiliyoruz.

	@Override
	public void log(String message) {
		
		System.out.println("Sms gönderildi: " +message);
	}
	

}
