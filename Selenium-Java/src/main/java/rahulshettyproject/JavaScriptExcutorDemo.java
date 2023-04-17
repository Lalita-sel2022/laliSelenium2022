package rahulshettyproject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptExcutorDemo 
{

	private static final String JavaScriptExcutor = null;
	private static final String JavaScriptExecutor = null;

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
	    JavascriptExecutor js= (JavascriptExecutor)driver;
	    js.executeScript("document.getElementById('email').value='lalitasaini'");
	    String title = js.executeScript("return document.title").toString();
	    System.out.println(title);
	    
	    //Scroll the window
	    //for(int i=1;i<3;i++)
	    //{
	    	//Thread.sleep(2000);
	    	//js.executeScript("window.scrollBy(0,100)");
	    //}
	    
		
		//Go to end of page
	    //js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	    
	    //Scrolling until element visibility
	    
	    //js.executeScript("document.getElementById('u_0_0_oP').scrollIntoView()");
	    
		/*
		 * //Window backword Thread.sleep(2000);
		 * js.executeScript("window.history.back()"); //Window forword
		 * Thread.sleep(2000); js.executeScript("window.history.forward()");
		 * 
		 * //Refresh page Thread.sleep(2000); js.executeScript("window.history.go(0)");
		 */
	    Thread.sleep(2000);
	    driver.navigate().back();
	    
	    Thread.sleep(2000);
	    driver.navigate().forward();
	    
	    Thread.sleep(2000);
	    driver.navigate().refresh();
	    
	    
	    
	    

	}

}
