package com.Product;

public class Product {

	private int id;
	private String name;
	private String department;
	private float cost;
	
	public Product() {
		super();
	}

	public Product(int id, String name, String department, float cost) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.cost = cost;
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

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public float getCost() {
		return cost;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", department=" + department + ", cost=" + cost + "]";
	}
	
	
	
}
