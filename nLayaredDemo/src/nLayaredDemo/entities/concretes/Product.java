package nLayaredDemo.entities.concretes;

import nLayaredDemo.entities.abstracts.Entity;
//javada başka paket içindeki class/interfcae vs kullnabailmek için onu IMPORT(içeri almak) etmen gerekiyor


public class Product implements Entity {
private int id;
private int categoryId;
private String name;
private double unitPrice;
private int unitsInStore;

public Product() {
	
}

public Product(int id, int categoryId, String name, double unitPrice, int unitsInStore) {
	super();
	this.id = id;
	this.categoryId = categoryId;
	this.name = name;
	this.unitPrice = unitPrice;
	this.unitsInStore = unitsInStore;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public int getCategoryId() {
	return categoryId;
}

public void setCategoryId(int categoryId) {
	this.categoryId = categoryId;
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

public int getUnitsInStore() {
	return unitsInStore;
}

public void setUnitsInStore(int unitsInStore) {
	this.unitsInStore = unitsInStore;
}



}
