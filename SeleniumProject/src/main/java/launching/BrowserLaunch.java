package launching;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserLaunch 
{
	//static WebDriver driver;

	public static void main(String[] args) throws InterruptedException 
	{
	
		//WebDriverManager.chromedriver().setup();
	       //System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\Mozilla Firefox\\firefox.exe");
	       
		
		   WebDriverManager.firefoxdriver().setup();
	      FirefoxDriver driver = new FirefoxDriver();
	      // System.out.println("C:\Program Files\Mozilla Firefox");
		
		/*driver= new ChromeDriver();
		driver.get("http://122.161.199.201/group/comnet2");
		driver.manage().window().maximize();
	
		
		driver.findElement(By.id("_com_liferay_product_navigation_user_personal_bar_web_portlet_ProductNavigationUserPersonalBarPortlet_jbfs____")).click();
		
		
		driver.findElement(By.id("_com_liferay_login_web_portlet_LoginPortlet_login")).sendKeys("test");
		driver.findElement(By.id("_com_liferay_login_web_portlet_LoginPortlet_password")).sendKeys("test");
		driver.findElement(By.className("lfr-btn-label")).click();
		
		driver.findElement(By.className("dropdown-toggle lfr-portal-tooltip btn btn-monospaced btn-sm btn-unstyled")).click();
		
		*/
		
		
		
	
		

	}

}
