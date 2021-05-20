package interfaces;

public class CustomerManager  {
	
	
	private Logger[] loggers;
	
   //2 tür bağlılık loosly-tightly coupled
	
	public CustomerManager(Logger[] loggers) {
		
		this.loggers = loggers;
	}

	public void add(Customer customer) {
		System.out.println("Müşteri eklendi"+ customer.getFirstName());
//		Utils utils =new Utils();
		Utils.runLoggers(loggers,customer.getFirstName());
		
		
		
//        for (Logger logger :loggers) {
//        	logger.log(customer.getFirstName());
//        }
		
		//	    this.logger.log(customer.getFirstName());
		
	   	}
	
	public void delete(Customer customer) {
		System.out.println("Müşteri silindi" + customer.getFirstName());
       Utils.runLoggers(loggers, customer.getLastName());
		
		
	}
	
	
	 
}
