package pages;

import org.openqa.selenium.By;

import appiumTest.BaseTest;
import io.appium.java_client.MobileElement;

public class RealizarPagoSolicitudDesdePeticionPage extends BaseTest {
	MobileElement elemento=null;
	
	By txtCorreo =By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.EditText");
	By txtContrasena =By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.EditText");
	By btnEntrar = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[4]");
	By btnOcultarTeclado=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.ImageView");
	By btnPermitirAccesoUbicacion=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.Button[1]");
	By btnPestanaSolicitud=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[3]");
	By btnPestanaEnProceso=By.xpath("//*[@text='En Proceso']");
	By btnPagarServicio=By.xpath("//*[@text='PAGAR SERVICIO']");
	By btnPagarServicio2=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[9]");
	By btnClearEmail=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.ListView/android.widget.RelativeLayout/android.widget.TextView");
	By txtEmailPagador=By.id("com.khipu.android:id/payer_email");
	By btnContinuar=By.xpath("//*[@text='CONTINUAR']");
	By btnOcultarTecladoMovil=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[1]/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View[5]");
	By txtIdUsuario=By.xpath("//android.widget.EditText[@content-desc=\"username\"]");
	By txtClaveUsuario=By.xpath("//android.widget.EditText[@content-desc=\"password\"]");
	By btnSeguir=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[1]/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View[5]");
	By btnContinuar2=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[1]/android.webkit.WebView/android.webkit.WebView/android.view.View[1]/android.view.View[3]/android.widget.ListView/android.view.View[17]");
	By txtAutorizacion=By.xpath("//android.view.View[@content-desc=\"Autorizar nómina\"]/android.widget.TextView");
	By btnSeguir2=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[1]/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View[5]/android.view.View");;
	By btnTerminar=By.xpath("//*[@text='TERMINAR']");
	
	public RealizarPagoSolicitudDesdePeticionPage(MobileElement elemento) throws InterruptedException
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
	public void clickPestanaSolicitud() throws InterruptedException
	/////MODIFICAR PARA EMULADOR/////////////
	{	if(driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.Button[1]") != null) {
		driver.findElement(btnPermitirAccesoUbicacion).click();
		Thread.sleep(3000);
		
	}else {}
		driver.findElement(btnPestanaSolicitud).click();
		Thread.sleep(10000);
	}
	public void clickPestanaEnProceso() throws InterruptedException
	{
		driver.findElement(btnPestanaEnProceso).click();
		Thread.sleep(10000);
	}
	public void clickPagarServicio() throws InterruptedException
	{
		driver.findElement(btnPagarServicio).click();
		Thread.sleep(20000);
		this.funcionScrollDownFull();
		driver.findElement(btnPagarServicio2).click();
		Thread.sleep(15000);
		
	}
	public void enterEmailPagador(String emailPagador) throws InterruptedException
	{   
		driver.findElement(txtEmailPagador).sendKeys(emailPagador);
		Thread.sleep(3000);
	}
	public void clickContinuar() throws InterruptedException
	{
		driver.findElement(btnContinuar).click();
		Thread.sleep(20000);
	}
	 public void enterDatosUsuario(String id,String clave) throws InterruptedException{
		driver.findElement(txtIdUsuario).sendKeys(id);
		Thread.sleep(3000);
		if(driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[1]/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View[5]")!=null) {
			
			driver.findElement(btnOcultarTecladoMovil).click();
		}
		driver.findElement(txtClaveUsuario).sendKeys(clave);
		Thread.sleep(3000);
		driver.findElement(btnSeguir).click();
		Thread.sleep(9000);	
		driver.findElement(btnContinuar).click();
		Thread.sleep(9000);	
	 }
	
	 public void enterAutorizacion(String auth) throws InterruptedException{
		driver.findElement(txtAutorizacion).sendKeys(auth);
		Thread.sleep(3000);	
		driver.findElement(btnSeguir2).click();
		Thread.sleep(9000);	
	 }
	 public void clickTerminar() throws InterruptedException{
			driver.findElement(btnTerminar).click();
			Thread.sleep(3000);	
			
		 }
}
