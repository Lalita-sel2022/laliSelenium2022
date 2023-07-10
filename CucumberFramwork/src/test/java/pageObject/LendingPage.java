package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LendingPage {
	WebDriver driver;
	public LendingPage(WebDriver driver) {
		this.driver=driver;
	}

	By search =By.className("search-keyword");
	By productName =By.cssSelector("h4.product-name");
	By topDeals=By.linkText("Top Deals");
	
	public void serchItem(String name) {
		driver.findElement(search).sendKeys(name);
	}
	
	public void getSearchText() {
		driver.findElement(search).getText();
	}
	
	
	public String getProductName() {
		return driver.findElement(productName).getText();
	}
	
	public void selectTopDeals() {
	driver.findElement(topDeals).click();
	}
	
}
