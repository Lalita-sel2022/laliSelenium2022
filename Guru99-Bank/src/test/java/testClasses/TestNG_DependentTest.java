package testClasses;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNG_DependentTest {
	@BeforeClass
	public void setup() {
		System.out.println("\nTestNG_TestClass2 This run once before class ");
	}
	@AfterClass
	public void cleanup() {
		System.out.println("\nTestNG_TestClass2 This run once after class ");
	}
	@Test(dependsOnMethods = {"testMethod2"})
	public void testMethod1() {
		System.out.println("\n Running test ->  testMethod1");
	}
	@Test
	public void testMethod2() {
		System.out.println("\n Running test ->  testMethod2");
	}
	@Test(dependsOnMethods = {"testMethod1"})
	public void testMethod3() {
		System.out.println("\n Running test ->  testMethod3");
	}
	@Test
	public void testMethod4() {
		System.out.println("\n Running test ->  testMethod4");
	}
}
