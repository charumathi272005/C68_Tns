package com.tns.fooddeliverysystem.application.entities;

public class Customer extends User {
	private Cart Cart;
	

public Customer(int userid,String username,long contactnumber){	
	super(userid,username,contactnumber);
	this.Cart= new Cart();
}


public Cart getCart() {
	return Cart;
}



}
