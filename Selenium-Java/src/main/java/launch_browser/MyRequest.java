package launch_browser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MyRequest
{

	public static void main(String[] args) throws InterruptedException
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
		
		WebElement element = driver.findElement(By.xpath("//select[@name='_com_adjecti_pis_liferay_PISMVCPortlet_INSTANCE_p5BPx7EBhJaa_MyRequestForm_123456dataTable_length']"));
		Select dropdown= new Select(element);
		Thread.sleep(2000);
		//dropdown.deselectByIndex(1);
		dropdown.selectByIndex(0);
		System.out.println(dropdown.getFirstSelectedOption().getText());
		
		/*
		 * System.out.println(driver.findElement(By.id(
		 * "_com_adjecti_pis_liferay_PISMVCPortlet_INSTANCE_p5BPx7EBhJaa_MyRequestForm_123456add"
		 * )).getText()); driver.findElement(By.id(
		 * "_com_adjecti_pis_liferay_PISMVCPortlet_INSTANCE_p5BPx7EBhJaa_MyRequestForm_123456add"
		 * )).click();
		 * 
		 * System.out.println(driver.findElement(By.
		 * xpath("//span[text()='Select an option']")).getText());
		 * 
		 * driver.findElement(By.id(
		 * "select2-_com_adjecti_pis_liferay_PISMVCPortlet_INSTANCE_p5BPx7EBhJaa_MyRequestForm_123456serviceRequestTypeId-container"
		 * )).click();
		 * System.out.println(driver.findElement(By.xpath("//span/ul/li[2]")).getText())
		 * ; driver.findElement(By.xpath("//span/ul/li[2]")).click();
		 * driver.findElement(By.xpath("//div/textarea")).sendKeys("XYZ");
		 * driver.findElement(By.className("lfr-btn-label")).click();
		 */
        driver.findElement(By.xpath("(//i[@class='fas fa-eye'])[4]")).click();
		

	}

}
