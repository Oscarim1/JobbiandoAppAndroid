package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;

import appiumTest.BaseTest;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class ValidarAntecedentesPage extends BaseTest {
	MobileElement elemento=null; 
	By btnAcceptAndContinue = By.xpath("//*[@resource-id=\"com.android.chrome:id/terms_accept\"]");
	By btnNext = By.xpath("//*[@resource-id=\"com.android.chrome:id/next_button\"]");
	By btnNoThanks = By.xpath("//*[@resource-id=\"com.android.chrome:id/negative_button\"]");
	By btnBuscador = By.xpath("//*[@resource-id=\"com.android.chrome:id/search_box_text\"]");
	By btnUrlBar = By.xpath("//*[@resource-id=\"com.android.chrome:id/url_bar\"]");
	

	
	public ValidarAntecedentesPage(MobileElement elemento) 
	{
		
		this.elemento=elemento;
	}
	
	public void iniciarSesion() throws InterruptedException {
		
		driver.findElement(btnAcceptAndContinue).click();
		Thread.sleep(3000);
		driver.findElement(btnNext).click();
		Thread.sleep(3000);
		driver.findElement(btnNoThanks).click();
		Thread.sleep(3000);

		
	}
	
	public void enterUrl(String url) throws InterruptedException {
		
		Thread.sleep(3000);
		
		driver.findElement(btnBuscador).click();
		Thread.sleep(5000);
		System.out.println(url);
		driver.findElement(btnUrlBar).sendKeys(url);
		Thread.sleep(3000);
		//driver.findElement(btnBuscador).submit();
		Thread.sleep(3000);
	}
	
	public void enterUsername(String username) throws InterruptedException {
		
		Thread.sleep(3000);
		driver.findElement(btnBuscador).sendKeys(username);
		
	}
	
	public void enterPassword(String password) throws InterruptedException {
		
		Thread.sleep(3000);
		driver.findElement(btnBuscador).sendKeys(password);
	}
		
}

	
	
