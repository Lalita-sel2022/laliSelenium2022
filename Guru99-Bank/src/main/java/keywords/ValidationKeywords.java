package keywords;

import com.aventstack.extentreports.Status;

public class ValidationKeywords extends GenericKeywords
{
	public String validateUrl()
	{
		//test.log(Status.INFO, "match url.....");
		
		String actualResult=driver.getCurrentUrl();
		return actualResult;
	}
	
	public String validateTitle()
	{
		//test.log(Status.INFO, "match title.....");
		//Reporting failure
		
		test.log(Status.FAIL, "Title not match");
		
		String actualTitle= driver.getTitle();
		return actualTitle;
		
		
		
	}
	
	public String validateText(String locatorKeys)
	{
		String actualHeading = getElement(locatorKeys).getText();
		return actualHeading;
		
		
		
	}

}
