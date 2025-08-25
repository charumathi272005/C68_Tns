package com.tns.fooddeliverysystem.application.entities;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {
	private int id;
	private String name;
	private List<FoodItems>menu= new ArrayList<>();


public Restaurant(int id,String name) {
	this.id= id;
	this.name=name;
	
}
public int getId() {
	return id; 
	}
public String getName() { 
	return name; 
	}
public List<FoodItems> getMenu() {
	return menu;
	}

public void addFoodItem(FoodItems foodItem) {
    menu.add(foodItem);
}

public void removeFoodItem(int foodItemId) {
    menu.removeIf(f -> f.getId() == foodItemId);
}

@Override
public String toString() {
	return "Restaurant[id="+id+",name="+name+"]";
}
}