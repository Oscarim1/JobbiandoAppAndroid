package appiumTest.steps;


import java.util.concurrent.TimeUnit;


import appiumtests.BaseTest;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.cucumber.java.en.When;
import pages.RegistroPrestadorPage;


public class RegistroPrestadorSteps extends BaseTest {
	
	RegistroPrestadorPage page=null;
	AppiumDriver<MobileElement> driver=null;
	@Given("Abrir app")
	public void abrir_navegador() throws Throwable {
	 openApp();
	
	}

	@And("Ir al registro del Prestador")
	public void ir_al_registro_del_Prestador() throws Throwable {
		page = new RegistroPrestadorPage(driver);
	    
	    page.clickQuieroSerJobber();
	    
	    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}

	@When("Completar el formulario de registro del prestador")
	public void completar_el_formulario_de_registro_del_prestador() throws Throwable {
	    
	}

	@And("hacer click en boton registrar")
	public void hacer_click_en_boton_registrar() throws Throwable {
	    
	}

	@Then("Ir a sitio de login")
	public void ir_a_sitio_de_login() throws Throwable {
	    
	}
}
