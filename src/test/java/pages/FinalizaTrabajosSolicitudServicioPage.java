package pages;

import org.openqa.selenium.By;

import appiumTest.BaseTest;
import io.appium.java_client.MobileElement;


public class FinalizaTrabajosSolicitudServicioPage extends BaseTest{
	MobileElement elemento=null; 
	
	By txtCorreo =By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.EditText");
	By txtContrasena =By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.EditText");
	By btnEntrar = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[4]");
	By btnDontAskAgain = By.id("com.android.packageinstaller:id/do_not_ask_checkbox");
	By btnDeny = By.xpath("//*[@text='DENY']");
	By btnAllow = By.xpath("//*[@text='ALLOW']");
	By btnSolicitudPestana=By.xpath("//*[@text='SOLICITUD']");
	By btnEjecutandoServicio = By.xpath("//*[@text='EJECUTANDO SERVICIO']");
	By btnActualizarEstadoTerminado = By.xpath("//*[@text='ACTUALIZAR ESTADO A TERMINADO']");
	By btnActualizarEstadoTerminar = By.xpath("//*[@text='ACTUALIZAR ESTADO A TERMINAR']");
	By btnActualizar = By.xpath("//*[@text='ACTUALIZAR']");
	By btnOk = By.xpath("//*[@text='OK']");
	
	
	By inputImagen=By.xpath("//*[@class='android.widget.ImageView']");
	By btnTomarImagen=By.xpath("//*[@text='Tomar una Foto']");
	By btnTake = By.xpath("//*[@resource-id=\"com.android.camera2:id/shutter_button\"]");
	By btnDone = By.xpath("//*[@resource-id=\"com.android.camera2:id/done_button\"]");
	By btnPublicar = By.xpath("//*[@text='Publicar']");
	
	public FinalizaTrabajosSolicitudServicioPage(MobileElement elemento) 
	{
		this.elemento=elemento;
	}
	
	public void correoPrestador(String correoPrestador) throws InterruptedException {
		System.out.println(correoPrestador);
		
		
		Thread.sleep(5000);
		driver.findElement(txtCorreo).sendKeys(correoPrestador);
		
	}
	
	public void passPrestador(String passPrestador) throws InterruptedException {
		driver.findElement(txtContrasena).sendKeys(passPrestador);
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
		
	public void clickSolicitud() throws InterruptedException{		
		
		if(exist(btnDontAskAgain) != null) {
			
			driver.findElement(btnDontAskAgain).click();
			Thread.sleep(5000);
			driver.findElement(btnDeny).click();
			driver.findElement(btnSolicitudPestana).click();
			Thread.sleep(5000);
			
		}else {
			
			driver.findElement(btnSolicitudPestana).click();
			Thread.sleep(5000);
		}
	}
	
	public void clickSeleccionaSolicitud() throws InterruptedException{
		
		while(exist(btnEjecutandoServicio) == null) {
			this.funcionScrollDown(0.8,0.6);
		}
		driver.findElement(btnEjecutandoServicio).click();
		Thread.sleep(5000);
	}
	
	public void clickAvanzarEstadoTerminado() throws InterruptedException{
		
		this.funcionScrollDown(0.9,0.1);
		driver.findElement(btnActualizarEstadoTerminado).click();
		Thread.sleep(5000);
		driver.findElement(inputImagen).click();
		Thread.sleep(5000);
		camara();
		driver.findElement(btnActualizarEstadoTerminar).click();
		Thread.sleep(5000);
		driver.findElement(btnActualizar).click();
		Thread.sleep(5000);
		driver.findElement(btnOk).click();
		Thread.sleep(5000);
		
	}
	
	
	
	public void camara() throws InterruptedException{
		
		driver.findElement(btnTomarImagen).click();
		Thread.sleep(5000);
		driver.findElement(btnAllow).click();
		Thread.sleep(5000);
		driver.findElement(btnAllow).click();
		Thread.sleep(5000);
		driver.findElement(btnTake).click();
		Thread.sleep(5000);
		driver.findElement(btnDone).click();
		Thread.sleep(5000);
		
	}
	
	
	
}
