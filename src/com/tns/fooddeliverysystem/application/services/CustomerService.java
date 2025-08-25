package com.tns.fooddeliverysystem.application.services;

import java.util.Map;
import com.tns.fooddeliverysystem.application.entities.Customer;
import com.tns.fooddeliverysystem.application.entities.FoodItems;

public class CustomerService {
	private Map<Integer, Customer> customers;

    public CustomerService(Map<Integer, Customer> customers) {
        this.customers = customers;
    }
   

    public void addCustomer(int userid, String username, long contactno) {
        if (customers.containsKey(userid)) {
            System.out.println("Customer with this ID already exists!");
            return;
             
        }
        customers.put(userid, new Customer(userid, username, contactno));
        System.out.println("Customer created successfully!");
    }

    
    public Customer getCustomer(int uid) {
        return customers.get(uid);
    }

   
    public void addFoodToCart(int userid, FoodItems food, int qty) {
        if (food == null) {
            System.out.println("Invalid Food Item!");
            return;
        }
        Customer c = customers.get(userid);
        if (c != null) {
            c.getCart().addItem(food, qty);
            System.out.println("Food item added to cart!");
        } else {
            System.out.println("Customer not found!");
        }
    }

    
    public void viewCart(int userid) {
        Customer c = customers.get(userid);
        if (c != null) {
            System.out.println(c.getCart());
        } else {
            System.out.println("Customer not found!");
        }
    }
}
