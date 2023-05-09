
package Listeners_Demo;

import org.apache.log4j.Logger;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import org.testng.Reporter;



public class Retry implements IRetryAnalyzer
{

	private static final Logger l = Logger.getLogger(Retry.class.getName());
	private int retryCount=0;
	private int maxRetryCount=3;

	public boolean retry(ITestResult result) {
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
		
		if(retryCount<maxRetryCount) {
		log("Retry Test "+result.getName() +"with status "+getResultStatusName(result.getStatus())+"for the "+(retryCount+1)+"times");
		retryCount++;
		return true;
		}
		return false;
	}



	private String getResultStatusName(int status) 
	{
		String statusName= null;
		
		if(status==1)
			statusName ="SUCCESS";
		if(status==2)
			statusName ="FAILURE";
		if(status==3)
			statusName ="SKIP";
	
		return statusName;
	}
	private void log(String string) {
		
		l.info(string);
		Reporter.log(string);
		
	}

	

}
