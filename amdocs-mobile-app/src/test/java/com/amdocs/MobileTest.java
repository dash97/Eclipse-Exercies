package com.amdocs;

import static org.junit.Assert.*;
import org.junit.Test;
import org.mockito.Mockito;

public class MobileTest {

	@Test
	//because this is a test case, longer name format is recommended, otherwise it's a code smell
	public void testStartPhotoAppWhenCameraOnFunctionsNormally() {
		
		//Mocking, i.e. creating a dummy camera object with no original code
		Camera mockedCamera = Mockito.mock( Camera.class);
		
		//Stubbing, i.e. hardcoding the response of the dependent method
		Mockito.when( mockedCamera.on()).thenReturn(true);
		
		//Dependency injection
		Mobile mobile = new Mobile(mockedCamera);
		
		boolean actualResponse = mobile.startPhotoApp();
		boolean expectedResponse = true;
		
		assertEquals(expectedResponse, actualResponse);
		
		//Verify the camera.on() method invoking within the smartPhotoApp
		Mockito.verify(mockedCamera, Mockito.times(1)).on();
		
	}

}
