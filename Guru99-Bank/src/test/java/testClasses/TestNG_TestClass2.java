package testClasses;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class TestNG_TestClass2 {
	@BeforeClass
	public void setup() {
		System.out.println("\nTestNG_TestClass2 This run once before class ");
	}
	@AfterClass
	public void cleanup() {
		System.out.println("\nTestNG_TestClass2 This run once after class ");
	}
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("\nTestNG_TestClass2 This run before every method ");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("\nTestNG_TestClass2 This run after every method ");
	}

	@Test
	public void testMethod1() {
		System.out.println("\n Running test -> TestNG_TestClass2 testMethod1");
	}
	@Test
	public void testMethod2() {
		System.out.println("\n Running test -> TestNG_TestClass2 testMethod2");
	}

}
