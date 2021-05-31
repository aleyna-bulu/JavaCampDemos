package kodlamaio.northwind.core.utilities.results;

public class Result {//super type
private boolean success;
private String message;
//tüm requestlerde kulllanabileceğim bir yapı

public Result (boolean success) {
//bunu productcontrollerda kullanıcam
	this.success=success;
	
}

public Result (boolean success,String message) {
	this(success);
	//DRY
	this.message=message;
	
	}

public boolean isSuccess() {
	return this.success;
}
public String getMessage() {
	return this.message;
}
}
