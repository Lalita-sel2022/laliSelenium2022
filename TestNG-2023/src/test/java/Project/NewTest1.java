package Project;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewTest1 {
  @Test
  public void f() throws IOException {
	  
	  WebDriverManager.firefoxdriver().setup();
	  WebDriver driver= new FirefoxDriver();
	  driver.manage().window().maximize();
	  
	  driver.get("https://www.amazon.in/");
	  driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Harrey Porter");
	  
	  File fileSrc = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  org.openqa.selenium.io.FileHandler.copy(fileSrc, new File("C:\\Users\\DELL\\Desktop\\Screenshot\\ama1.png"));
	  
	  //FileHandler.copy(src, new File("C:\\Users\\DELL\\Desktop\\Screenshot"));
	  
  }
}
