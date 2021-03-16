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
			 Thread.sleep(15000);
	     }catch(Exception exp) {
	         System.out.println(exp.getMessage());
	         exp.printStackTrace();
	         Thread.sleep(1000);         
	     }
		  page=new SubirAntecedentesPage(elemento);
		  page.enterCorreo(emailPrestador);
		  
		  page.enterContrasena(passPrestador);		 
		  page.clickOcultarTeclado();		 
		  page.clickEntrar();
		  
		  
	}
	@And("Hacer click en pestana Cuenta")
	public void hacer_click_en_pestana_Cuenta() throws Throwable{
		page = new SubirAntecedentesPage(elemento);
		if(elementExist("//*[@resource-id=\"com.android.packageinstaller:id/permission_allow_button\"]") != null ) {
		page.clickPermitirUbicacion();			
		}else {}
	page.clickPerfil();
		
	}

	@And("Hacer click en pestana Enviar Antecedentes")
	public void hacer_click_en_pestana_Enviar_Antecedentes() throws Throwable {
	    page = new SubirAntecedentesPage(elemento);
	    page.clickAntecedentes(); 	
	    page.clickTipoDocumento(); 
	    page.clickDocumento();
	}

	@When("Hacer click en Selecionar Imagen")
	public void hacer_click_en_Selecionar_Imagen() throws Throwable {
		page = new SubirAntecedentesPage(elemento);
		page.clickImagen(); 
		page.clickFuenteImagen();
		if(elementExist("//*[@resource-id=\"com.android.packageinstaller:id/permission_allow_button\"]") != null ) {
			page.clickPermitirImagen();				
			}else {}
		if(elementExist("//*[@resource-id=\"com.android.packageinstaller:id/permission_allow_button\"]") != null) {
				page.clickPermitirImagenCamara();					
				}else {}
		if(elementExist("//*[@resource-id=\"com.android.packageinstaller:id/permission_allow_button\"]") != null) {
				page.clickPermitirImagenCamara();					
				}else {}
		page.clickTomarFoto();
	
	}
	@And("Hacer click en Subir Imagen")
	public void hacer_click_en_Subir_Imagen() throws Throwable{
		page.clickAceptar(); 		
	}
	@Then("Hacer click en boton Subir Antecedentes")
	public void hacer_click_en_boton_Subir_Antecedentes() throws Throwable {
		page = new SubirAntecedentesPage(elemento);
		page.clickSubirAntecedentes(); 	    
	}

}
