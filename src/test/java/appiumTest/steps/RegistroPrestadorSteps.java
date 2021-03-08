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
		Thread.sleep(5000);
		page = new RegistroPrestadorPage(elemento);
		Thread.sleep(36000);
	    page.clickQuieroSerJobber();
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}

	@When("Completar el formulario de registro del prestador")
	public void completar_el_formulario_de_registro_del_prestador() throws Throwable {
		
		Thread.sleep(9000);
		page=new RegistroPrestadorPage(elemento);
	    Thread.sleep(9000);
	    page.enterNombres("ENRIC");
	    Thread.sleep(9000);
	   
	    page.enterApellidos("PARRAMON FLORES");
	    Thread.sleep(9000);
	    
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

	@And("hacer click en boton registrar prestador")
	public void hacer_click_en_boton_registrar_prestador() throws Throwable {
		Thread.sleep(5000);
		page = new RegistroPrestadorPage(elemento);
		
	    page.clickCrearCuenta();
	    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}

	@Then("Ir a sitio de login del prestador")
	public void ir_a_sitio_de_login_prestador() throws Throwable {
	    
	}
}
