
package actionsPractice;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import reportings.BaseClass;

public class KeyPressDemo extends BaseClass {

	public static void main(String[] args) throws IOException, InterruptedException 
	{
		init();
		launchBrowser("chromebrowser");
		navigate("letskodeitpractice");
		getElement("signin_xpath").click();
		WebElement element = getElement("loginemail_id");
		element.sendKeys("test@email.com");
		element.sendKeys(Keys.TAB);
		
		//Thread.sleep(2000);
		//getElement("pass_id", "id").sendKeys("test");
		//Thread.sleep(2000);
		//Press enter on login button not click
		//getElement("loginbtn_classname", "classname").sendKeys(Keys.ENTER);
		//Thread.sleep(2000);
		//System.out.println("Successfully");
		//driver.close();

	}

}
