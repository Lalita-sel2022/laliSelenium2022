package actionsPractice;

import java.awt.Window;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

import reportings.BaseClass;

public class MouseHover extends BaseClass {

	public static void main(String[] args) throws IOException
	{
		init();
		launchBrowser("chromebrowser");
		//navigate("snapdealurl");
		//Actions action= new Actions(driver);
		//WebElement element = getElement("signin_xpath","xpath");
		//action.moveToElement(element).perform();
		//getElement("yourorder_xpath","xpath").click();
		
		//Auto suggest box
		
		navigate("googleurl");
	   WebElement element = getElement("googlesearch_classname");
	   element.sendKeys("Hadoop Tutorial");
	   String val=element.getAttribute("value");
	   
		/*
		 * List<WebElement> list = getElements("autosuggestdata","xpaths"); for(int
		 * i=1;i<list.size();i++) {
		 * 
		 * if(list.get(i).getText().equalsIgnoreCase(val)) { list.get(i).click();
		 * return; } list= driver.findElements(By.xpath(
		 * "//ul[@class='G43f7e'][1]/li/div/div[2]/div[1]/span")); }
		 */
	   
	   
	    //String value = driver.findElement(By.className("googlesearch_classname")).getAttribute("value");
	    //System.out.println(value);

	}

}
