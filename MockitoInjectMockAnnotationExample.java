package com.niit.mockito;

import static org.junit.Assert.*;

import java.util.List;
import static org.mockito.Mockito.when;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class MockitoInjectMockAnnotationExample {
	
	@Mock
	List<String> mockList;

	@InjectMocks
	Fruits mockFruits;
	
	@Before
	public void setup()
	{
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void test() {
		when(mockList.get(0)).thenReturn("Apple");
		when(mockList.size()).thenReturn(1);
		assertEquals("Apple",mockList.get(0));
		assertEquals(1,mockList.size());
		
		
		assertEquals("Apple",mockFruits.getNames().get(0));
		assertEquals(1,mockFruits.getNames().size());
		
		
		mockList.add(1,"Mango");
		
		System.out.println(mockList.get(0));
	}

}
