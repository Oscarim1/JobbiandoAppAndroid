package pages;

import org.openqa.selenium.By;

import appiumTest.BaseTest;
import io.appium.java_client.MobileElement;

public class CrearOfertaDeServicioPage extends BaseTest {
	MobileElement elemento=null; 
	
	By txtCorreo =By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.EditText");
	By txtContrasena =By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.EditText");
	By btnEntrar = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[4]");
	
	By btnServicioPestana=By.xpath("//*[@text='SERVICIOS']");
	By btnAgregarServicio=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.widget.HorizontalScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.TextView");
	By txtDescripcion=By.xpath("");
	By btnCategoria=By.xpath("");
	By btnSeleccionarCategoria=By.xpath("");
	By txtPrecio=By.xpath("");
	By btnFechaCalendario=By.xpath("");
	By btnFechaDesdeAceptar=By.xpath("");
	By btnJornada=By.xpath("");
	By btnJornadaSeleccionada=By.xpath("");
	By btnSiguiente=By.xpath("");
	By btnDiasEntregaServicioLunes=By.xpath("");
	By btnDiasEntregaServicioMartes=By.xpath("");
	By btnDiasEntregaServicioMiercoles=By.xpath("");
	By btnDiasEntregaServicioJueves=By.xpath("");
	By btnDiasEntregaServicioViernes=By.xpath("");
	By btnDiasEntregaServicioSabado=By.xpath("");
	By btnDiasEntregaServicioDomingo=By.xpath("");
	By btnUbicacion=By.xpath("");
	By btnUbicacionUsuario=By.xpath("");
	
	By inputImagen=By.xpath("");
	By btnPublicar=By.xpath("");
	
	public CrearOfertaDeServicioPage(MobileElement elemento) 
	{
		this.elemento=elemento;
	}
	
	public void correoPrestador(String correoPrestador) throws InterruptedException {
		System.out.println(correoPrestador);
		
		
		Thread.sleep(5000);
		driver.findElement(txtCorreo).sendKeys(correoPrestador);
		
		Thread.sleep(5000);
		
	}
	
	public void passPrestador(String passPrestador) throws InterruptedException {
		driver.findElement(txtContrasena).sendKeys(passPrestador);
		Thread.sleep(5000);
		driver.findElement(btnEntrar).click();
		Thread.sleep(5000);
		
	}
	
	public void clickPestanaServicios() {
		driver.findElement(btnServicioPestana).click();
		
	}
	public void clickAgregarServicio() {
		driver.findElement(btnAgregarServicio).click();
	}
	
	public void enterDescripcion(String descripcion) 
	{
		driver.findElement(txtDescripcion).sendKeys(descripcion);
	}
	
	public void clickCategoria() {
		driver.findElement(btnCategoria).click();
	
	}
	
	public void clickSeleccionarCategoria() {
		driver.findElement(btnSeleccionarCategoria).click();
	
	}
	
	public void enterPrecio(String precio) {
		driver.findElement(txtPrecio).sendKeys(precio);
	}
	
	public void clickCalendario() {
		driver.findElement(btnFechaCalendario).click();
		driver.findElement(btnFechaDesdeAceptar).click();
	}
	
	public void clickJornada() {
		driver.findElement(btnJornada).click();
		driver.findElement(btnJornadaSeleccionada).click();
	}
	
	public void clickSiguiente() {
		driver.findElement(btnSiguiente).click();
		
	}
	
	public void clickDiasEntregaServicio() {
		driver.findElement(btnDiasEntregaServicioLunes).click();
		driver.findElement(btnDiasEntregaServicioMartes).click();
		driver.findElement(btnDiasEntregaServicioMiercoles).click();
		driver.findElement(btnDiasEntregaServicioJueves).click();
		driver.findElement(btnDiasEntregaServicioViernes).click();
		driver.findElement(btnDiasEntregaServicioSabado).click();
		driver.findElement(btnDiasEntregaServicioDomingo).click();
		
	}

	public void clickUbicacion() {
		driver.findElement(btnUbicacion).click();
		driver.findElement(btnUbicacionUsuario).click();
	}
	
	public void clickImagen() {
		
		
	}
	public void clickPublicar() {
		
		
	}
}
