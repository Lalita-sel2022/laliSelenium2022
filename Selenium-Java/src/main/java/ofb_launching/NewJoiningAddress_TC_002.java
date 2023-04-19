package ofb_launching;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewJoiningAddress_TC_002 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://122.161.199.201:9090/group/comnet2/home?p_p_id=com_adjecti_pis_liferay_PISMVCPortlet_INSTANCE_p5BPx7EBhJaa&p_p_lifecycle=0&p_p_state=normal&p_p_mode=view&_com_adjecti_pis_liferay_PISMVCPortlet_INSTANCE_p5BPx7EBhJaa_formFlowClass=com.adjecti.pis.liferay.form.JoiningProcessFlowForm&_com_adjecti_pis_liferay_PISMVCPortlet_INSTANCE_p5BPx7EBhJaa_mvcPath=%2Fcomponents%2Fform%2Fmulti-step-form-flow.jsp&_com_adjecti_pis_liferay_PISMVCPortlet_INSTANCE_p5BPx7EBhJaa_formFlowClassPK=4102&_com_adjecti_pis_liferay_PISMVCPortlet_INSTANCE_p5BPx7EBhJaa_tabIndex=1");
		driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		driver.findElement(By.id("_com_liferay_login_web_portlet_LoginPortlet_login")).clear();
		driver.findElement(By.id("_com_liferay_login_web_portlet_LoginPortlet_login")).sendKeys("abhishek.testing@ayudh.net");
		driver.findElement(By.xpath("//div[@class='form-group input-text-wrapper']/input[@class='field form-control']")).sendKeys("Abhishek");
		driver.findElement(By.className("lfr-btn-label")).click();
		////driver.findElement(By.xpath("//h4[text()='New Joining']")).click();
	   // Thread.sleep(2000);
		//System.out.println(driver.findElement(By.xpath("//a[@class='text-white float-right']")).getText());
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//a[@class='text-white float-right']")).click();
		driver.findElement(By.id("_com_adjecti_pis_liferay_PISMVCPortlet_INSTANCE_p5BPx7EBhJaa_addressLine1")).sendKeys("Sector 63");
		driver.findElement(By.id("_com_adjecti_pis_liferay_PISMVCPortlet_INSTANCE_p5BPx7EBhJaa_addressLine2")).sendKeys("H-102 Upper Floor");
		driver.findElement(By.id("_com_adjecti_pis_liferay_PISMVCPortlet_INSTANCE_p5BPx7EBhJaa_city")).sendKeys("Noida");
		driver.findElement(By.xpath("(//span[@class='select2-selection__rendered'])[1]")).click();
		//driver.switchTo().alert().accept();
	    driver.findElement(By.xpath("//li[text()='Uttar Pradesh']")).click();
	   
	    Thread.sleep(2000);
	    driver.findElement(By.id("select2-_com_adjecti_pis_liferay_PISMVCPortlet_INSTANCE_p5BPx7EBhJaa_PermanentAddressForm_123456districtId-container")).click();
	    driver.findElement(By.xpath("//li[text()='Meerut']")).click();
	    
	    driver.findElement(By.id("select2-_com_adjecti_pis_liferay_PISMVCPortlet_INSTANCE_p5BPx7EBhJaa_PermanentAddressForm_123456countryId-container")).click();
	    driver.findElement(By.xpath("//input[@class='select2-search__field']")).sendKeys("Ind");
	    //System.out.println(driver.findElement(By.xpath("//li[@class='select2-results__option select2-results__option--highlighted']")).getAttribute("class"));
        Thread.sleep(2000);
	    List<WebElement> options = driver.findElements(By.xpath("//li[@role='option']"));
	    for(WebElement option:options)
	    {
	    	if(option.getText().equalsIgnoreCase("india"))
	    	{
	    		option.click();
	    		break;
	    	}
	    }
	    
	    driver.findElement(By.id("_com_adjecti_pis_liferay_PISMVCPortlet_INSTANCE_p5BPx7EBhJaa_pinCode")).sendKeys("201304");
	    
	    driver.findElement(By.id("select2-_com_adjecti_pis_liferay_PISMVCPortlet_INSTANCE_p5BPx7EBhJaa_PermanentAddressForm_123456accomodationTypeId-container")).click();
	    driver.findElement(By.xpath("//li[text()='OwnHouse']")).click();
	    
	    WebElement ele = driver.findElement(By.xpath("(//input[@type='file'])[1]"));
	    ele.sendKeys("C:\\Users\\DELL\\Pictures\\Sneaker\\hung_360.png");
	    
	    /////////////////////////////////////////////////////////////////////////////////////////
	    Thread.sleep(2000);
        //WebElement parent = driver.findElement(By.className("container container-residenceaddressform_123456"));
        driver.findElement(By.xpath("(//input[@id='_com_adjecti_pis_liferay_PISMVCPortlet_INSTANCE_p5BPx7EBhJaa_addressLine1'])[2]")).sendKeys("SatabadiNagar");
		driver.findElement(By.xpath("(//input[@id='_com_adjecti_pis_liferay_PISMVCPortlet_INSTANCE_p5BPx7EBhJaa_addressLine2'])[2]")).sendKeys("H-102 Upper Floor");
		driver.findElement(By.xpath("(//input[@id='_com_adjecti_pis_liferay_PISMVCPortlet_INSTANCE_p5BPx7EBhJaa_city'])[2]")).sendKeys("Meerut");
	    driver.findElement(By.xpath("(//span[@role='combobox'])[5]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//li[text()='Uttar Pradesh']")).click();
	    
	    driver.findElement(By.xpath("//span[@id='select2-_com_adjecti_pis_liferay_PISMVCPortlet_INSTANCE_p5BPx7EBhJaa_ResidenceAddressForm_123456districtId-container']")).click();
	    driver.findElement(By.xpath("//li[text()='Meerut']")).click();
	    
	    
	    driver.findElement(By.id("select2-_com_adjecti_pis_liferay_PISMVCPortlet_INSTANCE_p5BPx7EBhJaa_ResidenceAddressForm_123456countryId-container")).click();
	    driver.findElement(By.xpath("//input[@class='select2-search__field']")).sendKeys("Ind");
	    //System.out.println(driver.findElement(By.xpath("//li[@class='select2-results__option select2-results__option--highlighted']")).getAttribute("class"));
        Thread.sleep(2000);
	    List<WebElement> option = driver.findElements(By.xpath("//li[@role='option']"));
	    for(WebElement options1:option)
	    {
	    	if(options1.getText().equalsIgnoreCase("india"))
	    	{
	    		options1.click();
	    		break;
	    	}
	    }
	    
	    driver.findElement(By.xpath("(//input[@id='_com_adjecti_pis_liferay_PISMVCPortlet_INSTANCE_p5BPx7EBhJaa_pinCode'])[2]")).sendKeys("250403");
	    
	    driver.findElement(By.id("select2-_com_adjecti_pis_liferay_PISMVCPortlet_INSTANCE_p5BPx7EBhJaa_PermanentAddressForm_123456accomodationTypeId-container")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//li[text()='OwnHouse']")).click();
	    
	    WebElement ele1 = driver.findElement(By.xpath("(//input[@type='file'])[2]"));
	    ele1.sendKeys("C:\\Users\\DELL\\Pictures\\Sneaker\\hung_360.png");
	    
	    Thread.sleep(3000);
	    driver.findElement(By.cssSelector("input[class*='action-button-next']")).click();
	    
	}

}