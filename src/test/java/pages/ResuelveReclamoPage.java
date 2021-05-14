package pages;

import org.openqa.selenium.By;


import appiumTest.BaseTest;

import io.appium.java_client.MobileElement;


public class ResuelveReclamoPage extends BaseTest {
	MobileElement elemento=null; 
	By btnAcepto = By.xpath("//*[@resource-id=\"com.android.chrome:id/terms_accept\"]");
	By btnNext = By.xpath("//*[@resource-id=\"com.android.chrome:id/next_button\"]");
	By btnNo = By.xpath("//*[@resource-id=\"com.android.chrome:id/negative_button\"]");
	By btnSearch = By.xpath("//*[@resource-id=\"com.android.chrome:id/search_box_text\"]");
	//By btnLink = By.xpath("//*[@text=\"app.jobbiando.cl\"]");
	By btnLink = By.xpath("//*[@text=\"testing.jobbiando.cl/login\"]");
	
	By btnCerrar = By.xpath("//*[@resource-id=\"com.android.chrome:id/infobar_close_button\"]");
	
	By btnOlvideContrasena = By.xpath("//*[@text=\"Olvidaste tu contraseña?\"]");
	By btnGoBackLogin = By.xpath("//*[@text=\"Go back to login\"]");
	By txtEmail  = By.xpath("//*[@resource-id=\"mat-input-0\"]");
	By txtPass  = By.xpath("//*[@resource-id=\"mat-input-1\"]");
	By btnEntrar  = By.xpath("//*[@resource-id=\"btnEntrar\"]");	
	By btnBlock = By.xpath("//*[@resource-id=\"android:id/button2\"]");
			
	By btnBarraLateral = By.className("android.widget.Button");
	By btnFiltrarReclamo = By.xpath("//*[@text=\"Filtrar Reclamos\"]");	
	By btnFiltro = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[3]/android.widget.EditText");
	By btnReclamo = By.xpath("//*[@text=\"Me robo herramientas.\"]");
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
		
		if(exist(btnAcepto)!=null) {
			driver.findElement(btnAcepto).click();
			Thread.sleep(30000);
			driver.findElement(btnNext).click();
			Thread.sleep(20000);
			driver.findElement(btnNo).click();
			Thread.sleep(20000);
			driver.findElement(btnSearch).sendKeys("testing.jobbiando.cl/login");
			Thread.sleep(15000);
			driver.findElement(btnLink).click();
			Thread.sleep(15000);
			driver.findElement(btnCerrar).click();
			Thread.sleep(15000);}
		else {
			driver.findElement(btnOlvideContrasena).click();
			Thread.sleep(15000);
			driver.findElement(btnGoBackLogin).click();
			Thread.sleep(5000);
		}
				
	}
	
	public void enterUsernameAdmin(String username) throws InterruptedException {
		System.out.println(username);
		Thread.sleep(10000);
		driver.findElement(txtEmail).sendKeys(username);
		Thread.sleep(5000);
	}
	
	public void enterPassAdmin(String passAdmin) throws InterruptedException {
		
		driver.findElement(txtPass).sendKeys(passAdmin);
		Thread.sleep(3000);
		driver.findElement(btnEntrar).click();
		Thread.sleep(15000);
		
	}
	
	public void barraLateral() throws InterruptedException {
		if(exist(btnBlock)!=null) {
			driver.findElement(btnBlock).click();
			Thread.sleep(15000);
		}
		if(exist(btnCerrar)!=null) {
			driver.findElement(btnCerrar).click();
			Thread.sleep(15000);
		}
		Thread.sleep(10000);
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

	
	
