package actionsPractice;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import reportings.BaseClass;

public class KeypressActions extends BaseClass {

	public static void main(String[] args) throws IOException {
		
		init();
		launchBrowser("chromebrowser");
		navigate("letskodeitpractice");
		
		//getElement("window_id", "id").sendKeys(Keys.chord(Keys.CONTROL,"a"));
		Actions action = new Actions(driver);
		//action.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		action.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();

	}

}
