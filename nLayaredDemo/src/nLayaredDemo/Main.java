package nLayaredDemo;

import nLayaredDemo.business.abstracts.ProductService;
import nLayaredDemo.business.concretes.ProductManager;
import nLayaredDemo.core.JLoggerManagerAdapter;
import nLayaredDemo.dataAccess.abstracts.ProductDao;
import nLayaredDemo.dataAccess.concretes.AbcProductDao;
import nLayaredDemo.dataAccess.concretes.HibernateProductDao;
import nLayaredDemo.entities.concretes.Product;
import nLayaredDemo.jLogger.JLoggerManager;

public class Main {

	public static void main(String[] args) {
		
		
		//testlerimizi yapıcaz
		
		//ToDo: Spring ioc ile iyileştirilecek
		ProductService productService=new ProductManager(new AbcProductDao(),new JLoggerManagerAdapter());
		//burada interface newlemedim interfaceler bu sınıfların referansını tuttuğundan dolayı ona erişim sağlamak için productmanager yerine interfaceini yazdım.
		//ANLAMADIMMMMM
		Product product= new Product(1,2,"Elma",12,50);
		productService.add(product);;

	}

}

