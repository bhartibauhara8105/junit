package com.niit.mockito;

public class MathApplication {
	private CalculatorService calcservice;

	
	public void setCalculatorservice(CalculatorService calcservice) {
		this.calcservice = calcservice;
	}
	public double add(double input1,double input2)
	{
		return calcservice.add(input1, input2);
	}
	public double subtract(double input1,double input2)
	{
		return calcservice.subtract(input1, input2);
	}
	public double multiply(double input1,double input2)
	{
		return calcservice.multiply(input1, input2);
	}
	public double divide(double input1,double input2)
	{
		return calcservice.divide(input1, input2);
	}

}
