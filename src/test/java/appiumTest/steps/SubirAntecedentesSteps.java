package appiumTest.steps;

import appiumTest.BaseTest;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.MobileElement;
import pages.SubirAntecedentesPage;

public class SubirAntecedentesSteps extends BaseTest{
	SubirAntecedentesPage page=null;
	MobileElement elemento=null;
	
	@Given("Completar login y entrar")
	public void completar_login_y_entrar() throws Throwable {

		 try{
			 
			 openApp("com.easyjobprestador","com.easyjobprestador.MainActivity");
			 Thread.sleep(8000);

	     }catch(Exception exp) {
	         System.out.println(exp.getMessage());
	         exp.printStackTrace();
	         Thread.sleep(11000);
	         
	     }
		 
		    page = new SubirAntecedentesPage(elemento);
		    page.enterCorreo("randomail256@gmailnator.com");
		    Thread.sleep(2000);
		    page.enterContrasena("Hola1234");
		    Thread.sleep(2000);
	    
	}

	@And("Hacer click en pestana Enviar Antecedentes")
	public void hacer_click_en_pestana_Enviar_Antecedentes() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("Hacer click en Selecionar Imagen")
	public void hacer_click_en_Selecionar_Imagen() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("Hacer click en boton Subir Antecedentes")
	public void hacer_click_en_boton_Subir_Antecedentes() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

}
