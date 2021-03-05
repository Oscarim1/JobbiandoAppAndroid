package appiumTest.steps;

import appiumTest.BaseTest;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.MobileElement;
import pages.CrearOfertaDeServicioPage;
import pages.LoginPage;

public class CrearOfertaDeServicioSteps extends BaseTest {
	
	LoginPage log=new LoginPage();
	MobileElement elemento=null;
	CrearOfertaDeServicioPage page=null;
	@Given("Completar login prestador y entrar")
	public void completar_login_prestador_y_entrar() throws Throwable {
		log.enterCorreo(emailPrestador);
		  Thread.sleep(5000);
		  log.enterContrasena(passPrestador);
		  Thread.sleep(5000);
	}
	@And("Hacer click en pestana Servicios")
	public void hacer_click_en_pestana_Servicios() throws Throwable {
		   page=new CrearOfertaDeServicioPage(elemento);
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
	    
	}

	@Then("Hacer click en boton registrar servicio")
	public void hacer_click_en_boton_registrar_servicio() throws Throwable {
	    
	}

}
