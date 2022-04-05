package webdriverScreenshots;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selfy3
{

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		String link1 = driver.findElement(By.linkText("Images")).getText();
		System.out.println(link1);
		
		System.out.println("********************************************************************************************");
		
		//get all links from page
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		  for(int i=0;i<links.size();i++) 
		  { String linkList = links.get(i).getText();
		  System.out.println(linkList); 
		  }
		  
		  System.out.println("*********************************************************************************************");
		 
		//Get all links in specific position
		  
		  List<WebElement> links2 = driver.findElements(By.xpath("//div[@id='SIvCob']/a"));
		  
		  for(int j=0;j<links2.size();j++)
		  {
			 String val = links2.get(j).getAttribute("innerHTML");
			 System.out.println(val);
		  }
		
		

	}

}
