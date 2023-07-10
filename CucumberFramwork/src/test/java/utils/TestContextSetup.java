package utils;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import pageObject.PageObjectManager;

public class TestContextSetup {
	public WebDriver driver;
   public String productName;
   public PageObjectManager pageObjectManager;
   public BaseClass baseclass;
   public GenericUtils genericUtils;
   
   public TestContextSetup() throws IOException {
	   baseclass= new BaseClass();
	   pageObjectManager= new PageObjectManager(baseclass.driverManger());
	   genericUtils = new GenericUtils(baseclass.driverManger());
	   
   }

}
