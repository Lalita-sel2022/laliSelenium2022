package testClasses;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import keywords.TestDataProvider;

public class TestNG_DataProviders {
  @Test(dataProvider ="data", dataProviderClass = TestDataProvider.class)
  public void testmethod(String name, String roll) {
	  System.out.println("\n TestNG_DataProviders -> testmethod");
	  System.out.println("Name is :"+name);
	  System.out.println("Roll number is :"+roll);
  }
  }
