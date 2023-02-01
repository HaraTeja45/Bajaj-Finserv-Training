package ToolsQA;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestAddition2 {
	
	
	
	@BeforeAll
	public static void m4() {
		System.out.println("****Before All****");
		System.out.println("From Method m4");
	}
	
	@BeforeClass
	public static void m1() {
		System.out.println("****Before Class****");
		System.out.println("From Method m1");
	}
	
	
	@Before
	public void m2() {
		System.out.println("****Before****");
		System.out.println("From Method m2");
	}
	
	@BeforeEach
	public void m3() {
		System.out.println("****Before Each****");
		System.out.println("From Method m3");
	}
	

	
	
	@Test
	@DisplayName("Addition Test Case 1")
	public void testCase1() {
		Addition2 add=new Addition2();
		
		assertEquals(24,add.addition(12, 12));
		System.out.println("From Method testCase1");
	}
	
	
	@Test
	@DisplayName("Addition Test Case 2")
	public void testCase2() {
		Addition2 add2=new Addition2();
		
		assertEquals(24,add2.addition(12, 12));
		System.out.println("From Method testCase2");
	}
	
	
	@Test
	@DisplayName("Addition Test Case 3")
	public void testCase3() {
		Addition2 add3=new Addition2();
		
		assertEquals(24,add3.addition(12, 12));
		System.out.println("From Method testCase3");
	}
	
	
	@After
	public void a1() {
		System.out.println("******After*****");
		System.out.println("From Method a1");
	}
	
	@AfterClass
	public static void a2() {
		System.out.println("******After Class *****");
		System.out.println("From Method a2");
	}
	
	
	@AfterEach
	public void a3() {
		System.out.println("******After Each *****");
		System.out.println("From Method a3");
	}
	
	@AfterAll
	public  static void a4() {
		System.out.println("******After All *****");
		System.out.println("From Method a4");
	}
	
	
	
	
}
