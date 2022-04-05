package webdriverScreenshots;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selfy2 
{

	public static void main(String[] args) throws Exception 
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		 List<WebElement> links = driver.findElements(By.linkText("lalita"));
		 System.out.println(links);
		 
		 if(links.size()==0)
		 {
			 File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				FileHandler.copy(file, new File("C:\\Users\\DELL\\Pictures\\Screenshots\\\\google.png"));
			}
		 

	}

}
