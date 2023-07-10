package utils;

import java.util.Set;

import org.openqa.selenium.WebDriver;

public class GenericUtils {
	public WebDriver driver;
	//Write reuseable code
	
	public GenericUtils(WebDriver driver) {
		this.driver=driver;
		
	}
	 public void switchToChildWindow() {
		 String ParentWindow=driver.getWindowHandle();
			System.out.println(ParentWindow);
			
			Set<String> windowHandles = driver.getWindowHandles();
			for(String handle:windowHandles) {
				if(handle != ParentWindow) {
					driver.switchTo().window(handle);
				}
			}
			
			
	 }
	

}
