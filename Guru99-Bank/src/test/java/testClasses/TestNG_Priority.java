package testClasses;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNG_Priority {
	@BeforeClass
	public void setup() {
		System.out.println("\n This run once before class ");
	}

	@AfterClass
	public void cleanup() {
		System.out.println("\n This run once after class ");
	}

	@Test(priority =2)
	public void method1() {
		System.out.println("\nMethod1");
	}

	@Test(priority =1)
	public void method2() {
		System.out.println("\nMethod2");
	}

	@Test(priority = 0)
	public void method3() {
		System.out.println("\nMethod3");
	}
}
