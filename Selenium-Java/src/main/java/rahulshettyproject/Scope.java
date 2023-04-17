package rahulshettyproject;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.TargetLocator;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scope
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		// 1. Count links in the page
		
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		// 2. Limit webDriver scope
		
		WebElement footerDriver = driver.findElement(By.id("gf-BIG"));
		
		System.out.println(footerDriver.findElements(By.tagName("a")).size());
		
		// 3. count of first coloum links in the footer
		
		WebElement coloumDriver = footerDriver.findElement(By.xpath("//tbody/tr/td[1]/ul[1]"));
		
		System.out.println(coloumDriver.findElements(By.tagName("a")).size());
		int count = coloumDriver.findElements(By.tagName("a")).size();
		
		/*//Print coloum links items
		 * int count = coloumDriver.findElements(By.tagName("a")).size(); String aText =
		 * null; for(int i=0;i<count;i++) {
		 * aText=coloumDriver.findElements(By.tagName("a")).get(i).getText();
		 * System.out.println(aText); }
		 */
            
		// 4. Click on each link in the coloum and check if the page are opening
		
		for(int i=0;i<count;i++)
		{
			String clickOnLinkTab = Keys.chord(Keys.CONTROL, Keys.ENTER);
			coloumDriver.findElements(By.tagName("a")).get(i).sendKeys(clickOnLinkTab);
			Thread.sleep(5000);
		}
			Set<String> windows = driver.getWindowHandles();
			Iterator<String> it = windows.iterator();
			
			while(it.hasNext())
			{
				driver.switchTo().window(it.next());
				System.out.println(driver.getTitle());
			}
			
		
			
		
			
		}
		
	}


