package appiumTest.steps;

import appiumTest.BaseTest;
import cucumber.api.CucumberOptions;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import dataProviders.ConfigFileReader;
import dataProviders.RegistroData;
import io.appium.java_client.MobileElement;

import pages.ValidarAntecedentesPage;

@CucumberOptions(
		strict=true,
		monochrome=true,
		features="features/subirAntecedentes.feature",
		plugin= {"pretty"}
		)
public class ValidarAntecedentesSteps extends BaseTest {
	
	static ConfigFileReader configFileReader= new ConfigFileReader(appiumON);
	ValidarAntecedentesPage page=null;
	MobileElement elemento=null;
	@Given("Abrir el navegador")
	public void abrir_navegador() throws Throwable {
	 
	 try{
		 openNavegator(configFileReader.getappPackageNavegator(),configFileReader.getappActivityNavegator());
		 Thread.sleep(15000);
		 /*openApp(configFileReader.getappPackagePrestador(),configFileReader.getappActivityPrestador());
		 Thread.sleep(15000);*/
		 RegistroData.dataAdministrador();
		 page = new ValidarAntecedentesPage(elemento);
		 page.iniciarSesion();
		 page.enterUsernameAdmin(RegistroData.correoAdministrador);
		 page.enterPassAdmin(RegistroData.passAdministrador);

     }catch(Exception exp) {
         System.out.println(exp.getMessage());
         exp.printStackTrace();
         Thread.sleep(5000);
         
     }
	 
	}

	@And("Ir a revisar antecedentes")
	public void ir_a_revisar_antecedentes() throws Throwable {
		
		page=new ValidarAntecedentesPage(elemento);
		page.barraLateral();	    	   	 
	}

	@When("Seleccionar al usuario al que se le validaran los antecedentes")
	public void seleccionar_al_usuario_al_que_se_le_validaran_los_antecedentes() throws Throwable {
		page=new ValidarAntecedentesPage(elemento);	
		RegistroData.datosPrestadores(false);
		page.filtroNombre(RegistroData.nombresPrestador);
	 
	}

	@And("hacer click en validar antecedentes")
	public void hacer_click_en_validar_antecedentes() throws Throwable {
		page=new ValidarAntecedentesPage(elemento);	    
	    page.validarAntecedente();
	    driver.quit();
	}

	@Then("Salir del navegador")
	public void ir_a_sitio_de_login() throws Throwable {
		
	    
	}
}
