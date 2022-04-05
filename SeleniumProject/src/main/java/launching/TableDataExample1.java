package launching;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TableDataExample1 extends BaseTest
{

	public static void main(String[] args) throws Exception 
	{
		
		  init(); 
		  launcher("chromebrowser"); 
		  navigateUrl("rediffurl");
		  
		  String val= driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr[13]/td[4]")).getText(); 
		  System.out.println(val);
		 
		/*
		 * WebDriverManager.chromiumdriver().setup();
		 * 
		 * ChromeDriver driver=new ChromeDriver(); driver.manage().window().maximize();
		 * driver.get("https://money.rediff.com/gainers");
		 * 
		 * String price =
		 * driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr[13]/td[4]")
		 * ).getText(); System.out.println(price);
		 */
		  
		  //String price = driver.findElement(By.xpath("//a[contains(text(),'Tata Coffee')]/parent::td/following-sibling::td[3]")).getText();
		  //System.out.println(price);
	}

}
