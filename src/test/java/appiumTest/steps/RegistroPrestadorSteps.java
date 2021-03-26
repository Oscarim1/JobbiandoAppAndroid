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

public class RegistroPrestadorSteps extends BaseTest {
	static ConfigFileReader configFileReader= new ConfigFileReader(appiumON);
	RegistroPrestadorPage page=null;
	MobileElement elemento=null;
	@Given("Abrir chrome prestador")
	public void abrir_chrome_prestador() throws Throwable {
	 
	 try{
		 //openApp(configFileReader.getappPackagePrestador(),configFileReader.getappActivityPrestador());	
		 openNavegator(configFileReader.getappPackageNavegator(),configFileReader.getappActivityNavegator());
		 RegistroData.datosPrestadores(appiumON,false);
		 
     }catch(Exception exp) {
         System.out.println(exp.getMessage());
         exp.printStackTrace();
         Thread.sleep(5000);      
     }
	}

	@And("Ir al registro del Prestador")
	public void ir_al_registro_del_Prestador() throws Throwable {
		page = new RegistroPrestadorPage(elemento);
		Thread.sleep(20000);
		page.validacionSamsung();
		page.iniciarSesion();
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}

	@When("Completar el formulario de registro del prestador")
	public void completar_el_formulario_de_registro_del_prestador() throws Throwable {	
		page=new RegistroPrestadorPage(elemento);
	    page.enterNombres(RegistroData.nombresPrestador);	   
	    page.enterApellidos(RegistroData.apellidosPrestador);	    
	    page.enterFechaNacimiento("12 de 05 de 1995");	   
	    page.enterCorreo(RegistroData.emailPrestador);    
	    page.enterContrasena(RegistroData.passPrestador);    
	    page.clickCedulaDeIdentidad(RegistroData.runPrestadorNuevo);    
	    page.enterIdentificador(RegistroData.numSeriePrestador);	    
	    page.enterCalle(RegistroData.callePrestador);	    
	    page.enterDireccion(RegistroData.ubicacionPrestador);	    
	    page.enterNombreDireccion(RegistroData.nombreDirPrestador);    
	    page.enterReferencia(RegistroData.refPrestador); 
	}

	@Then("click en boton registrar prestador")
	public void click_en_boton_registrar_prestador() throws Throwable {
		page = new RegistroPrestadorPage(elemento);	
	    page.clickCrearCuenta();
	    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	    driver.quit();
	}

	
}
