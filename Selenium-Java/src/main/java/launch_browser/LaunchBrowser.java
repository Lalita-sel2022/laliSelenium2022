package launch_browser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowser 
{

	public static void main(String[] args) throws InterruptedException
	{

	
		//Invoking browser
		//chrome - ChromeDriver .exten - method
		//firefox - FirefoxDriver .exten - method
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		//WebDriverManager.firefoxdriver().setup();
		WebDriver driver= new ChromeDriver();
		//WebDriver driver= new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
	    //driver.manage().window().maximize();
		driver.get("https://sso.teachable.com/secure/9521/identity/login/password");
		//System.out.println(driver.getCurrentUrl());
		//System.out.println(driver.getTitle());
	
		//driver.close();//closed focused window
		//driver.quit();// close drive
		driver.findElement(By.id("email")).sendKeys("rahul");
		driver.findElement(By.id("password")).sendKeys("rahulsettyacademy");
		driver.findElement(By.name("commit")).click();
		
		String s=driver.findElement(By.cssSelector("div[class='bodySmall m-b-3-xs text-center-xs auth-flash-error']")).getText();
	    System.out.println(s);
	    driver.findElement(By.linkText("Forgot Password")).click();
	    driver.findElement(By.xpath("//input[@class='form-input p-v-1-xs p-l-2-xs p-r-4-xs col-12-xs bodyMain error']")).sendKeys("rahul");
	    //driver.close();
		
		

	}

}
