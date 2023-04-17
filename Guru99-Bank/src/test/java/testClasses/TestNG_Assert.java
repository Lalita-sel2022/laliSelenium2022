package testClasses;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG_Assert {
  @Test
  public void sum() {
	  int a=10; 
	  int b=30;
	  int c=a+b;
	  System.out.println("Sum is ::"+c);
	  //Assert.assertEquals(c, 40);
	  //System.out.println(c);
  }
}
