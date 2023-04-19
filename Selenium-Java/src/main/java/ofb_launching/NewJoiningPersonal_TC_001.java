package ofb_launching;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewJoiningPersonal_TC_001 
{


	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://122.161.199.201:9090/group/comnet2/home");
		driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);
		driver.findElement(By.id("_com_liferay_login_web_portlet_LoginPortlet_login")).clear();
		driver.findElement(By.id("_com_liferay_login_web_portlet_LoginPortlet_login")).sendKeys("abhishek.testing@ayudh.net");
		driver.findElement(By.xpath("//div[@class='form-group input-text-wrapper']/input[@class='field form-control']")).sendKeys("Abhishek");
		driver.findElement(By.className("lfr-btn-label")).click();
		//Assert.assertEquals(driver.findElement(By.xpath("//span[text()=' Welcome Test Test '])[1]")), "Welcome Test Test");
		
		driver.findElement(By.xpath("//h4[text()='New Joining']")).click();
		
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.xpath("//a[@class='text-white float-right']")).getText());
		
		driver.findElement(By.xpath("//a[@class='text-white float-right']")).click();
		//Thread.sleep(2000);
		//WebDriverWait wait= new WebDriverWait(driver, 3);
		//wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("_com_adjecti_pis_liferay_PISMVCPortlet_INSTANCE_p5BPx7EBhJaa_PeopleForm_123456profileImageId_file")));
		
		//WebElement file = driver.findElement(By.id("_com_adjecti_pis_liferay_PISMVCPortlet_INSTANCE_p5BPx7EBhJaa_PeopleForm_123456profileImageId_file"));
		//file.sendKeys("C:\\Users\\DELL\\Pictures\\Sneaker\\hung_360.png");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//span[text()='Select an option'])[1]")).click();
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//li[text()='Dr']")).click();
		driver.findElement(By.id("_com_adjecti_pis_liferay_PISMVCPortlet_INSTANCE_p5BPx7EBhJaa_firstName_En")).sendKeys("Mohit");
		driver.findElement(By.id("_com_adjecti_pis_liferay_PISMVCPortlet_INSTANCE_p5BPx7EBhJaa_middleName_En")).sendKeys("Kumar");
		driver.findElement(By.id("_com_adjecti_pis_liferay_PISMVCPortlet_INSTANCE_p5BPx7EBhJaa_lastName_En")).sendKeys("Saini");
		driver.findElement(By.id("_com_adjecti_pis_liferay_PISMVCPortlet_INSTANCE_p5BPx7EBhJaa_fatherName_En")).sendKeys("Punit Raghav");
		//Thread.sleep(2000);
		//new =WebDriverWait(driver, Duration.ofSeconds(2000))
		//driver.findElement(By.id("_com_adjecti_pis_liferay_PISMVCPortlet_INSTANCE_p5BPx7EBhJaa_dateOfBirthHelper")).click();
		WebElement date = driver.findElement(By.cssSelector("#_com_adjecti_pis_liferay_PISMVCPortlet_INSTANCE_p5BPx7EBhJaa_dateOfBirth"));
		date.sendKeys("09072004");
		date.sendKeys(Keys.TAB);
		//date.click();
		driver.findElement(By.className("select2-selection__placeholder")).click();
		driver.findElement(By.className("select2-results__option")).click();
		driver.findElement(By.className("select2-selection__placeholder")).click();
		//driver.findElement(By.id("select2-_com_adjecti_pis_liferay_PISMVCPortlet_INSTANCE_p5BPx7EBhJaa_PeopleForm_123456maritalStatusId-result-1ys1-2")).click();
		driver.findElement(By.xpath("//li[text()='Single']")).click();
		
		driver.findElement(By.className("select2-selection__placeholder")).click();
		driver.findElement(By.xpath("//li[text()='GENERAL']")).click();
		
		driver.findElement(By.className("select2-selection__placeholder")).click();
		driver.findElement(By.xpath("//li[text()='Christian']")).click();
		
		driver.findElement(By.xpath("//span[@id='select2-_com_adjecti_pis_liferay_PISMVCPortlet_INSTANCE_p5BPx7EBhJaa_PeopleForm_123456citizenshipId-container']")).click();
		driver.findElement(By.className("select2-search__field")).sendKeys("ind");
		//driver.findElement(By.xpath("//li[text()='india']")).click();
		Thread.sleep(2000);
		List<WebElement> elements = driver.findElements(By.xpath("//li[@role='option']"));
		
		for(WebElement opt:elements)
		{
			//System.out.println(opt.getText());
			
			  if(opt.getText().equalsIgnoreCase("india")) 
			  { 
				  //System.out.println("Select india");
				  opt.click();
				  break;
			  }
			 
		}
		
		driver.findElement(By.id("select2-_com_adjecti_pis_liferay_PISMVCPortlet_INSTANCE_p5BPx7EBhJaa_PeopleForm_123456bloodGroupId-container")).click();
		driver.findElement(By.xpath("//li[text()='A+']")).click();
		
		driver.findElement(By.id("_com_adjecti_pis_liferay_PISMVCPortlet_INSTANCE_p5BPx7EBhJaa_aadhaarNo")).sendKeys("123456789812");
		driver.findElement(By.id("_com_adjecti_pis_liferay_PISMVCPortlet_INSTANCE_p5BPx7EBhJaa_panNo")).sendKeys("ghytu1234u");
		
		
	
		//Thread.sleep(5000);
		WebElement file1 = driver.findElement(By.id("_com_adjecti_pis_liferay_PISMVCPortlet_INSTANCE_p5BPx7EBhJaa_PeopleForm_123456identityProofId_file"));
		 //System.out.println(file.getText());
		 
		
		file1.sendKeys("C:\\Users\\DELL\\Pictures\\Sneaker\\hung_360.png");
		Thread.sleep(2000);
	
		 driver.findElement(By.cssSelector("input[class*='action-button-next']")).click();
	    
	     //@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
	     //Permanent Address form
		
		  Thread.sleep(2000); driver.findElement(By.id(
		  "_com_adjecti_pis_liferay_PISMVCPortlet_INSTANCE_p5BPx7EBhJaa_addressLine1"))
		  .sendKeys("Sector 63"); driver.findElement(By.id(
		  "_com_adjecti_pis_liferay_PISMVCPortlet_INSTANCE_p5BPx7EBhJaa_addressLine2"))
		  .sendKeys("H-102 Upper Floor"); driver.findElement(By.id(
		  "_com_adjecti_pis_liferay_PISMVCPortlet_INSTANCE_p5BPx7EBhJaa_city")).
		  sendKeys("Noida"); driver.findElement(By.xpath(
		  "(//span[@class='select2-selection__rendered'])[1]")).click();
		  //driver.switchTo().alert().accept();
		  driver.findElement(By.xpath("//li[text()='Uttar Pradesh']")).click();
		  
		  Thread.sleep(2000); driver.findElement(By.id(
		  "select2-_com_adjecti_pis_liferay_PISMVCPortlet_INSTANCE_p5BPx7EBhJaa_PermanentAddressForm_123456districtId-container"
		  )).click(); driver.findElement(By.xpath("//li[text()='Meerut']")).click();
		  
		  driver.findElement(By.id(
		  "select2-_com_adjecti_pis_liferay_PISMVCPortlet_INSTANCE_p5BPx7EBhJaa_PermanentAddressForm_123456countryId-container"
		  )).click();
		  driver.findElement(By.xpath("//input[@class='select2-search__field']")).
		  sendKeys("Ind"); 
		  //System.out.println(driver.findElement(By.xpath("//li[@class='select2-results__option select2-results__option--highlighted']")).getAttribute("class")); 
		  Thread.sleep(2000); 
		  List<WebElement> options =
		  driver.findElements(By.xpath("//li[@role='option']")); 
		  for(WebElement option:options) 
		  { 
			  if(option.getText().equalsIgnoreCase("india"))
			  {
		  option.click(); 
		  break;
		  }
			  }
		  
		  driver.findElement(By.id("_com_adjecti_pis_liferay_PISMVCPortlet_INSTANCE_p5BPx7EBhJaa_pinCode")).
		  sendKeys("201304");
		  
		  //driver.findElement(By.id("select2-_com_adjecti_pis_liferay_PISMVCPortlet_INSTANCE_p5BPx7EBhJaa_PermanentAddressForm_123456accomodationTypeId-container")).click();
		   driver.findElement(By.xpath("//span[@title='RentedHouse']")).click();
		  driver.findElement(By.xpath("(//li[text()='RentedHouse']")).click();
		  
		  WebElement ele = driver.findElement(By.xpath("(//input[@type='file'])[1]"));
		  ele.sendKeys("C:\\Users\\DELL\\Pictures\\Sneaker\\hung_360.png");
		  
		  ///////////////////////////////////////////////////////////////////////////////////////// 
		  //Residence Address form
		  Thread.sleep(2000);
		  //WebElement parent = driver.findElement(By.className("container container-residenceaddressform_123456"));
		  driver.findElement(By.xpath(
		  "(//input[@id='_com_adjecti_pis_liferay_PISMVCPortlet_INSTANCE_p5BPx7EBhJaa_addressLine1'])[2]"
		  )).sendKeys("SatabadiNagar"); driver.findElement(By.xpath(
		  "(//input[@id='_com_adjecti_pis_liferay_PISMVCPortlet_INSTANCE_p5BPx7EBhJaa_addressLine2'])[2]"
		  )).sendKeys("H-102 Upper Floor"); driver.findElement(By.xpath(
		  "(//input[@id='_com_adjecti_pis_liferay_PISMVCPortlet_INSTANCE_p5BPx7EBhJaa_city'])[2]"
		  )).sendKeys("Meerut");
		  driver.findElement(By.xpath("(//span[@role='combobox'])[5]")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//li[text()='Uttar Pradesh']")).click();
		  
		  driver.findElement(By.xpath(
		  "//span[@id='select2-_com_adjecti_pis_liferay_PISMVCPortlet_INSTANCE_p5BPx7EBhJaa_ResidenceAddressForm_123456districtId-container']"
		  )).click(); driver.findElement(By.xpath("//li[text()='Meerut']")).click();
		  
		  
		  driver.findElement(By.id(
		  "select2-_com_adjecti_pis_liferay_PISMVCPortlet_INSTANCE_p5BPx7EBhJaa_ResidenceAddressForm_123456countryId-container"
		  )).click();
		  driver.findElement(By.xpath("//input[@class='select2-search__field']")).
		  sendKeys("Ind"); 
		  //System.out.println(driver.findElement(By.xpath("//li[@class='select2-results__option select2-results__option--highlighted']")).getAttribute("class")); 
		  Thread.sleep(2000);
		  List<WebElement> option =
		  driver.findElements(By.xpath("//li[@role='option']")); 
		  for(WebElement options1:option)
		  { if(options1.getText().equalsIgnoreCase("india")) {
		  options1.click(); break; } }
		  
		  driver.findElement(By.xpath(
		  "(//input[@id='_com_adjecti_pis_liferay_PISMVCPortlet_INSTANCE_p5BPx7EBhJaa_pinCode'])[2]"
		  )).sendKeys("250403");
		  
		  driver.findElement(By.id(
		  "select2-_com_adjecti_pis_liferay_PISMVCPortlet_INSTANCE_p5BPx7EBhJaa_PermanentAddressForm_123456accomodationTypeId-container"
		  )).click(); 
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("(//span[text()='OwnHouse'])[2]")).click();
		  
		  WebElement ele1 = driver.findElement(By.xpath("(//input[@type='file'])[2]"));
		  ele1.sendKeys("C:\\Users\\DELL\\Pictures\\Sneaker\\hung_360.png");
		  
		  Thread.sleep(3000);
		 driver.findElement(By.cssSelector("input[class*='action-button-next']")). click();
		 

	}

}
