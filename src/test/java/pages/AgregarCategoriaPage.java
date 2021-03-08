package pages;
import org.openqa.selenium.By;

import appiumTest.BaseTest;
import io.appium.java_client.MobileElement;

public class AgregarCategoriaPage extends BaseTest {
	MobileElement elemento=null; 
	By btnAgregar=By.xpath("");
	By btnAgregarCategoria=By.xpath("");
	By txtCorreo =By.xpath("//*[@text=\"Email\"]");
	By txtContrasena =By.xpath("//*[@text=\"Contraseña\"]");
	By btnEntrar =By.xpath("//*[@text=\"LOGIN\"]");
	public AgregarCategoriaPage(MobileElement elemento) 
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
	
	public void clickEntrar() 
	{
		driver.findElement(btnEntrar).click();
	}
	
	public void clickAgregar() {
		driver.findElement(btnAgregar).click();
		
	}
	public void clickAgregarCategoria() {
		driver.findElement(btnAgregarCategoria).click();
	}
	
}
