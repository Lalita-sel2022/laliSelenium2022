package seleniumWebdriverException;

import java.io.IOException;

import reportings.BaseClass;

public class NoSuchElementEx extends BaseClass{

	public static void main(String[] args) throws IOException
	{
		init();
		launchBrowser("firefoxbrowser");
		navigate("letskodeitpractice");//https://letskodeit.teachable.com/
		//Because of timing issue
		//Because of incorrect locator or type of locator
		//Because of Element in frame
		

	}

}
