package verifications;

import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import launching.BaseTest;

public class Verify3 extends BaseTest
{

	public static void main(String[] args) throws Exception 
	{
		init();
		launcher("chromebrowser");
        navigateUrl("amazonurl");
		
		
		String expectResult="Customer Service";
		
		if(isActualResult(expectResult)) 
		{
			reportSuccess("Both links are equal..");
			//System.out.println("Both links are equal..");
		}
		else
		{
			reportFail("Both links are not equal..");
			//System.out.println("Both links are not equal..");
		}
		rep.flush();

	}



	

}
