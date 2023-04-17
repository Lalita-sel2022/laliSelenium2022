package rahulshettyproject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CalenderUI 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		driver.get("https://www.path2usa.com/travel-companion/");
		Thread.sleep(2000);
		
		//WebDriverWait wait= new WebDriverWait(driver, 2);
		//wait.until(ExpectedConditions.elementToBeClickable(By.id("form-field-travel_comp_date")));
		//driver.findElement(By.id("form-field-travel_comp_date")).click();
		
		/*
		 * WebElement element =
		 * driver.findElement(By.id("form-field-travel_comp_date"));
		 * 
		 * Actions action = new Actions(driver);
		 * action.moveToElement(element).click().build().perform();
		 */
		
		//driver.findElement(By.id("form-field-travel_comp_date")).click();
		driver.findElement(By.cssSelector("#form-field-travel_comp_date")).click();

	}

}
