package com.amdocs;

import java.util.HashMap;

public class Contacts {

	private HashMap<String, String> contacts;

	public Contacts() {
		this.contacts = new HashMap<String, String>();
	}
	
	public void addContact (String name, String mobileNo) {
		contacts.put(mobileNo, name);
	}
	
	public String findContactNameByMobileNo(String mobileNo) {
		
		String name = contacts.get(mobileNo);
		
		if(name == null)
			return mobileNo;
		
		return name;
	}
	
	public static void main(String[] args) {
		
		Contacts contacts = new Contacts();
		contacts.addContact("Rishi", "12378921");
		contacts.addContact("Rish", "12328921");
		
		
		String name1 = contacts.findContactNameByMobileNo("12328921");
		System.out.println(name1);
		
		String name2 = contacts.findContactNameByMobileNo("123266666");
		System.out.println(name2);
		
	}
	
}
