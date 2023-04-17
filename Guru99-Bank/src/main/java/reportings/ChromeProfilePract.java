package reportings;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeProfilePract {

	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		//options.addArguments("automateprofile");
		//Add headless mode
		//options.addArguments("--headless");
		options.addArguments("user.data.dir=C:\\Users\\DELL\\AppData\\Local\\Google\\Chrome\\User Data\\Profile 12");
		
		//options.addArguments("--disable-infobars");
		WebDriver driver= new ChromeDriver(options);
		
		driver.get("https://www.amazon.in/");
		System.out.println(driver.getTitle());

	}

}
