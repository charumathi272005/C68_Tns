package com.tns.fooddeliverysystem.application.entities;

import java.util.HashMap;
import java.util.Map;

public class Order {
	    private int orderId;
	    private Customer customer;
	    private Map<FoodItems, Integer> items = new HashMap<>();;
	    private String status = "Pending";
	    private DeliveryPerson deliveryPerson;

	    public Order(int orderId, Customer customer) {
	        this.orderId = orderId;
	       this.customer = customer;
	       this.items.putAll(customer.getCart().getItems());
	    }
	   



	    public int getOrderId() {
			return orderId;
		}




		public void setOrderId(int orderId) {
			this.orderId = orderId;
		}




		public Customer getCustomer() {
			return customer;
		}




		public void setCustomer(Customer customer) {
			this.customer = customer;
		}




		public Map<FoodItems, Integer> getItems() {
			return items;
		}




		public void setItems(Map<FoodItems, Integer> items) {
			this.items = items;
		}




		public String getStatus() {
			return status;
		}




		public void setStatus(String status) {
			this.status = status;
		}




		public DeliveryPerson getDeliveryPerson() {
			return deliveryPerson;
		}



		public void setDeliveryPerson(DeliveryPerson deliveryPerson) {
			this.deliveryPerson = deliveryPerson;
		}


		@Override
	    public String toString() {
	        return "Order{orderId=" + orderId +", customer=" + customer.getUsername() + ", items=" + items + ", status='" + status + '\'' + ", deliveryPerson=" + (deliveryPerson == null ? "Not Assigned" : deliveryPerson.getname())+'}';
	    }
	}