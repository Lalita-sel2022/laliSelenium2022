package testClasses;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG_ReprortsAndLogs {
	@BeforeClass
	public void beforeClass() {
		//System.out.println("TestNG_ReprortsAndLogs -> This method will run before the class");
		//Want to print the log on the console window if yes give true 
		Reporter.log("TestNG_ReprortsAndLogs -> This method will run before the class", true);

	}

	@AfterClass
	public void afterClass() {
		//System.out.println("TestNG_ReprortsAndLogs -> This method will run after the class");
		Reporter.log("TestNG_ReprortsAndLogs -> This method will run after the class", true);

	}

	@BeforeMethod
	public void beforeMethod() {
		//System.out.println("TestNG_ReprortsAndLogs -> This method will run before every method");
		Reporter.log("TestNG_ReprortsAndLogs -> This method will run before every method", true);

	}

	@AfterMethod
	public void afterMethod() {
		//System.out.println("TestNG_ReprortsAndLogs -> This method will run after every method");
		Reporter.log("TestNG_ReprortsAndLogs -> This method will run after every method", true);

	}

	@Test
	public void testMethod1() {
		//System.out.println("TestNG_ReprortsAndLogs -> testMethod1");
		Reporter.log("TestNG_ReprortsAndLogs -> testMethod1", true);
	}

	@Test
	public void testMethod2() {
		//System.out.println("TestNG_ReprortsAndLogs -> testMethod2");
		Reporter.log("TestNG_ReprortsAndLogs -> testMethod2", true);
		Assert.assertTrue(false);
	}

	@Test(dependsOnMethods = {"testMethod2"})
	public void testMethod3() {
		//System.out.println("TestNG_ReprortsAndLogs -> testMethod3");
		Reporter.log("TestNG_ReprortsAndLogs -> testMethod3", true);
	}
}
