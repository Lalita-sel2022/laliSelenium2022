package ofb_launching;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MyRequest_TC_02 {
	

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		driver.get("http://122.161.199.201:9090/group/comnet2/home");
		driver.findElement(By.id("_com_liferay_login_web_portlet_LoginPortlet_login")).clear();
		driver.findElement(By.id("_com_liferay_login_web_portlet_LoginPortlet_login")).sendKeys("Test@liferay.com");
		driver.findElement(By.xpath("//div[@class='form-group input-text-wrapper']/input[@class='field form-control']")).sendKeys("test");
		driver.findElement(By.className("lfr-btn-label")).click();
		driver.findElement(By.xpath("//h4[text()='My Requests']")).click();
		
		WebElement element = driver.findElement(By.xpath("//select[@name='_com_adjecti_pis_liferay_PISMVCPortlet_INSTANCE_p5BPx7EBhJaa_MyRequestForm_123456dataTable_length']"));
		Select dropdown= new Select(element);
		//Thread.sleep(2000);
		//dropdown.deselectByIndex(1);
		dropdown.selectByIndex(0);
		System.out.println(dropdown.getFirstSelectedOption().getText());
		driver.findElement(By.xpath("(//i[@class='fas fa-eye'])[7]")).click();
		//System.out.println(driver.findElement(By.xpath("//span[@class='select2-selection__clear']")).getText());
		Thread.sleep(2000);
		//driver.navigate().back();
		WebElement ele = driver.findElement(By.xpath("//span[@class='select2-selection__rendered']"));
		//driver.findElement(By.cssSelector("button[id='yui_patched_v3_18_1_1_1661148305100_2736'] svg")).click();
		if(ele.isDisplayed())
		{
			System.out.println(driver.findElement(By.xpath("//div[@class='form-group input-select-wrapper']/span")).getText());
		}
		else
		{
			System.out.println("Not found element");
		}
	
	
		

	}

}
