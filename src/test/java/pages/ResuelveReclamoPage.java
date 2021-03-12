package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;

import appiumTest.BaseTest;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;


import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;
import java.net.MalformedURLException;
import java.util.logging.Level;



public class ResuelveReclamoPage extends BaseTest {
	MobileElement elemento=null; 
	By btnOlvideContrasena = By.xpath("//*[@text=\"Olvidaste tu contrase�a?\"]");
	By btnGoBackLogin = By.xpath("//*[@text=\"Go back to login\"]");
	By txtEmail  = By.xpath("//*[@resource-id=\"mat-input-1\"]");
	By txtPass  = By.xpath("//*[@resource-id=\"mat-input-2\"]");
	By btnEntrar  = By.xpath("//*[@resource-id=\"btnEntrar\"]");	

	By btnBarraLateral = By.className("android.widget.Button");
	By btnFiltrarReclamo = By.xpath("//*[@text=\"Filtrar Reclamos\"]");	
	By btnFiltro = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[3]/android.widget.EditText");
	By btnReclamo = By.xpath("//*[@text=\"Me rob� herramientas.\"]");
	By btnResolverReclamo = By.xpath("//*[@resource-id='btnResolver0']");
	By btnRevisarAntecedenteUsuario = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[5]/android.widget.GridView/android.view.View[3]/android.view.View/android.view.View/android.widget.Button");
	
	By btnTipoSolucion = By.xpath("//*[@resource-id='selectTipo']");
	By btnOpcion = By.xpath("//*[@resource-id='option0']");
	By btnDescripcion = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.view.View[17]/android.view.View/android.view.View[1]/android.view.View[3]/android.view.View/android.view.View/android.widget.EditText");	
	By btnRegistrar = By.xpath("//*[@resource-id='btnRegistrar']");
	

	public ResuelveReclamoPage(MobileElement elemento) 
	{
		
		this.elemento=elemento;
	}
	
	public void iniciarSesion() throws InterruptedException {
		
		driver.findElement(btnOlvideContrasena).click();
		Thread.sleep(15000);
		driver.findElement(btnGoBackLogin).click();
		Thread.sleep(5000);
				
	}
	
	public void enterUsernameAdmin(String username) throws InterruptedException {
		
		driver.findElement(txtEmail).sendKeys(username);
		Thread.sleep(5000);
	}
	
	public void enterPassAdmin(String passAdmin) throws InterruptedException {
		
		driver.findElement(txtPass).sendKeys(passAdmin);
		Thread.sleep(3000);
		driver.findElement(btnEntrar).click();
		Thread.sleep(3000);
		
	}
	
	public void barraLateral() throws InterruptedException {
		
		driver.findElement(btnBarraLateral).click();
		Thread.sleep(3000);
		this.funcionScrollDown(0.8,0.6);
		Thread.sleep(3000);
		driver.findElement(btnFiltrarReclamo).click();
		Thread.sleep(3000);
	}
	
	public void filtroNombre(String nombre) throws InterruptedException {
		
		driver.findElement(btnFiltro).click();
		Thread.sleep(3000);
		driver.findElement(btnFiltro).sendKeys(nombre);
		Thread.sleep(3000);
		
		

	}
	
	public void resuelveReclamo() throws InterruptedException {
		
		driver.findElement(btnReclamo).click();
		Thread.sleep(5000);
		driver.findElement(btnResolverReclamo).click();
		Thread.sleep(5000);	
		
	}
	
public void registrar(String resolucion) throws InterruptedException {
		
		this.funcionScrollDown(0.9,0.1);
		driver.findElement(btnTipoSolucion).click();
		Thread.sleep(3000);
		driver.findElement(btnOpcion).click();
		Thread.sleep(3000);
		driver.findElement(btnDescripcion).sendKeys(resolucion);
		Thread.sleep(3000);
		driver.findElement(btnRegistrar).click();
		Thread.sleep(3000);
		
		
	}
		
}

	
	
