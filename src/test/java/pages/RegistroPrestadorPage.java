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
	
	public void enterFechaNacimiento(String fechaNacimiento) 
	{
		driver.findElement(txtFechaNacimiento).sendKeys(fechaNacimiento);
	}
	
	public void enterCorreo(String correo) 
	{
		driver.findElement(txtCorreo).sendKeys(correo);
	}
	
	public void enterContrasena(String contrasena) throws InterruptedException 
	{
		driver.manage().window().getSize();
		Dimension dimension = driver.manage().window().getSize();
		int start_x = (int) (dimension.width * 0.5);
		int start_y = (int) (dimension.height * 0.8);
		
		int end_x = (int) (dimension.width * 0.5);
		int end_y = (int) (dimension.height * 0.6);
		
		TouchAction touch = new TouchAction(driver);
		touch.press(PointOption.point(start_x, start_y))
		.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
		.moveTo(PointOption.point(end_x, end_y)).release().perform();
		Thread.sleep(3000);
		
		driver.findElement(txtContrasena).sendKeys(contrasena);
		driver.findElement(txtContrasena2).sendKeys(contrasena);
	}
	
	public void clickCedulaDeIdentidad(String numeroIdentificador) {
		driver.findElement(btnTipoDocumento).click();
		driver.findElement(btnCedulaDeIdentidadOpcion0).click();
		driver.findElement(txtNumeroIdentificador).sendKeys(numeroIdentificador);
	}
	
	public void enterIdentificador(String numeroSerie) 
	{
		
		driver.findElement(txtNumeroSerie).sendKeys(numeroSerie);
	}
	
	public void enterCalle(String calle) 
	{
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
	
	public void enterReferencia(String referencia) 
	{
		driver.findElement(txtReferencia).sendKeys(referencia);
	}
	
	public void clickCrearCuenta() throws InterruptedException {
		driver.findElement(btnRegistrar).click();
		Thread.sleep(5000);
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

	
	
