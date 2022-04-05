package launching;

import java.io.IOException;

import org.apache.log4j.Logger;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class TC_006 extends BaseTest
{

	//private static final Logger log= Logger.getLogger(TC_006.class);
	
	
	public static void main(String[] args) throws IOException 
	{
		init();
		initExtentTest("TC_006");
		test.log(Status.INFO, "init the properties file :");
		//log.info("init the properties file :");
		
		launcher("chromebrowser");
		test.log(Status.INFO, "Launching the browser");
		//log.info("Launching the browser");
		
		navigateUrl("amazonurl");
		test.log(Status.INFO, "Navigate the URL");
		//log.info("Navigate the URL");
		
		selectOption("amazonselectoption-id","Books");
		test.log(Status.INFO, "Select books option from dropdown list");
		//log.info("Select books option from dropdown list");
		
		textBox("amazontextbox-id","Herry potter");
		test.log(Status.INFO, "Enter text harry potter in search field");
		//log.info("Enter text harry potter in search field");
		
		searchButton("amazonsearchbutton-id");
		test.log(Status.INFO, "Click on search button");
		
		//log.info("Click on search button");

	}
//
//	private static void initExtentTest() {
//		test = rep.createTest("TC_006");
//	}
//	
	

}