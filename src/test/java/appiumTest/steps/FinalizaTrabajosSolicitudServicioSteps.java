package appiumTest.steps;

import appiumTest.BaseTest;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import dataProviders.ConfigFileReader;
import dataProviders.RegistroData;
import io.appium.java_client.MobileElement;

import pages.FinalizaTrabajosSolicitudServicioPage;



public class FinalizaTrabajosSolicitudServicioSteps extends BaseTest {
	
	static ConfigFileReader configFileReader= new ConfigFileReader();
	FinalizaTrabajosSolicitudServicioPage page=null;
	MobileElement elemento=null;
	@Given("Rellena el formulario de login y entrar")
	public void rellena_el_formulario_de_login_y_entrar() throws Throwable {
	 
	 try{
		 openApp(configFileReader.getappPackagePrestador(),configFileReader.getappActivityPrestador());
		 Thread.sleep(15000);
		 page = new FinalizaTrabajosSolicitudServicioPage(elemento);	 
		 RegistroData.datosPrestadores(false);
		 Thread.sleep(10000); 
		 page.correoPrestador(RegistroData.emailPrestador);	  
		 page.passPrestador(RegistroData.passPrestador);	

     }catch(Exception exp) {
         System.out.println(exp.getMessage());
         exp.printStackTrace();
         Thread.sleep(5000);
         
     }
	 
	}
	
	@And("Ingresar pestana Solicitud")
	public void ingresar_pestana_Solicitud() throws Throwable {
		   page=new FinalizaTrabajosSolicitudServicioPage(elemento);		
		   page.permisosDeny();		   
		   page.clickSolicitud();		   
	}
		
	@When("click solicitud a finalizar")
	public void click_solicitud_a_finalizar() throws Throwable {
		   page=new FinalizaTrabajosSolicitudServicioPage(elemento);		  
		   page.permisosDeny();		  
		   page.clickSeleccionaSolicitud();
	}


	@Then("Hacer click en boton avanzar a terminado")
	public void hacer_click_en_boton_avanzar_a_terminado() throws Throwable {
		page=new FinalizaTrabajosSolicitudServicioPage(elemento);
		page.clickAvanzarEstadoTerminado();
		driver.quit();
	}

}