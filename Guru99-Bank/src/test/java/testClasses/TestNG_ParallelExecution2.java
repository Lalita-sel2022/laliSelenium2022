package testClasses;

import org.testng.annotations.Test;

public class TestNG_ParallelExecution2 {
	  @Test
	  public void method1() throws InterruptedException {
		  System.out.println("\nTestNG_ParallelExecution2 -> Method1");
		  Thread.sleep(6000);
		  System.out.println("\nTestNG_ParallelExecution2 -> Method1 -> more method");

	  }
	  @Test
	  public void Method2() throws InterruptedException {
		  System.out.println("\nTestNG_ParallelExecution2 -> Method2");
		  Thread.sleep(6000);
		  System.out.println("\nTestNG_ParallelExecution2 -> Method2 -> more method");
	  }
}
