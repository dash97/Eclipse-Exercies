package com.amdocs;

public class Address {
	
	public String doorNo;
	public String street1, street2, street3;
	public String city;
	public String pinCode;
	
	public Address(String doorNo, String street1, String street2, String street3, String city,
					String pinCode) {
		this.doorNo = doorNo;
		this.street1 = street1;
		this.street2 = street2;
		this.street3 = street3;
		this.city = city;
		this.pinCode = pinCode;
	}
	
	
	public String getAddress() {
		return "Address [doorNo=" + doorNo + ", street1=" + street1 + ", street2=" + street2 + " street3=" + street3 + ",city=" + city + ","
				+ "pinCode=" + pinCode + "]";
	}
	

	
	
}