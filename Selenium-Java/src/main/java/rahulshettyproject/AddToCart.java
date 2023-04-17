package rahulshettyproject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AddToCart 
{

	public static void main(String[] args)
	{
	  WebDriverManager.chromedriver().setup();
	  WebDriver driver= new ChromeDriver();
	  driver.manage().window().maximize();
	 // driver.manage().timeouts().
	  driver.get("https://rahulshettyacademy.com/seleniumPractise/");
	  
	  String[] names= {"Brocolli","Cauliflower","Cucumber", "Beetroot","Tomato"};
	  int j=0;
	 
	  List<WebElement> productName = driver.findElements(By.xpath("//h4[@class='product-name']"));
	  for(int i=0;i<productName.size();i++)
	  {
		 String[] name=productName.get(i).getText().split("-");
		 String formatName = name[0].trim();
		 
		
		  List<String> element = Arrays.asList(names);
		   
		  if(element.contains(formatName))
		  {
			  j++;
			  
			 driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
			 
		  }
		  if(j==5)
		  {
			  break;
		  }
	  }
	 

	}

	

}
