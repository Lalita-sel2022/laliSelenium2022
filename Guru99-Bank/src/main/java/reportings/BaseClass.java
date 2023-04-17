package reportings;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.ProfilesIni;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import io.github.bonigarcia.wdm.WebDriverManager;


public class BaseClass {
	
	
	public static WebDriver driver;
	public static FileInputStream file;
	public static String projectPath = System.getProperty("user.dir");
	public static Properties mainPro;
	public static Properties childPro;
	public static Properties orPro;
	public static JavascriptExecutor js;
	public static ExtentReports reports;
	public static ExtentTest test;
	
	

	
	public static void init() throws IOException {
		file = new FileInputStream(projectPath + "\\src\\main\\resources\\environment.properties");
		mainPro = new Properties();
		mainPro.load(file);
		String e = mainPro.getProperty("env");
		System.out.println(e);
		file = new FileInputStream(projectPath + "\\src\\main\\resources\\" + e + ".properties");
		childPro = new Properties();
		childPro.load(file);
		System.out.println(childPro.getProperty("chromebrowser"));
		file = new FileInputStream(projectPath+"\\src\\main\\resources\\or.properties");
		orPro= new Properties();
		orPro.load(file);
		System.out.println(orPro.getProperty("search_xpath"));
		file= new FileInputStream(projectPath+"\\src\\main\\resources\\log4j.properties");
		PropertyConfigurator.configure(file);
		reports = ExtentManager.getReport();
	}

	   public static void launchBrowser(String browser) {
		WebDriverManager.chromedriver().setup();
		if (browser.equals("chromebrowser")) {
			driver = new ChromeDriver();
			//Work with JavaScriptExecutor
		    js=  (JavascriptExecutor) driver;
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
			driver.manage().window().maximize();}
		else if (browser.equals("firefoxbrowser")) {
			
			WebDriverManager.firefoxdriver().setup();
			ProfilesIni profile= new ProfilesIni();
			FirefoxProfile pro = profile.getProfile("automationprofile");
			FirefoxOptions options= new FirefoxOptions();
			options.setProfile(pro);
			System.out.println("Inside firefox browser");
			driver = new FirefoxDriver(options);
			driver.manage().window().maximize();
		}
	}
      public static void navigate(String url) {
		System.out.println("inside navigate method");
		driver.get(childPro.getProperty(url));
	   }
	
		/*
		 * // Open url using JavaScriptExecutor public static void navigate1() {
		 * System.out.println("Open url using javascript executor");
		 * js.executeScript("window.location ='https://courses.letskodeit.com/practice'"
		 * ); System.out.println("After navigate url"); }
		 */
	
		/*
		 * //Find size of window using JavaScriptexecutor public static void
		 * windowSize() throws InterruptedException { //long height =
		 * (Long)js.executeScript("return window.innerHeight;"); //long width =
		 * (Long)js.executeScript("return window.innerWidth;");
		 * //System.out.println("Heigth is :" +height);
		 * //System.out.println("Width is :" +width); //Scroll down using JSE
		 * js.executeScript("window.scrollBy(0,699)"); Thread.sleep(2000); //Scroll up
		 * using JSE js.executeScript("window.scrollBy(0,-699)"); Thread.sleep(2000);
		 * 
		 * //Scroll Element into view WebElement element =
		 * driver.findElement(By.id("mousehover"));
		 * js.executeScript("arguments[0].scrollIntoView(true)",element);
		 * Thread.sleep(2000); }
		 */
	
		/*
		 * //Find element using JavaScriptexecutor public static WebElement
		 * getElement2() { return
		 * (WebElement)js.executeScript("return document.getElementById('name')"); }
		 */
		
		  public static void enterText(String locatorKey) {
		  getElement(locatorKey).sendKeys("Lalita"); }
		 
		/*
		 * public static void windowSwitch(String locatorKey) throws
		 * InterruptedException { // getElement(locatorKey).sendKeys(value); String
		 * windowHandle = driver.getWindowHandle();
		 * System.out.println("Parent window is :"+windowHandle);
		 * getElement(locatorKey).click(); Thread.sleep(2000); //Before switch the
		 * window //Get all handles Set<String> windowHandles =
		 * driver.getWindowHandles(); //Switching between handles for(String
		 * handle:windowHandles) { if(!handle.equals(windowHandle)) {
		 * driver.switchTo().window(handle); Thread.sleep(2000);
		 * getElement(locatorKey).sendKeys("Python"); Thread.sleep(2000);
		 * getElement(locatorKey).click(); Thread.sleep(2000); driver.close(); break; }
		 * }
		 * 
		 * 
		 * }
		 */
      
	   // Find elements 
      public static WebElement getElement(String locatorKey)
	  { 
      WebElement element=null;	
      
      //Check for the element persence
      if(!isElementPresent(locatorKey))
         System.out.println("Element is not present :"+locatorKey);
      
        element = driver.findElement(getLocator(locatorKey));
	    /*
		 * if(locatorKey.endsWith("_id")) { element=
		 * driver.findElement(By.id(orPro.getProperty(locatorKey))); } else
		 * if(locatorKey.endsWith("_classname")) { element =
		 * driver.findElement(By.className(orPro.getProperty(locatorKey))); } else
		 * if(locatorKey.endsWith("_xpath")) { element=
		 * driver.findElement(By.xpath(orPro.getProperty(locatorKey))); } else
		 * if(locatorKey.endsWith("_css")) { element=
		 * driver.findElement(By.cssSelector(orPro.getProperty(locatorKey))); } else
		 * if(locatorKey.endsWith("_linktext")) { element=
		 * driver.findElement(By.linkText(orPro.getProperty(locatorKey))); } else
		 * if(locatorKey.endsWith("_partiallinktext")) { element=
		 * driver.findElement(By.partialLinkText(orPro.getProperty(locatorKey))); } else
		 * if(locatorKey.endsWith("_name")) { element=
		 * driver.findElement(By.name(orPro.getProperty(locatorKey))); }
		 */
	   return element;
	  }
	  
	  
	    public static boolean isElementPresent(String locatorKey) 
	    {
	    	System.out.println("Checking the Element Presence :" + locatorKey);
	    	WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(3));
	    	try {
	    		wait.until(ExpectedConditions.presenceOfElementLocated(getLocator(locatorKey)));
				/*
				 * if(locatorKey.endsWith("_id")) {
				 * wait.until(ExpectedConditions.presenceOfElementLocated(By.id(orPro.
				 * getProperty(locatorKey)))); }else if(locatorKey.endsWith("_name")) {
				 * wait.until(ExpectedConditions.presenceOfElementLocated(By.name(orPro.
				 * getProperty(locatorKey)))); }else if(locatorKey.endsWith("classname")) {
				 * wait.until(ExpectedConditions.presenceOfElementLocated(By.className(orPro.
				 * getProperty(locatorKey)))); }else if(locatorKey.endsWith("_css")) {
				 * wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(orPro.
				 * getProperty(locatorKey)))); }else if(locatorKey.endsWith("_xpath")) {
				 * wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(orPro.
				 * getProperty(locatorKey)))); }else if(locatorKey.endsWith("_linktext")) {
				 * wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText(orPro.
				 * getProperty(locatorKey)))); } else
				 * if(locatorKey.endsWith("_partiallinktext")) {
				 * wait.until(ExpectedConditions.presenceOfElementLocated(By.partialLinkText(
				 * orPro.getProperty(locatorKey)))); }
				 */
			} catch (Exception e){
				
				return false;
			}
		    return true;
	     }

	    
	    public static By getLocator(String locatorKey)
	    {
	    	By by=null;
	    	if(locatorKey.endsWith("_id"))
			{
			by = By.id(orPro.getProperty(locatorKey));
			}else if(locatorKey.endsWith("_name"))
			{
			by = By.name(orPro.getProperty(locatorKey));
			}else if(locatorKey.endsWith("_class"))
			{
			by = By.className(orPro.getProperty(locatorKey));
			}
			else if(locatorKey.endsWith("_css"))
			{
			by = By.cssSelector(orPro.getProperty(locatorKey));
			}
			else if(locatorKey.endsWith("_xpath"))
			{
			by = By.xpath(orPro.getProperty(locatorKey));
			}
			else if(locatorKey.endsWith("_linktext"))
			{
			by = By.linkText(orPro.getProperty(locatorKey));
			}
			else if(locatorKey.endsWith("_partiallinktext"))
			{
			by = By.partialLinkText(orPro.getProperty(locatorKey));
			}
	    	
			return by;
	    	
	    }
       
			/*
			 * public static void childWindow(String locator,String type, String value) {
			 * getElement(locator, type).sendKeys(orPro.getProperty(value));
			 * 
			 * }
			 */
	 
			/*
			 * public static List<WebElement> getElements(String locator, String type) {
			 * if(type.equals("xpaths")) {
			 * System.out.println("Element found with xpaths :"+locator); return
			 * driver.findElements(By.xpath(orPro.getProperty(locator))); } return null; }
			 */
         
	

}
