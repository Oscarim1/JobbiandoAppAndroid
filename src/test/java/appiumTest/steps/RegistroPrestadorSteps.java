package appiumTest.steps;






import java.util.concurrent.TimeUnit;

import appiumTest.BaseTest;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.MobileElement;

import pages.RegistroPrestadorPage;


public class RegistroPrestadorSteps extends BaseTest {
	
	RegistroPrestadorPage page=null;
	MobileElement elemento=null;
	@Given("Abrir app")
	public void abrir_navegador() throws Throwable {
	 
	 try{
		 openApp();

     }catch(Exception exp) {
         System.out.println(exp.getMessage());
         exp.printStackTrace();
         Thread.sleep(5000);
         
     }
	}

	@And("Ir al registro del Prestador")
	public void ir_al_registro_del_Prestador() throws Throwable {
		Thread.sleep(5000);
		page = new RegistroPrestadorPage(elemento);
		Thread.sleep(5000);
	    page.clickQuieroSerJobber();
	    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}

	@When("Completar el formulario de registro del prestador")
	public void completar_el_formulario_de_registro_del_prestador() throws Throwable {
		
		Thread.sleep(5000);
		page=new RegistroPrestadorPage(elemento);
	    Thread.sleep(4000);
	    page.enterNombres("DAVID");
	    Thread.sleep(4000);
	   
	    page.enterApellidos("ALGUÉ TRANCHO");
	    Thread.sleep(4000);
	   
	    page.enterCorreo("randomail256@gmailnator.com");
	    Thread.sleep(4000);
	  
	 
	}

	@And("hacer click en boton registrar")
	public void hacer_click_en_boton_registrar() throws Throwable {
	    
	}

	@Then("Ir a sitio de login")
	public void ir_a_sitio_de_login() throws Throwable {
	    
	}
}
