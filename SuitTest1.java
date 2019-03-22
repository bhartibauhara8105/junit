package com.niit.junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class SuitTest1 {


	public String msg="Varun";
	JUnitMessage jms=new JUnitMessage(msg);
	
	@Test//(expected=ArithmeticException.class)
		public void testJUnitMessage() {
			System.out.println("Junit Message is printing");
			jms.printMessage();
		}
	
	
	@Test
	public void testJUnitHiMessage()
	{
		msg="Hi "+msg;
		System.out.println("Junit Hi Message is printing");
		assertEquals(msg,jms.printHiMessage());
		System.out.println("Suite Test 1 is successful"+msg);
	}
	


}
