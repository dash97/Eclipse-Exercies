package com.amdocs;

public interface IObservable {
	
	public void addSubscriber (IObserver observer);
	public void removeSubsciber (IObserver observer);
	public void notifyAllSubscribers(String message);
	 
}
