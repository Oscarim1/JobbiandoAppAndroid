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
			 Thread.sleep(28000);

	     }catch(Exception exp) {
	         System.out.println(exp.getMessage());
	         exp.printStackTrace();
	         Thread.sleep(1000);
	         
	     }
		 
		  page=new SubirAntecedentesPage(elemento);
		  page.enterCorreo("randomail259@gmailnator.com");
		  Thread.sleep(1000);
		  page.enterContrasena(passPrestador);
		  Thread.sleep(4000);
		  page.clickOcultarTeclado();
		  Thread.sleep(5000);
		  page.clickEntrar();
		  Thread.sleep(25000);
		  
	}
	@And("Hacer click en pestana Cuenta")
	public void hacer_click_en_pestana_Cuenta() throws Throwable{
		page = new SubirAntecedentesPage(elemento);
		if(elementExist("//*[@resource-id=\"com.android.packageinstaller:id/permission_allow_button\"]") != null) {
		page.clickPermitirUbicacion();
		Thread.sleep(2000);
		}else {}
		
		page.clickPerfil();
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
		//////////////falta cargar imagen//////////////////
	}
	@And("Hacer click en Subir Imagen ")
	public void hacer_click_en_Subir_Imagen() throws Throwable{
		page.clickAceptar(); 
		Thread.sleep(2000);
	}

	@Then("Hacer click en boton Subir Antecedentes")
	public void hacer_click_en_boton_Subir_Antecedentes() throws Throwable {
		page = new SubirAntecedentesPage(elemento);
		page.clickSubirAntecedentes(); 
		Thread.sleep(2000);
	    
	}

}
