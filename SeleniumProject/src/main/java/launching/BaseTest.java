package launching;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.ProfilesIni;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest 
{
	 static public WebDriver driver;
	 static String property = System.getProperty("user.dir");
	 static  Properties p;
	 static  FileInputStream fil;
	 static  Properties p1;
	 static  Properties p2;
	 static  Properties p3;
	 public static ExtentReports rep;
	 public static ExtentTest test;
	 
	
	 public static void init() throws IOException
	 {
		 fil= new FileInputStream(property +"\\src\\main\\resources\\data.properties");
	     p = new Properties();
	     p.load(fil);
	     String value = p.getProperty("chromebrowser");
		 System.out.println(value);
		 
		 fil= new FileInputStream(property +"\\src\\main\\resources\\environment.properties");
		 p1 = new Properties();
		 p1.load(fil);
		 String v = p1.getProperty("env");
		 System.out.println(v);
		 
		 fil=new FileInputStream(property +"\\src\\main\\resources\\"+ v +".properties");
		 p2=new Properties();
		 p2.load(fil);
		 String val = p2.getProperty("amazonurl");
		 System.out.println(val);
		 
		 fil=new FileInputStream(property+"\\src\\main\\resources\\or.properties");
		 p3=new Properties();
		 p3.load(fil);
		 String val1 = p3.getProperty("amazonsearchbutton-id");
		 System.out.println(val1);
		 
		 fil=new FileInputStream(property+"\\src\\main\\resources\\lof4jconfig.properties");
		 PropertyConfigurator.configure(fil);
		 
		 
		 rep = ExtentReportDemo.getInstance();
		
		 
		 
	 }
	 
	 public static void initExtentTest(String testCaseName) {
		 test = rep.createTest(testCaseName);
	 }
	
	public static void launcher(String browser)
	 {
		 if(p.getProperty(browser).equals("chrome"))
		 {
			WebDriverManager.chromedriver().setup(); 
			//ChromeOptions option = new ChromeOptions();
			//option.addArguments("--user-data-dir = C:\\Users\\DELL\\AppData\\Local\\Google\\Chrome\\User Data\\Profile 3");
			//Handle notifications
			//option.addArguments("--disable-notifications");
			//Maximize Window
			//option.addArguments("--start-maximized");
			//Handle certificate error
			//option.addArguments("--ignore-certificate-errors-spki-list");
			//work with proxy server
			//option.addArguments("--proxy-server=https://129:168:10:1:9098");
			
			driver= new ChromeDriver();
			driver.manage().window().maximize();
			
		
		 }
		  else if(p.getProperty(browser).equals("firefox"))
		 {
			 WebDriverManager.firefoxdriver().setup(); 
			 ProfilesIni profile= new ProfilesIni();
			 FirefoxProfile pro = profile.getProfile("march2020");
			 
			 FirefoxOptions option= new FirefoxOptions();
			 option.setProfile(pro);
			 
			 //Handling browser Notification
				/*
				 * pro.setPreference("dom.webnotifications.enabled", false);
				 * 
				 * //Handling Certificate Error pro.setAcceptUntrustedCertificates(true);
				 * pro.setAssumeUntrustedCertificateIssuer(false);
				 */
			 
			 //How to work with proxy setting
			 pro.setPreference("network.proxy.type", 5);
			 pro.setPreference("network.proxy.socks", "199.168.10.1");
			 pro.setPreference("network.proxy.socks_port", 1744);
			 
			 
			 
			 driver= new FirefoxDriver(option);
		 }
	 }

	
	  public static void navigateUrl(String url)
	  {
		  driver.get(p.getProperty(url));
	  }
	  
		
	  
	   public static void searchButton(String locatorkey)
		{
			
			//driver.findElement(By.id(p3.getProperty(locatorkey))).click();
		  getElement(locatorkey).click();
		}


       public static void textBox(String locatorkey,String text) 
		{
			//driver.findElement(By.id(p3.getProperty(locatorkey))).sendKeys(text);
			getElement(locatorkey).sendKeys(text);
		}

		public static void selectOption(String locatorkey,String option)
		{
		
			//driver.findElement(By.id(p3.getProperty(locatorkey))).sendKeys(option);
			getElement(locatorkey).sendKeys(option);
		}
		
		public static WebElement getElement(String locatorkey) 
		{
			if(!isElementPresent(locatorkey))
				//If element is not present
				System.out.println("Element is not present :"+locatorkey );
				
			WebElement element=null;
			
			element=driver.findElement(getLocator(locatorkey));
		
			/*
			 * if(locatorkey.endsWith("-id")) {
			 * element=driver.findElement(By.id(p3.getProperty(locatorkey))); } else
			 * if(locatorkey.endsWith("-className")) {
			 * element=driver.findElement(By.className(p3.getProperty(locatorkey))); } else
			 * if(locatorkey.endsWith("-name")) {
			 * element=driver.findElement(By.name(p3.getProperty(locatorkey))); } else
			 * if(locatorkey.endsWith("-xpath")) {
			 * element=driver.findElement(By.xpath(p3.getProperty(locatorkey))); } else
			 * if(locatorkey.endsWith("-css")) {
			 * element=driver.findElement(By.cssSelector(p3.getProperty(locatorkey))); }
			 * else if(locatorkey.endsWith("-linkText")) {
			 * element=driver.findElement(By.linkText(p3.getProperty(locatorkey))); } else
			 * if(locatorkey.endsWith("-partialLinkText")) {
			 * element=driver.findElement(By.partialLinkText(p3.getProperty(locatorkey))); }
			 */			
			
			return element;
	  }

		public static boolean isElementPresent(String locatorkey) 
		{
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			
			try {
				
				wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(getLocator(locatorkey)));
				/*
				 * if(locatorkey.endsWith("-id")) {
				 * wait.until(ExpectedConditions.presenceOfElementLocated(By.id(p3.getProperty(
				 * locatorkey)))); } else if(locatorkey.endsWith("ClassName")) {
				 * wait.until(ExpectedConditions.presenceOfElementLocated(By.className(p3.
				 * getProperty(locatorkey)))); } else if(locatorkey.endsWith("name")) {
				 * wait.until(ExpectedConditions.presenceOfElementLocated(By.name(p3.getProperty
				 * (locatorkey)))); } else if(locatorkey.endsWith("xpath")) {
				 * wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(p3.
				 * getProperty(locatorkey)))); } else if(locatorkey.endsWith("cssSelecter")) {
				 * wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(p3.
				 * getProperty(locatorkey)))); } else if(locatorkey.endsWith("linkText")) {
				 * wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText(p3.
				 * getProperty(locatorkey)))); } else if(locatorkey.endsWith("partialLinkText"))
				 * {
				 * wait.until(ExpectedConditions.presenceOfElementLocated(By.partialLinkText(p3.
				 * getProperty(locatorkey)))); }
				*/
				} 
			catch (Exception e) 
			  {
				return false;
			  }
			
			   return true;
		}
		
		public static By getLocator(String locatorkey)
		{
			By by=null;
			
			if(locatorkey.endsWith("-id"))
			{
			  by=By.id(p3.getProperty(locatorkey));
			}
			else if(locatorkey.endsWith("-className"))
			{
			  by=By.className(p3.getProperty(locatorkey));
			}
			else if(locatorkey.endsWith("-name"))
			{
			  by=By.name(p3.getProperty(locatorkey));
			}
			else if(locatorkey.endsWith("-xpath"))
			{
			  by=By.xpath(p3.getProperty(locatorkey));
			}
			else if(locatorkey.endsWith("-cssSeleter"))
			{
			  by=By.cssSelector(p3.getProperty(locatorkey));
			}
			else if(locatorkey.endsWith("-linkText"))
			{
			  by=By.linkText(p3.getProperty(locatorkey));
			}
			else if(locatorkey.endsWith("-partialLinkText"))
			{
			  by=By.partialLinkText(p3.getProperty(locatorkey));
			}
			

			return by;
			
			
			
		}

		//************************************Verification ********************************
		
		
		public static boolean isActualResult(String expectResult)
		{
			String actaulRes = driver.findElement(By.linkText("Customer Service")).getText();
			if(actaulRes.equals(expectResult))
			{
				return true;
			}
			else 
			{
				return false;
			}
			
		}
		//************************************ Reporting***********************************
		
		public static void reportSuccess(String passMsz)
		{
		  if(test != null) {
			  
		  }
			
			System.out.println(passMsz);
			
			test.log(Status.PASS, passMsz);
		}

		public static void reportFail(String failMsz) 
		{
			//System.out.println(failMsz);
			
			test.log(Status.FAIL, failMsz);
		}
		
		
		

}
