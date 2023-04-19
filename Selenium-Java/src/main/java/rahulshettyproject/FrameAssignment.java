package rahulshettyproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameAssignment {

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/");
		
		
		
		driver.findElement(By.xpath("//a[text()='Nested Frames']")).click();
		
		//Find count of frame on the page
	    System.out.println(driver.findElements(By.tagName("frame")).size());
	    
	    driver.switchTo().frame("//frameset[@name='frameset-middle']/frame[@name='frame-middle']");
	    
	    System.out.println(driver.findElement(By.xpath("//div[@id='content']")).getText());

	}

}
