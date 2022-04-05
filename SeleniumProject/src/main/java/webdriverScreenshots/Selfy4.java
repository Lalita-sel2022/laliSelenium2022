package webdriverScreenshots;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selfy4 
{

	public static void main(String[] args) throws Exception
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		// Take screenshot on basis of functionality
		
          List<WebElement> links=driver.findElements(By.xpath("//div[@id='SIvCob']/a"));
		  
          for(int j=0;j<links.size();j++)
		  {
        	 Date date= new Date();
        	 System.out.println(date);
        	 String res = date.toString().replace(":", "_").replace(" ", "_");
             System.out.println(res); 
			 
        	 String linkName = links.get(j).getAttribute("innerHTML");
			 links.get(j).click();
			 File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			 FileHandler.copy(file, new File("C:\\Users\\DELL\\Pictures\\Screenshots\\"+linkName+"_"+res+".png"));
			 
			 links=driver.findElements(By.xpath("//div[@id='SIvCob']/a"));
			 
		  }
		

	}

}
