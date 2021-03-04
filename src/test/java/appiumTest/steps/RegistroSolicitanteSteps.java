package appiumTest.steps;


import java.util.concurrent.TimeUnit;

import appiumTest.BaseTest;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.MobileElement;

import pages.RegistroPrestadorPage;


public class RegistroSolicitanteSteps extends BaseTest {
	
	RegistroPrestadorPage page=null;
	MobileElement elemento=null;
	@Given("Abrir app")
	public void abrir_navegador() throws Throwable {
	 
	 try{
		 //Se abre aplicación solicitante
		 openApp("com.easyjob","com.easyjob.MainActivity");

     }catch(Exception exp) {
         System.out.println(exp.getMessage());
         exp.printStackTrace();
         Thread.sleep(5000);
         
     }
	}

	@And("Ir al registro del Solicitante")
	public void ir_al_registro_del_Solicitante() throws Throwable {
		Thread.sleep(5000);
		page = new RegistroPrestadorPage(elemento);
		Thread.sleep(5000);
	    page.clickQuieroSerJobber();
	    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}

	@When("Completar el formulario de registro del solicitante")
	public void completar_el_formulario_de_registro_del_solicitante() throws Throwable {
		
		Thread.sleep(5000);
		page=new RegistroPrestadorPage(elemento);
	    Thread.sleep(4000);
	    page.enterNombres("ENRIC");
	    Thread.sleep(4000);
	   
	    page.enterApellidos("PARRAMON FLORES");
	    Thread.sleep(4000);
	    
	    page.enterFechaNacimiento("12 de 05 de 1995");
	    Thread.sleep(4000);
	   
	    page.enterCorreo("randomail250@gmailnator.com");
	    Thread.sleep(4000);
	    
	    page.enterContrasena("Hola1234");
	    Thread.sleep(4000);
	    
	    page.clickCedulaDeIdentidad("637106066");
	    Thread.sleep(4000);
	    
	    page.enterIdentificador("618513922");
	    Thread.sleep(4000);
	    
	    page.enterCalle("Sin calle");
	    Thread.sleep(4000);
	    
	    page.enterDireccion("L-331, Colbun, Colbún, Maule, Chile");
	    Thread.sleep(4000);
	    
	    page.enterNombreDireccion("Casa");
	    Thread.sleep(4000);
	    
	    page.enterReferencia("Sin referencia");
	    Thread.sleep(4000);
	 
	}

	@And("hacer click en boton registrar")
	public void hacer_click_en_boton_registrar() throws Throwable {
		
	}

	@Then("Ir a sitio de login")
	public void ir_a_sitio_de_login() throws Throwable {
	    
	}
}