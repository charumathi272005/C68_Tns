package com.tns.fooddeliverysystem.application.services;

import java.util.Map;

import com.tns.fooddeliverysystem.application.entities.FoodItems;
import com.tns.fooddeliverysystem.application.entities.Restaurant;

public class FoodService {
	
    private Map<Integer, Restaurant> restaurants;

    public FoodService(Map<Integer, Restaurant> restaurants) {
        this.restaurants = restaurants;
    }

    public void addRestaurant(int id, String name) {
        restaurants.put(id, new Restaurant(id, name));
        System.out.println("Restaurant added successfully!");
    }

    public void addFoodItem(int rid, int fid, String fname, double price) {
        if (restaurants.containsKey(rid)) {
            restaurants.get(rid).addFoodItem(new FoodItems(fid, fname, price));
            System.out.println("Food item added successfully!");
        } else {
            System.out.println("Restaurant not found!");
        }
    }

    public void removeFoodItem(int rid, int fid) {
        if (restaurants.containsKey(rid)) {
            restaurants.get(rid).removeFoodItem(fid);
            System.out.println("Food item removed successfully!");
        } else {
            System.out.println("Restaurant not found!");
        }
    }

    public void viewRestaurants() {
        System.out.println("Restaurants and Menus:");
        for (Restaurant r : restaurants.values()) {
            System.out.println("Restaurant ID: " + r.getId() + ", Name: " + r.getName());
            for (FoodItems f : r.getMenu()) {
                System.out.println("- Food Item ID: " + f.getId() + ", Name: " + f.getName() + ", Price: Rs. " + f.getPrice());
            }
        }
    }

    public FoodItems findFoodItem(int rid, int fid) {
        if (restaurants.containsKey(rid)) {
            for (FoodItems f : restaurants.get(rid).getMenu()) {
                if (f.getId() == fid) return f;
            }
        }
        return null;
    }
}
