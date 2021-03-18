package appiumTest.steps;

import appiumTest.BaseTest;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import dataProviders.ConfigFileReader;
import dataProviders.RegistroData;
import io.appium.java_client.MobileElement;

import pages.ResuelveReclamoPage;



public class ResuelveReclamoSteps extends BaseTest {
	
	static ConfigFileReader configFileReader= new ConfigFileReader();
	ResuelveReclamoPage page=null;
	MobileElement elemento=null;
	@Given("Rellena el formulario de login del admin y entrar")
	public void rellena_el_formulario_de_login_del_admin_y_entrar() throws Throwable {
	 
	 try{
		 openNavegator(configFileReader.getappPackageNavegator(),configFileReader.getappActivityNavegator());
		 Thread.sleep(3000);
		 page = new ResuelveReclamoPage(elemento);
		 RegistroData.dataAdministrador();
		 RegistroData.dataRegistroSolicitante();
		 page.iniciarSesion();
		 page.enterUsernameAdmin(RegistroData.correoAdministrador);
		 page.enterPassAdmin(RegistroData.passAdministrador);
		 
		 
     }catch(Exception exp) {
         System.out.println(exp.getMessage());
         exp.printStackTrace();
         Thread.sleep(5000);
         
     }
	}

	@And("Ingresar a filtrar reclamo")
	public void ingresar_a_filtrar_reclamo() throws Throwable {
		
		
		Thread.sleep(5000);
		page=new ResuelveReclamoPage(elemento);
		page.barraLateral();
	    Thread.sleep(4000);
	    
	   
	    
	}

	@When("Seleccionar al usuario al que se le resolvera el reclamo")
	public void seleccionar_al_usuario_al_que_se_le_resolvera_el_reclamo() throws Throwable {
		
	
		page=new ResuelveReclamoPage(elemento);	    
		page.filtroNombre(RegistroData.nombresSolicitante);
	 
	}

	@And("hacer click en resolver reclamo")
	public void hacer_click_en_resolver_reclamo() throws Throwable {
		
		page=new ResuelveReclamoPage(elemento);	    
	    Thread.sleep(4000);
	    page.resuelveReclamo();
	}

	@Then("resolver reclamo")
	public void resolver_reclamo() throws Throwable {
		page=new ResuelveReclamoPage(elemento);	    
	    Thread.sleep(4000);
	    page.registrar("Se le devolvera el dinero en su totalidad.");
	    driver.quit();
	}
}
