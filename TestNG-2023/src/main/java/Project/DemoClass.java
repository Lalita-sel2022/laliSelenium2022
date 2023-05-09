package Project;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoClass extends BaseClass
{

	public static void main(String[] args) throws IOException {
		
		/*
		 * WebDriverManager.firefoxdriver().setup(); WebDriver driver = new
		 * FirefoxDriver(); driver.manage().window().maximize();
		 * 
		 * driver.get("https://www.amazon.in/");
		 * 
		 * WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		 * 
		 * JavascriptExecutor js = (JavascriptExecutor)driver; js.
		 * executeScript("arguments[0].setAttribute('style', 'border:2px solid red;')",
		 * search);
		 */
		
		init();
		launchBrowser("firefox");
		navigateUrl("amazonurl");
		selectOption("amazondropdown_id", "Books");
		enterText("searchtext_id", "Harry potter");
	}

}
