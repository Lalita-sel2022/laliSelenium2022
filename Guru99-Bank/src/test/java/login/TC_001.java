package login;

import java.io.IOException;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

public class TC_001 extends BaseTest
{
	@Test//dataProvider ="LoginData"
	public void login() throws IOException
	{
		
		
		
		//Reporter.log("Login to guru99 bank");
		 //test.log(Status.INFO, "Login to guru99......");
		app.log("Login to guru99 bank");
		app.openBrowser("chromebrowser");
		app.navigateUrl("guru99bankurl");
		//Report failer
		
		
		app.type("userID_name", "guru99username");
		app.failureReport("Password is not coreect");
		app.type("pass_name", "pass");
		app.click("loginbutton_name");
		
		String actualHeading = app.validateText("sucess_classname");
		String expectredHeading = "Welcome To Manager's Page of Guru99 Bank";
		Assert.assertEquals(actualHeading, expectredHeading, "Login Pass");
		
		app.assertAll();
	}
	
	@Test
	public void matchUrl()
	{
		//test.log(Status.INFO, "Matching url......");
		app.log("Matching url......");
		String expectedUrl="https://www.demo.guru99.com/V4/manager/Managerhomepage.php";
	    String actualUrl=app.validateUrl();
		Assert.assertEquals(actualUrl, expectedUrl);
	}
	
	@Test
	public void matchTitle() throws IOException
	{
		//test.log(Status.INFO, "Matching title......");
		//app.log("Matching title......");
		//app.assertAll();
		app.failureReport("Matching title......");
		String expectedTitle="Guru99 Bank Manager HomePage";
		String actualTitle = app.validateTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
	}
	
	
	/*
	 * @DataProvider(name="LoginData") public String[][] getDate() { String
	 * loginData[][] ={ {"mngr453891","zyvegEh"}, {"invadmin","zyvegEh"},
	 * {"mngr453891","pass"}, {"invadmin","pass"} }; return loginData;
	 * 
	 * }
	 */
	 

}
