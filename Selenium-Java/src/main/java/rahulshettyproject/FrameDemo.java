package rahulshettyproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameDemo
{

	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		
		//Find count of frame on the page
		System.out.println(driver.findElements(By.tagName("iframe")).size());
		
		//driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		driver.switchTo().frame(0);

		driver.findElement(By.id("draggable")).click();
		
		Actions action= new Actions(driver);
		WebElement sourse = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));
		
		action.dragAndDrop(sourse, target).build().perform();
		
		//Exit from frame
		driver.switchTo().defaultContent();
		
		System.out.println(driver.findElement(By.xpath("//a[text()='Accept']")).getText());
		
		
		
		

	}

}
