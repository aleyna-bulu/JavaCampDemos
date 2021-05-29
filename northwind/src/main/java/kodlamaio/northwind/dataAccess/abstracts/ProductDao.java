package kodlamaio.northwind.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.northwind.entities.concretes.Product;

public interface ProductDao extends JpaRepository<Product, Integer> {
//verdiğim veri tipi için yani entity anotasyonyla süslenmiş nesne için(product)primary key alanını da ver ki ben sorguları intellisensi ona göre hazırliyim diyor (priamry key alanım integer olduğundan integer olarak veriyorym
}
//şu an itibariyle dataAccesste CRUD operasyonalrı hazır

