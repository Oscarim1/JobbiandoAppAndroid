package pages;

import org.openqa.selenium.By;

import appiumTest.BaseTest;
import io.appium.java_client.MobileElement;


public class EvaluarExperienciaPrestadorPage extends BaseTest{
	MobileElement elemento=null; 
	
	By txtCorreo =By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.EditText");
	By txtContrasena =By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.EditText");
	By btnEntrar = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[4]");
	By btnDontAskAgain = By.id("com.android.packageinstaller:id/do_not_ask_checkbox");
	By btnDeny = By.xpath("//*[@text='DENY']");
	By btnAllow = By.xpath("//*[@text='ALLOW']");
	By btnSolicitudPestana=By.xpath("//*[@text='SOLICITUD']");
	By btnEvaluarExperiencia = By.xpath("//*[@text='EVALUAR EXPERIENCIA']");
	By btnOk = By.xpath("//*[@text='OK']");
	
	
	By inputDetalle = By.xpath("//*[@class='android.widget.EditText']");
	//By inputDetalle=By.xpath("//*[@class='android.widget.ImageView']");
	By btnEnviarEvaluacion=By.xpath("//*[@text='ENVIAR EVALUACIÓN']");
	
	
	public EvaluarExperienciaPrestadorPage(MobileElement elemento) 
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
		if(permisoDeny(btnDeny) != null) {

			driver.findElement(btnDeny).click();
			Thread.sleep(5000);
		}else {
		}
		
	}
		
	public void clickSolicitud() throws InterruptedException{		
		
		if(permisoDontAskAgain(btnDontAskAgain) != null) {
			
			driver.findElement(btnDontAskAgain).click();
			Thread.sleep(5000);
			driver.findElement(btnDeny).click();
			Thread.sleep(5000);
			driver.findElement(btnSolicitudPestana).click();
			
		}else {
			
			driver.findElement(btnSolicitudPestana).click();
			Thread.sleep(5000);
		}
	}
	
	public void clickSeleccionaSolicitudEvaluar() throws InterruptedException{
		
		while(btnEvaluarExperiencia(btnEvaluarExperiencia) == null) {
			this.funcionScrollDown();
		}
		driver.findElement(btnEvaluarExperiencia).click();
		Thread.sleep(5000);
	}
	
	public void clickEvaluarExperiencia() throws InterruptedException{
		
		this.funcionScrollDownFull();
		driver.findElement(btnEvaluarExperiencia).click();
		Thread.sleep(5000);
		
	}
	public void EvaluarExperiencia(String descripcion) throws InterruptedException{
		
		this.funcionScrollDownFull();
		driver.findElement(inputDetalle).sendKeys(descripcion);
		Thread.sleep(2000);
		driver.findElement(btnEnviarEvaluacion).click();
		Thread.sleep(5000);
		driver.findElement(btnOk).click();
		Thread.sleep(5000);
		
	}
}
