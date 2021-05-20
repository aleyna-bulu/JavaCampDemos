package nLayaredDemo.dataAccess.abstracts;

import java.util.List;

import nLayaredDemo.entities.concretes.Product;

public interface ProductDao {
	
	void add(Product product);
	void update(Product product);
	void delete(Product product);
	Product get(int id);
	//bana bir id ver o içeride veritabanından ürünü bulup onu getirecek
	List<Integer>getAll();
	//ürün listesi
	


	

}
