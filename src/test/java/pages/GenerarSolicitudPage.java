package pages;

import org.openqa.selenium.By;

import appiumTest.BaseTest;
import io.appium.java_client.MobileElement;

public class GenerarSolicitudPage extends BaseTest{
	MobileElement elemento=null;
	By txtCorreo =By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.EditText");
	By txtContrasena =By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.EditText");
	By btnEntrar = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[4]");
	By btnOcultarTeclado=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.ImageView");
	By btnPermitirAccesoUbicacion=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.Button[1]");
	By btnServicios=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[2]");

	By btnCategoriaSolicitud=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.ScrollView[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView\r\n");
	By txtDescripcion=By.xpath("//*[@text=\"ingrese descripcion aqui\"]");
	By btnSeleccionarSubCategoria=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.Spinner");
	By btnSubCategoria=By.xpath("//*[@text=\"Masajes\"]");	
	By btnOcultarTeclado2=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.TextView[3]");
	By txtPrecio=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.EditText");
	By btnFecha=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.TextView[3]");
	By btnAceptar=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button[2]");
	By btnSiguiente=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[9]/android.widget.TextView");
	By btnPosicion=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.Spinner");
	By btnSeleccionarPosicion=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[2]");
	By btnSiguiente2=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[9]");
	By btnPublicar=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[9]");
	By btnDeny = By.xpath("//*[@text='DENY']");
	
	public GenerarSolicitudPage(MobileElement elemento) throws InterruptedException
	{
		this.elemento=elemento;
	}
	/////////////////////////LOGIN/////////////////////////////////////////
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
	/////////////////////////LOGIN/////////////////////////////////////////
	
	
	public void clickServicios()throws InterruptedException {
		
		Thread.sleep(5000);
		if(exist(btnDeny) != null) {

			driver.findElement(btnDeny).click();
			Thread.sleep(5000);
		
		}else {
			
		}
		driver.findElement(btnServicios).click();
		Thread.sleep(19000);	
	
		}
	
	public void clickCategoriaServicios()throws InterruptedException {
		driver.findElement(btnCategoriaSolicitud).click();
		Thread.sleep(9000);	
	}
	
	public void enterDescripcion(String descripcion) throws InterruptedException
	{
		driver.findElement(txtDescripcion).sendKeys(descripcion);
		Thread.sleep(3000);
	}
	public void clickSeleccionarSubCategoria()throws InterruptedException {
		driver.findElement(btnSeleccionarSubCategoria).click();
		Thread.sleep(9000);	
	}
	public void clickSubCategoria()throws InterruptedException {
		driver.findElement(btnSubCategoria).click();
		Thread.sleep(9000);	
	}
	public void clickOcultarTeclado2()throws InterruptedException {
		driver.findElement(btnOcultarTeclado2).click();
		Thread.sleep(9000);	
	}
	public void enterPrecio(String precio) throws InterruptedException
	{
		driver.findElement(txtPrecio).sendKeys(precio);
		Thread.sleep(5000);
	}
	public void clickFecha()throws InterruptedException {
		driver.findElement(btnFecha).click();
		Thread.sleep(9000);	
	}
	public void clickAceptar()throws InterruptedException {
		driver.findElement(btnAceptar).click();
		Thread.sleep(9000);	
	}
	public void clickSiguiente()throws InterruptedException {
		driver.findElement(btnSiguiente).click();
		Thread.sleep(9000);	
	}
	public void clickPosicion()throws InterruptedException {
		driver.findElement(btnPosicion).click();
		Thread.sleep(9000);	
	}
	public void clickSeleccionarPosicion()throws InterruptedException {
		driver.findElement(btnSeleccionarPosicion).click();
		Thread.sleep(9000);	
	}
	public void clickSiguiente2()throws InterruptedException {
		driver.findElement(btnSiguiente2).click();
		Thread.sleep(9000);	
	}
	public void clickPublicar()throws InterruptedException {
		driver.findElement(btnPublicar).click();
		Thread.sleep(9000);	
	}
	
}



