package switching;

import java.io.IOException;

import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

//import launching.BaseTest;

public class WindowSwitching 
{

	public static void main(String[] args) throws IOException 
	{
		
		WebDriverManager.chromedriver().setup();
	    ChromeOptions option=new ChromeOptions();
		option.addArguments("incognito");
		ChromeDriver driver=new ChromeDriver(option);
		driver.manage().window().maximize();
		
	
		driver.get("https://www.google.com/");
		String val = driver.getTitle();
		System.out.println(val);
		
		//driver.switchTo().newWindow(WindowType.TAB);
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.amazon.in/");
		String val1 = driver.getTitle();
		System.out.println(val1);
		
		
		
		

	}

}
