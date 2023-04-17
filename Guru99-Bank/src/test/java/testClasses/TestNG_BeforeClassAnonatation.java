package testClasses;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class TestNG_BeforeClassAnonatation {
	@BeforeClass
	public void setup() {
		System.out.println("\n This run once before class ");
	}
	@AfterClass
	public void cleanup() {
		System.out.println("\n This run once after class ");
	}
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("\n This run before every method ");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("\n This run after every method ");
	}

	@Test
	public void testMethod1() {
		System.out.println("\n Running test -> testMethod1");
	}
	@Test
	public void testMethod2() {
		System.out.println("\n Running test -> testMethod2");
	}


}
