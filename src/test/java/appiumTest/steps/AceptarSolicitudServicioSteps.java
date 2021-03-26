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
import pages.AceptarSolicitudServicioPage;

public class AceptarSolicitudServicioSteps extends BaseTest{
	static ConfigFileReader configFileReader= new ConfigFileReader(appiumON);
	AceptarSolicitudServicioPage page=null;
	MobileElement elemento=null;
	
	@Given("Completar login rol prestador y entrar")
	public void completar_login_rol_prestador_y_entrar() throws Throwable {
		try{
			 openApp(configFileReader.getappPackagePrestador(),configFileReader.getappActivityPrestador());
			 Thread.sleep(20000);
			 RegistroData.datosPrestadores(appiumON,false);
			 page = new AceptarSolicitudServicioPage(elemento);
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

	
	@When("Se selecciona una solicitud de la misma categoria")
	public void se_selecciona_una_solicitud_de_la_misma_categoria()throws Throwable{
		page = new AceptarSolicitudServicioPage(elemento);
		page.clickSeleccionarUbicacion();
		page.clickUbicacion();
		page.compararCategorias();
		
	}

	@Then("Hacer click en realizar solicitud")
	public void hacer_click_en_realizar_solicitud() throws Throwable {
		page = new AceptarSolicitudServicioPage(elemento);
		page.clickRealizarSolicitud();
		page.clickRealizar();
		driver.quit();
	}
}
