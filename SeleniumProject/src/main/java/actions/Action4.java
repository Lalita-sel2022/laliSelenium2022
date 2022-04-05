package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Action4 
{

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
	    ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.amazon.in/");
		
		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']"))).perform();
		driver.findElement(By.xpath("(//a[@class='nav-action-button']//span[@class='nav-action-inner'])[1]")).click();
		WebElement gmailfield = driver.findElement(By.xpath("//input[@id='ap_email']"));
        a.moveToElement(gmailfield).keyDown(gmailfield, Keys.SHIFT).click().sendKeys("lalitasaini").keyUp(gmailfield,Keys.SHIFT).click().build().perform();
        driver.findElement(By.xpath("//input[@id='continue']")).click();
      
       
		

	}

}
