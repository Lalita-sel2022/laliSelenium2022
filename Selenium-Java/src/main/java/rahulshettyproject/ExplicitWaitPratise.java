package rahulshettyproject;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWaitPratise 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		//WebDriverWait wait=new WebDriverWait(driver, 3);
		
		String[] s= {"iphone X","Samsung Note 8","Nokia Edge","Blackberry"};
		
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.cssSelector("#username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("#password")).sendKeys("learning");
		System.out.println(driver.findElement(By.xpath("(//input[@id='usertype'])[2]")).isSelected());
		Assert.assertFalse(driver.findElement(By.xpath("(//input[@id='usertype'])[2]")).isSelected());
		Assert.assertFalse(false);
		driver.findElement(By.xpath("(//input[@id='usertype'])[2]")).click();
		//System.out.println(driver.findElement(By.xpath("(//input[@id='usertype'])[2]")).isSelected());
		Assert.assertTrue(driver.findElement(By.xpath("(//input[@id='usertype'])[2]")).isSelected());
		Assert.assertTrue(true);
		System.out.println(driver.findElement(By.xpath("(//input[@id='usertype'])[2]")).isSelected());
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='modal-body']/p")));
		System.out.println(driver.findElement(By.xpath("//div[@class='modal-body']/p")).getText());
		driver.findElement(By.cssSelector("#okayBtn")).click();
		
		
		//wait.until(ExpectedConditions.)
		
		
		WebElement ele = driver.findElement(By.xpath("//select[@class='form-control']"));
		Select select=new Select(ele);
		select.selectByIndex(1);
		driver.findElement(By.cssSelector("#terms")).click();
		
		//WebDriverWait wait1=new WebDriverWait(driver, 3);
		//wait1.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("#signInBtn")));
		driver.findElement(By.cssSelector("#signInBtn")).click();
		
		//WebDriverWait wait1= new WebDriverWait(driver, 3);
		//wait1.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//li[@class='nav-item active']")));
	
		Thread.sleep(3000);

		List<WebElement> items = driver.findElements(By.cssSelector(".card-title"));
		
		for(int i=0;i<items.size();i++)
		{
			List<String> aList = Arrays.asList(s);
			//System.out.println("Hello");
		    String getItem=items.get(i).getText();
		    //System.out.println(getItem);
		    
			
			  if(aList.contains(getItem)) { System.out.println(aList);
		      driver.findElements(By.xpath("//button[@class='btn btn-info']")).get(i).click();
			  
			  }
			 
		}
		
		
		driver.findElement(By.xpath("//li[@class='nav-item active']")).click();
		
	}

}
