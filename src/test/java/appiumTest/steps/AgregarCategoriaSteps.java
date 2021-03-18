package appiumTest.steps;

import appiumTest.BaseTest;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import dataProviders.ConfigFileReader;
import dataProviders.RegistroData;
import io.appium.java_client.MobileElement;
import pages.AgregarCategoriaPage;



public class AgregarCategoriaSteps extends BaseTest {
	

	static ConfigFileReader configFileReader= new ConfigFileReader(appiumON);
	AgregarCategoriaPage page=null;
	MobileElement elemento=null;
	
	@Given("Para categorias Completar Login y entrar")
	public void para_categorias_Completar_Login_y_entrar() throws Throwable {
		try{			 
			 openApp(configFileReader.getappPackagePrestador(),configFileReader.getappActivityPrestador());
			 Thread.sleep(15000);
			 page=new AgregarCategoriaPage(elemento);
			 RegistroData.datosPrestadores(appiumON,false);
			 Thread.sleep(10000); 
			 page.enterCorreo(RegistroData.emailPrestador);	  
			 page.enterContrasena(RegistroData.passPrestador);	  
			 page.clickEntrar();	 
	     }catch(Exception exp) {
	         System.out.println(exp.getMessage());
	         exp.printStackTrace();
	         Thread.sleep(1000);         
	     }
		
		 
	}

	@When("Hacer click en Agregar")
	public void hacer_click_en_Agregar() throws Throwable {
	    page=new AgregarCategoriaPage(elemento);
	    page.permisosAllow();
	    page.clickAgregar();    
	}

	@Then("Seleccionar una categoria")
	public void seleccionar_una_categoria() throws Throwable {
		page=new AgregarCategoriaPage(elemento);
	    page.clickAgregarCategoria(); 
	    driver.quit();
	}
	
}
