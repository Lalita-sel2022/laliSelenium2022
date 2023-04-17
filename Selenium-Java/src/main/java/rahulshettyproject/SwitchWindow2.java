package rahulshettyproject;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SwitchWindow2 
{

	public static void main(String[] args) 
	{
		ChromeOptions option= new ChromeOptions();
		option.addArguments("--disable-notifications");
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver(option);
		
		driver.manage().window().maximize();
		driver.get("https://www.icicibank.com/");
		//Parent child window switching
		Set<String> windowId = driver.getWindowHandles();
		//System.out.println(windowId);
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		
		while(!wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//img[@alt='HL'])[1]"))).isDisplayed())
		{
			driver.findElement(By.xpath("(//button[@class='slick-next slick-arrow'])[1]")).click();
		}
	
		
		driver.findElement(By.xpath("//img[@alt='HL'])[1]")).click();
		
		
		

	}

}
