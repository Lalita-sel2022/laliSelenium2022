package Test;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCase_02 {

	
	@BeforeTest
	public void prerequist()
	{
		System.out.println("Before Test :"+"Delete existing data");
	}
	 @Test(groups={"smoke"})
	public void test()
	{
		System.out.println("Hello Lalita");
	}
	
	@BeforeSuite
	public void beforesuite()
	{
		System.out.println("Suite level execution");
	}
	

	
	

}
