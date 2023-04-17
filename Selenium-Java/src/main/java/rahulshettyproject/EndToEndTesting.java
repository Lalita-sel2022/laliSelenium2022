package rahulshettyproject;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EndToEndTesting 
{

	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("(//a[@value='BLR'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[text()=' Chennai (MAA)'])[2]")).click();
		driver.findElement(By.xpath("//a[text()='25']")).click();
		
		
		driver.findElement(By.id("divpaxinfo")).click();
		int i=1;
		while(i<4)
		{
		driver.findElement(By.id("hrefIncAdt")).click();
		i++;
		}
		
		driver.findElement(By.id("btnclosepaxoption")).click();
		
		WebElement ele = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
	    Select select=new Select(ele);
		select.selectByIndex(2);
		
		
		driver.findElement(By.id("autosuggest")).sendKeys("Ind");
		List<WebElement> element = driver.findElements(By.xpath("//li[@class='ui-menu-item']"));
		for(WebElement option:element)
		{
			if(option.getText().equalsIgnoreCase("India"))
			{
				option.click();
			}
		}
		
		
		//driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).click();
		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
		
		
		//System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		//System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		
		
		  if(driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5"))
		  {
			  System.out.println("It is enable");
			  Assert.assertTrue(false);
		  }
		  else
		  {
			  Assert.assertTrue(true);
		  }
		
		  driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
		
	}

}
