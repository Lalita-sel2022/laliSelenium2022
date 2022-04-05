package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Action2
{

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
	    ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/draggable/");
		
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		Actions a=new Actions(driver);
		WebElement drag = driver.findElement(By.xpath("//p[text()='Drag me around']"));
		
		/*a.dragAndDrop(drag)), null).perform();
		a.clickAndHold(drag).moveToElement(drag).release(drag).perform();
		*/
		a.dragAndDropBy(drag, 100, 0).perform();

	}

}
