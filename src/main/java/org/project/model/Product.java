package org.project.model;

public class Product {
	
	private String name;
	private String category;
	private Double price;
	private String image;
	private int id;
	
	
	public Product() {
		super();
		
	}
   public Product(int id, String name, String category, Double price, String image) {
		super();
		this.id = id;
		this.name = name;
		this.category = category;
		this.price = price;
		this.image = image;
	}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCategory() {
	return category;
}
public void setCategory(String category) {
	this.category = category;
}
public 	Double getPrice() {
	return price;
}
public void setPrice(Double price) {
	this.price =price;
}
public String getImage() {
	return image;
}
public void setImage(String image) {
	this.image = image;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
@Override
public String toString() {
	return "Product [name=" + name + ", category=" + category + ", price=" + price + ", image=" + image + ", id=" + id
			+ ", getName()=" + getName() + ", getCategory()=" + getCategory() + ", getPrice()=" + getPrice()
			+ ", getImage()=" + getImage() + ", getId()=" + getId() + ", getClass()=" + getClass() + ", hashCode()="
			+ hashCode() + ", toString()=" + super.toString() + "]";
}

   
	
	
	
	

}
