package appiumTest.steps;

import appiumTest.BaseTest;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import dataProviders.ConfigFileReader;
import dataProviders.RegistroData;
import io.appium.java_client.MobileElement;
import pages.RealizarPagoSolicitudDesdePeticionCuponPage;

public class RealizarPagoSolicitudDesdePeticionCuponSteps extends BaseTest{
	static ConfigFileReader configFileReader= new ConfigFileReader(appiumON);
	RealizarPagoSolicitudDesdePeticionCuponPage page=null;
	MobileElement elemento=null;
	
	
	@Given("Completar login para pagar con cupon")
	public void completar_login_para_pagar_con_cupon() throws Throwable {
		 try{
			 openApp(configFileReader.getappPackageSolicitante(),configFileReader.getappActivitySolicitante());
			 Thread.sleep(20000);
			 page = new RealizarPagoSolicitudDesdePeticionCuponPage(elemento);		
			 RegistroData.datosSolicitantes(appiumON,false);
			 System.out.println(RegistroData.medioPagoSolicitante.toString());
			 if(RegistroData.medioPagoSolicitante.toString().equals("Cupon")) {
				 page.enterCorreo(RegistroData.emailSolicitante);
				 page.clickOcultarTeclado();		
				 page.enterContrasena(RegistroData.passSolicitante);
				 page.clickOcultarTeclado();
				 
				 page.clickEntrar();
			 }
			 
	     }catch(Exception exp) {
	         System.out.println(exp.getMessage());
	         exp.printStackTrace();
	         Thread.sleep(5000);   
	     	}
	}

	@And("En pestana Solicitud para pagar")
	public void en_pestana_Solicitud_para_pagar() throws Throwable {
		if(RegistroData.medioPagoSolicitante.toString().equals("Cupon")) {
			page = new RealizarPagoSolicitudDesdePeticionCuponPage(elemento);
			page.clickPestanaSolicitud();
		}
		 
	}

	@And("En pestana En Proceso para pagar")
	public void en_pestana_En_Proceso_para_pagar() throws Throwable {
		 if(RegistroData.medioPagoSolicitante.toString().equals("Cupon")) {
			 page = new RealizarPagoSolicitudDesdePeticionCuponPage(elemento);
			 page.clickPestanaEnProceso();
		 }
		 
	}

	@And("Click en una solicitud en espera de pago para pagarla")
	public void click_en_una_solicitud_en_espera_de_pago_para_pagarla() throws Throwable {
		 if(RegistroData.medioPagoSolicitante.toString().equals("Cupon")) {
			 page = new RealizarPagoSolicitudDesdePeticionCuponPage(elemento);
			 page.clickPestanaEnProceso();
		 }
		 
	}

	@When("Seleccionar pago con cupon")
	public void selecciona_pago_con_cupon() throws Throwable {
		 if(RegistroData.medioPagoSolicitante.toString().equals("Cupon")) {
			 page = new RealizarPagoSolicitudDesdePeticionCuponPage(elemento);
			 page.clickPagarServicio();
			 page.anadirCupon(); 
			 page.ingresarCupon();
			 page.agregarCupon();
			 page.seleccionaCupon();
			 
		 }	
		
	}

	@Then("Realizar el pago de la solicitud con cupon")
	public void realizar_el_pago_de_la_solicitud_con_cupon() throws Throwable {
		if(RegistroData.medioPagoSolicitante.toString().equals("Cupon")) {
			 page = new RealizarPagoSolicitudDesdePeticionCuponPage(elemento);
			 page.pagarConCupon();
			 driver.quit();
		}
		else {
			System.out.println("Se ha saltado este feature debido a que el medio de pago es"+RegistroData.medioPagoSolicitante.toString());
		}
		
	}
}
