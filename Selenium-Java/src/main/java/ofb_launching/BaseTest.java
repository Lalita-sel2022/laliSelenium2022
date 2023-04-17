package ofb_launching;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.util.Collection;
import java.util.Collections;
import java.util.Properties;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.ProfilesIni;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.google.j2objc.annotations.Property;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest
{
	public static WebDriver driver;
	
	public static String projectPath=System.getProperty("user.dir");
	public static Properties p;
	
	public static void dataFile() throws IOException
	{
		FileInputStream input= new FileInputStream(projectPath+"/src/main/resources/data.properties");
	    p= new Properties();
	    p.load(input);
	    
	   //String value= p.getProperty("chromebrowser");
	   //System.out.println(value);
	   //System.out.println(p.getProperty("rahulshetty"));
			
		
	}
	
	public static  void launchBrowser(String browser)
    {
		
		if(p.getProperty(browser).equals("chrome"))
		{
		
			//ChromeOptions option= new ChromeOptions();
			//option.addArguments("user-data-dir=C:\\Users\\DELL\\AppData\\Local\\Google\\Chrome\\User Data\\Profile 10");
		
			//Disable infobar--> 
			//option.setExperimentalOption("UseAutomationExtension", false);
			//option.setExperimentalOption("excludeSwitches",Collections.singletonList("enable-automation"));
			//Handling browser notification
			//option.addArguments("--disable-notifications");
			//Handling SSl certification
			//option.addArguments("--ignore-certificate-errors-spki-list");
			//option.setAcceptInsecureCerts(true);
			//Set user define profile
			//option.addArguments("--start-maximized");
			//option.addArguments("--proxy-server=https://192.168.10.1:9090");
			
			
			
		
		
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();		
		}
		else if(p.getProperty(browser).equals("firefox"))
		{
		    WebDriverManager.firefoxdriver().setup();
		    //Set user define profile
		    ProfilesIni p= new ProfilesIni();
		    FirefoxProfile profile = p.getProfile("SelPractice");
		    FirefoxOptions option= new FirefoxOptions();
		    //option.setProfile(profile);
		   
		    //handle ssl cetificate
		    //option.setAcceptInsecureCerts(false);
		    
		    //Handling browser notifications
		    //option.addArguments("--disable-notifications");
		    
		    //How to work with proxy setting
		    profile.setPreference("network.proxy.type", 1);
		    profile.setPreference("network.proxy.socks", "199.168.10.1");
		    profile.setPreference("network.proxy.socks_port", 1744);
		   
	        driver = new FirefoxDriver(option);
	        driver.manage().window().maximize();
		}
      }
		
	public static void getUrl(String url)
    {
			driver.get(p.getProperty(url));
    }
		
	

	
}
