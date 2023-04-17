package actionsPractice;

import java.io.IOException;

import org.openqa.selenium.Keys;

import reportings.BaseClass;

public class KeyPressDemo2 extends BaseClass {

	public static void main(String[] args) throws IOException, InterruptedException 
	{
		init();
		launchBrowser("chromebrowser");
		navigate("letskodeitpractice");
		//getElement("window_id", "id").sendKeys(Keys.CONTROL +"a");
		//Thread.sleep(2000);
		//Chord use to perform sequences of keys--> say other way to press keyboard keys
		getElement("window_id").sendKeys(Keys.chord(Keys.CONTROL,"a"));
		Thread.sleep(2000);

	}

}
