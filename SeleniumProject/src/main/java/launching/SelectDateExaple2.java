package launching;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SelectDateExaple2 extends BaseTest
{

	public static void main(String[] args) throws IOException
	{
		init();
		launcher("chromebrowser");
		navigateUrl("goibibourl");
		driver.findElement(By.xpath("//div[@class='sc-bkkeKt gAqCbJ fswFld ']//span[text()='Departure']")).click();
		String val = driver.findElement(By.xpath("//div[@class='DayPicker-Caption']/div")).getText();
		System.out.println(val);
		while(!val.startsWith("April"))
		{
			
			driver.findElement(By.xpath("//span[@class='DayPicker-NavButton DayPicker-NavButton--next']")).click();
			val = driver.findElement(By.xpath("//div[@class='DayPicker-Caption']/div")).getText();
		}
		
		WebElement date = driver.findElement(By.xpath("//div[@class='DayPicker-Body']//div//div[@class='DayPicker-Day']/p[text()=20]"));
		date.click();
		
		

	}

}
