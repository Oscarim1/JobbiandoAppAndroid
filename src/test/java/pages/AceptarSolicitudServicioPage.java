package pages;

import org.openqa.selenium.By;

import appiumTest.BaseTest;
import io.appium.java_client.MobileElement;

public class AceptarSolicitudServicioPage extends BaseTest {
	MobileElement elemento=null;
	
	By txtCorreo =By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.EditText");
	By txtContrasena =By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.EditText");
	By btnEntrar = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[4]");
	By btnOcultarTeclado=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.ImageView");
	By txtCategoriaPrestador=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.ScrollView[1]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView[1]/android.view.ViewGroup/android.widget.TextView[2]");
	By btnPermitirAccesoUbicacion=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.Button[1]");
	By btnRealizarSolicitud=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[10]/android.widget.TextView");
	By btnRealizar=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.TextView");	
	By btnDeny = By.xpath("//*[@text='ALLOW']");
	By btnSeleccionarUbicacion=By.xpath("//*[@text='Tu ubicación :']");
	By btnUbicacion=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup\r\n");
	
	
	public AceptarSolicitudServicioPage(MobileElement elemento) throws InterruptedException
	{
		this.elemento=elemento;
	}
	
	/////////////////////////LOGIN/////////////////////////////////////////
	public void enterCorreo(String correo) throws InterruptedException
	{
		driver.findElement(txtCorreo).sendKeys(correo);
		Thread.sleep(3000);
	}
	
	public void enterContrasena(String contrasena) throws InterruptedException
	{
		driver.findElement(txtContrasena).sendKeys(contrasena);
		Thread.sleep(3000);
	}
	public void clickOcultarTeclado() throws InterruptedException
	{
		driver.findElement(btnOcultarTeclado).click();
		Thread.sleep(5000);
	}
	public void clickEntrar() throws InterruptedException
	{
		driver.findElement(btnEntrar).click();
		Thread.sleep(15000);
		Thread.sleep(10000);
		if(exist(btnDeny) != null) {

			driver.findElement(btnDeny).click();
			Thread.sleep(5000);
		
		}else {}
	}
	public void clickSeleccionarUbicacion()throws InterruptedException {
		driver.findElement(btnSeleccionarUbicacion).click();
		Thread.sleep(9000);
		
	}
	public void clickUbicacion()throws InterruptedException {
		driver.findElement(btnUbicacion).click();
		Thread.sleep(9000);
		
	}

	public void compararCategorias() throws InterruptedException{
		
		String catPrestador= driver.findElement(txtCategoriaPrestador).getAttribute("text");
		
		int n=1;
		do {
			this.funcionScrollDown(0.8,0.6);
			n++;
			System.out.println("Categoria del prestador: "+catPrestador);
			System.out.println("Categoria de la solicitud: "+elementExistSolicitud(n));
		}while(elementExistSolicitud(n)==catPrestador);
			
		driver.findElementByXPath("//*[@text=\""+this.elementExistSolicitud(n)+"\"]").click();
		Thread.sleep(5000);
	   }
		
	public void clickRealizarSolicitud()throws InterruptedException{
		this.funcionScrollDown(0.9,0.1);
		driver.findElement(btnRealizarSolicitud).click();
		Thread.sleep(5000);
	}
	public void clickRealizar()throws InterruptedException{
		
		driver.findElement(btnRealizar).click();
		Thread.sleep(5000);
	}
	
}
