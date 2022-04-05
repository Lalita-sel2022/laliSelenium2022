package launching;

import java.io.IOException;

import com.aventstack.extentreports.AnalysisStrategy;
import com.aventstack.extentreports.ExtentReporter;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ReportAggregates;
import com.aventstack.extentreports.model.Author;
import com.aventstack.extentreports.model.Category;
import com.aventstack.extentreports.model.Device;
import com.aventstack.extentreports.model.Log;
import com.aventstack.extentreports.model.ScreenCapture;
import com.aventstack.extentreports.model.Screencast;
import com.aventstack.extentreports.model.Test;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportDemo extends BaseTest
{
	public static ExtentHtmlReporter htmlReport;
	public static ExtentReports report;
	
	public static ExtentReports getInstance()
	{
		
		htmlReport=new ExtentHtmlReporter(property+"\\htmlreport\\report.html");
		htmlReport.config().setDocumentTitle("Automation Report");
		htmlReport.config().setReportName("Functional Report");
		htmlReport.config().setTheme(Theme.STANDARD);
		
		report=new ExtentReports();
		report.attachReporter(htmlReport);
		report.setSystemInfo("OS", "window 10");
		report.setSystemInfo("Tester", "Lalitasaini");
		report.setSystemInfo("Browser", "Chrome");
		
			
	
		
		
		return report;
		
		
	}
	

}

