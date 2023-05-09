package Project;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

public class TC_001 extends BaseClass
{
	
	//How define test cases into annotation
	
	@BeforeMethod
	@Parameters("browser")
	public void startProcess(String str) throws IOException
	{
		 init();
		 test=reports.createTest("TC_001");
		 
		 test.log(Status.INFO, "Init the properties file");
		 
		 //log.info("Init the properties file");
		 launchBrowser(str);
		 test.log(Status.INFO, "Opening browser .."+childpro.getProperty("firefoxbrowser"));
		 //log.info("Opening browser .."+childpro.getProperty("firefoxbrowser"));
		 navigateUrl("amazonurl");
		 test.log(Status.INFO, "Opening URL .."+childpro.getProperty("amazonurl"));
		
	}
	
	@Test
	public void amazon()
	{
		selectOption("amazondropdown_id", "Books");
		test.log(Status.PASS, "Selecting dropdown option as Books .."+orpro.getProperty("amazondropdown_id"));
		//log.info("Selecting dropdown option as Books .."+orpro.getProperty("amazondropdown_id"));
		enterText("searchtext_id", "harry potter");
	    test.log(Status.FAIL, "Enter the text Harry Pottal by using locator ..."+orpro.getProperty("searchtext_id"));
		//log.info("Enter the text Harry Pottal by using locator ..."+orpro.getProperty("searchtext_id"));
		clickElement("searchbuttonclick_id");
		test.log(Status.PASS, "Click on search button by using locator..."+orpro.getProperty("searchbuttonclick_id"));
		
	}
	
	@AfterMethod
	public void endProcess()
	{
		reports.flush();
		
	}

}
