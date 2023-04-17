package rahulshettyproject;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandling 
{

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.cssSelector(".blinkingText")).click();
		
		  Set<String> windows = driver.getWindowHandles();
		  //System.out.println(windows); 
		  Iterator<String> it = windows.iterator();
		  String parentID = it.next(); 
		  String childID = it.next();
		  driver.switchTo().window(childID);
		 
		System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());
		String email=driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];
		System.out.println(email);
		
		driver.switchTo().window(parentID);
		driver.findElement(By.id("username")).sendKeys(email);
		
		
		
		
		

	}

}
