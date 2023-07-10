package pageObject;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
	WebDriver driver;
	public LendingPage lendingPage;
	public OfferPage offerPage;
	
	public PageObjectManager(WebDriver driver) {
		this.driver= driver;
	}
	
	
	public LendingPage getLendingPage() {
		lendingPage = new LendingPage(driver);
		return lendingPage;
		}
	public OfferPage getOfferPage() {
		offerPage = new OfferPage(driver);
		return offerPage;
		}

}
