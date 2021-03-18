package pages;

import org.openqa.selenium.By;

import appiumTest.BaseTest;
import io.appium.java_client.MobileElement;

public class CrearOfertaDeServicioPage extends BaseTest {
	MobileElement elemento=null; 
	
	By txtCorreo =By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.EditText");
	By txtContrasena =By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.EditText");
	By btnEntrar = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[4]");
	By btnOcultarTeclado=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.ImageView");
	By btnDeny = By.xpath("//*[@text='DENY']");
	By btnAllow = By.xpath("//*[@text='ALLOW']");
	
	By btnDontAskAgain = By.id("com.android.packageinstaller:id/do_not_ask_checkbox");
	By btnServicioPestana=By.xpath("//*[@text='SERVICIOS']");
	By btnAgregarServicio=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.widget.HorizontalScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.TextView");
	By txtDescripcion=By.xpath("//*[@text='Ingrese descripcion']");
	By btnCategoria = By.xpath("//*[@class='android.widget.Spinner' and ./*[@text='Categoria : ']]");
	By btnSeleccionarCategoria=By.xpath("//*[@text='Servicios de cuidado personal y bienestar']");

	By btnSubCategoria = By.xpath("//*[@class='android.widget.Spinner' and ./*[@text='sub-Categoria : ']]");
	By btnSeleccionarSubCategoria = By.xpath("//*[@text='Masajes']");	
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
	By btnOk = By.xpath("//*[@text='OK']");
	
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
		Thread.sleep(8000);
		
		
	}
	public void clickOcultarTeclado() throws InterruptedException
	{
		if(exist(btnOcultarTeclado)!=null) {
			driver.findElement(btnOcultarTeclado).click();
			Thread.sleep(5000);
		}
		
	}
	
	public void clickEntrar() throws InterruptedException
	{
		driver.findElement(btnEntrar).click();
		Thread.sleep(20000);
	}
	
	 
	public void permisosDeny() throws InterruptedException{
		if(exist(btnDeny) != null) {

			driver.findElement(btnDeny).click();
			Thread.sleep(8000);
		}else {
		}
		
	}
	public void clickPestanaServicios() throws InterruptedException {
		
		driver.findElement(btnServicioPestana).click();
		Thread.sleep(9000);
		
	}
	public void clickAgregarServicio() throws InterruptedException {
		
		driver.findElement(btnAgregarServicio).click();
		Thread.sleep(5000);
		if(exist(btnDontAskAgain) != null) {
			
			driver.findElement(btnDontAskAgain).click();
			Thread.sleep(5000);
			driver.findElement(btnDeny).click();
			Thread.sleep(5000);			
		}else {
			
		}
		
	}
	
	public void enterDescripcion(String descripcion) throws InterruptedException
	{
		driver.findElement(txtDescripcion).sendKeys(descripcion);
		Thread.sleep(5000);
	}
	
	public void clickCategoria() throws InterruptedException{
		driver.findElement(btnCategoria).click();
		Thread.sleep(5000);
		
	}
	
	public void clickSeleccionarCategoria() throws InterruptedException{
		
		while(exist(btnSeleccionarCategoria) == null) {
			
			this.funcionScrollDown(0.8, 0.4);	
		}
		driver.findElement(btnSeleccionarCategoria).click();
		Thread.sleep(5000);
		
	}
	
	public void clickSubCategoria() throws InterruptedException{
		driver.findElement(btnSubCategoria).click();
		Thread.sleep(5000);
	}
	
	public void clickSeleccionarSubCategoria()throws InterruptedException {
		driver.findElement(btnSeleccionarSubCategoria).click();
		Thread.sleep(5000);
	}
	
	public void enterPrecio(String precio)throws InterruptedException {
		driver.findElement(txtPrecio).sendKeys(precio);
		Thread.sleep(9000);
	}
	
	public void clickCalendario() throws InterruptedException {
		driver.findElement(btnFechaCalendario).click();
		Thread.sleep(5000);
		driver.findElement(btnFechaDesdeAceptar).click();
		Thread.sleep(9000);
	}
	
	public void clickJornada() throws InterruptedException {
		driver.findElement(btnJornada).click();
		Thread.sleep(5000);
		driver.findElement(btnJornadaSeleccionada).click();
		
	}
	
	public void clickSiguiente() throws InterruptedException {
		while(exist(btnSiguiente)==null){
			this.funcionScrollDown(0.8, 0.1);
		}
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
		Thread.sleep(9000);
		
	}

	public void clickUbicacion() throws InterruptedException {
		driver.findElement(btnUbicacion).click();
		Thread.sleep(5000);
		driver.findElement(btnUbicacionUsuario).click();
		Thread.sleep(5000);
		this.funcionScrollDown(0.4,0.1);
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
		driver.findElement(btnOk).click();
		Thread.sleep(5000);
		
	}
}
