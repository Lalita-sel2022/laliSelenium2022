package seleniumWebdriverException;

import java.io.IOException;

import org.openqa.selenium.WebElement;

import reportings.BaseClass;

public class StaleExeption extends BaseClass {

	public static void main(String[] args) throws IOException 
	{
		init();
		launchBrowser("chromebrowser");
		navigate("letskodeitpractice");
		
		driver.get(driver.getCurrentUrl());
		WebElement element = getElement("bmwcheck_id");
		element.click();

	}

}
