package switching;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowSwitching2 
{

	public static void main(String[] args) 
	{
	
		WebDriverManager.chromedriver().setup();
	    ChromeOptions option=new ChromeOptions();
	    option.addArguments("--disable-notifications");
		//option.addArguments("incognito");
		ChromeDriver driver=new ChromeDriver(option);
		driver.manage().window().maximize();
		
		driver.get("https://www.icicibank.com/");
		String title = driver.getTitle();
		System.out.println(title);
		String parentWin = driver.getWindowHandle();
		System.out.println(parentWin);

	}

}
