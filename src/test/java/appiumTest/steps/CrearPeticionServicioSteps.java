package appiumTest.steps;

import appiumTest.BaseTest;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import dataProviders.ConfigFileReader;
import io.appium.java_client.MobileElement;
import pages.CrearPeticionServicioPage;

public class CrearPeticionServicioSteps extends BaseTest {
	
	static ConfigFileReader configFileReader= new ConfigFileReader();
	CrearPeticionServicioPage page=null;
	MobileElement elemento=null;
	@Given("Completar login solicitante y entrar")
	public void completar_login_solicitante_y_entrar() throws Throwable {
	 
	 try{
		 openApp(configFileReader.getappPackageSolicitante(),configFileReader.getappActivitySolicitante());
		 Thread.sleep(25000);
		 page = new CrearPeticionServicioPage(elemento);		
		 page.correoSolicitante(emailSolicitante);
		 page.clickOcultarTeclado();		
		 page.passSolicitante(passSolicitante);
		 page.clickOcultarTeclado();
		 page.clickEntrar();
     }catch(Exception exp) {
         System.out.println(exp.getMessage());
         exp.printStackTrace();
         Thread.sleep(5000);   
     	}
	 
	}
	
	@And("Buscar servicio en inicio")
	public void buscar_servicio_en_inicio() throws Throwable {
		page = new CrearPeticionServicioPage(elemento);
		page.permisosAllow();
		page.clickInicio();
		page.clickSeleccionarUbicacion();
		page.clickUbicacion();
		page.clickFiltroServicios();
		
	}

	@And("Hacer click en un servicio")
	public void hacer_click_en_un_servicio() throws Throwable {
		page = new CrearPeticionServicioPage(elemento);
		page.clickSeleccionarServicio();
		
	}

	@And("Hacer click en boton solicitar servicio")
	public void hacer_click_en_boton_solicitar_servicio() throws Throwable {
		page = new CrearPeticionServicioPage(elemento);
		page.clickSolicitarServicio();
	}

	@When("Ingresar datos de la peticion")
	public void ingresar_datos_de_la_peticion() throws Throwable {
	    page=new CrearPeticionServicioPage(elemento);
	    page.clickDescripcion("Descripcion prueba");
	    page.clickSeleccionarFecha();
	    page.clickAceptarFecha();
	    page.clickSeleccionarDireccion();
	    page.clickDireccion();
	    
	}

	@Then("Generar peticion de servicio")
	public void generar_peticion_de_servicio() throws Throwable {
		page=new CrearPeticionServicioPage(elemento);
		page.clickGenerarPeticion();
		driver.quit();
	}

	
	
	
}
