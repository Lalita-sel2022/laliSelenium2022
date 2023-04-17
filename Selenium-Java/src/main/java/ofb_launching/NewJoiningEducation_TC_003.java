package ofb_launching;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewJoiningEducation_TC_003 
{

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://122.161.199.201:9090/group/comnet2/home?p_p_id=com_adjecti_pis_liferay_PISMVCPortlet_INSTANCE_p5BPx7EBhJaa&p_p_lifecycle=0&p_p_state=normal&p_p_mode=view&_com_adjecti_pis_liferay_PISMVCPortlet_INSTANCE_p5BPx7EBhJaa_formFlowClass=com.adjecti.pis.liferay.form.JoiningProcessFlowForm&_com_adjecti_pis_liferay_PISMVCPortlet_INSTANCE_p5BPx7EBhJaa_mvcPath=%2Fcomponents%2Fform%2Fmulti-step-form-flow.jsp&_com_adjecti_pis_liferay_PISMVCPortlet_INSTANCE_p5BPx7EBhJaa_formFlowClassPK=4102&_com_adjecti_pis_liferay_PISMVCPortlet_INSTANCE_p5BPx7EBhJaa_tabIndex=2");
		driver.findElement(By.id("_com_liferay_login_web_portlet_LoginPortlet_login")).clear();
		driver.findElement(By.id("_com_liferay_login_web_portlet_LoginPortlet_login")).sendKeys("abhishek.testing@ayudh.net");
		driver.findElement(By.xpath("//div[@class='form-group input-text-wrapper']/input[@class='field form-control']")).sendKeys("Abhishek");
		driver.findElement(By.className("lfr-btn-label")).click();
	}

}
