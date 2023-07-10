package stepDefinations;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;



import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import utils.TestContextSetup;

public class Hooks {
	TestContextSetup testContext;
	
	public Hooks(TestContextSetup testContext) {
		this.testContext=testContext;
	}
	
	@After
	public void afterScenario() throws IOException {
		testContext.baseclass.driverManger().quit();
		
		//driver.quit();
	}
	
	@AfterStep
	public void addScreenshot(Scenario scenario)throws IOException {
		
		WebDriver driver=null;
		try {
			driver = testContext.baseclass.driverManger();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(scenario.isFailed()) {
			//Screenshots
			
			File sourcePath = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			byte[] fileContent = null;
			try {
				fileContent = FileUtils.readFileToByteArray(sourcePath);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			scenario.attach(fileContent, "image/png", "image");
			
		}
		
		
	}

}
