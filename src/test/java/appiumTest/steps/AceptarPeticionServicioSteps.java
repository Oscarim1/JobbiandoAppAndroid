package appiumTest.steps;

import appiumTest.BaseTest;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import dataProviders.ConfigFileReader;
import dataProviders.RegistroData;
import io.appium.java_client.MobileElement;
import pages.AceptarPeticionServicioPage;

public class AceptarPeticionServicioSteps extends BaseTest{

	static ConfigFileReader configFileReader= new ConfigFileReader();
	AceptarPeticionServicioPage page=null;
	MobileElement elemento=null;
	
	@Given("Completar login del prestador y entrar")
	public void completar_login_del_prestador_y_entrar() throws Throwable {
		 try{
			 openApp(configFileReader.getappPackagePrestador(),configFileReader.getappActivityPrestador());
			 Thread.sleep(15000);
			 page = new AceptarPeticionServicioPage(elemento);
			 RegistroData.datosPrestadores(false);
			 Thread.sleep(10000); 
			 page.enterCorreo(RegistroData.emailPrestador);	  
			   
			 page.clickOcultarTeclado();
			 page.enterContrasena(RegistroData.passPrestador);	
			 page.clickOcultarTeclado();
			 page.clickEntrar();
			 

	     }catch(Exception exp) {
	         System.out.println(exp.getMessage());
	         exp.printStackTrace();
	         Thread.sleep(5000);
	         
	     }
	}

	@And("Ingresar a pestana Servicios")
	public void ingresar_a_pestana_Servicios() throws Throwable {
		 page = new AceptarPeticionServicioPage(elemento);
		 page.permisosDeny();
		 page.clickPestanaServicios();
	}

	@And("Ingresar a pestana Peticiones")
	public void ingresar_a_pestana_Peticiones() throws Throwable {
		 page = new AceptarPeticionServicioPage(elemento);
		 page.clickPestanapeticiones();
	}

	@When("Se seleccione una peticion")
	public void se_seleccione_una_peticion() throws Throwable {
		 page = new AceptarPeticionServicioPage(elemento);
		 page.clickPeticion();
	}

	@Then("Hacer click en boton aceptar peticion")
	public void hacer_click_en_boton_aceptar_peticion() throws Throwable {
		 page = new AceptarPeticionServicioPage(elemento);
		 page.clickAceptarPeticion();
		 driver.quit();
	}
}
