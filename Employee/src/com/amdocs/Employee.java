package com.amdocs;

public class Employee {
	
	private String name;
	private String designation;
	private String department;
	
	private Address address; //Employee and Address class ha, 'has a' relationship

	public Employee(String name, String designation, String department, Address address) {
		super();
		this.name = name;
		this.designation = designation;
		this.department = department;
		this.address = address;
	}
	
	
	public String getDetails() {
		return "Employee [name=" + name + ", designation=" + designation + ", department=" + 
				department + ", doorNo=" + address.doorNo + ", street1=" + address.street1 + 
				", street2=" + address.street2 + ", street3=" + address.street3 + ", city=" + 
				address.city + ", pincode=" + address.pinCode + "]";
	}

	
}
