package ofb_launching;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Launch_OFBUrl
{

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		driver.get("http://122.161.199.201:9090/group/comnet2/home");
		//driver.navigate().refresh();
		//System.out.println(driver.getTitle());
		//System.out.println(driver.getCurrentUrl());
		driver.findElement(By.id("_com_liferay_login_web_portlet_LoginPortlet_login")).clear();
		driver.findElement(By.id("_com_liferay_login_web_portlet_LoginPortlet_login")).sendKeys("Test@liferay.com");
		//driver.findElement(By.id("_com_lif eray_login_web_portlet_LoginPortlet_password")).sendKeys("test");
		driver.findElement(By.xpath("//div[@class='form-group input-text-wrapper']/input[@class='field form-control']")).sendKeys("test");
		//Assert.assertEquals("test", "test");
		driver.findElement(By.className("lfr-btn-label")).click();
		//driver.findElement(By.xpath("//span[contains(text(),'Master Data')]")).click();
		//driver.findElement(By.xpath("(//span[@class='title ml-2'])[3]")).click();
		driver.findElement(By.xpath("(//div/a/p)[13]")).click();
		//driver.navigate().to(driver.getCurrentUrl());
		
		driver.findElement(By.xpath("(//i[@class='fas fa-edit'])[3]")).click();
		System.out.println(driver.findElement(By.xpath("(//span[@class='select2-selection__rendered'])[1]")).getText());
	
		String inputName[]={"firstName_En","middleName_En","lastName_En","color","identificationMark"};
		for(String name:inputName) {
			driver.findElement(By.xpath("//input[@id='_com_adjecti_pis_liferay_PISMVCPortlet_INSTANCE_p5BPx7EBhJaa_"+name+"']")).clear();
		}
		
		
		driver.findElement(By.xpath("//div[@class='btn-group-item']/input")).click();
		try {
			driver.findElement(By.xpath("(//span[@class='select2-selection__rendered'])[1]")).sendKeys("xyz");
		}catch(Exception e){
			System.out.println("can not enter value in dropdown");
		}

		

	}

}
