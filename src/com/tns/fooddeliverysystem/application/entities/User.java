package com.tns.fooddeliverysystem.application.entities;

public class User {
	private int userid;
	private String username;
	private long contactnumber;


public User(int userid,String username,long contactnumber) {
	this.userid=userid;
	this.username=username;
	this.contactnumber=contactnumber;
	
}


public int getUserid() {
	return userid;
}


public String getUsername() {
	return username;
}

public long getContactnumber() {
	return contactnumber;
}


@Override
public String toString() {
	return "User[userid"+userid+",username"+username+",contactnumber"+contactnumber+"]";
}
	
}
