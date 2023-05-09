package Listeners_Demo;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import org.testng.annotations.ITestAnnotation;


public class RetryListener implements IAnnotationTransformer
{

	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
		

		Class<? extends IRetryAnalyzer> r = annotation.getRetryAnalyzerClass();
		if(r==null)
		{
			annotation.setRetryAnalyzer(Retry.class);
		}
	
}


	

}
