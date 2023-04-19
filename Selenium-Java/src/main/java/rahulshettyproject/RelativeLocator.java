package rahulshettyproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import static org.openqa.selenium.support.locators.RelativeLocator.*;

public class RelativeLocator 
{

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
	
		
		driver.get("https://rahulshettyacademy.com/angularpractice/");	
		WebElement ele = driver.findElement(By.xpath("(//input[@name='name'])[1]"));
		
		
		
		
		
		
		

	}

}
