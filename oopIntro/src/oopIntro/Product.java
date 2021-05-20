package oopIntro;

public class Product {
	//benim product classım özellik tutuyor
	//benim product diye bir veritipim var ve onun içinde de name diye bir alan var.
	//kod yazarken önce fieldlar sonra constructorlar yazılır.daha sonra da varsa operasyonlar yazılır.
	
	
	//encapsulation
	private int id;
	private String name ;
	private double unitPrice;
	private String details;
	private double discount;
	
    //field
    //final dışarıdan erişimi kısıtlıyor ve sadece constructorda set edilebilir demek.
    //private sadece bu classın içinde kullanılabilir (geçerli) demek.
   public Product() {
	   
   }
   
    
	public Product(int id, String name, double unitPrice, String details,double discount) {
		super();
		this.id = id;
		this.name = name;
		this.unitPrice = unitPrice;
		this.details = details;
		this.discount=discount;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public double getUnitPriceAfterDiscount() {
	
		return this.unitPrice-(this.unitPrice*this.discount/100);
	//bu değeri okumaya yönelik
	}
	
	//yukarıdakilerin hepsi birer iş yapan metotlar.
	//c#ta property bunun javada tam karşılığı yok ama methot olarak adlandırıyoruz. 
    
    
	//public Product() {
	//constructor bloğu açtım	
	
		//System.out.println("ben çalıştım");
	//}
	//public Product(int id,String name,double unitPrice,String details) {
		//this();
		//this.id=id;
		//this.name=name;
		//this.unitPrice=unitPrice;
		//this.details=details;
	}
	
	
 

