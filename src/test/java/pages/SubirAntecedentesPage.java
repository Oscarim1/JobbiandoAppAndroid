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
	By btnPermitirUbicacionE=By.xpath("//*[@resource-id=\"com.android.packageinstaller:id/permission_allow_button\"]");
	By btnEntrarCuenta =By.xpath("//*[@text=\"CUENTA\"]");
	By btnAntecedentes =By.xpath("//*[@text=\"Antecedentes de la cuenta\"]");	
	By btnTipoDocumento =By.xpath("//*[@resource-id=\"android:id/text1\"]");
	By btnDocumento =By.xpath("//*[@text=\"Certificado de antecedentes\"]");
	By btnImagen =By.className("android.widget.ImageView");
	By btnPermitirImagen=By.xpath("//*[@resource-id=\"com.android.packageinstaller:id/permission_allow_button\"]");
	By btnPermitirImagenCamara=By.xpath("//*[@resource-id=\"com.android.packageinstaller:id/permission_allow_button\"]");
	///////////////////////editar///////////////////////////////////
	By btnElegirFuenteImagen =By.xpath("//*[@text=\"Tomar una Foto\"]");
	By btnTomarFoto =By.xpath("//*[@resource-id=\"com.android.camera:id/shutter_button\"]");
	By btnAceptar =By.xpath("//*[@text=\"ACEPTAR\"]");
	By btnSubirAntecedentes =By.xpath("//*[@text=\"SUBIR ANTECEDENTES\"]");
	
	
	public SubirAntecedentesPage(MobileElement elemento) throws InterruptedException
	{
		this.elemento=elemento;
	}
	
	
	public void enterCorreo(String correo) throws InterruptedException
	{
		driver.findElement(txtCorreo).sendKeys(correo);
		Thread.sleep(3000);
	}
	
	public void enterContrasena(String contrasena) throws InterruptedException
	{
		driver.findElement(txtContrasena).sendKeys(contrasena);
		Thread.sleep(3000);
	}
	public void clickOcultarTeclado() throws InterruptedException
	{
		driver.findElement(btnOcultarTeclado).click();
		Thread.sleep(5000);
	}
	public void clickEntrar() throws InterruptedException
	{
		driver.findElement(btnEntrar).click();
		Thread.sleep(25000);
	}
	
	public void clickPermitirUbicacion()throws InterruptedException {
		driver.findElement(btnPermitirUbicacionE).click();
		Thread.sleep(5000);
		
	}
	
	public void clickPerfil() throws InterruptedException
	{
		driver.findElement(btnEntrarCuenta).click();
		Thread.sleep(9000);
		
	}
	
	public void clickAntecedentes() throws InterruptedException
	{
		driver.findElement(btnAntecedentes).click();
		Thread.sleep(5000);
		
	}
	public void clickTipoDocumento() throws InterruptedException
	{
		driver.findElement(btnTipoDocumento).click();
		Thread.sleep(5000);
		
	}
	
	public void clickDocumento() throws InterruptedException
	{
		driver.findElement(btnDocumento).click();
		Thread.sleep(5000);
	}
	
	public void clickImagen() throws InterruptedException
	{
		driver.findElement(btnImagen).click();
		Thread.sleep(5000);
	}
	
	public void clickFuenteImagen() throws InterruptedException
	{
		driver.findElement(btnElegirFuenteImagen).click();
		Thread.sleep(5000);
	}
	public void clickPermitirImagen() throws InterruptedException
	{
		driver.findElement(btnPermitirImagen).click();
		Thread.sleep(5000);
	}
	public void clickPermitirImagenCamara() throws InterruptedException
	{
		driver.findElement(btnPermitirImagenCamara).click();
		Thread.sleep(5000);
	}
	public void clickTomarFoto() throws InterruptedException
	{
		driver.findElement(btnTomarFoto).click();
		Thread.sleep(5000);
	}
	
	public void clickAceptar() throws InterruptedException
	{
		driver.findElement(btnAceptar).click();
		Thread.sleep(5000);
	}
	
	public void clickSubirAntecedentes() throws InterruptedException
	{
		driver.findElement(btnSubirAntecedentes).click();
		Thread.sleep(5000);
	}
	
}
