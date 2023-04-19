package rahulshettyproject;

import java.io.FileInputStream;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Log4jDemo 
{
	public static String projectPath=System.getProperty("user.dir");

	public static void main(String[] args)
	{
		
		//Object file = FileInputStream(projectPath +"/src/main/resources/Log4j.properties");
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
	   final Logger log = Logger.getLogger("Log4jDemo");
	    
	    driver.get("https://www.facebook.com/");
	    log.info("Opening the browser");

	}

	



}
