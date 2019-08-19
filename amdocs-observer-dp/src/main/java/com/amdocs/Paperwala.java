package com.amdocs;

import java.util.ArrayList;

public class Paperwala implements IObservable {
	
	private ArrayList<IObserver> subscribers;
	private String name;
	
	public Paperwala (String name) {
		
		this.name = name;
		subscribers = new ArrayList<IObserver>();

	}

	public void addSubscriber(IObserver observer) {
		
		subscribers.add(observer);
		
	}

	public void removeSubsciber(IObserver observer) {
		
		subscribers.remove(observer);

	}

	public void notifyAllSubscribers(String message) {
		
		for ( IObserver customer : subscribers )
				customer.update( message );
		
	}

}
