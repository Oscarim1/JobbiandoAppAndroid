package appiumTest.steps;


import appiumTest.BaseTest;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import dataProviders.ConfigFileReader;
import io.appium.java_client.MobileElement;

import pages.IniciaTrabajosSolicitudServicioPage;


public class IniciaTrabajosSolicitudServicioSteps extends BaseTest {
	
	static ConfigFileReader configFileReader= new ConfigFileReader(appiumON);
	IniciaTrabajosSolicitudServicioPage page=null;
	MobileElement elemento=null;
	@Given("Completar el formulario de login y entrar")
	public void completar_el_formulario_de_login_y_entrar() throws Throwable {
	 
	 try{
		 openApp(configFileReader.getappPackagePrestador(),configFileReader.getappActivityPrestador());
		 Thread.sleep(15000);
		 page = new IniciaTrabajosSolicitudServicioPage(elemento);	
		 page.correoPrestador(emailPrestador52);	
		 page.passPrestador(passPrestador);

     }catch(Exception exp) {
         System.out.println(exp.getMessage());
         exp.printStackTrace();
         Thread.sleep(5000);
         
     }
	 
	}
	
	@And("Ingresar a asignar Servicio")
	public void ingresar_a_asignar_Servicio() throws Throwable {
		   page=new IniciaTrabajosSolicitudServicioPage(elemento);
		  
		   page.permisosDeny();
		   page.clickServicio();
	}
	
	@And("Ingresar a pestana Solicitud")
	public void ingresar_a_pestana_Solicitud() throws Throwable {
		   page=new IniciaTrabajosSolicitudServicioPage(elemento);
		   page.clickSolicitud();
	}

	@When("Seleccione una solicitud")
	public void seleccione_una_solicitud() throws Throwable {
		page=new IniciaTrabajosSolicitudServicioPage(elemento);
		page.clickSeleccionaSolicitud();
	    
	}

	@Then("Hacer click en boton avanzar de estado a en camino")
	public void hacer_click_en_boton_avanzar_de_estado_a_en_camino() throws Throwable {
		page=new IniciaTrabajosSolicitudServicioPage(elemento);
		page.clickAvanzarEstadoEnCamino();
	}

	@And("Hacer click en avanzar de estado a ejecutando servicios")
	public void hacer_click_en_avanzar_de_estado_a_ejecutando_servicios() throws Throwable {
		page=new IniciaTrabajosSolicitudServicioPage(elemento);
		page.clickAvanzarEstadoEjecutandoServicios();
		page.inputServicio();
	}

}