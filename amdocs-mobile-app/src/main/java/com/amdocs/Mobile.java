package com.amdocs;

public class Mobile {
	
	private Camera camera;
	
	public Mobile() {
		camera = new Camera();
	}
	
	//dependency injection
	public Mobile(Camera camera) {
		this.camera = camera;
	}

	public boolean startPhotoApp() {
		
		System.out.println("Inside start Photo App");
		
		if (camera.on()) {
			System.out.println("Positive code path");
			System.out.println("Assume some hardware interaction happens");
			return true;
		}
		
		System.out.println("Negative code path");
		System.out.println("Assume some exception handling and error log happens here");
		
		return false;
	}

}
