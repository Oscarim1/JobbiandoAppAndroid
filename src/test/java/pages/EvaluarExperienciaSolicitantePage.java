package pages;
import org.openqa.selenium.By;
import appiumTest.BaseTest;
import io.appium.java_client.MobileElement;

public class EvaluarExperienciaSolicitantePage extends BaseTest {
	MobileElement elemento=null;
	By txtCorreo =By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.EditText");
	By txtContrasena =By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.EditText");
	By btnEntrar = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[4]");
	By btnOcultarTeclado=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.ImageView");
	By btnDeny = By.xpath("//*[@text='DENY']");
	By btnDontAskAgain = By.id("com.android.packageinstaller:id/do_not_ask_checkbox");
	By btnPestanaSolicitud=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[3]");
	By btnPestanaEnProceso=By.xpath("//*[@text='En Proceso']");
	By btnEvaluarExperiencia=By.xpath("//*[@text='EVALUAR EXPERIENCIA']");
	By txtDescripcion =By.xpath("//*[@class='android.widget.EditText']");
	By btnOcultarTeclado2=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.TextView[1]");
	By btnSeleccionarCriterio=By.xpath("//*[@resource-id=\"android:id/text1\"]");
	By btnCriterio = By.xpath("//*[@text='Rapidez']");
	By btnEnviarEvaluacion = By.xpath("//*[@text='ENVIAR EVALUACIÓN']");
	By btnOk = By.xpath("//*[@text='OK']");
	
	public EvaluarExperienciaSolicitantePage(MobileElement elemento) throws InterruptedException
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
		if(exist(btnOcultarTeclado)!=null) {
			driver.findElement(btnOcultarTeclado).click();
		Thread.sleep(5000);
		}	
	}
	public void clickEntrar() throws InterruptedException
	{
		driver.findElement(btnEntrar).click();
		Thread.sleep(25000);
	}
	/////////////////////////LOGIN/////////////////////////////////////////
	public void clickPestanaSolicitud() throws InterruptedException
	{Thread.sleep(5000);
		if(exist(btnDeny) != null) {
			driver.findElement(btnDeny).click();
			Thread.sleep(5000);
			driver.findElement(btnPestanaSolicitud).click();
			Thread.sleep(10000);
		}else {
			//no hara nada
		}
		driver.findElement(btnPestanaSolicitud).click();
		Thread.sleep(10000);
	}
	public void clickPestanaEnProceso() throws InterruptedException
	{
		if(exist(btnDontAskAgain) != null) {
			driver.findElement(btnDontAskAgain).click();
			Thread.sleep(5000);
			driver.findElement(btnDeny).click();
			Thread.sleep(5000);
			driver.findElement(btnPestanaEnProceso).click();
			Thread.sleep(10000);
		}else {
			driver.findElement(btnPestanaEnProceso).click();
			Thread.sleep(10000);
		}
	}
	public void clickEvaluarExperiencia() throws InterruptedException
	{
		driver.findElement(btnEvaluarExperiencia).click();
		Thread.sleep(10000);
		while(exist(btnEvaluarExperiencia)==null) {
			this.funcionScrollDown(0.9,0.1);
			Thread.sleep(3000);
		}		
		driver.findElement(btnEvaluarExperiencia).click();
		Thread.sleep(10000);
	}
	public void enterDescripcion(String descripcion)throws InterruptedException
	{
		if(exist(btnEnviarEvaluacion)==null) {
			this.funcionScrollDown(0.9,0.1);
			Thread.sleep(3000);
		}else {
		driver.findElement(txtDescripcion).sendKeys(descripcion);
		Thread.sleep(3000);}
	}
	public void clickOcultarTeclado2() throws InterruptedException
	{
		driver.findElement(btnOcultarTeclado2).click();
		Thread.sleep(5000);
	}
	public void clickSeleccionarCriterio() throws InterruptedException
	{
		driver.findElement(btnSeleccionarCriterio).click();
		Thread.sleep(5000);
	}
	public void clickCriterio() throws InterruptedException
	{
		driver.findElement(btnCriterio).click();
		Thread.sleep(5000);
	}
	public void clickEnviarEvaluacion() throws InterruptedException
	{
		driver.findElement(btnEnviarEvaluacion).click();
		Thread.sleep(5000);
		driver.findElement(btnOk).click();
		Thread.sleep(5000);
	}
}
