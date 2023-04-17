package testClasses;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestNG_Softassert {
 
  @Test
  public void sum() {
	  SoftAssert sa= new SoftAssert();
	  int a=10; 
	  int b=30;
	  int c=a+b;
	  System.out.println("Sum is ::"+c);
	  //Assert.assertEquals(c, 40);
	  sa.assertEquals(c, 20);
	  //After fail condition, SoftAssert will continue execution of the program
	  System.out.println("The sum of two no is ::"+c);
	  //AssertAll statement figure out any assert fail from test method, this statement fail the asserts
	  sa.assertAll();
  }
}
