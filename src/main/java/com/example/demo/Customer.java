package com.example.demo;

public class Customer {
	private int id;
	private String cname;
	private String address;
	private Product product;
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(int id, String cname, String address) {
		super();
		this.id = id;
		this.cname = cname;
		this.address = address;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
}
