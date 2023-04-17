package login;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import keywords.ApplicationKeywords;
import reportings.ExtentManager;

public class BaseTest 
{
	public ApplicationKeywords app;
	public static ExtentReports reports;
	public static ExtentTest test;
	
	@BeforeTest
	public void beforeTest(ITestContext context) throws IOException
	{
		System.out.println("Before Test");
		app = new ApplicationKeywords();
		context.setAttribute("app", app);
		
		
		reports = ExtentManager.getReport();
		test = reports.createTest(context.getCurrentXmlTest().getName());
		app.setReport(test);
		
		
		  context.setAttribute("reports", reports);
		  context.setAttribute("test", test);
		
	}
	
	@BeforeMethod
	public void beforeMethod(ITestContext context)
	{
		System.out.println("Before Method");
	
		app = (ApplicationKeywords)context.getAttribute("app");
		reports = (ExtentReports)context.getAttribute("reports");
		test = (ExtentTest)context.getAttribute("test");
	}

	@BeforeMethod
	public void quit()
	{
		if(reports!=null)
		{
			reports.flush();
		}
	}
}
