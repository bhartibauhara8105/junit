package com.niit.junit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.fail;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class AnnotationsExample 
{

	private ArrayList<String> list;
	
	@BeforeClass
	public static void m1()
	{
		System.out.println("Using @BeforeClass, executed before all test cases");
	}
	
	@Before 
	public void m2()
	{
		list=new ArrayList<String>();
		System.out.println("Using @Before annotations, executed before each test cases");
	}
	
	@AfterClass
	public static void m3()
	{
		//list=new ArrayList<String>();
		System.out.println("Using @BAfterClass annotations, executed before each test cases");
	}
	
	@After
	public void m4()
	{
		//list=new ArrayList<String>();
		list.clear();
		System.out.println("Using @BAfterClass annotations, executed before each test cases");
	}
	

	@Test
	public void m5()
	{
		//list=new ArrayList<String>();
		list.add("test");
		assertFalse(list.isEmpty());
		assertEquals(1,list.size());
		System.out.println("Using @BAfterClass annotations, executed before each test cases");
	}
	
	@Ignore
	public void m6()
	{
		//list=new ArrayList<String>();
		//list.clear();
		System.out.println("Using @Ignore this execution is ignored");
	}

	
	@Test(timeout=10)
	public void m7() 
	{
		System.out.println("Using @Test(timeout), it can used to enforce timeout "+" in Junit4 test case");
	}
	
//	@Test(expected=NoSuchMethodException.class)
//	public void m8() 
//	{
//		System.out.println("Using @Test(expected), it will check for "+" specified exception during its execution");
//	}			
}
