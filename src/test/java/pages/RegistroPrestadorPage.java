package pages;

import org.openqa.selenium.By;

import appiumTest.BaseTest;

import io.appium.java_client.MobileElement;

public class RegistroPrestadorPage extends BaseTest {
	MobileElement elemento=null; 
	By btnQuieroSerJobber = By.xpath("//*[@text=\"crear cuenta aquí\"]");
	
	By txtNombres=By.xpath("//*[@resource-id=\"mat-input-0\"]");
	By txtApellidos=By.id("mat-input-1");
	/////////////////////////////////////////
	
	////////////////////////////////////////////////////
	By txtCorreo=By.xpath("//*[@resource-id=\"mat-input-3\"]");

	public RegistroPrestadorPage(MobileElement elemento) 
	{
		this.elemento=elemento;
	}
	
	public void clickQuieroSerJobber() {
		driver.findElement(btnQuieroSerJobber).click();
	}
	///////////////////////////////////////////////////////////
	public void enterNombres(String nombres) 
	{
		driver.findElement(txtNombres).sendKeys(nombres);
	}
	
	public void enterApellidos(String apellidos) 
	{
		driver.findElement(txtApellidos).sendKeys(apellidos);
	}
	
	public void enterCorreo(String correo) 
	{
		driver.findElement(txtCorreo).sendKeys(correo);
	}
	/*
	public void clickFechaNacimiento() {
		driver.findElement(btnFechaNacimiento).click();
		driver.findElement(btnFechaNacimientoAño).click();
		driver.findElement(btnFechaNacimientoMes).click();
		driver.findElement(btnFechaNacimientoDia).click();
	}
	
	
	public void enterCorreo(String correo) 
	{
		driver.findElement(txtCorreo).sendKeys(correo);
	}
	
	public void enterContrasena(String contrasena) 
	{
		driver.findElement(txtContrasena).sendKeys(contrasena);
	}
	
	public void enterConfirmarContrasena(String confirmarContrasena) 
	{
		driver.findElement(txtConfirmarContrasena).sendKeys(confirmarContrasena);
	}
	
	public void clickCedulaDeIdentidad() {
		driver.findElement(btnCedulaDeIdentidad).click();
		driver.findElement(btnCedulaDeIdentidadOpcion0).click();
	}
	
	public void enterIdentificador(String identificador) 
	{
		driver.findElement(txtIdentificador).sendKeys(identificador);
	}
	
	public void enterNumeroSerie(String numeroSerie) 
	{
		driver.findElement(txtNumeroSerie).sendKeys(numeroSerie);
	}
	
	public void enterDireccion(String direccion) 
	{
		driver.findElement(txtDireccion).sendKeys(direccion);
	}
	
	public void enterAsignaleUnNombre(String asignaleUnNombre) 
	{
		driver.findElement(txtAsignaleUnNombre).sendKeys(asignaleUnNombre);
	}
	
	public void enterAsignaleUnaReferencia(String asignaleUnaReferencia) 
	{
		driver.findElement(txtAsignaleUnaReferencia).sendKeys(asignaleUnaReferencia);
	}

	
	public void clickCrearCuenta() {
		driver.findElement(btnCrearCuenta).click();
	}

	
	*/
	
}

	
	
