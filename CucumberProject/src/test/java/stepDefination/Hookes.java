package stepDefination;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hookes {
	@Before("@MobileTest")
	public void beforeValidation()
	{
		System.out.println("Mobile before hook");
		
	}
	
	@After()
	public void afterValidation()
	{
		System.out.println("Mobile after hook");
		
	}

	@Before("@WebTest")
	public void webValidation()
	{
		System.out.println("Mobile before hook");
		
	}
	
	@After("@WebTest")
	public void webtestValidation()
	{
		System.out.println("Mobile after hook");
		
	}
}
