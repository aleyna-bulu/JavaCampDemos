package kodlamaio.northwind.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Entity
//anotasyon
//bu hareketi yapaarak product bir entity diyoruz
@Table(name="products")
@AllArgsConstructor
//tüm argümanları kullanarak constructor ekle 
@NoArgsConstructor
//parametresiz olan constr. için





public class Product {
	
	@Id
	//primary key bu olduğundan işlemler buna göre belirlenecek o yüzden bu şekilde yazmamız lazım	
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	//id nin 1 1 arttırılacağını söylemiş oldu
	@Column(name="product_id")
private int id;
	
	@Column(name="category_id")
private int categoryId;
	
	@Column(name="product_name")
private String productName;
	
	@Column(name="unit_price")
private double unitPrice;
	
	@Column(name="units_in_stock")
private short unitsInStock;
	
	@Column(name="quantity_per_unit")
private String quantityPerUnit;
	

}
