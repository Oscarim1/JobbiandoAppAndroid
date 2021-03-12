package appiumTest.steps;

import appiumTest.BaseTest;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import dataProviders.ConfigFileReader;
import io.appium.java_client.MobileElement;

import pages.ValidarAntecedentesPage;


public class ValidarAntecedentesSteps extends BaseTest {
	
	static ConfigFileReader configFileReader= new ConfigFileReader();
	ValidarAntecedentesPage page=null;
	MobileElement elemento=null;
	@Given("Abrir el navegador")
	public void abrir_navegador() throws Throwable {
	 
	 try{
		 openApp(configFileReader.getappPackagePrestador(),configFileReader.getappActivityPrestador());
		 Thread.sleep(15000);
		 page = new ValidarAntecedentesPage(elemento);
		 page.iniciarSesion();
		 page.enterUsernameAdmin(emailAdmin);
		 page.enterPassAdmin(passAdmin);

     }catch(Exception exp) {
         System.out.println(exp.getMessage());
         exp.printStackTrace();
         Thread.sleep(5000);
         
     }
	 
	}

	@And("Ir a revisar antecedentes")
	public void ir_a_revisar_antecedentes() throws Throwable {
		
		page=new ValidarAntecedentesPage(elemento);
		page.barraLateral();	    	   	 
	}

	@When("Seleccionar al usuario al que se le validaran los antecedentes")
	public void seleccionar_al_usuario_al_que_se_le_validaran_los_antecedentes() throws Throwable {
		page=new ValidarAntecedentesPage(elemento);	    
		page.filtroNombre("Enric Parramon Flores");
	 
	}

	@And("hacer click en validar antecedentes")
	public void hacer_click_en_validar_antecedentes() throws Throwable {
		page=new ValidarAntecedentesPage(elemento);	    
	    page.validarAntecedente();
	}

	@Then("Salir del navegador")
	public void ir_a_sitio_de_login() throws Throwable {
	    
	}
}
