package com.niit.junit;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class AssertTestRunner {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Result result=JUnitCore.runClasses(AssertionTest.class);
for(Failure failure: result.getFailures())
{
	System.out.println(failure.toString());
}
System.out.println("result=="+result.wasSuccessful());
	}
}