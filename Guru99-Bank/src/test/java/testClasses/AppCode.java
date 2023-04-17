package testClasses;

import org.testng.annotations.Test;

import switching.FrameSwitching;

public class AppCode {
  @Test
  public void testMethod1() {
	  //Create object of another class & access methods
	  FrameSwitching fw= new FrameSwitching();
	 // fw.enterText("Lalita");
	  System.out.println("Test method1");
  }
  
  @Test
  public void testMethod2() {
	  System.out.println("Test method2");
  }
  @Test
  public void testMethod3() {
	  System.out.println("Test method3");
  }
}
