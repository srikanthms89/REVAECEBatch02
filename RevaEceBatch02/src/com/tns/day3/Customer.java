package com.tns.day3;

public class Customer {
	
	
	//data members
	private String customerName;
	private String customerCity;
	private String customerId;
	

	//Default constructor 
	public Customer() {

      System.out.println("Default constructor");
	}

	//parameterized constructor
	public Customer(String customerName, String customerCity, String customerId) {
		System.out.println("Parametrized constructor");
		this.customerName = customerName;
		this.customerCity = customerCity;
		this.customerId = customerId;
	}
	//getters and setters
	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerCity() {
		return customerCity;
	}

	public void setCustomerCity(String customerCity) {
		this.customerCity = customerCity;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	@Override
	public String toString() {
		return "Customer [customerName=" + customerName + ", customerCity=" + customerCity + ", customerId="
				+ customerId + "]";
	}
	
	
	
	
	
	
	
	
	

}
