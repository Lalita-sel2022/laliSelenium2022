package testClasses;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNG_EnableTimeOut {
	@BeforeClass
	public void setup() {
		System.out.println("\n This run once before class ");
	}
	@AfterClass
	public void cleanup() {
		System.out.println("\n This run once after class ");
	}
	@Test(enabled = false)
	public void testMethod1() {
		System.out.println("\n Running test ->  testMethod1");
	}
	@Test(timeOut = 100)
	public void testMethod2() throws InterruptedException {
		System.out.println("\n Running test ->  testMethod2");
		Thread.sleep(1000);
	}
	
	
	
}
