package appiumTest.steps;


import java.util.concurrent.TimeUnit;

import appiumTest.BaseTest;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import dataProviders.ConfigFileReader;
import io.appium.java_client.MobileElement;

import pages.CrearOfertaDeServicioPage;


public class CrearOfertaDeServicioSteps extends BaseTest {
	
	static ConfigFileReader configFileReader= new ConfigFileReader();
	CrearOfertaDeServicioPage page=null;
	MobileElement elemento=null;
	@Given("Completar login prestador y entrar")
	public void completar_login_prestador_y_entrar() throws Throwable {
	 
	 try{
		 openApp(configFileReader.getappPackagePrestador(),configFileReader.getappActivityPrestador());
		 Thread.sleep(3000);
		 page = new CrearOfertaDeServicioPage(elemento);
		 
		 Thread.sleep(3000);
		 page.correoPrestador(emailPrestador);
		 Thread.sleep(3000);
		 page.passPrestador(passPrestador);

     }catch(Exception exp) {
         System.out.println(exp.getMessage());
         exp.printStackTrace();
         Thread.sleep(5000);
         
     }
	 
	}
	@And("Hacer click en pestana Servicios")
	public void hacer_click_en_pestana_Servicios() throws Throwable {
		   page=new CrearOfertaDeServicioPage(elemento);
		   Thread.sleep(5000);
		   page.permisosDeny();
		   Thread.sleep(5000);
		   page.clickPestanaServicios();
		   Thread.sleep(5000);
	}

	@When("Hacer click en boton agregar servicio")
	public void hacer_click_en_boton_agregar_servicio() throws Throwable {
		page=new CrearOfertaDeServicioPage(elemento);
	    page.clickAgregarServicio();
	    Thread.sleep(5000);
	    
	}

	@And("Ingresar datos del servicio")
	public void ingresar_datos_del_servicio() throws Throwable {
		page=new CrearOfertaDeServicioPage(elemento);
	    page.enterDescripcion("Esta es una descripcion");
	    Thread.sleep(5000);
	    page.clickCategoria();
	    Thread.sleep(5000);
	    page.clickSeleccionarCategoria();
	    Thread.sleep(5000);
	    page.clickSubCategoria();
	    Thread.sleep(5000);
	    page.clickSeleccionarSubCategoria();
	    Thread.sleep(5000);
	    page.enterPrecio(precio);
	    Thread.sleep(5000);
	    page.clickCalendario();
	    Thread.sleep(5000);
	    page.clickJornada();
	    Thread.sleep(5000);
	    page.clickSiguiente();
	    Thread.sleep(5000);
	    page.clickDiasEntregaServicio();
	    Thread.sleep(5000);
	    page.clickUbicacion();
	    Thread.sleep(5000);
	}

	@Then("Hacer click en boton registrar servicio")
	public void hacer_click_en_boton_registrar_servicio() throws Throwable {
		page=new CrearOfertaDeServicioPage(elemento);
	    page.clickPublicar();
	     Thread.sleep(5000);
	}

}
