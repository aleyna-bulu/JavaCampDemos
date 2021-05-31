package kodlamaio.northwind.core.utilities.results;

public class DataResult<T> extends Result {

	//data döndürücem;data ürün olabilir ürün listesi,employee vs her veri olabilir
			//birden fazla veri tipiyle çalışacabileceimiz noktada generic çalışırız
	
	private T data;
	public DataResult(T data,boolean success, String message) {
		super(success, message);
		//super base sınıfın constructorlarını set ediyor
     	this.data=data;
	}
	
	public DataResult(T data,boolean success) {
		super(success);
		//super base sınıfın constructorlarını set ediyor
     	this.data=data;
	
	}
	public T getData() {
	return this.data;
	}
}
