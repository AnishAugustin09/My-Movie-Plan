package com.movieplan.Entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Customer {

	@Id
	private String customerEmail;
	@Column 
	private String customerName;
	@Column
	private String customerNumber;
	@Column
	private String password;
	@OneToOne(cascade=CascadeType.ALL)
	private Address address;
	
	
	
	public Customer(String customerEmail, String customerName, String customerNumber, String password,
			Address address) {
		super();
		this.customerEmail = customerEmail;
		this.customerName = customerName;
		this.customerNumber = customerNumber;
		this.password = password;
		this.address = address;
	}
	public Customer() {
		super();
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerNumber() {
		return customerNumber;
	}
	public void setCustomerNumber(String customerNumber) {
		this.customerNumber = customerNumber;
	}
	public String getCustomerEmail() {
		return customerEmail;
	}
	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}
	public Address getaddress() {
		return address;
	}
	public void setaddress(Address address) {
		this.address = address;
	}
	
	
	
}
