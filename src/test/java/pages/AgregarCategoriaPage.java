package pages;
import org.openqa.selenium.By;

import appiumTest.BaseTest;
import io.appium.java_client.MobileElement;

public class AgregarCategoriaPage extends BaseTest {
	MobileElement elemento=null; 
	By btnAgregar=By.xpath("");
	By btnAgregarCategoria=By.xpath("");
	
	public AgregarCategoriaPage(MobileElement elemento) 
	{
		this.elemento=elemento;
	}
	
	public void clickAgregar() {
		driver.findElement(btnAgregar).click();
		
	}
	public void clickAgregarCategoria() {
		driver.findElement(btnAgregarCategoria).click();
	}
	
}
