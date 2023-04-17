package testClasses;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import keywords.CustomeListiners2;
@Listeners(CustomeListiners2.class)
public class TestNG_ListinersTest2 {
	@BeforeClass
	public void beforeClass() {
		System.out.println("Run before the class");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("Run after the class");
	}

	@Test
	public void tsetMethod1() {
		System.out.println("TestMethod1");
	}

	@Test
	public void tsetMethod2() {
		System.out.println("TestMethod2");
	}
}
