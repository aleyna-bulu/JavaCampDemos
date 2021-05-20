package nLayaredDemo.business.abstracts;

import java.util.List;

import nLayaredDemo.entities.concretes.Product;

public interface ProductService
//neyi servis etmek istiyorsam onları yazıyorum{
	
{
	void add(Product product);
	List<Product>getAll();
	

}
