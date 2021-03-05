package appiumTest.steps;

import appiumTest.BaseTest;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import dataProviders.ConfigFileReader;
import io.appium.java_client.MobileElement;
import pages.SubirAntecedentesPage;

public class SubirAntecedentesSteps extends BaseTest{
	static ConfigFileReader configFileReader= new ConfigFileReader();
	SubirAntecedentesPage page=null;
	MobileElement elemento=null;
	
	@Given("Completar login y entrar")
	public void completar_login_y_entrar() throws Throwable {

		 try{
			 
			 openApp(configFileReader.getappPackagePrestador(),configFileReader.getappActivityPrestador());
			 Thread.sleep(8000);

	     }catch(Exception exp) {
	         System.out.println(exp.getMessage());
	         exp.printStackTrace();
	         Thread.sleep(11000);
	         
	     }
		 
		    page = new SubirAntecedentesPage(elemento);
		    page.enterCorreo(this.emailPrestador);
		    Thread.sleep(2000);
		    page.enterContrasena(this.passPrestador);
		    Thread.sleep(2000);
		    page.clickEntrar();
		    Thread.sleep(2000);
	}

	@And("Hacer click en pestana Enviar Antecedentes")
	public void hacer_click_en_pestana_Enviar_Antecedentes() throws Throwable {

	    page = new SubirAntecedentesPage(elemento);
	    page.clickAntecedentes(); 	
	    Thread.sleep(2000);
	    page.clickTipoDocumento(); 
	    Thread.sleep(2000);
	    page.clickDocumento();
	    Thread.sleep(2000);
		
 
	}

	@When("Hacer click en Selecionar Imagen")
	public void hacer_click_en_Selecionar_Imagen() throws Throwable {
		page = new SubirAntecedentesPage(elemento);
		page.clickImagen(); 
		Thread.sleep(2000);
		page.clickFuenteImagen();
		Thread.sleep(2000);
		page.clickTomarFoto();
		Thread.sleep(2000);
	}

	@Then("Hacer click en boton Subir Antecedentes")
	public void hacer_click_en_boton_Subir_Antecedentes() throws Throwable {
		page = new SubirAntecedentesPage(elemento);
		page.clickAceptar(); 
		page.clickSubirAntecedentes(); 
		
	    
	}

}
