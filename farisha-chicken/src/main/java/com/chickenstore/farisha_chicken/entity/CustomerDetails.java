package com.chickenstore.farisha_chicken.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="customerdetails")
public class CustomerDetails {
    
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="email")
	private String email;
	
	@Column(name="address")
	private String address;
	
	@Column(name="phonenumber")
	private int phno;
	
	

	public CustomerDetails(String name, String email, int phno, String address) {
		super();
		this.name = name;
		this.email = email;
		this.phno = phno;
		this.address=address;
	}

	public CustomerDetails() {
		
		// TODO Auto-generated constructor stub
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address=address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getPhno() {
		return phno;
	}

	public void setPhno(int phno) {
		this.phno = phno;
	}
	
	
	
	
	
}
