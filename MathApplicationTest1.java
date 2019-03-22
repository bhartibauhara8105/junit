package com.niit.mockito;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
@RunWith(MockitoJUnitRunner.class)
public class MathApplicationTest1 {


	@InjectMocks
	MathApplication mathApplication =new MathApplication();
	
	
	@Mock
	CalculatorService calcservice;
	
	@Test
   public void testAdd() {
		when(calcservice.add(10.0,20.0)).thenReturn(30.00);
		
		Assert.assertEquals(mathApplication.add(10.0,20.0),30.0,0);
		
		verify(calcservice).add(10.0,20.0);
	}


}
