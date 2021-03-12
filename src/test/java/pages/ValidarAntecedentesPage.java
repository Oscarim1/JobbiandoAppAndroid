package pages;

import org.openqa.selenium.By;


import appiumTest.BaseTest;

import io.appium.java_client.MobileElement;


public class ValidarAntecedentesPage extends BaseTest {
	MobileElement elemento=null; 
	By btnOlvideContrasena = By.xpath("//*[@text=\"Olvidaste tu contrase�a?\"]");
	By btnGoBackLogin = By.xpath("//*[@text=\"Go back to login\"]");
	By txtEmail  = By.xpath("//*[@resource-id=\"mat-input-1\"]");
	By txtPass  = By.xpath("//*[@resource-id=\"mat-input-2\"]");
	By btnEntrar  = By.xpath("//*[@resource-id=\"btnEntrar\"]");	

	By btnBarraLateral = By.className("android.widget.Button");
	By btnRevisarAntecedentes = By.xpath("//*[@text=\"Revisar antecedentes\"]");	
	By btnFiltro = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[3]/android.widget.EditText\r\n");
	By btnAntecedentes = By.xpath("//*[@text=\"Certificado de antecedentes\"]");
	By btnAntecedenteUsuario = By.xpath("//*[@text=\"Revisar Antecedente!\"]");
	By btnRevisarAntecedenteUsuario = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[5]/android.widget.GridView/android.view.View[3]/android.view.View/android.view.View/android.widget.Button");
	
	By btnVerificarAntecedente = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.app.Dialog/android.widget.Button[1]");
	By btnYes = By.xpath("//*[@resource-id='btnYes']");
	
	public ValidarAntecedentesPage(MobileElement elemento) 
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
		this.funcionScrollDown();
		Thread.sleep(3000);
		driver.findElement(btnRevisarAntecedentes).click();
		Thread.sleep(3000);
	}
	
	public void filtroNombre(String nombre) throws InterruptedException {
		
		driver.findElement(btnFiltro).click();
		Thread.sleep(3000);
		driver.findElement(btnFiltro).sendKeys(nombre);
		Thread.sleep(3000);
		

	}
	
	public void validarAntecedente() throws InterruptedException {
		
		driver.findElement(btnAntecedentes).click();
		Thread.sleep(5000);
		driver.findElement(btnRevisarAntecedenteUsuario).click();
		Thread.sleep(5000);
		driver.findElement(btnVerificarAntecedente).click();
		Thread.sleep(3000);
		driver.findElement(btnYes).click();
		Thread.sleep(3000);
		

	}
		
}

	
	
