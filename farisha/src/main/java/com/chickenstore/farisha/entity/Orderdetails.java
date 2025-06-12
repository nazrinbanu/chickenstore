//package com.chickenstore.farisha.entity;
//
//import jakarta.persistence.Column;
//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
//import jakarta.persistence.Table;
//
//@Entity
//@Table(name="OrderDetails")
//public class Orderdetails {
//	
//	@Id
//	@GeneratedValue(strategy=GenerationType.IDENTITY)
//	@Column(name="ID")
//	private int id;
//	@Column(name="DateOfOrder")
//	private int dateOfOrder;
//	@Column(name="Name")
//	private String name;
//	@Column(name="Address")
//	private String address;
//	@Column(name="PhoneNumber")
//	private int phonenumber;
//	@Column(name="KG")
//	private int kg;
//	@Column(name="Price")
//	private int price;
//	@Column(name="Delivered")
//	private boolean delivered;
//	public int getDateOfOrder() {
//		return dateOfOrder;
//	}
//	public void setDateOfOrder(int dateOfOrder) {
//		this.dateOfOrder = dateOfOrder;
//	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public String getAddress() {
//		return address;
//	}
//	public void setAddress(String address) {
//		this.address = address;
//	}
//	public int getPhonenumber() {
//		return phonenumber;
//	}
//	public void setPhonenumber(int phonenumber) {
//		this.phonenumber = phonenumber;
//	}
//	public int getKg() {
//		return kg;
//	}
//	public void setKg(int kg) {
//		this.kg = kg;
//	}
//	public int getPrice() {
//		return price;
//	}
//	public void setPrice(int price) {
//		this.price = price;
//	}
//	public boolean isDelivered() {
//		return delivered;
//	}
//	public void setDelivered(boolean delivered) {
//		this.delivered = delivered;
//	}
//	public Orderdetails(int dateOfOrder, String name, String address, int phonenumber, int kg, int price,
//			boolean delivered) {
//		super();
//		this.dateOfOrder = dateOfOrder;
//		this.name = name;
//		this.address = address;
//		this.phonenumber = phonenumber;
//		this.kg = kg;
//		this.price = price;
//		this.delivered = delivered;
//	}
//	public Orderdetails() {
//		
//	}
//	
//	
//
//}
