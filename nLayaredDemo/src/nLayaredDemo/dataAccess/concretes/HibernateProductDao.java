package nLayaredDemo.dataAccess.concretes;

import java.util.List;

import nLayaredDemo.dataAccess.abstracts.ProductDao;
import nLayaredDemo.entities.concretes.Product;

public class HibernateProductDao implements ProductDao 
	//hibernate veritabanıyla iletişim kuran java yapısı
	//veriye erişim kodları yazılacak bunun içinde

{

	@Override
	public void add(Product product) {
		System.out.println("Hibernate ile eklendi " +product.getName());
		
	}

	@Override
	public void update(Product product) {
		
	}

	@Override
	public void delete(Product product) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Product get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Integer> getAll() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}
