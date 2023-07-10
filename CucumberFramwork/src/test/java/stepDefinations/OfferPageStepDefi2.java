package stepDefinations;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObject.LendingPage;
import pageObject.OfferPage;
import pageObject.PageObjectManager;
import utils.TestContextSetup;

public class OfferPageStepDefi2 {
	
	String offerProName;
	TestContextSetup testContext;
	PageObjectManager pageObjectManager;
	//Single responsibilty principal
	//Loosely coupled
	public OfferPageStepDefi2(TestContextSetup testContext) {
		this.testContext=testContext;
		
	}
	

	@Then("User serached for same name in offer page to check if product exist")
	public void result() {
		switchToChildWindow();
		OfferPage offerpage= new OfferPage(testContext.driver);
		offerpage.serchItem("tom");
		offerProName=offerpage.getProductName();
		
	}
	
	public void switchToChildWindow()
	{
		//If switch to offer page ----Skip below part
		//if(testContext.driver.getCurrentUrl().equals(".........."))
		String ParentWindow=testContext.driver.getWindowHandle();
		System.out.println(ParentWindow);
		
		//pageObjectManager=  new PageObjectManager(testContext.driver);
		LendingPage lendingPage = testContext.pageObjectManager.getLendingPage();
		//LendingPage lengingPage= new LendingPage(testContext.driver);
		lendingPage.selectTopDeals();
		//testContext.driver.findElement(By.linkText("Top Deals")).click();
		testContext.genericUtils.switchToChildWindow();
		
		
	}
	@When("Validate the product name in offers page match with lending page")
	public void validate() {
		Assert.assertEquals(offerProName, testContext.productName);
		
	}

}
