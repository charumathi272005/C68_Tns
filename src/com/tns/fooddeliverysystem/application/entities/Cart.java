package com.tns.fooddeliverysystem.application.entities;
import java.util.*;

public class Cart {
	
	    private Map<FoodItems, Integer> items = new HashMap<>();

	    public void addItem(FoodItems foodItem, int quantity) {
	        items.put(foodItem, items.getOrDefault(foodItem, 0) + quantity);
	    }

	    public void removeItem(FoodItems foodItem) {
	        items.remove(foodItem);
	    }

	    public Map<FoodItems, Integer> getItems() {
	        return items;
	    }

	    @Override
	    public String toString() {
	        StringBuilder sb = new StringBuilder("Cart:\n");
	        double total = 0;
	        for (Map.Entry<FoodItems, Integer> e : items.entrySet()) {
	            double cost = e.getKey().getPrice() * e.getValue();
	            sb.append("Food Item: ").append(e.getKey().getName())
	              .append(", Quantity: ").append(e.getValue())
	              .append(", Cost: Rs. ").append(cost).append("\n");
	            total += cost;
	        }
	        sb.append("Total Cost: Rs. ").append(total).append("\n");
	        return sb.toString();
	    }
	}
