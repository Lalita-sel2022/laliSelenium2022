package ofb_launching;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MyRequest_TC_03 
{

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(4000, TimeUnit.SECONDS);
		driver.get("http://122.161.199.201:9090/group/comnet2/home");
		driver.findElement(By.id("_com_liferay_login_web_portlet_LoginPortlet_login")).clear();
		driver.findElement(By.id("_com_liferay_login_web_portlet_LoginPortlet_login")).sendKeys("Test@liferay.com");
		driver.findElement(By.xpath("//div[@class='form-group input-text-wrapper']/input[@class='field form-control']")).sendKeys("test");
		driver.findElement(By.className("lfr-btn-label")).click();
		driver.findElement(By.xpath("//h4[text()='My Requests']")).click();
		System.out.println(driver.findElement(By.id("_com_adjecti_pis_liferay_PISMVCPortlet_INSTANCE_p5BPx7EBhJaa_MyRequestForm_123456add")).getText()); 
		driver.findElement(By.id("_com_adjecti_pis_liferay_PISMVCPortlet_INSTANCE_p5BPx7EBhJaa_MyRequestForm_123456add")).click();
	}

}
