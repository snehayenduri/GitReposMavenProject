package com.lti.junitdemo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ExceptionTest {

//	@Test
//	void test() {
//		fail("Not yet implemented");
//	}
	
	@Test
	public void testExceptions() {		
		
	    Exception exception = Assertions.assertThrows(NumberFormatException.class, () -> {
	        Integer.parseInt("100assff");
	        });

	    String expectedMessage = "For input string";
	    String actualMessage = exception.getMessage();
	    Assertions.assertTrue(actualMessage.contains(expectedMessage));
	   // Assertions.assertEquals(expectedMessage,actualMessage);
	    
	}	

}
