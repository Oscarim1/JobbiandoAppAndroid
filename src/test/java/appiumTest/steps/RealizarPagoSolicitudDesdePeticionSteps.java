package appiumTest.steps;

import appiumTest.BaseTest;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import dataProviders.ConfigFileReader;
import dataProviders.RegistroData;
import io.appium.java_client.MobileElement;
import pages.RealizarPagoSolicitudDesdePeticionPage;

public class RealizarPagoSolicitudDesdePeticionSteps extends BaseTest{
	static ConfigFileReader configFileReader= new ConfigFileReader(appiumON);
	RealizarPagoSolicitudDesdePeticionPage page=null;
	MobileElement elemento=null;
	
	@Given("Completar login de solicitante y entrar")
	public void completar_login_de_solicitante_y_entrar() throws Throwable {
		 try{
			 openApp(configFileReader.getappPackageSolicitante(),configFileReader.getappActivitySolicitante());
			 Thread.sleep(20000);
			 page = new RealizarPagoSolicitudDesdePeticionPage(elemento);		
			 RegistroData.datosPrestadores(appiumON,false);
			 page.enterCorreo(RegistroData.emailSolicitante);
			 page.clickOcultarTeclado();		
			 page.enterContrasena(RegistroData.passSolicitante);
			 page.clickOcultarTeclado();
			 
			 page.clickEntrar();
	     }catch(Exception exp) {
	         System.out.println(exp.getMessage());
	         exp.printStackTrace();
	         Thread.sleep(5000);   
	     	}
	}

	@And("Entrar en pestana Solicitud")
	public void entrar_en_pestana_Solicitud() throws Throwable {
		 page = new RealizarPagoSolicitudDesdePeticionPage(elemento);
		 page.clickPestanaSolicitud();
	}

	@And("Entrar en pestana En Proceso")
	public void entrar_en_pestana_En_Proceso() throws Throwable {
		 page = new RealizarPagoSolicitudDesdePeticionPage(elemento);
		 page.clickPestanaEnProceso();
	}

	@And("Hacer click en una solicitud en espera de pago")
	public void hacer_click_en_una_solicitud_en_espera_de_pago() throws Throwable {
		 page = new RealizarPagoSolicitudDesdePeticionPage(elemento);
		 page.clickPestanaEnProceso();
	}

	@When("Ingresar datos de pago")
	public void ingresar_datos_de_pago() throws Throwable {
		 page = new RealizarPagoSolicitudDesdePeticionPage(elemento);
		 page.clickPagarServicio();
		 page.enterEmailPagador(RegistroData.emailSolicitante);
		 page.clickContinuar();
		 page.enterDatosUsuario("9.123.845-4","1234");
		 page.clickContinuar();
		 page.enterAutorizacion("11", "22", "33");
		
		
	}

	@Then("Realizar el pago de la solicitud")
	public void realizar_el_pago_de_la_solicitud() throws Throwable {
		 page = new RealizarPagoSolicitudDesdePeticionPage(elemento);
		 page.clickTerminar();
		 driver.quit();
	}
}
