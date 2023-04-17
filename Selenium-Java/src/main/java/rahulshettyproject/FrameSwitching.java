package rahulshettyproject;

import java.io.IOException;

import org.openqa.selenium.By;

import ofb_launching.BaseTest;

public class FrameSwitching extends BaseTest
{

	public static void main(String[] args) throws IOException
	{
		dataFile();
		launchBrowser("chromebrowser");
		getUrl("seleniumdev");

		driver.findElement(By.xpath("(//a[text()='Frames'])[1]")).click();
		
		driver.switchTo().frame(driver.findElement(By.name("packageListFrame")));
		driver.findElement(By.xpath("(//a[text()='org.openqa.selenium'])[1]")).click();
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(driver.findElement(By.name("packageFrame")));
		driver.findElement(By.xpath("//span[text()='WebDriver']")).click();
	}

}
