package Project;

import org.testng.annotations.Test;

public class NewTest {

	@Test(priority=3)
	public void f() {
		System.out.println("..F..");
	}
	@Test(priority=1, enabled=false)
	public void j() {
		System.out.println("..J..");
	}
	@Test(priority=2)
	public void i() {
		System.out.println("..I..");
	}
}
