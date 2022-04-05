package launching;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PagingExample3 extends BaseTest
{

	public static void main(String[] args) throws IOException, InterruptedException 
	{
		
		
		  init(); 
		  launcher("chromebrowser"); 
		  navigateUrl("datatablesurl");
		 
		/*
		 * WebDriverManager.chromedriver().setup(); ChromeDriver driver= new
		 * ChromeDriver(); driver.get("https://datatables.net/");
		 */
		  int size = driver.findElements(By.cssSelector("div#example_paginate>span>a")).size();
		  System.out.println("Total size is :"+size);
		  
		  for(int i=1;i<=size;i++)
		  {
			 String pageSelector="div#example_paginate>span>a:nth-child("+i+")";
			 
			 //System.out.println("Number is :"+pageSelector);
				/*
				 * driver.findElement(By.cssSelector("pageSelector")).click(); List<WebElement>
				 * elementName =
				 * driver.findElements(By.cssSelector("table#example>tbody>tr>td:nth-child(1)"))
				 * ; for(WebElement listName:elementName) {
				 * System.out.println(listName.getText()); } Thread.sleep(2000);
				 */			 
		  }

		
	}

}
