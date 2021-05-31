package kodlamaio.northwind.core.utilities.results;

public class SuccessDataResult<T> extends DataResult<T> {

	public SuccessDataResult(T data, String message) {
		super(data,true,message);
		//zaten başarılı oludğu için true bilgisini gönderdik
		
	}
public SuccessDataResult(T data){
	super (data,true);
}
public SuccessDataResult(String message) {
	super(null,true,message);
	
}
public SuccessDataResult() {
	super(null,true);
	
	
}
}
