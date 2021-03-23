package pages;



import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import appiumTest.BaseTest;

import io.appium.java_client.MobileElement;


public class RegistroPrestadorPage extends BaseTest {
	MobileElement elemento=null; 
	By btnQuieroSerJobber = By.xpath("//*[@text=\"Quiero ser jobber\"]");
	
	////////////////////VALIDACION CHROME//////////////////////////
	By btnAccept = By.id("com.android.chrome:id/terms_accept");	
	By btnNext = By.id("com.android.chrome:id/next_button");
	By btnNoThanks = By.id("com.android.chrome:id/negative_button");
	//////////////////FIN VALIDACION CHROME////////////////////////
	By btnAcepto = By.xpath("//*[@resource-id=\"com.android.chrome:id/terms_accept\"]");
	By btnNo = By.xpath("//*[@resource-id=\"com.android.chrome:id/negative_button\"]");
	By btnSearch = By.xpath("//*[@resource-id=\"com.android.chrome:id/search_box_text\"]");
	By btnLink = By.xpath("//*[@text=\"app.jobbiando.cl/registroPrestador\"]");
	By btnCerrar = By.xpath("//*[@resource-id=\"com.android.chrome:id/infobar_close_button\"]");
	By btnBlock = By.xpath("//*[@text=\"BLOCK\"]");
	By btnAllow = By.xpath("//*[@text=\"ALLOW\"]");
	By txtNombres=By.xpath("//*[@resource-id=\"mat-input-0\"]");
	By txtApellidos=By.xpath("//*[@resource-id=\"mat-input-1\"]");
	By txtFechaNacimiento=By.xpath("//*[@resource-id=\"fecha_nacimiento\"]");
	
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
	
	////////////////////////VALIDACION SAMSUNG///////////////////////////////////
	public void validacionSamsung() throws InterruptedException
	{	
		if(exist(btnAccept)!=null) {
			driver.findElement(btnAccept).click();
			Thread.sleep(5000);
			driver.findElement(btnNext).click();
			Thread.sleep(5000);
			driver.findElement(btnNoThanks).click();
			Thread.sleep(5000);
			
		}
		else if(exist(btnNext)!=null) {
			driver.findElement(btnNext).click();
			Thread.sleep(5000);
			driver.findElement(btnNoThanks).click();
			Thread.sleep(5000);
		}
		else {
			
		}
		
	}
public void iniciarSesion() throws InterruptedException {
		
		if(exist(btnAcepto)!=null) {
			driver.findElement(btnAcepto).click();
			Thread.sleep(15000);
			driver.findElement(btnNext).click();
			Thread.sleep(15000);
			driver.findElement(btnNo).click();
			Thread.sleep(15000);
			driver.findElement(btnSearch).sendKeys("app.jobbiando.cl/registroPrestador");
			Thread.sleep(15000);
			driver.findElement(btnLink).click();
			Thread.sleep(15000);
			if(exist(btnCerrar)!=null) {
				driver.findElement(btnCerrar).click();
				Thread.sleep(15000);
			}
			
			
		}
		else {
			driver.findElement(btnSearch).sendKeys("app.jobbiando.cl/registroPrestador");
			Thread.sleep(15000);
			driver.findElement(btnLink).click();
			Thread.sleep(15000);
			if(exist(btnCerrar)!=null) {
				driver.findElement(btnCerrar).click();
				Thread.sleep(3000);
			}
			
		}
				
	}
	
	public void enterNombres(String nombres) throws InterruptedException
	{	
		if(exist(btnBlock)==null) {
			driver.findElement(txtNombres).sendKeys(nombres);
			Thread.sleep(5000);
			
		}else {
			driver.findElement(btnBlock).click();
		    Thread.sleep(3000);
		    driver.findElement(btnCerrar).click();
			Thread.sleep(3000);
		    System.out.println(nombres);
			driver.findElement(txtNombres).sendKeys(nombres);
			Thread.sleep(3000);
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

	
	
