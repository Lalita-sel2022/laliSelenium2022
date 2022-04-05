package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoSuggestionBox 
{

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
	    ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("hadop tutorial");
		String attName = driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).getAttribute("value");
		System.out.println(attName);

	}
	

}
