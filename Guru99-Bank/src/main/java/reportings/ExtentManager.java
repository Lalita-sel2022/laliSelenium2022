package reportings;

import java.io.IOException;

//import java.io.File;
//import java.util.Date;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
//import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentManager extends BaseClass
{
	public static ExtentReports extentReports;
	public static ExtentHtmlReporter htmlReport;
	
	
	public static ExtentReports getReport()
	{
		if(htmlReport==null)
		{
			htmlReport = new ExtentHtmlReporter(projectPath+"\\ExtentReport\\extentReport.html");  //E:\abc
			//htmlReport = new ExtentHtmlReporter("E://abc//extentReport.html");
			System.out.println("htmlReport :: "+htmlReport);
			System.out.println(projectPath);
			System.out.println(projectPath+"\\ExtentReport\\extentReport.html");
			/*
			 * //System.out.println(htmlReport.getFileFile().getAbsolutePath());
			 * //System.out.println(htmlReport.getFileFile().exists()); try {
			 * System.out.println(htmlReport.getFileFile().getCanonicalPath()); } catch
			 * (IOException e) { // TODO Auto-generated catch block e.printStackTrace(); }
			 * //System.out.println(htmlReport.); //System.out.println(htmlReport);
			 */			
			htmlReport.config().setDocumentTitle("Automation Test");
			htmlReport.config().setReportName("Ravilella");
			htmlReport.config().setTheme(Theme.STANDARD);
			
			extentReports = new ExtentReports();
			extentReports.attachReporter(htmlReport);
			
			extentReports.setSystemInfo("OS", "Window 10");
			extentReports.setSystemInfo("TesterName", "Lalita");
			extentReports.setSystemInfo("Browser", "Chrome");
			
			
		}
		return extentReports;
	}
	
	
}