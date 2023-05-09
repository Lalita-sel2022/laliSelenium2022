package Project;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentManger extends BaseClass
{

	public static ExtentSparkReporter sparkReport;
	public static ExtentReports report;
	
	public static ExtentReports getInstance()
	{
	if(sparkReport==null)
	{
		 sparkReport = new ExtentSparkReporter(projectPath+"\\SparkReport\\report.html");
		//In html report set some configuration like title, name etc
		 sparkReport.config().setTheme(Theme.STANDARD);
		 sparkReport.config().setReportName("Functional Report");
		 sparkReport.config().setDocumentTitle("Automation Report");
		 
		 report = new ExtentReports();
		 report.attachReporter(sparkReport);
		 
		 report.setSystemInfo("OS", "Window 10");
		 report.setSystemInfo("TesterName", "Lalita Saini");
		 report.setSystemInfo("Browser", "Firefox");
		 }
	return report;
	}
}
