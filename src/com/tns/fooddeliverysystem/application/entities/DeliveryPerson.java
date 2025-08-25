package com.tns.fooddeliverysystem.application.entities;

public class DeliveryPerson {
	private int dpid;
	private String name;
	private long contactno;
	
	


public DeliveryPerson(int dpid,String name,long contactno) {
	
	this.contactno=contactno;
	this.dpid=dpid;
	this.name=name;
	
}
	public int getdpid() {
	return dpid;
	}
	public String getname() {
		return name;
	}
		public long getcontactno() {
			return contactno;
	}
	


@Override


public String toString()
{
	return "DeliveryPerson[dpid"+dpid+",name"+name+",contactno"+contactno+"]";
}}