package actions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptExeDemo 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		//find element and get title through JSE
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("document.getElementById('email').value='lalitasaini'");
		String val = js.executeScript("return document.title").toString();
		System.out.println(val);
		
		//Scrolling page through JSE
		Thread.sleep(2000);
		
		//Scrolling by axis
		js.executeScript("window.scrollBy(0,100)");
		
		//Scrolling down
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
		//Scroll till element visible
		//js.executeScript("document.getElementById('loginbutton').scrollIntoView()");
		
		//Backwork browser
		js.executeScript("window.history.back()");
		
		//Forward browser
		js.executeScript("window.history.forward()");
		
		//Refresh page
		js.executeScript("window.history.go(0)");

	}

}
