package pages;

import org.openqa.selenium.By;

import appiumTest.BaseTest;
import io.appium.java_client.MobileElement;

public class RealizarPagoSolicitudDesdePeticionCuponPage extends BaseTest {
	MobileElement elemento=null;
	
	By txtCorreo =By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.EditText");
	By txtContrasena =By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.EditText");
	By btnEntrar = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[4]");
	By btnOcultarTeclado=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.ImageView");
	By btnDeny = By.xpath("//*[@text='DENY']");
	By btnAllow = By.xpath("//*[@text='ALLOW']");
	By btnDontAskAgain = By.id("com.android.packageinstaller:id/do_not_ask_checkbox");
	
	By btnPestanaSolicitud=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[3]");
	By btnPestanaEnProceso=By.xpath("//*[@text='En Proceso']");
	By btnPagarServicio=By.xpath("//*[@text='PAGAR SERVICIO']");
	By btnCupon = By.xpath("//*[@text='PAGAR CON CUPON']"); 
	By btnAnadirCupon = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.TextView");
	By btnCodigoCupon = By.xpath("//*[@text='Ingresar codigo cupon']");	
	By btnAgregarCupon = By.xpath("//*[@text='AGREGAR CUPON']");
	By btnOk = By.xpath("//*[@text='OK']");
	By btnSeleccionaCupon = By.xpath("//*[@text='cuponPrueba']");
	
	By btnDeny2 = By.id("com.android.packageinstaller:id/permission_deny_button");

	By btnCancelar = By.xpath("//*[@resource-id=\"android:id/button2\"]");
	
	
	public RealizarPagoSolicitudDesdePeticionCuponPage(MobileElement elemento) throws InterruptedException
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
	public void clickPestanaSolicitud() throws InterruptedException{

		if(exist(btnDeny) != null) {

			driver.findElement(btnDeny).click();
			Thread.sleep(5000);
		}else {
		}
		driver.findElement(btnPestanaSolicitud).click();
		Thread.sleep(10000);
		
	}
	public void clickPestanaEnProceso() throws InterruptedException
	{
		if(exist(btnDontAskAgain) != null) {
			
			driver.findElement(btnDontAskAgain).click();
			Thread.sleep(5000);
			driver.findElement(btnDeny).click();
			driver.findElement(btnPestanaEnProceso).click();
			Thread.sleep(5000);
			
		}else {
			
			driver.findElement(btnPestanaEnProceso).click();
			Thread.sleep(5000);
		}
	}
	public void clickPagarServicio() throws InterruptedException
	{
		driver.findElement(btnPagarServicio).click();
		Thread.sleep(10000);
		this.funcionScrollDown(0.9,0.1);
		driver.findElement(btnPagarServicio).click();
		Thread.sleep(10000);
		driver.findElement(btnCupon).click();
		Thread.sleep(10000);
		
		
	}
	public void anadirCupon() throws InterruptedException
	{   
		driver.findElement(btnAnadirCupon).click();
		Thread.sleep(3000);
		
	}
	public void ingresarCupon() throws InterruptedException
	{
		driver.findElement(btnCodigoCupon).sendKeys("1234");
		Thread.sleep(8000);
	}
	 public void agregarCupon() throws InterruptedException
	 {
		driver.findElement(btnAgregarCupon).click();
		Thread.sleep(8000);
		driver.findElement(btnOk).click();
		Thread.sleep(8000);
	 }
	
	 public void seleccionaCupon() throws InterruptedException
	 {
		driver.findElement(btnSeleccionaCupon).click();
		Thread.sleep(8000);
	 }
	 public void pagarConCupon() throws InterruptedException
	 {
		driver.findElement(btnCupon).click();
		Thread.sleep(7000);	
		driver.findElement(btnOk).click();
		Thread.sleep(7000);
			
	 }
}
