package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import appiumtests.AppiumTest;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class RegistroPrestadorPage extends AppiumTest {
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

	
	
