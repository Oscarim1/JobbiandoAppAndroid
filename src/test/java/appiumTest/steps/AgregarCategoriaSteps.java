package appiumTest.steps;

import appiumTest.BaseTest;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.MobileElement;
import pages.AgregarCategoriaPage;
import pages.LoginPage;


public class AgregarCategoriaSteps extends BaseTest {
	LoginPage log=new LoginPage();
	AgregarCategoriaPage page=null;
	MobileElement elemento=null;
	@Given("Para categorias Completar Login y entrar")
	public void para_categorias_Completar_Login_y_entrar() throws Throwable {
	  log.enterCorreo(emailPrestador);
	  Thread.sleep(5000);
	  log.enterContrasena(passPrestador);
	  Thread.sleep(5000);
	}

	@When("Hacer click en Agregar")
	public void hacer_click_en_Agregar() throws Throwable {
	    page=new AgregarCategoriaPage(elemento);
	    page.clickAgregar();
	    Thread.sleep(5000);
	}

	@Then("Seleccionar una categoria")
	public void seleccionar_una_categoria() throws Throwable {
		page=new AgregarCategoriaPage(elemento);
	    page.clickAgregarCategoria();
	    Thread.sleep(5000);
	}
	
}
