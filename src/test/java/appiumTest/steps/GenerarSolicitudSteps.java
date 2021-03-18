package appiumTest.steps;

import appiumTest.BaseTest;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import dataProviders.ConfigFileReader;
import io.appium.java_client.MobileElement;
import pages.GenerarSolicitudPage;

public class GenerarSolicitudSteps extends BaseTest{
	static ConfigFileReader configFileReader= new ConfigFileReader(appiumON);
	GenerarSolicitudPage page=null;
	MobileElement elemento=null;
	
	@Given("Completar login rol solicitante y entrar")
	public void completar_login_rol_solicitante_y_entrar() throws Throwable {
		 try{
			 openApp(configFileReader.getappPackageSolicitante(),configFileReader.getappActivitySolicitante());
			 Thread.sleep(20000);
			 page = new GenerarSolicitudPage(elemento);		
			 page.enterCorreo(emailSolicitante);
			 page.clickOcultarTeclado();		
			 page.enterContrasena(passSolicitante);
			 page.clickOcultarTeclado();
			 page.clickEntrar();
	     }catch(Exception exp) {
	         System.out.println(exp.getMessage());
	         exp.printStackTrace();
	         Thread.sleep(5000);   
	     	}
	}

	@And("Se ingresa a pestana Servicios")
	public void se_ingresa_a_pestana_Servicios() throws Throwable {
		page = new GenerarSolicitudPage(elemento);
		page.clickServicios();
		
	}

	@And("Se selecciona una categoria para realizar la solicitud")
	public void se_selecciona_una_categoria_para_realizar_la_solicitud() throws Throwable {
		page = new GenerarSolicitudPage(elemento);
		page.clickCategoriaServicios();
	}

	@When("Se completen los datos de la solicitud")
	public void se_completen_los_datos_de_la_solicitud() throws Throwable {
		page = new GenerarSolicitudPage(elemento);
		page.enterDescripcion("Descripcion prueba :)");
		page.clickSeleccionarSubCategoria();
		page.clickSubCategoria();
		page.clickOcultarTeclado2();
		page.enterPrecio("10000");
		page.clickOcultarTeclado2();
		page.clickFecha();
		page.clickAceptar();
		page.clickSiguiente();
		page.clickPosicion();
		page.clickSeleccionarPosicion();
		page.clickSiguiente2();
		
		
		
	}

	@Then("Hacer click en publicar solicitud")
	public void hacer_click_en_publicar_solicitud() throws Throwable {
		page.clickPublicar();
		driver.quit();
	}
}
