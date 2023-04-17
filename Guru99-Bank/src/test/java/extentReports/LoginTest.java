package extentReports;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {
	WebDriver driver;
	
	@BeforeClass
	public void launchBrowser()
	{
		try {
		WebDriverManager.firefoxdriver().setup();
		driver= new FirefoxDriver();
		driver.get("https://demo.guru99.com/V1/");
		}catch(Exception e) {
			System.out.println(e);
		}
	}
  @Test
  public void f() {
  }
}
