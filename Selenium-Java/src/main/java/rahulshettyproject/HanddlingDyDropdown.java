package rahulshettyproject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HanddlingDyDropdown 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("(//a[@value='BLR'])[1]")).click();
		
		//driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[text()=' Chennai (MAA)'])[2]")).click();
		//Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@class='ui-state-default ui-state-highlight']")).click();
		//Thread.sleep(3000);
		//System.out.println(driver.findElement(By.className("ui-state-default ui-state-highlight")).getText());
		//driver.findElement(By.xpath("//a[text()='25']")).click();

	}

}
