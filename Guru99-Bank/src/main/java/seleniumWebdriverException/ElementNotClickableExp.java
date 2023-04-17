package seleniumWebdriverException;

import java.io.IOException;

import reportings.BaseClass;

public class ElementNotClickableExp extends BaseClass {

	public static void main(String[] args) throws IOException {
		
		init();
		launchBrowser("chromebrowser");
		navigate("freecrmurl"); //https://freecrm.com/index.html
		//getElement("crmlogin_class").click();
		
		getElement("email_name").sendKeys("test");

	}

}
