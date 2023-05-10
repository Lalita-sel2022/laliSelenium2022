package Test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class TestCase_03 
{
	@Parameters({ "firstname" ,"lastname"})
	@Test
	public void webLoginCarLoan(String username, String lname)
	{
		//selenium
		System.out.println("webLoginCarLoan");
		System.out.println(username);
		System.out.println(lname);
	}
	
	 @Test(groups={"smoke"})
	public void mobileLoginCarLoan()
	{
		//Appium
		System.out.println("mobileLoginCarLoan");
	}
	
	@Test
	public void mobilesighinCarLoan()
	{
		//Appium
		System.out.println("mobileLoginCarLoan");
	}
	
	@Test
	public void mobilesighoutCarLoan()
	{
		//Appium
		System.out.println("mobileLoginCarLoan");
	}
	
	

	@Test(dependsOnMethods= {"webLoginCarLoan"})
	public void loginApiCarLoan()
	{
		//Rest API automation
		System.out.println("loginApiCarLoan");
	}
}
