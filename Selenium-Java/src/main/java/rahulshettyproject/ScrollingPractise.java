package rahulshettyproject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollingPractise 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("window.scroll(0,500)");
		Thread.sleep(3000);
		
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000;");
		List<WebElement> element = driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
		
		int sum=0;
		for(int i=0;i<element.size();i++)
		{
			sum=sum + Integer.parseInt(element.get(i).getText());
			 
		}
      
		System.out.println(sum);
		
		//System.out.println(driver.findElement(By.className(".totalAmount")).getText());
		System.out.println(driver.findElement(By.xpath("//div[@class='totalAmount']")).getText());
		
		 
	}

}
