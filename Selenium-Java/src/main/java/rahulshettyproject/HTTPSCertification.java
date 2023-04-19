package rahulshettyproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HTTPSCertification {

	public static void main(String[] args) 
	{
		ChromeOptions option = new ChromeOptions();
		option.setAcceptInsecureCerts(true);
				
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver(option);
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		driver.get("https://expired.badssl.com/");
		

	}

}
