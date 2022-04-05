package verifications;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Verify1 {

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		//Compare actual result and expected result 
		
		//String expectedRes = driver.findElement(By.xpath("//a[text()='Customer Service']")).getText();
		String expectedRes = driver.findElement(By.xpath("//a[text()='Customer Service']")).getAttribute("innerHTML");
		//String actualResult="Customer Service";
		String actualResult="customer service";
		
		System.out.println("Expected result is :"+expectedRes);
		System.out.println("Actual Result is :"+actualResult);
		
		//if(expectedRes.equals(actualResult))
		if(expectedRes.equalsIgnoreCase(actualResult))
		{
			System.out.println("Both are equal..");
		}
		else
		{
			System.out.println("Both are not equal...");
		}
		

	}

}
