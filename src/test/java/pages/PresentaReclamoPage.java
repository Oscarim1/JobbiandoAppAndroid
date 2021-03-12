package pages;

import org.openqa.selenium.By;

import appiumTest.BaseTest;
import io.appium.java_client.MobileElement;


public class PresentaReclamoPage extends BaseTest{
	MobileElement elemento=null; 
	
	By txtCorreo =By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.EditText");
	By txtContrasena =By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.EditText");
	By btnEntrar = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[4]");
	By btnDontAskAgain = By.id("com.android.packageinstaller:id/do_not_ask_checkbox");
	By btnDeny = By.xpath("//*[@text='DENY']");
	By btnAllow = By.xpath("//*[@text='ALLOW']");
	By btnCuenta=By.xpath("//*[@text='CUENTA']");
	By btnSolicitudesTerminadas = By.xpath("//*[@text='Solicitudes terminadas']");
	By btnSolicitudFinalizada = By.xpath("//*[@text='SOLICITUD FINALIZADA']");
	By btnArticulosPerdidos = By.xpath("//*[@text='Artículos perdidos']");
	By inputDetalle=By.xpath("//*[@text='ingrese descripcion aqui']");
	By btnEnviar = By.xpath("//*[@text='ENVIAR']");
	By btnOk = By.xpath("//*[@text='OK']");
	
	public PresentaReclamoPage(MobileElement elemento) 
	{
		this.elemento=elemento;
	}
	
	public void correoSolicitante(String correoSolicitante51) throws InterruptedException {
		System.out.println(correoSolicitante51);
		
		
		Thread.sleep(5000);
		driver.findElement(txtCorreo).sendKeys(correoSolicitante51);
		
	}
	
	public void passSolicitante(String emailSolicitante51) throws InterruptedException {
		driver.findElement(txtContrasena).sendKeys(emailSolicitante51);
		Thread.sleep(5000);
		driver.findElement(btnEntrar).click();
		Thread.sleep(5000);
		
	}
	 
	public void permisosDeny() throws InterruptedException{
		if(exist(btnDeny) != null) {

			driver.findElement(btnDeny).click();
			Thread.sleep(5000);
		}else {
		}
		
	}
		
	public void clickCuenta() throws InterruptedException{		
		
		if(exist(btnDontAskAgain) != null) {
			
			driver.findElement(btnDontAskAgain).click();
			Thread.sleep(5000);
			driver.findElement(btnDeny).click();
			Thread.sleep(5000);
			driver.findElement(btnCuenta).click();
			
		}else {
			
			driver.findElement(btnCuenta).click();
			Thread.sleep(5000);
		}
	} 
	
	public void clickSolicitudesTermiandas() throws InterruptedException{
		
		while(exist(btnSolicitudesTerminadas) == null) {
			this.funcionScrollDown(0.8,0.6);
		}
		driver.findElement(btnSolicitudesTerminadas).click();
		Thread.sleep(5000);
	}
	
	public void clickSolicitudFinalizada() throws InterruptedException{
		
		while(exist(btnSolicitudFinalizada) == null) {
			this.funcionScrollDown(0.8,0.6);
		}
		driver.findElement(btnSolicitudFinalizada).click();
		Thread.sleep(5000);
	}
		 
	
	public void clickReclamo() throws InterruptedException{
		
		while(exist(btnArticulosPerdidos) == null) {
			this.funcionScrollDown(0.8,0.6);
		}
		driver.findElement(btnArticulosPerdidos).click();
		Thread.sleep(5000);
	} 
	
	public void clickEnviar(String descripcion) throws InterruptedException{
		
		driver.findElement(inputDetalle).sendKeys(descripcion);
		Thread.sleep(2000);
		driver.findElement(btnEnviar).click();
		Thread.sleep(5000);
		driver.findElement(btnOk).click();
		Thread.sleep(5000);
		
		
	}
}
