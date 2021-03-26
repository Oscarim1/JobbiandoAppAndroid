package appiumTest.steps;

import appiumTest.BaseTest;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import dataProviders.ConfigFileReader;
import dataProviders.RegistroData;
import io.appium.java_client.MobileElement;

import pages.PresentaReclamoPage;



public class PresentaReclamoSteps extends BaseTest {
	
	static ConfigFileReader configFileReader= new ConfigFileReader(appiumON);
	PresentaReclamoPage page=null;
	MobileElement elemento=null;
	@Given("Rellena el formulario de login del solicitante y entrar")
	public void rellena_el_formulario_de_login_del_solicitante_y_entrar() throws Throwable {
	 
	 try{
		 openApp(configFileReader.getappPackageSolicitante(),configFileReader.getappActivitySolicitante());
		 Thread.sleep(15000);
		 page = new  PresentaReclamoPage(elemento);
		 RegistroData.datosSolicitantes(appiumON,false);
		 RegistroData.datosPrestadores(appiumON,false);
		 page.correoSolicitante(RegistroData.emailSolicitante);	
		 page.passSolicitante(RegistroData.passSolicitante);

     }catch(Exception exp) {
         System.out.println(exp.getMessage());
         exp.printStackTrace();
         Thread.sleep(5000);
         
     }	 
}
	
	@And("Ingresar a cuenta")
	public void ingresar_a_cuenta() throws Throwable {
		   page=new PresentaReclamoPage(elemento);
		   Thread.sleep(5000);
		   page.permisosDeny();
		   Thread.sleep(5000);
		   page.clickCuenta();
		   Thread.sleep(5000);
	}
	
	@When("click solicitudes terminadas")
	public void click_solicitudes_terminadas() throws Throwable {
		   page=new PresentaReclamoPage(elemento);
		   Thread.sleep(5000);
		   page.clickSolicitudesTerminadas();
		   Thread.sleep(5000);
	}
		
	@Then("Hacer click en solicitud finalizada")
	public void hacer_click_en_solicitud_finalizada() throws Throwable {
		   page=new PresentaReclamoPage(elemento);
		   page.clickSolicitudFinalizada();
		   Thread.sleep(5000);
	}


	@And("Presentar reclamo")
	public void presentar_reclamo() throws Throwable {
		page=new PresentaReclamoPage(elemento);
		page.clickReclamo();
		Thread.sleep(5000);
		page.clickEnviar("Este es un reclamo");
		driver.quit();
	}

}