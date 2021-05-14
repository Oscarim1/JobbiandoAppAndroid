package appiumTest.steps;


import java.util.concurrent.TimeUnit;

import appiumTest.BaseTest;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import dataProviders.ConfigFileReader;
import dataProviders.RegistroData;
import io.appium.java_client.MobileElement;
import pages.RegistroPrestadorPage;
import pages.RegistroSolicitantePage;


public class RegistroSolicitanteSteps extends BaseTest {
	static ConfigFileReader configFileReader= new ConfigFileReader(appiumON);
	RegistroSolicitantePage page=null;
	MobileElement elemento=null;
	@Given("Abrir app solicitante")
	public void abrir_app_solicitante() throws Throwable {
	 
	 try{
		 //openApp(configFileReader.getappPackagePrestador(),configFileReader.getappActivityPrestador());	
		 openNavegator(configFileReader.getappPackageNavegator(),configFileReader.getappActivityNavegator());
		 page=new RegistroSolicitantePage(elemento);
		 RegistroData.datosSolicitantes(appiumON,false);
		 
     }catch(Exception exp) {
         System.out.println(exp.getMessage());
         exp.printStackTrace();
         Thread.sleep(5000);      
     }
	}
	
	@And("Ir al registro del Solicitante")
	public void ir_al_registro_del_Solicitante() throws Throwable {
		page = new RegistroSolicitantePage(elemento);
		Thread.sleep(7000);
		page.validacionSamsung();
		page.iniciarSesion();
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}

	@When("Completar el formulario de registro del solicitante")
	public void completar_el_formulario_de_registro_del_solicitante() throws Throwable {	
		page=new RegistroSolicitantePage(elemento);
	    page.enterNombres(RegistroData.nombresSolicitante);	   
	    page.enterApellidos(RegistroData.apellidosSolicitante);	       
	    page.enterCorreo(RegistroData.emailSolicitante);    
	    page.enterFechaNacimiento("12 de 05 de 1995");
	    page.enterContrasena(RegistroData.passSolicitante);    
	    page.clickCedulaDeIdentidad(RegistroData.runSolicitanteNuevo);    
	    //page.enterIdentificador(RegistroData.numSerieSolicitante);	    
	    //page.enterCalle(RegistroData.calleSolicitante);	    
	    //page.enterDireccion(RegistroData.ubicacionSolicitante);	    
	    //page.enterNombreDireccion(RegistroData.nombreDirSolicitante);    
	    //page.enterReferencia(RegistroData.refSolicitante); 
	}

	@Then("hacer click en boton registrar solicitante")
	public void hacer_click_en_boton_registrar_solicitante() throws Throwable {
		page = new RegistroSolicitantePage(elemento);	
	    page.clickCrearCuenta();
	    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	    driver.quit();
	}

	
}