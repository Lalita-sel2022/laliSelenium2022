package rahulshettyproject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StaticDropdown 
{

	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		//Select Static dropdown using webdriver API
		//driver.findElement(By.id("autosuggest")).sendKeys("Ind");
		WebElement ele = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
	    Select select=new Select(ele);
		//System.out.println(select.getFirstSelectedOption());
		select.selectByIndex(2);
		//System.out.println(select.getFirstSelectedOption());
		
		//Select Dynamic dropdown
	
		
		// Select dynamic dropdown
		
		
		

	}

}
