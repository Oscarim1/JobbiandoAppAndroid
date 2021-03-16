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

public class RegistroPrestadorSteps extends BaseTest {
	static ConfigFileReader configFileReader= new ConfigFileReader();
	RegistroPrestadorPage page=null;
	MobileElement elemento=null;
	@Given("Abrir app prestador")
	public void abrir_app_prestador() throws Throwable {
	 
	 try{
		 openApp(configFileReader.getappPackagePrestador(),configFileReader.getappActivityPrestador());

     }catch(Exception exp) {
         System.out.println(exp.getMessage());
         exp.printStackTrace();
         Thread.sleep(5000);      
     }
	}

	@And("Ir al registro del Prestador")
	public void ir_al_registro_del_Prestador() throws Throwable {
		page = new RegistroPrestadorPage(elemento);
	    page.clickQuieroSerJobber();
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}

	@When("Completar el formulario de registro del prestador")
	public void completar_el_formulario_de_registro_del_prestador() throws Throwable {	
		page=new RegistroPrestadorPage(elemento);
	    page.enterNombres("LLU�S");	   
	    page.enterApellidos("ZAMBUDIO FIGULS");	    
	    page.enterFechaNacimiento("12 de 05 de 1995");	   
	    page.enterCorreo("randomail215@gmailnator.com");    
	    page.enterContrasena("Hola1234");    
	    page.clickCedulaDeIdentidad("980631966");    
	    page.enterIdentificador("232218529");	    
	    page.enterCalle("Sin calle");	    
	    page.enterDireccion("L-331, Colbun, Colb�n, Maule, Chile");	    
	    page.enterNombreDireccion("Casa");    
	    page.enterReferencia("Sin referencia"); 
	}

	@Then("click en boton registrar prestador")
	public void click_en_boton_registrar_prestador() throws Throwable {
		page = new RegistroPrestadorPage(elemento);	
	    page.clickCrearCuenta();
	    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}

	
}
