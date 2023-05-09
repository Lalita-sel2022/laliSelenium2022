package Listeners_Demo;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Project.BaseClass;
import io.github.bonigarcia.wdm.WebDriverManager;

@Listeners(Listeners_Demo.TestListener.class)

public class AmazonTest extends BaseClass {
	
	
	
	/*
	 * public WebDriver driver;
	 * 
	 * @Test public void openAmazon() {
	 * 
	 * WebDriverManager.firefoxdriver().setup(); driver = new FirefoxDriver();
	 * driver.manage().window().maximize(); driver.get("https://www.amazon.in/");
	 * 
	 * }
	 */
	 @Test
	 public void amazonUrl() throws IOException
	 {
		 init();
		 launchBrowser("firefox");
		 navigateUrl("amazonurl");
		 
	 }
	 
	
	 @Test
	 public void guru99Url() throws IOException
	 {
		 init();
		 launchBrowser("firefox");
		 navigateUrl("guruurl");
		 
	 }
	
	
}
