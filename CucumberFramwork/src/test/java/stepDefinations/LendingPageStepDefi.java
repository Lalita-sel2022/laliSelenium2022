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
import utils.TestContextSetup;

public class LendingPageStepDefi {
	public WebDriver driver;
	String offerProName;
	String productName;
	TestContextSetup testContext;
	public LendingPageStepDefi(TestContextSetup testContext) {
		this.testContext=testContext;
		
	}

	@Given("User is on greenKart lending page")
	public void lendPage() {
		WebDriverManager.chromedriver().setup();
		testContext.driver= new ChromeDriver();//Driver gets the life here
		testContext.driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		}

	@When("^User serach with short name (.+) and get the actual name of product$")
	public void searchProduct() {
		LendingPage lendingPage = testContext.pageObjectManager.getLendingPage();
		lendingPage.serchItem("tom");
		
		//testContext.driver.findElement(By.className("search-keyword")).sendKeys("tom");
		testContext.productName=lendingPage.getProductName().split("-")[0].trim();
		//System.out.println(productName);
		
}


}
