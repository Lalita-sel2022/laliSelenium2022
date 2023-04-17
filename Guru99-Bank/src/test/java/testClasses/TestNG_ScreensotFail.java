package testClasses;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import reportings.BaseClass;

public class TestNG_ScreensotFail  extends BaseClass{
	WebDriver driver;
	
	@BeforeMethod
	public void setUp()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://www.facebook.com/");
		}
  @Test
  public void testLogin() {
	  driver.findElement(By.id("email")).sendKeys("test");
	  driver.findElement(By.id("pass")).sendKeys("test");
	  try {
	  driver.findElement(By.name("Login")).click();
	  }catch(Exception e)
	  {
		  System.out.println(e);
	  }
	  System.out.println("Not click to login button");
  }
  @AfterMethod
  public void cleanUp(ITestResult testResult) throws IOException
  {
	  System.out.println("Inside the cleanup method");
	  
	  if(testResult.getStatus()==ITestResult.FAILURE)
	  {
		  System.out.println("Get method name");
		  System.out.println(testResult.getMethod().getMethodName());
		  //String fileName= getRandomString(10)+".png";
		  String directory=projectPath+"\\Screenshots\\x.png";
		  System.out.println("Project path is ::"+directory);
		  File source= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  FileUtils.copyFile(source, new File(directory));
		}
	  driver.quit();
  }
  
	/*
	 * public static String getRandomString(int length ) { StringBuilder sb= new
	 * StringBuilder(); String
	 * characters="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOpQRSTUVWXYZ1234567890";
	 * for(int i=0;i<length;i++) { int index=(int)(Math.random()*
	 * characters.length()); sb.append(characters.charAt(index)); } return
	 * sb.toString();
	 * 
	 * }
	 */
}
