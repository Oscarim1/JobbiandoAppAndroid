package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;

import appiumTest.BaseTest;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;


import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;






public class ValidarAntecedentesPage extends BaseTest {
	MobileElement elemento=null; 
	By btnOlvideContrasena = By.xpath("//*[@text=\"Olvidaste tu contraseña?\"]");
	By btnGoBackLogin = By.xpath("//*[@text=\"Go back to login\"]");
	By txtEmail  = By.xpath("//*[@resource-id=\"mat-input-1\"]");
	By txtPass  = By.xpath("//*[@resource-id=\"mat-input-2\"]");
	By btnEntrar  = By.xpath("//*[@resource-id=\"btnEntrar\"]");	

	By btnBarraLateral = By.className("android.widget.Button");
	By btnRevisarAntecedentes = By.xpath("//*[@text=\"Revisar antecedentes\"]");	
			
	public ValidarAntecedentesPage(MobileElement elemento) 
	{
		
		this.elemento=elemento;
	}
	
	public void iniciarSesion() throws InterruptedException {
		
		driver.findElement(btnOlvideContrasena).click();
		Thread.sleep(15000);
		driver.findElement(btnGoBackLogin).click();
		Thread.sleep(5000);
				
	}
	
	public void enterUsernameAdmin(String username) throws InterruptedException {
		
		driver.findElement(txtEmail).sendKeys(username);
		Thread.sleep(5000);
	}
	
	public void enterPassAdmin(String passAdmin) throws InterruptedException {
		
		driver.findElement(txtPass).sendKeys(passAdmin);
		Thread.sleep(3000);
		driver.findElement(btnEntrar).click();
		Thread.sleep(3000);
		//driver.findElement(btnBlock).click();
		//Thread.sleep(3000);
		
	}
	
	public void BarraLateral() throws InterruptedException {
		driver.findElement(btnBarraLateral).click();
		Thread.sleep(3000);
		this.funcionScrollDown();
		Thread.sleep(3000);
		driver.findElement(btnRevisarAntecedentes).click();
		Thread.sleep(3000);
	}
		
}

	
	
