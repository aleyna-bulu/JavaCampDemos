package nLayaredDemo.business.concretes;

import java.util.List;

import nLayaredDemo.business.abstracts.ProductService;
import nLayaredDemo.core.LoggerService;
import nLayaredDemo.dataAccess.abstracts.ProductDao;

import nLayaredDemo.entities.concretes.Product;

public class ProductManager implements ProductService
{
//dependency injection
	private ProductDao productDao;
	private LoggerService loggerService;
	
	public ProductManager(ProductDao productDao,LoggerService loggerService) {
	super();
	this.productDao = productDao;
	this.loggerService=loggerService;
}

	@Override
	public void add(Product product) {
		//iş kodları yazılır(kurallar vs)
		if (product.getCategoryId()==1) {
			System.out.println("Bu kategoride ürün kabul edilmiyor");
			return;
			//returnü gördüğü anda aşağı bakmaz bitirir
			}
		
		this.productDao.add(product);
		this.loggerService.logToSystem("ürün eklendi: "+product.getName());
		
		
	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
