package kodlamaio.northwind.business.abstracts;

import java.util.List;

import kodlamaio.northwind.core.utilities.results.DataResult;
import kodlamaio.northwind.core.utilities.results.Result;
import kodlamaio.northwind.entities.concretes.Product;

public interface ProductService {
	//ben burada list <product> döndürüyorum ama işlem başarılı mı başarısız mı bilmiyorum bile
 DataResult<List<Product>>getAll();
 Result add(Product product);
}
