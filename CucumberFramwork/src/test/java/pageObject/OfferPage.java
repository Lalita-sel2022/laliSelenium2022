package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OfferPage {
	WebDriver driver;
	public OfferPage(WebDriver driver) {
		this.driver=driver;
	}

	By search =By.id("search-field");
	By offProductName =By.cssSelector("tr td:nth-child(1)");
	
	public void serchItem(String name) {
		driver.findElement(search).sendKeys(name);
	}
	
	public void getSearchText() {
		driver.findElement(search).getText();
	}
	
	
	public String getProductName() {
		return driver.findElement(offProductName).getText();
	}

}
