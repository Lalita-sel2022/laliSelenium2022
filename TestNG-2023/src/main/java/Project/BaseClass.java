package Project;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	public static String projectPath = System.getProperty("user.dir");
	public static Properties mainpro;
	public static Properties childpro;
	public static Properties orpro;
	
	public static FileInputStream file;
	public static ExtentReports reports;
	public static ExtentTest test;
	public static String filePath;
	public static JavascriptExecutor js;
	
	static
	{
		Date dt = new Date();
		//System.out.println(dt);
		filePath = dt.toString().replace(':', '_').replace(' ', '_');
		
		
	}

	public static void init() throws IOException {
		
		try {
			file = new FileInputStream(projectPath + "\\src\\main\\resources\\enviornment.properties");
		} catch (FileNotFoundException e1) {
			
			e1.printStackTrace();
		}
		mainpro = new Properties();
		try {
			mainpro.load(file);
		} catch (IOException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		String e = mainpro.getProperty("env");
		System.out.println(e);

		try {
			file = new FileInputStream(projectPath+"\\src\\main\\resources\\"+ e +".properties");
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		childpro = new Properties();
		try {
			childpro.load(file);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		String s = childpro.getProperty("chromebrowser");
		System.out.println(s);

		file = new FileInputStream(projectPath +"\\src\\main\\resources\\or.properties");
		orpro = new Properties();
		orpro.load(file);
		String value = orpro.getProperty("amazondropdown_id");
		System.out.println(value);
		
		file = new FileInputStream(projectPath + "\\src\\main\\resources\\log4jconfig.properties");
		PropertyConfigurator.configure(file);
		
		reports=ExtentManger.getInstance();

	}

	public static void launchBrowser(String browser) {
		if (browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		
		} else if (browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
		}
	}

	public static void navigateUrl(String url) {
		
		driver.get(childpro.getProperty(url));
	}

	public static void clickElement(String keyLocator) {
		
		 getElement(keyLocator).click();
		
		// driver.findElement(By.id(locator)).click();
		
	}
	
	/*
	 * public static void highlightFailedEle() { JavascriptExecutor js =
	 * (JavascriptExecutor)driver; js.
	 * executeScript("arguments[0].setAttribute('style', 'border:2px solid red;')",
	 * getElement(keyLocator));
	 * 
	 * }
	 */

	public static void enterText(String keyLocator, String text) {
		

		getElement(keyLocator).sendKeys(text);
		// driver.findElement(By.id(locator)).sendKeys(text);
	}

	public static void selectOption(String keyLocator, String option) {

		
		getElement(keyLocator).sendKeys(option);

		// driver.findElement(By.id(locator)).sendKeys(option);

	}

	public static WebElement getElement(String keyLocator) {

		WebElement element = null;
		System.out.println("Check for Element is present ::" + keyLocator);
		if (!isElementPresent(keyLocator))
			 System.out.println("Element is not present :" + keyLocator);
			// js = (JavascriptExecutor)driver;
			// js.executeScript("arguments[0].setAttribute('style', 'border:2px solid red;')", keyLocator);
			

		element = driver.findElement(getLocators(keyLocator));

		/*
		 * if(keyLocator.endsWith("_id")) {
		 * 
		 * element=driver.findElement(By.id(orpro.getProperty(keyLocator)));
		 * 
		 * }else if(keyLocator.endsWith("_classname")) {
		 * element=driver.findElement(By.className(orpro.getProperty(keyLocator))); }
		 * else if(keyLocator.endsWith("_xpath")) {
		 * element=driver.findElement(By.xpath(orpro.getProperty(keyLocator))); } else
		 * if(keyLocator.endsWith("_css")) {
		 * element=driver.findElement(By.cssSelector(orpro.getProperty(keyLocator))); }
		 * else if(keyLocator.endsWith("_link")) {
		 * element=driver.findElement(By.linkText(orpro.getProperty(keyLocator))); }
		 * else if(keyLocator.endsWith("_partialLink")) {
		 * element=driver.findElement(By.partialLinkText(orpro.getProperty(keyLocator)))
		 * ; } else if(keyLocator.endsWith("_name")) {
		 * element=driver.findElement(By.name(orpro.getProperty(keyLocator))); }
		 */

		return element;
	}

	public static boolean isElementPresent(String keyLocator) {
		
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		

		try {
			wait.until(ExpectedConditions.presenceOfElementLocated(getLocators(keyLocator)));
			
		
			/*
			 * if(keyLocator.endsWith("_id")){
			 * wait.until(ExpectedConditions.presenceOfElementLocated(By.id(orpro.
			 * getProperty(keyLocator)))); }else if(keyLocator.endsWith("_name")) {
			 * wait.until(ExpectedConditions.presenceOfElementLocated(By.name(orpro.
			 * getProperty(keyLocator)))); }else if(keyLocator.endsWith("_classname")) {
			 * wait.until(ExpectedConditions.presenceOfElementLocated(By.className(orpro.
			 * getProperty(keyLocator)))); }else if(keyLocator.endsWith("_css")) {
			 * wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(orpro.
			 * getProperty(keyLocator)))); }else if(keyLocator.endsWith("_xpath")) {
			 * wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(orpro.
			 * getProperty(keyLocator)))); }else if(keyLocator.endsWith("_link")) {
			 * wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText(orpro.
			 * getProperty(keyLocator)))); }else if(keyLocator.endsWith("_partiallink")) {
			 * wait.until(ExpectedConditions.presenceOfElementLocated(By.partialLinkText(
			 * orpro.getProperty(keyLocator)))); }
			 */
		} catch (Exception e) {

			return false;
		}
		return true;
	}

	public static By getLocators(String keyLocator) {
		By by = null;

		if (keyLocator.endsWith("_id")) {
			by = By.id(orpro.getProperty(keyLocator));
		} else if (keyLocator.endsWith("_name")) {
			by = By.name(orpro.getProperty(keyLocator));
		} else if (keyLocator.endsWith("_classname")) {
			by = By.className(orpro.getProperty(keyLocator));
		} else if (keyLocator.endsWith("_css")) {
			by = By.cssSelector(orpro.getProperty(keyLocator));
		} else if (keyLocator.endsWith("_xpath")) {
			by = By.xpath(orpro.getProperty(keyLocator));
		} else if (keyLocator.endsWith("_link")) {
			by = By.linkText(orpro.getProperty(keyLocator));
		} else if (keyLocator.endsWith("_partiallink")) {
			by = By.partialLinkText(orpro.getProperty(keyLocator));
		}

		return by;

	}
	
	//*******************************  Verification  **********************************************************************
	
	/*
	 * public static String isLinkEqual() { String actualLink =
	 * driver.findElement(By.linkText("Customer Service")).getAttribute("innerHTML")
	 * ; return actualLink; }
	 */
	
	public static boolean isLinkEqual(String expectedLink, String keyLocator) 
	{
		//String actualLink = driver.findElement(By.linkText("Customer Service")).getAttribute("innerHTML");
		String actualLink=getElement(keyLocator).getText();
		if(actualLink.equals(expectedLink))
		return true;
		else
		return false;
	}
	

	//*******************************  Reporting  **********************************************************************
	
	public static void reportSuccess(String sucMgz) 
	{
		test.log(Status.PASS, sucMgz);
		
	}

	public static void reportFail(String failMgz) throws Exception 
	{
		test.log(Status.FAIL, failMgz);
		takeScreenshot();
		
	}

	public static void takeScreenshot() throws Exception 
	{
		Date date= new Date();
		String dateFormat = date.toString().replace(':', '_').replace(' ', '_')+".png";
		File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(srcFile, new File(projectPath+"\\faliureScreenshot\\"+dateFormat));
		
		test.log(Status.INFO, "Screenshot-->"+ test.addScreenCaptureFromPath(projectPath+"\\faliureScreenshot\\"+dateFormat));
		}
	
	public static boolean linkClickable(String keyLocator) 
	{
		return false;
		
	
	}

}
