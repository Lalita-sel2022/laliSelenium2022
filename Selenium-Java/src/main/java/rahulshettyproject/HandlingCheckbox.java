package rahulshettyproject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingCheckbox {

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		/*
		 * Assert.assertFalse(driver.findElement(By.cssSelector(
		 * "input[id*='SeniorCitizenDiscount']")).isSelected());
		 * Assert.assertFalse(false);
		 * System.out.println(driver.findElement(By.cssSelector(
		 * "input[id*='SeniorCitizenDiscount']")).isSelected());
		 * driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).
		 * click(); Assert.assertTrue(driver.findElement(By.cssSelector(
		 * "input[id*='SeniorCitizenDiscount']")).isSelected());
		 * Assert.assertTrue(true);
		 * System.out.println(driver.findElement(By.cssSelector(
		 * "input[id*='SeniorCitizenDiscount']")).isSelected());
		 * 
		 * //Count of number of checkboxs
		 * System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']"))
		 * .size());
		 */
		//Assignment 
		//Assert.assertFalse(driver.findElement(By.id("checkBoxOption1")).isSelected());
		//Assert.assertFalse(false);
		//System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected());
		
		driver.findElement(By.id("checkBoxOption1")).click();
		Assert.assertTrue(driver.findElement(By.id("checkBoxOption1")).isSelected());
		Assert.assertTrue(true);
		System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected());
		
		//Unchecked the checked box
		driver.findElement(By.id("checkBoxOption1")).click();
		Assert.assertFalse(driver.findElement(By.id("checkBoxOption1")).isSelected());
		Assert.assertFalse(false);
		System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected());
		
		//Count of number of checkbox
		
		System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());
	}

}
