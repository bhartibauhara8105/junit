package com.niit.mockito;



import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static com.niit.mockito.Demo.*;

public class MockitoHelloWorld1 {

	private Demo d;
	@Before
	public void setupMock()
	{
		d=mock(Demo.class);
		when(d.greet()).thenReturn(Hello_World);
		
		
	}
	@Test
   public void fooGreets() {
		System.out.println("Foo greets : "+d.greet());
		assertEquals("Hello_World",d.greet());
	}
   @Test
    public void barGreets()
    {
	   Bar bar=new Bar();
		assertEquals("Hello_World",bar.greet(d));
    }

}
