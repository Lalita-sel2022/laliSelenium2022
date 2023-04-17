package switching;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.Status;

import reportings.BaseClass;

public class FrameSwitching extends BaseClass {
	// private static final Logger log= Logger.getLogger(FrameSwitching.class);

	public static void main(String[] args) {

		System.out.println("before method");
		System.out.println("get report ..." + reports);

		try {
			init();
		} catch (IOException e) {
			
		test.log(Status.ERROR, "Init() failed the properties file............");
		}
		test = reports.createTest("FrameSwitching");
		test.log(Status.INFO, "Init the properties file............");
		// log.info("Init the properties file............");

		launchBrowser("chromebrowser");
		test.log(Status.INFO, "Open browser.." + childPro.getProperty("chromebrowser"));
		// log.info("Open browser.."+childPro.getProperty("chromebrowser"));

		navigate("letskodeitpractice");
		test.log(Status.INFO, "Navigate url.." + childPro.getProperty("letskodeitpractice"));
		// log.info("Navigate url.."+childPro.getProperty("letskodeitpractice"));

		// log.error("Enter the text.."+orPro.getProperty("search_xpath"));

		try {

			getElement("search_xpath").sendKeys("Lalita");
		} catch (Exception exception) {

			test.log(Status.FAIL, "Enter the text.." + orPro.getProperty("search_xpath"));
		}
		getElement("bmwcheck_id").click();
		test.log(Status.PASS, "BMW check select.." + orPro.getProperty("bmwcheck_id"));

		reports.flush();

		/*
		 * driver.switchTo().frame("courses-iframe");
		 * getElement("search_xpath").sendKeys("python"); Thread.sleep(2000);
		 * getElement("searchbutton_class","classname").click();
		 * 
		 * driver.switchTo().defaultContent();
		 * 
		 * getElement("name_id","id").sendKeys("Hello"); Thread.sleep(2000); //Click on
		 * alert button //getElement("alert_id","id").click(); //Click on confirm button
		 * getElement("confirm_id","id").click(); Thread.sleep(2000); Alert alert =
		 * driver.switchTo().alert(); //alert.accept(); alert.dismiss();
		 * Thread.sleep(3000);
		 */

	}

}
