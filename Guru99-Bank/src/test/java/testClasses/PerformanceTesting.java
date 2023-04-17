package testClasses;

import java.time.Duration;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.ProfilesIni;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import reportings.BaseClass;

public class PerformanceTesting extends BaseClass {
	long startTime;
	long endTime;
	long duration;
	double seconds;
	WebDriver driver;
	//SearchPageFactory searchPage;
	private static final Logger log= Logger.getLogger(PerformanceTesting.class);
	
	@BeforeClass
	public void beforeClass()
	{
		WebDriverManager.chromedriver().setup();
		/*
		 * ProfilesIni profile = new ProfilesIni(); FirefoxProfile profile2 =
		 * profile.getProfile("automationprofile"); FirefoxOptions option= new
		 * FirefoxOptions(); option.setProfile(profile2);
		 */
		//option.addArguments("--disable-notifications");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.get("https://letskodeit.com/");
		
	}
  @Test
  public void searchFlight() {
	  //driver.findElement(By.xpath("//a[text()='Sign in']")).click();
	  //driver.findElement(By.id("loginFormEmailInput")).sendKeys("abc");
	  //driver.findElement(By.id("loginFormPasswordInput")).sendKeys("123");
	  startTime = System.nanoTime();
	  driver.get("https://letskodeit.com/");
	  driver.findElement(By.className("ast-button")).click();
	  driver.findElement(By.id("email")).sendKeys("test@email.com");
      driver.findElement(By.id("password")).sendKeys("abcabc");
      driver.findElement(By.className("btn-default")).click();
      endTime=System.nanoTime();
      duration = endTime-startTime;
      seconds = (double)duration/1000000000.0;
      log.info("**************************************");
      log.info("Time taken to execute this method "+seconds+ " seconds");
  }
}
