package rahulshettyproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SwitchWindow {

	public static void main(String[] args) 
	{
		

		
		WebDriverManager.chromedriver().setup();
		
		//Open incognito window
		//ChromeOptions option= new ChromeOptions();
		//option.addArguments("--incognito");
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		
		//Open new tab /window
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.amazon.in/");
		System.out.println(driver.getTitle());

	
	}

}
