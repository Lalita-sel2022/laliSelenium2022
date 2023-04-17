package keywords;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.Markup;

import org.testng.asserts.SoftAssert;
import io.github.bonigarcia.wdm.WebDriverManager;
import reportings.ExtentManager;


public class GenericKeywords
{
	public WebDriver driver;
	public Properties mainPro;
	public Properties childPro;
	public Properties orPro;
	public ExtentTest test;
	public FileInputStream file;
	String projectPath =System.getProperty("user.dir");
	public SoftAssert softAssert;
	
	
	
	public void openBrowser(String browser)
	{
		//test.log(Status.INFO, "Open Browser....."+childPro.getProperty(browser));
		log("Open Browser....."+childPro.getProperty(browser));
		if(childPro.getProperty(browser).equals("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}
		else if(childPro.getProperty(browser).equals("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
		}
	}
	
	public void navigateUrl(String url)
	{//
		//test.log(Status.INFO, "Navigate guru99 bank url....."+childPro.getProperty(url));
		log("Navigate guru99 bank url....."+childPro.getProperty(url));
		driver.get(childPro.getProperty(url));
	}
	
	  public WebElement getElement(String locatorKey)
	  {
		  WebElement element=null;
	   // check for presence of Element 
		 if(!isElementPresent(locatorKey)) 
		  //report the failure 
		  System.out.println("Element is not present :" +locatorKey);
	     element = driver.findElement(getLocator(locatorKey)); 
	      return element; 
	  }
	  
	  public boolean isElementPresent(String locatorKey) 
	  {
	   test.log(Status.INFO,"Checking the Element Presence :"+ locatorKey);
		 
	  System.out.println("Checking the Element Presence :" + locatorKey);
	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	  
	  try
	  {
	  wait.until(ExpectedConditions.presenceOfElementLocated(getLocator(locatorKey))); 
	  } 
	  catch (Exception e)
	  {
		  return false; 
	  }
	  return true; 
	  }
	  
	  public By getLocator(String locatorKey) 
	  {
		  By by=null;
	  
	  if(locatorKey.endsWith("_id")) 
	  { 
	  by = By.id(orPro.getProperty(locatorKey));
	  }
	  else if(locatorKey.endsWith("_name"))
	  { 
		  by = By.name(orPro.getProperty(locatorKey)); 
	  }
	  else if(locatorKey.endsWith("_classname")) 
	  {
		  by = By.className(orPro.getProperty(locatorKey)); 
	  }
	  else if(locatorKey.endsWith("_linktext")) 
	  {
		  by = By.linkText(orPro.getProperty(locatorKey)); }else
	  if(locatorKey.endsWith("_partiallinktext")) 
	  { 
		  by = By.partialLinkText(orPro.getProperty(locatorKey)); 
	 } 
	  else if(locatorKey.endsWith("_xpath")) 
	  { 
		  by = By.xpath(orPro.getProperty(locatorKey)); 
	  }
	  else if(locatorKey.endsWith("_css")) { by =
	  By.cssSelector(orPro.getProperty(locatorKey)); }
	  
	  return by; 
	  }
	
	
	
	public void type(String locatorKey, String textKey)
	{
		//test.log(Status.INFO, "Enter user name and password.....");
		
		getElement(locatorKey).sendKeys(childPro.getProperty(textKey));
		
		//System.out.println(childPro.getProperty(textKey));
		
	}
	
	public void click(String locatorKey)
	{
		//test.log(Status.INFO, "Click on login button.....");
		getElement(locatorKey).click();
		
		
	}
	
	public void setReport(ExtentTest test)
	{
		this.test =test;
	}
	
	public void log(String mesz)
	{
		test.log(Status.INFO, mesz);
	}
	
	
	  public void failureReport(String message) throws IOException 
	  { 
		 // ((ExtentTest) softAssert).fail(message);
		  
		    softAssert.fail(message);//Failure in testNG reports
		    test.log(Status.FAIL, message);  //Failure in extent reports
		    takeScreenshot();
	  }
	  
	  public void assertAll()
	  {
		  softAssert.assertAll();
	  }
	  
		
		  public void takeScreenshot() throws IOException 
		  {
		  Date currentDate = new Date(); 
		  
		  System.out.println("takeScreenshot ::::");
		  String screenshotFileName = currentDate.toString().replace(":","_").replace(" ", "_")+".png"; 
		  System.out.println("screenshotFileName :::: "+ screenshotFileName);
		  //Take Screenshot 
		  TakesScreenshot screenshot = ((TakesScreenshot)driver); 
		  File file = screenshot.getScreenshotAs(OutputType.FILE);
		  
		/*  if(file.isFile()) {
			  System.out.println("file is avail ::: ");
			  System.out.println("file.getTotalSpace() ::: "+file.getTotalSpace());
			  System.out.println("file.getTotalSpace() ::: "+file.getParentFile().getName());
		  }
		  try {
			  
			  FileUtils.copyDirectory(file, new File(ExtentManager.screensotFolderPath+"\\"+screenshotFileName));
		  }catch(Exception exception) {
			  exception.getStackTrace();
		  }
		  test.log(Status.INFO, "Screenshot-->"+ test.addScreenCaptureFromPath(ExtentManager.screensotFolderPath+"\\"+screenshotFileName));
		 
		  }*/

}}
