package Project;

import org.testng.annotations.Test;

public class TestParallel {
  @Test
  public void A() {
	  System.out.println("Execute A method :"+Thread.currentThread().getId());
  }
  
  
  @Test
  public void B() {
	  System.out.println("Execute B method :"+Thread.currentThread().getId());
  }
  
  
  @Test
  public void C() {
	  System.out.println("Execute C method :"+Thread.currentThread().getId());
  }
  
  @Test
  public void D() {
	  System.out.println("Execute D method :"+Thread.currentThread().getId());
  }
  
  @Test
  public void E() {
	  System.out.println("Execute E method :"+Thread.currentThread().getId());
  }  @Test
  public void F() {
	  System.out.println("Execute F method :"+Thread.currentThread().getId());
  }
}
