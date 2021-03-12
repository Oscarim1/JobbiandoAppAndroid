package pages;

import org.openqa.selenium.By;

import appiumTest.BaseTest;
import io.appium.java_client.MobileElement;

public class CrearOfertaDeServicioPage extends BaseTest {
	MobileElement elemento=null; 
	
	By txtCorreo =By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.EditText");
	By txtContrasena =By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.EditText");
	By btnEntrar = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[4]");
	
	By btnDeny = By.xpath("//*[@text='DENY']");
	By btnAllow = By.xpath("//*[@text='ALLOW']");
	
	By btnDontAskAgain = By.id("com.android.packageinstaller:id/do_not_ask_checkbox");
	By btnServicioPestana=By.xpath("//*[@text='SERVICIOS']");
	By btnAgregarServicio=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.widget.HorizontalScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.TextView");
	By txtDescripcion=By.xpath("//*[@text='Ingrese descripcion']");
	By btnCategoria = By.xpath("//*[@class='android.widget.Spinner' and ./*[@text='Categoria : ']]");
	By btnSeleccionarCategoria=By.xpath("//*[@text='Enseñanza']");

	By btnSubCategoria = By.xpath("//*[@class='android.widget.Spinner' and ./*[@text='sub-Categoria : ']]");
	By btnSeleccionarSubCategoria = By.xpath("//*[@text='clases de matematicas']");	
	By txtPrecio = By.xpath("//*[@text='precio']");
	By btnFechaCalendario = By.xpath("//*[@text='Fecha Desde']");
	By btnFechaDesdeAceptar=By.xpath("//*[@text='OK']");
	By btnJornada=By.xpath("//*[@class='android.widget.Spinner' and ./*[@text='Todo el dia ']]");
	By btnJornadaSeleccionada=By.xpath("//*[@text='Todo el dia ']");
	By btnSiguiente=By.xpath("//*[@text='siguiente']");
	By btnDiasEntregaServicioLunes=By.xpath("//*[@text='' and ./parent::*[(./preceding-sibling::* | ./following-sibling::*)[@text='Lunes']]]");
	By btnDiasEntregaServicioMartes=By.xpath("//*[@text='' and ./parent::*[(./preceding-sibling::* | ./following-sibling::*)[@text='Martes']]]");
	By btnDiasEntregaServicioMiercoles=By.xpath("//*[@text='' and ./parent::*[(./preceding-sibling::* | ./following-sibling::*)[@text='Miercoles']]]");
	By btnDiasEntregaServicioJueves=By.xpath("//*[@text='' and ./parent::*[(./preceding-sibling::* | ./following-sibling::*)[@text='Jueves']]]");
	By btnDiasEntregaServicioViernes=By.xpath("//*[@text='' and ./parent::*[(./preceding-sibling::* | ./following-sibling::*)[@text='Viernes']]]");
	By btnDiasEntregaServicioSabado=By.xpath("//*[@text='' and ./parent::*[(./preceding-sibling::* | ./following-sibling::*)[@text='Sabado']]]");
	By btnDiasEntregaServicioDomingo=By.xpath("//*[@text='' and ./parent::*[(./preceding-sibling::* | ./following-sibling::*)[@text='Domingo']]]");
	By btnUbicacion=By.id("android:id/text1");
	By btnUbicacionUsuario=By.xpath("//*[@text='Casa']");
	
	By inputImagen=By.xpath("//*[@class='android.widget.ImageView']");
	By btnTomarImagen=By.xpath("//*[@text='Tomar una Foto']");
	By btnTake = By.xpath("//*[@resource-id=\"com.android.camera2:id/shutter_button\"]");
	By btnDone = By.xpath("//*[@resource-id=\"com.android.camera2:id/done_button\"]");
	By btnPublicar = By.xpath("//*[@text='Publicar']");
	
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
	 
	public void permisosDeny() throws InterruptedException{
		if(exist(btnDeny) != null) {

			driver.findElement(btnDeny).click();
			Thread.sleep(5000);
		}else {
		}
		
	}
	public void clickPestanaServicios() throws InterruptedException {
		
		driver.findElement(btnServicioPestana).click();
		
	}
	public void clickAgregarServicio() throws InterruptedException {
		
		if(exist(btnDontAskAgain) != null) {
			
			driver.findElement(btnDontAskAgain).click();
			Thread.sleep(5000);
			driver.findElement(btnDeny).click();
			Thread.sleep(5000);
			driver.findElement(btnAgregarServicio).click();
			Thread.sleep(5000);
			
		}else {
			
			driver.findElement(btnAgregarServicio).click();
			Thread.sleep(5000);
		}
		
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
	
	public void clickSubCategoria() {
		driver.findElement(btnSubCategoria).click();
	
	}
	
	public void clickSeleccionarSubCategoria() {
		driver.findElement(btnSeleccionarSubCategoria).click();
	
	}
	
	public void enterPrecio(String precio) {
		driver.findElement(txtPrecio).sendKeys(precio);
	}
	
	public void clickCalendario() throws InterruptedException {
		driver.findElement(btnFechaCalendario).click();
		Thread.sleep(5000);
		driver.findElement(btnFechaDesdeAceptar).click();
	}
	
	public void clickJornada() throws InterruptedException {
		driver.findElement(btnJornada).click();
		Thread.sleep(5000);
		driver.findElement(btnJornadaSeleccionada).click();
		this.funcionScrollDown();
	}
	
	public void clickSiguiente() throws InterruptedException {
		driver.findElement(btnSiguiente).click();
		Thread.sleep(5000);
		
	}
	
	public void clickDiasEntregaServicio() throws InterruptedException {
		driver.findElement(btnDiasEntregaServicioLunes).click();
		Thread.sleep(2000);
		driver.findElement(btnDiasEntregaServicioMartes).click();
		Thread.sleep(2000);
		driver.findElement(btnDiasEntregaServicioMiercoles).click();
		Thread.sleep(2000);
		driver.findElement(btnDiasEntregaServicioJueves).click();
		Thread.sleep(2000);
		driver.findElement(btnDiasEntregaServicioViernes).click();
		Thread.sleep(2000);
		driver.findElement(btnDiasEntregaServicioSabado).click();
		Thread.sleep(2000);
		driver.findElement(btnDiasEntregaServicioDomingo).click();
		clickSiguiente();
		
	}

	public void clickUbicacion() throws InterruptedException {
		driver.findElement(btnUbicacion).click();
		Thread.sleep(5000);
		driver.findElement(btnUbicacionUsuario).click();
		Thread.sleep(5000);
		this.funcionScrollDownCrearPeticionServicio();
		clickSiguiente();
		Thread.sleep(5000);
	}
	
	public void clickImagen() throws InterruptedException {
		driver.findElement(inputImagen).click();
		Thread.sleep(5000);
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
	public void clickPublicar() throws InterruptedException {
		driver.findElement(btnPublicar).click();
		Thread.sleep(5000);
	}
}
