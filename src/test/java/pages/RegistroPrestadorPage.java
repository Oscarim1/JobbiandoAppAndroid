package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;

import appiumTest.BaseTest;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class RegistroPrestadorPage extends BaseTest {
	MobileElement elemento=null; 
	By btnQuieroSerJobber = By.xpath("//*[@text=\"crear cuenta aquí\"]");
	
	By txtNombres=By.xpath("//*[@resource-id=\"mat-input-0\"]");
	By txtApellidos=By.xpath("//*[@resource-id=\"mat-input-1\"]");
	By txtFechaNacimiento=By.xpath("//*[@resource-id=\"fecha_nacimiento\"]");
	//By btnCalendario = By.xpath("//*[@text=\"Open calendar\"]");
	By btnFormulario = By.xpath("//*[@resource-id=\"register-form\"]");
	By txtCorreo=By.xpath("//*[@resource-id=\"mat-input-3\"]");
	By txtContrasena=By.xpath("//*[@resource-id=\"password\"]");
	By txtContrasena2=By.xpath("//*[@resource-id=\"mat-input-5\"]");
	By btnTipoDocumento = By.xpath("//*[@resource-id=\"selectTipo\"]");
	By btnCedulaDeIdentidadOpcion0 = By.xpath("//*[@resource-id=\"selectTipo\"]");
	By txtNumeroIdentificador= By.xpath("//*[@resource-id=\"mat-input-6\"]");
	By txtNumeroSerie= By.xpath("//*[@resource-id=\"numero_serie\"]");
	By txtCalle= By.xpath("//*[@resource-id=\"mat-input-8\"]");
	By txtDireccion= By.xpath("//*[@resource-id=\"mat-input-9\"]");
	By txtNombreDireccion= By.xpath("//*[@resource-id=\"mat-input-10\"]");
	By txtReferencia= By.xpath("//*[@resource-id=\"mat-input-11\"]");
	By btnRegistrar= By.xpath("//*[@resource-id=\"btnGoBack\"]");
	
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
	
	public void enterFechaNacimiento(String fechaNacimiento) throws InterruptedException 
	{
		driver.findElement(txtFechaNacimiento).sendKeys(fechaNacimiento);
		Thread.sleep(3000);
		driver.findElement(txtFechaNacimiento).click();
		Thread.sleep(3000);
		
		//funcion scroll
		
		this.funcionScrollUp();
		
		driver.findElement(btnFormulario).click();
		Thread.sleep(3000);
	}
	
	public void enterCorreo(String correo) 
	{
		driver.findElement(txtCorreo).sendKeys(correo);
	}
	
	public void enterContrasena(String contrasena) throws InterruptedException 
	{
		
		this.funcionScrollDown();
		driver.findElement(txtContrasena).sendKeys(contrasena);
		driver.findElement(txtContrasena2).sendKeys(contrasena);
	}
	
	public void clickCedulaDeIdentidad(String numeroIdentificador) {
		driver.findElement(btnTipoDocumento).click();
		driver.findElement(btnCedulaDeIdentidadOpcion0).click();
		driver.findElement(txtNumeroIdentificador).sendKeys(numeroIdentificador);
	}
	
	public void enterIdentificador(String numeroSerie) throws InterruptedException 
	{
		funcionScrollDown();
		driver.findElement(txtNumeroSerie).sendKeys(numeroSerie);
	}
	
	public void enterCalle(String calle) throws InterruptedException 
	{
		funcionScrollDown();
		driver.findElement(txtCalle).sendKeys(calle);
	}
	
	public void enterDireccion(String direccion) 
	{
		driver.findElement(txtDireccion).sendKeys(direccion);
	}
	
	public void enterNombreDireccion(String nombreDireccion) 
	{
		driver.findElement(txtNombreDireccion).sendKeys(nombreDireccion);
	}
	
	public void enterReferencia(String referencia) throws InterruptedException 
	{
		funcionScrollDown();
		driver.findElement(txtReferencia).sendKeys(referencia);
	}
	
	public void clickCrearCuenta() throws InterruptedException {
		//para finalizar el registro hay que cambiar el btnRegistrar
		driver.findElement(btnRegistrar).click();
		Thread.sleep(5000);
	}
	
}

	
	
