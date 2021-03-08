package pages;
import org.openqa.selenium.By;


import appiumTest.BaseTest;
import io.appium.java_client.MobileElement;

public class SubirAntecedentesPage extends BaseTest {

	MobileElement elemento=null; 
	
	By txtCorreo =By.xpath("//*[@text=\"Email\"]");
	By txtContrasena =By.xpath("//*[@text=\"Contraseña\"]");
	By btnEntrar =By.xpath("//*[@text=\"LOGIN\"]");
	By btnOcultarTeclado=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.ImageView");
	By btnPermitirUbicacion=By.xpath("//*[@resource-id=\"com.android.packageinstaller:id/permission_allow_button\"]");
	By btnEntrarCuenta =By.xpath("//*[@text=\"CUENTA\"]");
	By btnAntecedentes =By.xpath("//*[@text=\"Antecedentes de la cuenta\"]");	
	By btnTipoDocumento =By.xpath("//*[@resource-id=\"android:id/text1\"]");
	By btnDocumento =By.xpath("//*[@text=\"Certificado de antecedentes\"]");
	By btnImagen =By.className("android.widget.ImageView");
	///////////////////////editar///////////////////////////////////
	By btnElegirFuenteImagen =By.xpath("//*[@text=\"Tomar una Foto\"]");
	By btnTomarFoto =By.xpath("//*[@resource-id=\"com.android.camera:id/shutter_button\"]");
	By btnAceptar =By.xpath("//*[@text=\"ACEPTAR\"]");
	By btnSubirAntecedentes =By.xpath("//*[@text=\"SUBIR ANTECEDENTES\"]");
	
	
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
	public void clickOcultarTeclado() 
	{
		driver.findElement(btnOcultarTeclado).click();
	}
	public void clickEntrar() 
	{
		driver.findElement(btnEntrar).click();
	}
	
	public void clickPermitirUbicacion() {
		driver.findElement(btnPermitirUbicacion).click();
		
	}
	public void clickPerfil() 
	{
		driver.findElement(btnEntrarCuenta).click();
		
	}
	
	public void clickAntecedentes() 
	{
		driver.findElement(btnAntecedentes).click();
		
	}
	public void clickTipoDocumento() 
	{
		driver.findElement(btnTipoDocumento).click();
		
	}
	
	public void clickDocumento() 
	{
		driver.findElement(btnDocumento).click();
	}
	
	public void clickImagen() 
	{
		driver.findElement(btnImagen).click();
	}
	
	public void clickFuenteImagen() 
	{
		driver.findElement(btnElegirFuenteImagen).click();
	}
	
	public void clickTomarFoto() 
	{
		driver.findElement(btnTomarFoto).click();
	}
	
	public void clickAceptar() 
	{
		driver.findElement(btnAceptar).click();
	}
	
	public void clickSubirAntecedentes() 
	{
		driver.findElement(btnSubirAntecedentes).click();
	}
	
}
