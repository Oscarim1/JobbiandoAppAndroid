package pages;

import org.openqa.selenium.By;

import appiumTest.BaseTest;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class RegistroPrestadorPage extends BaseTest {
	AppiumDriver<MobileElement> driver=null; 
	By btnQuieroSerJobber = By.linkText("Quiero ser Prestador");
	
	public RegistroPrestadorPage(AppiumDriver<MobileElement> driver) 
	{
		this.driver=driver;
	}
	
	public void clickQuieroSerJobber() {
		driver.findElement(btnQuieroSerJobber).click();
	}
	
	
}

	
	
