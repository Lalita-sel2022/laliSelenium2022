package launching;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;

public class TC_005 extends BaseTest
{
     
	private static final Logger log= Logger.getLogger(TC_005.class);
	public static void main(String[] args) throws IOException 
	{
		
		init();
		log.info("init the properties file :");
		
		launcher("chromebrowser");
		log.info("Launching the browser");
		
		navigateUrl("amazonurl");
		log.info("Navigate the URL");
		
		selectOption("amazonselectoption-id","Books");
		log.info("Select books option from dropdown list");
		
		textBox("amazontextbox-id","Herry potter");
		log.info("Enter text harry potter in search field");
		
		searchButton("amazonsearchbutton-id");
		log.info("Click on search button");
	
		
		/*
		 * driver.findElement(By.id("searchDropdownBox")).sendKeys("Books");
		 * driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Herry portal");
		 * driver.findElement(By.id("nav-search-submit-button")).click();
		 */

	}


}
