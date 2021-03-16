package appiumTest.steps;


import java.util.concurrent.TimeUnit;

import appiumTest.BaseTest;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import dataProviders.ConfigFileReader;
import io.appium.java_client.MobileElement;

import pages.RegistroPrestadorPage;


public class RegistroSolicitanteSteps extends BaseTest {
	static ConfigFileReader configFileReader= new ConfigFileReader();
	RegistroPrestadorPage page=null;
	MobileElement elemento=null;
	
	@Given("Abrir app solicitante")
	public void abrir_app_solicitante() throws Throwable {
	 
	 try{
		 openApp(configFileReader.getappPackageSolicitante(),configFileReader.getappActivitySolicitante());
     }catch(Exception exp) {
         System.out.println(exp.getMessage());
         exp.printStackTrace();
         Thread.sleep(5000);
         
     }
	}

	@And("Ir al registro del Solicitante")
	public void ir_al_registro_del_Solicitante() throws Throwable {
		page = new RegistroPrestadorPage(elemento);
	    page.clickQuieroSerJobber();
	    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}

	@When("Completar el formulario de registro del solicitante")
	public void completar_el_formulario_de_registro_del_solicitante() throws Throwable {
		
		page=new RegistroPrestadorPage(elemento);
	    page.enterNombres("ENRIC");
	    page.enterApellidos("PARRAMON FLORES");
	    page.enterFechaNacimiento("12 de 05 de 1995");	   
	    page.enterCorreo("randomail250@gmailnator.com");	    
	    page.enterContrasena("Hola1234");	    
	    page.clickCedulaDeIdentidad("637106066");	    
	    page.enterIdentificador("618513922");	    
	    page.enterCalle("Sin calle");	    
	    page.enterDireccion("L-331, Colbun, Colbún, Maule, Chile");	    
	    page.enterNombreDireccion("Casa");	    
	    page.enterReferencia("Sin referencia");	 
	}

	@And("hacer click en boton registrar")
	public void hacer_click_en_boton_registrar_solicitante() throws Throwable {
		page = new RegistroPrestadorPage(elemento);	
	    page.clickCrearCuenta();
	    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}

	@Then("Ir a sitio de login solicitante")
	public void ir_a_sitio_de_login_solicitante() throws Throwable {
	    
	}
}