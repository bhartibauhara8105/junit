package com.niit.junit;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;



public class SuiteTest2 {

	@Test
	public void createAndSetName() {
	String actual="Y";
	String expected="Y";
	
	Assert.assertEquals(expected,actual);
	System.out.println("Suite Test 2 is successful "+actual);
	}

}
