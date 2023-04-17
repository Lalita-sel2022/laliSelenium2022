package seleniumWebdriverException;

import java.io.IOException;

import reportings.BaseClass;

public class ElementNotInteractableExcep extends BaseClass{

	public static void main(String[] args) throws IOException {
		
		init();
		launchBrowser("chromebrowser");
		navigate("letskodeitpractice");

	}

}
