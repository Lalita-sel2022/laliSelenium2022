package Test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestCase_04 
{
	@Test
	public void webLoginHomeLoan()
	{
		//selenium
		System.out.println("webLoginHomeLoan");
	}
	
	 @Test(groups={"smoke"})
	public void mobileLoginHomeLoan()
	{
		//Appium
		System.out.println("mobileLoginHomeLoan");
	}

	@Test(dataProvider="getData")
	public void loginApiHomeLoan(String uname, String pass)
	{
		//Rest API automation
		System.out.println("loginApiHomeLoan");
		System.out.println(uname);
		System.out.println(pass);
	}
	
	@AfterTest
	public void afterdelete()
	{
		System.out.println("After test :"+"Delete all cookies" );
	}
	
	@AfterSuite
	public void aftersuite()
	{
		System.out.println("Suite level execution");
	}
	
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data= new Object[3][2];
		data[0][0]="lalitasaini";
		data[0][1]="password";
		data[1][0]="@dainy";
		data[1][1]="password";
		data[2][0]="123";
		data[2][1]="pass";
		return data;
	}
	
}
