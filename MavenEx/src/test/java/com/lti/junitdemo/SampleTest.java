package com.lti.junitdemo;

import java.util.ArrayList;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



public class SampleTest {

//	@Test
//	void test() {
//		fail("Not yet implemented");
//	}
	 /*@Test
	 void testAssumeFalseEnvProp() {
	      System.setProperty("env", "prod");
	      Assumptions.assumeFalse("dev".equals(System.getProperty("env")));
	      System.out.println("further code will execute only if above assumption hold");
	 }

	 @Test
	 void testAssumingThat() {
	      System.setProperty("env", "test");
	      Assumptions.assumingThat("test".equals(System.getProperty("env")),
	           () -> {
	        	   Assertions.assertEquals(10, 10);
	                System.out.println("perform below assertions only on the test env");
	                });

	      Assertions.assertEquals(20, 20);
	      System.out.println("perform below assertions on all env");
	 }
	*/
	
	@Test
	 void testAssumeTrue() {
	      boolean b = "A" == "A";
	      Assumptions.assumeTrue(b);
	     // Assertions.assertEquals("Hello", "Hello");
	 }

	
	 @Test
	 void testAssumeFalse() {
	      boolean b = 'A' != 'A';
	      Assumptions.assumeFalse(b);
	      Assertions.assertEquals("Hello", "Hello");
	 }
	
	@Test
	void testShow() {
		MyApp m = new MyApp();
		String s = m.show();
		Assertions.assertEquals("Hello Maven!", s);
	}
	
	@Test
	void testAdd() {
		int result=Calculator.add(100, 200);
		Assertions.assertEquals(300, result);
		                        //expected, actual, optional message
		Assertions.assertEquals(100,Calculator.add(50,50),"Testing add method");
		Assertions.assertNotEquals(100, result);
	}
	
	@Test
	void testAssertFalse() {
		Assertions.assertFalse("Nisha".length()==10);
		Assertions.assertFalse(5>10,"Comaprison of values");
	}
	
	@Test
	void testAssertNull() {
		String s1=null;
		String s2="abc";
		Assertions.assertNull(s1);
		Assertions.assertNotNull(s2);

	}
	void testAssertAll() {
		String s11="abc";
		String s12="pqr";
		String s13="xyz";
		Assertions.assertAll("data",
				()->Assertions.assertEquals(s11, "abc"),
				()->Assertions.assertEquals(s12, "pqr"),
				()->Assertions.assertEquals(s13, "xyz"));	
	}
	
	@Test
	void testCollections()
	{
		ArrayList<String> myList=new ArrayList<>();
		myList.add("Hiii");
		Assertions.assertFalse(myList.isEmpty());
		
		ArrayList<Integer> myList1=new ArrayList<Integer>();
		Assertions.assertEquals(true,myList1.isEmpty());	
	}
	
	@BeforeAll
	static void setup() {
		System.out.println("only once in beg - @BeforeAll executed\n");
	}

	@BeforeEach
	void setupThis() {
		System.out.println("@BeforeEach executed");
	}

	@Test
	void testCalcOne() {
		System.out.println("======TEST ONE EXECUTED=======");
		Assertions.assertEquals(4, Calculator.add(2, 2));
	}

	// @Disabled
	@Test
	void testCalcTwo() {
		System.out.println("======TEST TWO EXECUTED=======");
		Assertions.assertEquals(6, Calculator.add(2, 4));
	}

	@AfterEach
	void tearThis() {
		System.out.println("@AfterEach executed");
	}

	@AfterAll
	static void tear() {
		System.out.println("\n once aat the end - clean up @AfterAll executed");
	}
	
	///////////////////////////////////////////////////////////
	@Test
	void testGetCompanyName() {
		
		Product p= new Product(101, "Pen", 10.0);
		
		Assertions.assertEquals("DMART", p.getCompanyName());
		
	}
	
}
