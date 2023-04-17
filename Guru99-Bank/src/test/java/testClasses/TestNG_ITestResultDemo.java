package testClasses;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class TestNG_ITestResultDemo {
	@Test
	public void method1() {

		System.out.println("Running -> Method1");
		Assert.assertTrue(false);

	}

	@Test
	public void Method2() throws InterruptedException {
		System.out.println("Running -> Method2");
		Assert.assertTrue(true);
	}

	@AfterMethod
	public void afterMethod(ITestResult testResult) {
		if (testResult.getStatus() == ITestResult.FAILURE) {
			System.out.println("Failed :: " + testResult.getMethod().getMethodName());
		}

		if (testResult.getStatus() == ITestResult.SUCCESS) {
			System.out.println("Sucessful ::" + testResult.getName());
		}
	}

}
