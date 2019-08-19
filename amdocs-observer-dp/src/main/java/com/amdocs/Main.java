package com.amdocs;

public class Main {

	public static void main(String[] args) {
		
		Paperwala paperWala = new Paperwala("Pune Paperwala Pvt Ltd..");
		paperWala.addSubscriber(new Subscriber("Ramesh"));
		paperWala.addSubscriber(new Subscriber("Rishi"));
		paperWala.addSubscriber(new Subscriber("Abhey"));
		
		paperWala.notifyAllSubscribers("Times of India");


	}

}
