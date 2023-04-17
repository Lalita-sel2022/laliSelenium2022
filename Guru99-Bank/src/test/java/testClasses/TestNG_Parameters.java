package testClasses;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNG_Parameters {
	@BeforeClass
	@Parameters({"browser","os"})
	public void setUp(String browser, String os) {
		System.out.println("TestNG_Parameters -> setUp");
		System.out.println("1. Parameters value from xml file :"+browser);
		System.out.println("1. Parameters value from xml file :"+os);

	}

	@Test
	@Parameters({"response"})
	public void method1(String response) {
		System.out.println("TestNG_Parameters -> method1");
		System.out.println("Responce from xml file :"+response);
	}
}
