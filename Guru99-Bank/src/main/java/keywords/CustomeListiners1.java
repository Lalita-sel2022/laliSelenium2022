package keywords;

import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestResult;

public class CustomeListiners1 implements IInvokedMethodListener {
	public void beforeInvocation(IInvokedMethod method, ITestResult testResult) {
		System.out.println("beforeInvocation ::"+testResult.getTestClass().getName()+" -> "+method.getTestMethod().getMethodName());
	
	}

	public void afterInvocation(IInvokedMethod method, ITestResult testResult) {
		System.out.println("afterInvocation ::"+testResult.getTestClass().getName()+" -> "+method.getTestMethod().getMethodName());
		
	}

}
