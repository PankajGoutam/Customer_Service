package com.example.demo;

public class Product {
private int id;
private String name;
private int price;
private String cat;
private String cmp;
public Product() {
	super();
	// TODO Auto-generated constructor stub
}
public Product(int id, String name, int price, String cat, String cmp) {
	super();
	this.id = id;
	this.name = name;
	this.price = price;
	this.cat = cat;
	this.cmp = cmp;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public String getCat() {
	return cat;
}
public void setCat(String cat) {
	this.cat = cat;
}
public String getCmp() {
	return cmp;
}
public void setCmp(String cmp) {
	this.cmp = cmp;
}

}
