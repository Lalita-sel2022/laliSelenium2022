package keywords;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;

public class CustomeListiners2 implements ITestListener {
	public void onTestStart(ITestResult result) {
		// When test method starts
		System.out.println("OnTestStarts -> test name :: " + result.getName());
	}

	public void onTestSuccess(ITestResult result) {
		// When test method success
		System.out.println("OnTestSuccess -> test name :: " + result.getName());
	}

	public void onTestFailure(ITestResult result) {
		// When test method fail
		System.out.println("OnTestFail -> test name :: " + result.getName());
	}

	public void onTestSkipped(ITestResult result) {
		// When test method skipped
		System.out.println("OnTestSkipped -> test name :: " + result.getName());
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// Ignore this

	}

	public void onTestFailedWithTimeout(ITestResult result) {
		// When test method fail within given timeout
		System.out.println("OnTestFailedWithTimeout -> test name :: " + result.getName());
	}

	public void onStart(ITestContext context) {
		// It will execute before the <test> tag in xml file
		System.out.println("OnStart -> test name :: " + context.getName());
		//Print all the classes and all the method present in <test>
		ITestNGMethod methods[]= context.getAllTestMethods();
		System.out.println("These methods will be execute in this testng");
		for(ITestNGMethod method:methods)
		{
			System.out.println(method.getMethodName());
		}
		
	}

	public void onFinish(ITestContext context) {
		// It will execute after the <test> tag in xml file
		System.out.println("OnFinished -> test name :: " + context.getName());
	}

}
