package appiumTest.steps;




import appiumTest.BaseTest;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import dataProviders.ConfigFileReader;
import dataProviders.RegistroData;
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
		 Thread.sleep(10000);
		 page = new CrearOfertaDeServicioPage(elemento);
		 RegistroData.datosPrestadores(false);
		 Thread.sleep(10000); 
		 page.correoPrestador(RegistroData.emailPrestador);	  
		 page.clickOcultarTeclado();
		 page.passPrestador(RegistroData.passPrestador);	
		 page.clickOcultarTeclado();
		 page.clickEntrar();
     }catch(Exception exp) {
         System.out.println(exp.getMessage());
         exp.printStackTrace();
         Thread.sleep(5000);
         
     }
	 
	}
	@And("Hacer click en pestana Servicios")
	public void hacer_click_en_pestana_Servicios() throws Throwable {
		   page=new CrearOfertaDeServicioPage(elemento);
		   page.permisosDeny();		   
		   page.clickPestanaServicios();		  
	}

	@When("Hacer click en boton agregar servicio")
	public void hacer_click_en_boton_agregar_servicio() throws Throwable {
		page=new CrearOfertaDeServicioPage(elemento);
	    page.clickAgregarServicio();        
	}

	@And("Ingresar datos del servicio")
	public void ingresar_datos_del_servicio() throws Throwable {
		page=new CrearOfertaDeServicioPage(elemento);
	    page.enterDescripcion("Esta es una descripcion");	   
	    page.clickCategoria();
	    page.clickSeleccionarCategoria();	    
	    page.clickSubCategoria();    
	    page.clickSeleccionarSubCategoria();	    
	    page.enterPrecio(precio);	    
	    page.clickCalendario();	    
	    page.clickJornada();	    
	    page.clickSiguiente();	    
	    page.clickDiasEntregaServicio();	    
	    page.clickUbicacion();	    
	    page.clickImagen();
	    
	}

	@Then("Hacer click en boton registrar servicio")
	public void hacer_click_en_boton_registrar_servicio() throws Throwable {
		page=new CrearOfertaDeServicioPage(elemento);
	    page.clickPublicar();
	    driver.quit();
	   
	}

}
