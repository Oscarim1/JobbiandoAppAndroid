package appiumTest.steps;

import java.util.concurrent.TimeUnit;

import appiumtests.AppiumTest;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import pages.RegistroPrestadorPage;
import cucumber.api.junit.Cucumber;

public class RegistroPrestadorSteps extends AppiumTest {
	
	RegistroPrestadorPage page=null;
	@Given("Abrir navegador")
	public void abrir_navegador() throws InterruptedException{
		
		try {
			openApp();
			}catch(Exception exp) {
				System.out.println(exp.getCause());
				System.out.println(exp.getMessage());
				exp.printStackTrace();
				}
	    Thread.sleep(1000);
	    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	    
	    driver.navigate().to("https://app.jobbiando.cl");
	    Thread.sleep(2000);
	}
	
	@And("Ir al registro del Prestador")
	public void ir_al_registro_del_prestador() throws InterruptedException {
		//navegamos a la aplicacion

	    page = new RegistroPrestadorPage(driver);
	    
	    //hacemos click en "Quiero ser jobber"
	    page.clickQuieroSerJobber();
	    
	    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}
}
