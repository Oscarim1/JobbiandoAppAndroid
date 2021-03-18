package pages;



import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import appiumTest.BaseTest;

import io.appium.java_client.MobileElement;


public class RegistroPrestadorPage extends BaseTest {
	MobileElement elemento=null; 
	By btnQuieroSerJobber = By.xpath("//*[@text=\"crear cuenta aquí\"]");
	
	By txtNombres=By.xpath("//*[@resource-id=\"mat-input-0\"]");
	By txtApellidos=By.xpath("//*[@resource-id=\"mat-input-1\"]");
	By txtFechaNacimiento=By.xpath("//*[@resource-id=\"fecha_nacimiento\"]");
	By btnBlock = By.xpath("//*[@text=\"BLOCK\"]");
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
	By btnRegistrar= By.xpath("//*[@resource-id=\"btnSaveRegistro\"]"); 
	
	
	public RegistroPrestadorPage(MobileElement elemento) 
	{
		this.elemento=elemento;
	}
	
	public void clickQuieroSerJobber() throws InterruptedException{
		Thread.sleep(5000);
		driver.findElement(btnQuieroSerJobber).click();			
		Thread.sleep(5000);
	}
	///////////////////////////////////////////////////////////
	public void enterNombres(String nombres) throws InterruptedException
	{	
		if(exist(btnBlock)==null) {
			System.out.println(nombres+"AQUIII");
			driver.findElement(txtNombres).sendKeys(nombres);
			Thread.sleep(5000);
		}else {
			driver.findElement(btnBlock).click();
		    Thread.sleep(5000);
		    System.out.println(nombres);
			driver.findElement(txtNombres).sendKeys(nombres);
			Thread.sleep(5000);
		}
		
	}
	
	public void enterApellidos(String apellidos) throws InterruptedException
	{
		driver.findElement(txtApellidos).sendKeys(apellidos);
		Thread.sleep(5000);
	}
	
	public void enterFechaNacimiento(String fechaNacimiento) throws InterruptedException 
	{
		driver.findElement(txtFechaNacimiento).sendKeys(fechaNacimiento);
		Thread.sleep(3000);
		driver.findElement(txtFechaNacimiento).click();
		Thread.sleep(3000);
		this.funcionScrollUp();	
		driver.findElement(btnFormulario).click();
		Thread.sleep(3000);
	}
	
	public void enterCorreo(String correo) throws InterruptedException
	{
		driver.findElement(txtCorreo).sendKeys(correo);
		Thread.sleep(5000);
	}
	
	public void enterContrasena(String contrasena) throws InterruptedException 
	{
		
		this.funcionScrollDown(0.8,0.6);
		driver.findElement(txtContrasena).sendKeys(contrasena);
		Thread.sleep(5000);
		driver.findElement(txtContrasena2).sendKeys(contrasena);
		Thread.sleep(5000);
	}
	
	public void clickCedulaDeIdentidad(String numeroIdentificador)throws InterruptedException {
		driver.findElement(btnTipoDocumento).click();
		Thread.sleep(5000);
		driver.findElement(btnCedulaDeIdentidadOpcion0).click();
		Thread.sleep(5000);
		driver.findElement(txtNumeroIdentificador).sendKeys(numeroIdentificador);
		Thread.sleep(5000);
	}
	
	public void enterIdentificador(String numeroSerie) throws InterruptedException 
	{
		this.funcionScrollDown(0.8,0.6);
		Thread.sleep(5000);
		driver.findElement(txtNumeroSerie).sendKeys(numeroSerie);
		Thread.sleep(5000);
	}
	
	public void enterCalle(String calle) throws InterruptedException 
	{
		this.funcionScrollDown(0.8,0.6);
		Thread.sleep(5000);
		driver.findElement(txtCalle).sendKeys(calle);
		Thread.sleep(5000);
	}
	
	public void enterDireccion(String direccion) throws InterruptedException
	{
		driver.findElement(txtDireccion).sendKeys(direccion);
		Thread.sleep(5000);
		//driver.findElement(txtDireccion).click();
		//Thread.sleep(5000);

	}
	
	public void enterNombreDireccion(String nombreDireccion) throws InterruptedException
	{
		driver.findElement(txtNombreDireccion).sendKeys(nombreDireccion);
		Thread.sleep(5000);
	}
	
	public void enterReferencia(String referencia) throws InterruptedException 
	{
		this.funcionScrollDown(0.8,0.6);
		Thread.sleep(5000);
		driver.findElement(txtReferencia).sendKeys(referencia);
		Thread.sleep(5000);
	}
	
	public void clickCrearCuenta() throws InterruptedException {
		
		this.funcionScrollDown(0.9,0.1);
		driver.findElement(btnRegistrar).click();
		System.out.println("AQUIII");
		Thread.sleep(5000);
	}
	
}

	
	
