package pages;

import org.openqa.selenium.By;

import appiumTest.BaseTest;
import io.appium.java_client.MobileElement;


public class IniciaTrabajosSolicitudServicioPage extends BaseTest{
	MobileElement elemento=null; 
	
	By txtCorreo =By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.EditText");
	By txtContrasena =By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.EditText");
	By btnEntrar = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[4]");
	
	By btnDeny = By.xpath("//*[@text='DENY']");
	By btnAllow = By.xpath("//*[@text='ALLOW']");
	By btnServicioPestana=By.xpath("//*[@text='SERVICIOS']");
	By btnPeticiones=By.xpath("//*[@text='Peticiones']");
	By btnEspera=By.xpath("//*[@text='ESPERA']");
	By btnAceptar = By.xpath("//*[@text='ACEPTAR']");
	By btnSolicitudPestana=By.xpath("//*[@text='SOLICITUD']");
	By btnSolicitudAceptada = By.xpath("//*[@text='SOLICITUD ACEPTADA']");
	By btnActualizarEstadoEnCamino = By.xpath("//*[@text='ACTUALIZAR ESTADO A EN CAMINO']");
	By btnActualizar = By.xpath("//*[@text='ACTUALIZAR']");
	By btnOk = By.xpath("//*[@text='OK']");
	By btnActualizarEstadoEjecutandoServicio = By.xpath("//*[@text='ACTUALIZAR ESTADO A EJECUTAR']");
	By inputLlegada = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ImageView");
	By inputSolicitante = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.ImageView");	
	By inputTrabajo = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[4]/android.view.ViewGroup/android.widget.ImageView");
	
	By btnSubCategoria = By.xpath("//*[@class='android.widget.Spinner' and ./*[@text='sub-Categoria : ']]");
	By btnSeleccionarSubCategoria = By.xpath("//*[@text='clases de matematicas']");	
	By txtPrecio = By.xpath("//*[@text='precio']");
	By btnFechaCalendario = By.xpath("//*[@text='Fecha Desde']");
	By btnFechaDesdeAceptar=By.xpath("//*[@text='OK']");
	By btnJornada=By.xpath("//*[@class='android.widget.Spinner' and ./*[@text='Todo el dia ']]");
	By btnJornadaSeleccionada=By.xpath("//*[@text='Todo el dia ']");
	By btnSiguiente=By.xpath("//*[@text='siguiente']");
	
	By btnUbicacion=By.id("android:id/text1");
	By btnUbicacionUsuario=By.xpath("//*[@text='Casa']");
	
	By inputImagen=By.xpath("//*[@class='android.widget.ImageView']");
	By btnTomarImagen=By.xpath("//*[@text='Tomar una Foto']");
	By btnTake = By.xpath("//*[@resource-id=\"com.android.camera2:id/shutter_button\"]");
	By btnDone = By.xpath("//*[@resource-id=\"com.android.camera2:id/done_button\"]");
	By btnPublicar = By.xpath("//*[@text='Publicar']");
	
	public IniciaTrabajosSolicitudServicioPage(MobileElement elemento) 
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
		
		driver.findElement(btnDeny).click();
		Thread.sleep(5000);
		
	}
	
	public void clickServicio() throws InterruptedException{
		
		driver.findElement(btnServicioPestana).click();
		Thread.sleep(5000);
		driver.findElement(btnPeticiones).click();
		Thread.sleep(5000);
		driver.findElement(btnEspera).click();
		Thread.sleep(5000);
		this.funcionScrollDown(0.9,0.1);
		Thread.sleep(2000);
		driver.findElement(btnAceptar).click();
		Thread.sleep(5000);
		driver.findElement(btnAceptar).click();
		Thread.sleep(5000);
		driver.findElement(btnOk).click();
	}
	
	public void clickSolicitud() throws InterruptedException{
		
		driver.findElement(btnSolicitudPestana).click();
		Thread.sleep(5000);
	}
	
	public void clickSeleccionaSolicitud() throws InterruptedException{
		
		while(btnExist(btnSolicitudAceptada) == null) {
			this.funcionScrollDown(0.8,0.6);
		}
		driver.findElement(btnSolicitudAceptada).click();
		Thread.sleep(5000);
		this.funcionScrollDown(0.9,0.1);
		Thread.sleep(2000);
		
		
	}
	
	public void clickAvanzarEstadoEnCamino() throws InterruptedException{
		
		driver.findElement(btnActualizarEstadoEnCamino).click();
		Thread.sleep(5000);
		driver.findElement(btnActualizar).click();
		Thread.sleep(5000);
		driver.findElement(btnOk).click();
		Thread.sleep(5000);
		
	}
	
	public void clickAvanzarEstadoEjecutandoServicios() throws InterruptedException{
		
		driver.findElement(btnActualizarEstadoEjecutandoServicio).click();
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
	
	public void camara2() throws InterruptedException{
		
		driver.findElement(btnTomarImagen).click();
		Thread.sleep(5000);
		driver.findElement(btnTake).click();
		Thread.sleep(5000);
		driver.findElement(btnDone).click();
		Thread.sleep(5000);
		
	}
	
	public void inputServicio() throws InterruptedException{
		
		driver.findElement(inputLlegada).click();
		Thread.sleep(5000);
		camara();
		driver.findElement(inputSolicitante).click();
		Thread.sleep(5000);
		camara2();
		driver.findElement(inputTrabajo).click();
		Thread.sleep(5000);
		camara2();
		clickAvanzarEstadoEjecutandoServicios();
		driver.findElement(btnActualizar).click();
		Thread.sleep(5000);
		driver.findElement(btnOk).click();
		Thread.sleep(5000);
		
	}
	
}
