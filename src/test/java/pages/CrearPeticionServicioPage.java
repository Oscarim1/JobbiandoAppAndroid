package pages;

import org.openqa.selenium.By;

import appiumTest.BaseTest;
import io.appium.java_client.MobileElement;

public class CrearPeticionServicioPage extends BaseTest{
	MobileElement elemento=null; 
	
	By txtCorreo =By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.EditText");
	By txtContrasena =By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.EditText");
	By btnOcultarTeclado=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.ImageView");
	By btnEntrar = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[4]");
	By btnPermitirUbicacion=By.xpath("//*[@resource-id=\"com.android.packageinstaller:id/permission_allow_button\"]");
	By btnSeleccionarUbicacion=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView[2]");
	By btnUbicacion=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup");
	/////////////////////////////////////Elegir Servicio/////////////////////////////////////////////
	By btnFiltroServicios=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView[2]");
	By btnFiltroCategoria=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.Spinner[1]");
	By btnCategoria=By.xpath("//*[@text=\"Servicios de cuidado personal y bienestar\"]");
	By btnFiltroSubCategoria=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.Spinner[2]");
	By btnSubCategoria=By.xpath("//*[@text=\"Masajes\"]");
	By btnAplicarFiltro=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[7]");
	/////////////////////////////////////Elegir Servicio/////////////////////////////////////////////
	By btnSeleccionarServicio=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.HorizontalScrollView[2]/android.view.ViewGroup/android.view.ViewGroup");
	By btnSolicitarServicio=By.xpath("//*[@text=\"SOLICITAR SERVICIO\"]");	
	
	By txtDescripcion=By.xpath("//*[@text=\"ingrese descripcion aqui\"]");	
	By btnSeleccionarFecha=By.xpath("//*[@text=\"Seleccione fecha para el servicio\"]");
	By btnOk = By.xpath("//*[@resource-id=\"android:id/button1\"]");
	
	//By btnAceptarFecha=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button[2]");
	By btnSeleccionarDireccion = By.xpath("//*[@resource-id=\"android:id/text1\"]");
	By btnDireccion=By.xpath("//*[@text=\"Casa\"]");
	By btnOcultarTeclado2=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout[2]");
	By btnSolicitarPeticion=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[5]");
	
	public CrearPeticionServicioPage(MobileElement elemento) throws InterruptedException
	{
		this.elemento=elemento;
	}
	
	
	public void correoSolicitante(String correoSolicitante) throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(txtCorreo).sendKeys(correoSolicitante);
		Thread.sleep(5000);
		
	}
	
	public void passSolicitante(String passSolicitante) throws InterruptedException {
		driver.findElement(txtContrasena).sendKeys(passSolicitante);
		Thread.sleep(5000);
		
		
	}
	public void clickOcultarTeclado() throws InterruptedException
	{
		driver.findElement(btnOcultarTeclado).click();
		Thread.sleep(5000);
	}
	public void clickEntrar() throws InterruptedException
	{
		driver.findElement(btnEntrar).click();
		Thread.sleep(30000);
	}
	public void clickPermitirUbicacion()throws InterruptedException {
		driver.findElement(btnPermitirUbicacion).click();
		Thread.sleep(9000);
		
	}
	public void clickSeleccionarUbicacion()throws InterruptedException {
		driver.findElement(btnSeleccionarUbicacion).click();
		Thread.sleep(9000);
		
	}
	public void clickUbicacion()throws InterruptedException {
		driver.findElement(btnUbicacion).click();
		Thread.sleep(9000);
		
	}
	
	public void clickFiltroServicios()throws InterruptedException{
		driver.findElement(btnFiltroServicios).click();
		Thread.sleep(9000);	
		driver.findElement(btnFiltroCategoria).click();
		Thread.sleep(4000);
		while(exist(btnCategoria)==null) {
			this.funcionScrollDown(0.8, 0.4);
		}
		driver.findElement(btnCategoria).click();
		Thread.sleep(4000);	
		driver.findElement(btnFiltroSubCategoria).click();
		Thread.sleep(4000);	
		driver.findElement(btnSubCategoria).click();
		Thread.sleep(4000);	
		driver.findElement(btnAplicarFiltro).click();
		Thread.sleep(4000);
		
		
	}
	public void clickSeleccionarServicio() throws InterruptedException {
		
		this.funcionScrollHorizontal(0.6, 0.1);
		
		driver.findElement(btnSeleccionarServicio).click();
		Thread.sleep(9000);	
	}
	
	
	
	public void clickSolicitarServicio() throws InterruptedException {
		this.funcionScrollDown(0.9,0.1);
		Thread.sleep(5000);
		driver.findElement(btnSolicitarServicio).click();
		Thread.sleep(5000);
	}
	
	public void clickDescripcion(String descripcion) throws InterruptedException{
		driver.findElement(txtDescripcion).sendKeys(descripcion);
		Thread.sleep(5000);
	}
	public void clickSeleccionarFecha() throws InterruptedException {
		driver.findElement(btnSeleccionarFecha).click();
		Thread.sleep(9000);	
	}
	public void clickAceptarFecha() throws InterruptedException {
		driver.findElement(btnOk).click();
		Thread.sleep(9000);	
	}
	public void clickSeleccionarDireccion() throws InterruptedException {
		driver.findElement(btnSeleccionarDireccion).click();
		Thread.sleep(9000);	
	}
	public void clickDireccion() throws InterruptedException {
		driver.findElement(btnDireccion).click();
		Thread.sleep(9000);	
	}
	
	public void clickGenerarPeticion() throws InterruptedException {		
		if(exist(btnOcultarTeclado2)!=null) {
			driver.findElement(btnOcultarTeclado2).click();
			Thread.sleep(3000);	
		}		
		
		driver.findElement(btnSolicitarPeticion).click();
		Thread.sleep(9000);	
	}
}
