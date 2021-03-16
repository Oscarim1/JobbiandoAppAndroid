package pages;
import org.openqa.selenium.By;

import appiumTest.BaseTest;
import io.appium.java_client.MobileElement;

public class AgregarCategoriaPage extends BaseTest {
	MobileElement elemento=null; 	
	By txtCorreo =By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.EditText");
	By txtContrasena =By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.EditText");
	By btnEntrar = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[4]");
	By btnOcultarTeclado=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.ImageView");
	By btnAgregar=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView[2]/android.view.ViewGroup/android.widget.TextView[1]");
	By btnDeny = By.xpath("//*[@text='DENY']");
	By btnAllow = By.xpath("//*[@text='ALLOW']");
	/////MODIFICAR VIEW GROUP PRA ELEGIR CATEGORIA
	By btnAgregarCategoria=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[10]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup");
	By btnOk=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView");
	public AgregarCategoriaPage(MobileElement elemento) 
	{
		this.elemento=elemento;
	}
	
	public void enterCorreo(String correo) throws InterruptedException
	{
		driver.findElement(txtCorreo).sendKeys(correo);
		Thread.sleep(5000);
	}
	
	public void enterContrasena(String contrasena) throws InterruptedException
	{
		driver.findElement(txtContrasena).sendKeys(contrasena);
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
		Thread.sleep(15000);
	}
	public void permisosDeny() throws InterruptedException{
		if(exist(btnDeny) != null) {

			driver.findElement(btnDeny).click();
			Thread.sleep(15000);
		}else {
		}
		
	}
	public void clickAgregar() throws InterruptedException 
	{
		driver.findElement(btnAgregar).click();
		Thread.sleep(5000);
		
	}
	public void clickAgregarCategoria() throws InterruptedException 
	{
		driver.findElement(btnAgregarCategoria).click();
		Thread.sleep(5000);
		driver.findElement(btnOk).click();
		Thread.sleep(5000);
	}
	
}
