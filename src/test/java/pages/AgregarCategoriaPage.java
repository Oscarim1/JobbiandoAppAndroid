package pages;
import org.openqa.selenium.By;
import appiumTest.BaseTest;
import io.appium.java_client.MobileElement;

public class AgregarCategoriaPage extends BaseTest {
	MobileElement elemento=null; 
	By txtCorreo =By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.EditText");
	By txtContrasena =By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.EditText");
	By btnEntrar = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[4]");
	By btnDeny = By.xpath("//*[@text='DENY']");
	By btnAllow = By.xpath("//*[@text='ALLOW']");
	By btnDontAskAgain = By.id("com.android.packageinstaller:id/do_not_ask_checkbox");
	By btnAgregar=By.xpath("//*[@text='']");
	By btnAgregarCategoria=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView");
	By btnOk = By.xpath("//*[@text='OK']");
	
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
	public void clickEntrar() throws InterruptedException
	{
		driver.findElement(btnEntrar).click();
		Thread.sleep(5000);
	}
	public void permisosAllow() throws InterruptedException{
		if(exist(btnAllow) != null) {
			driver.findElement(btnAllow).click();
			Thread.sleep(5000);
		}else {
			//no hara nada
		}	
	}
	public void clickAgregar() throws InterruptedException 
	{
		driver.findElement(btnAgregar).click();
		Thread.sleep(5000);	
	}
	public void clickAgregarCategoria() throws InterruptedException 
	{
		if(exist(btnDontAskAgain) != null) {
			driver.findElement(btnDontAskAgain).click();
			Thread.sleep(5000);
			driver.findElement(btnDeny).click();
			driver.findElement(btnAgregarCategoria).click();
			Thread.sleep(5000);
			driver.findElement(btnOk).click();
			Thread.sleep(5000);
		}else {
			driver.findElement(btnAgregarCategoria).click();
			Thread.sleep(5000);
			driver.findElement(btnOk).click();
			Thread.sleep(5000);
		}
	}
}
