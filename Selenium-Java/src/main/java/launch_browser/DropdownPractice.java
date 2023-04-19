package launch_browser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownPractice 
{

	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		//dropdown with select tag - static
		//WebElement staticDrop = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		/*
		 * Select dropdown= new Select(staticDrop); //Select option through index
		 * dropdown.selectByIndex(3);
		 * System.out.println(dropdown.getFirstSelectedOption().getText());
		 * dropdown.selectByVisibleText("AED");
		 * System.out.println(dropdown.getFirstSelectedOption().getText());
		 * dropdown.selectByValue("INR");
		 * System.out.println(dropdown.getFirstSelectedOption().getText());
		 */
		
		//Practice for another dropdown
		//Thread.sleep(2000L);
		driver.findElement(By.id("divpaxinfo")).click();
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		Thread.sleep(2000);
		int i=1;
		while(i<5)
		{
			driver.findElement(By.id("hrefIncAdt")).click();
			i++;
		}
		
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

		
		//driver.findElement(By.xpath("(//div[@class='ad-row-right'])[3]")).click();
		driver.findElement(By.id("btnclosepaxoption")).click();

	}

}
