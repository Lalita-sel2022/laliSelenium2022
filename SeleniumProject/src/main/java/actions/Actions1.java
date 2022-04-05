package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Actions1 
{

	public static void main(String[] args) 
	{
	
		WebDriverManager.chromedriver().setup();
	    ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.snapdeal.com/");
		
		Actions a=new Actions(driver);
        a.moveToElement(driver.findElement(By.xpath("//span[text()='Sign In']"))).perform();
        driver.findElement(By.xpath("//a[text()='Your Orders']")).click();

	}

}
