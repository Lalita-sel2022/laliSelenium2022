package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	WebDriver driver;
	
	
	public WebDriver driverManger() throws IOException {

		FileInputStream file= new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\Globel.properties");
		Properties pro= new Properties();
		pro.load(file);
		if(driver==null) {
			if(pro.getProperty("chromebrowser").equals("chrome"))
			{
				WebDriverManager.chromedriver().setup();
				driver= new ChromeDriver();
			}else if(pro.getProperty("firefoxbrowser").equals("firefox")) {
				WebDriverManager.firefoxdriver().setup();
				driver= new FirefoxDriver();
			}
		
		driver.get(pro.getProperty("qaurl"));
		}
		 return driver;
	}

}
