package Listeners_Demo;

import java.io.IOException;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import Project.BaseClass;

public class NavigateAmazon extends BaseClass
{
	
	@Test
	public void navigateURL() throws IOException
	{
		
		 init();
		 
		 
		 //test=reports.createTest("TC_001");
		 
		 //test.log(Status.INFO, "Init the properties file");
		 //log.info("Init the properties file");
		 launchBrowser("firefox");
		 //test.log(Status.INFO, "Opening browser .."+childpro.getProperty("firefoxbrowser"));
		 //log.info("Opening browser .."+childpro.getProperty("firefoxbrowser"));
		 navigateUrl("amazonurl");
		 //test.log(Status.INFO, "Opening URL .."+childpro.getProperty("amazonurl"));
		 selectOption("amazondropdown_id","Books");
		 
		 enterText("searchtext_id","Harry Potter");
		
		 
		 
		 
		 //System.out.println("Execute navigateURL method :"+Thread.currentThread().getId());
		
	}
	

}
