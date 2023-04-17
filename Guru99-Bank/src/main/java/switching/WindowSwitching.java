package switching;

import java.io.IOException;
import java.util.Set;
import org.openqa.selenium.WebDriver;
import reportings.BaseClass;

public class WindowSwitching extends BaseClass

{

	public static void main(String[] args) throws IOException, InterruptedException 
	{
		
		init();
		launchBrowser("chromebrowser");
		navigate("letskodeitpractice");
		//Parent window find element
		getElement("window_id").click();
		//Get the handle
		String windowHandle = driver.getWindowHandle();
		System.out.println("Parent handle is :"+windowHandle);
		//Get handles
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println("Windows :"+windowHandles.size());
		System.out.println(windowHandles);
		 //Switching between handles
		for(String handle:windowHandles)
		{
			if(!handle.equals(windowHandle))
			{
				driver.switchTo().window(handle);
				Thread.sleep(2000);
				getElement("search_xpath").sendKeys("Python");
				Thread.sleep(2000);
				getElement("searchbutton_class").click();
				Thread.sleep(2000);
				driver.close();
				break;
			}
		}
		//Switch back to parent window
		driver.switchTo().window(windowHandle);
		Thread.sleep(2000);
		getElement("name_id").sendKeys("Lalita");
		}
	}


