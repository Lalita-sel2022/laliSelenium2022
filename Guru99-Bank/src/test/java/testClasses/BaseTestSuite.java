package testClasses;


import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class BaseTestSuite {
 
  @BeforeClass
  public void beforeClass() {
	  System.out.println("\n BaseTestSuite -> beforeClass");
  }


  @AfterClass
  public void afterClass() {
	  System.out.println("\n BaseTestSuite -> afterClass");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("\n BaseTestSuite -> beforeTest");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("\n BaseTestSuite -> afterTest");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("\n BaseTestSuite -> beforeSuite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("\n BaseTestSuite -> afterSuite");
  }

}
