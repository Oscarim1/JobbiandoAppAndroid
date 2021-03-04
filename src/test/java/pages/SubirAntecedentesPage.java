package pages;
import org.openqa.selenium.By;

import appiumTest.BaseTest;
import io.appium.java_client.MobileElement;

public class SubirAntecedentesPage extends BaseTest {

	MobileElement elemento=null; 
	
	By txtCorreo =By.xpath("//*[@text=\"Email\"]");
	By txtContrasena =By.xpath("//*[@text=\"Contraseña\"]");
	//By btnEntrar =By.xpath(null);
	
	public SubirAntecedentesPage(MobileElement elemento) 
	{
		this.elemento=elemento;
	}
	
	public void enterCorreo(String correo) 
	{
		driver.findElement(txtCorreo).sendKeys(correo);
	}
	
	public void enterContrasena(String contrasena) 
	{
		driver.findElement(txtContrasena).sendKeys(contrasena);
	}
	/*
	public void clickEntrar() 
	{
		driver.findElement(btnEntrar).click();
	}*/
	
}
