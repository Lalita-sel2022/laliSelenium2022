package testClasses;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class TestNG_Group {
  @Test(groups = {"smock-test","regression-test"})
  public void testBMW() {
	  System.out.println("Running test -> BMW");
  }
  @Test
  public void testAudi() {
	  System.out.println("Running test -> Audi");
  }
  @Test(groups = {"smock-test"})
  public void testNinja() {
	  System.out.println("Running test -> Ninja");
  }

  @BeforeClass(alwaysRun = true)
  public void beforeClass() {
	  System.out.println("Run once before the class");
  }

  @AfterClass(alwaysRun = true)
  public void afterClass() {
	  System.out.println("Run once after the class");
  }

}
