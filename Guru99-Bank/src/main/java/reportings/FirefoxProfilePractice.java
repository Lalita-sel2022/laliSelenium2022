package reportings;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.ProfilesIni;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirefoxProfilePractice {

	public static void main(String[] args) 
	{
		WebDriver driver;
		
		WebDriverManager.firefoxdriver().setup();
		ProfilesIni profiles= new ProfilesIni();
		FirefoxProfile profile = profiles.getProfile("automationprofile");
	    //Use firefox profile
		FirefoxOptions options = new FirefoxOptions();
		options.setProfile(profile);
		driver= new FirefoxDriver(options);
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://letskodeit.com/");
		

	}

}
