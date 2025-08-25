package com.tns.fooddeliverysystem.application.entities;

public class FoodItems {
	private int id= 1;
	private String name="chicken fried rice";
	private double price=150;
	
	public FoodItems(int id,String name,double price) {
		
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

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	@Override
	
	public String toString() {
		return "FoodItems[id="+id+",name"+ name+",price"+price+"]";
	}
	

}
