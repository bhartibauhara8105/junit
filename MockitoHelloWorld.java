package com.niit.mockito;

import static org.junit.jupiter.api.Assertions.*;
import static com.niit.mockito.Demo.*;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class MockitoHelloWorld {

	@Test
	void demoGreets() {
		Demo d=mock(Demo.class);//create mock demo object
		when(d.greet()).thenReturn(Hello_World);//Add Behaviour
		System.out.println("Demo Greets :"+d.greet());
		assertEquals(d.greet(),Hello_World);
	}

}
