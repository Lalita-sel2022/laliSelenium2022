package Test;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;
import com.beust.jcommander.Parameters;

public class TestCase_01 
{

	
	
    @AfterClass
    public void afterclass()
    {
		System.out.println("It will execute after the class");
	}
	    @Test(groups={"smoke"})
		public void demo1()
		{
			System.out.println("Hello");
			
		}
	    
	    @BeforeMethod
	    public void beforemethod()
	    {
	    	System.out.println("Execute before the method");
	    }
       
		@AfterMethod
		 public void aftermethod()
		{
			System.out.println(" Execute after method");
		}
        
		
        @Test
		public void demo()
		{
			System.out.println("Bye");
		
		}
		
        @BeforeClass
        public void beforeclass()
        {
			System.out.println("It will execute before the class");
		}
        
	
		
	}


