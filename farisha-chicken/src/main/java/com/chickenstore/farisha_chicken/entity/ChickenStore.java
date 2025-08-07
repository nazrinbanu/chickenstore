package com.chickenstore.farisha_chicken.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="chickenstore")
public class ChickenStore {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	@Column(name="name")
	private String name;
	@Column(name="kg")
	private int kg;
	@Column(name="rs")
	private int rs;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="customer_id")
	private CustomerDetails customerdetails;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKg() {
		return kg;
	}
	public void setKg(int kg) {
		this.kg = kg;
	}
	public int getRs() {
		return rs;
	}
	public void setRs(int rs) {
		this.rs = rs;
	}
	public CustomerDetails getCustomerDetails() {
		return customerdetails;
	}
	public void setCustomerDetails(CustomerDetails customerdetails) {
		this.customerdetails = customerdetails;
	}
	public ChickenStore() {
		
		// TODO Auto-generated constructor stub
	}
	public ChickenStore( String name, int kg, int rs, CustomerDetails customerdetails) {

		this.name = name;
		this.kg = kg;
		this.rs = rs;
		this.customerdetails=customerdetails;
	}
	
	

}
