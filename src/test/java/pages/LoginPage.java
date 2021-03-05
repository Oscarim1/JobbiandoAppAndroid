package pages;

import org.openqa.selenium.By;

import appiumTest.BaseTest;

public class LoginPage extends BaseTest{

	By txtCorreo =By.xpath("//*[@text=\"Email\"]");
	By txtContrasena =By.xpath("//*[@text=\"Contraseña\"]");
	By btnEntrar =By.xpath("//*[@text=\"LOGIN\"]");
	
	public void enterCorreo(String correo) 
	{
		driver.findElement(txtCorreo).sendKeys(correo);
	}
	
	public void enterContrasena(String contrasena) 
	{
		driver.findElement(txtContrasena).sendKeys(contrasena);
	}
	
	public void clickEntrar() 
	{
		driver.findElement(btnEntrar).click();
	}
}
