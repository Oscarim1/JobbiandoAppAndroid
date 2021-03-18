package appiumTest.steps;

import appiumTest.BaseTest;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import dataProviders.ConfigFileReader;
import dataProviders.RegistroData;
import io.appium.java_client.MobileElement;

import pages.EvaluarExperienciaPrestadorPage;



public class EvaluarExperienciaPrestadorSteps extends BaseTest {
	
	static ConfigFileReader configFileReader= new ConfigFileReader();
	EvaluarExperienciaPrestadorPage page=null;
	MobileElement elemento=null;
	@Given("Rellena el formulario de login del prestador y entrar")
	public void rellena_el_formulario_de_login_del_prestador_y_entrar() throws Throwable {
	 
	 try{
		 openApp(configFileReader.getappPackagePrestador(),configFileReader.getappActivityPrestador());
		 Thread.sleep(15000);
		 page = new EvaluarExperienciaPrestadorPage(elemento);
		 RegistroData.datosPrestadores(false);
		 Thread.sleep(10000); 
		 page.correoPrestador(RegistroData.emailPrestador);	  
		 page.passPrestador(RegistroData.passPrestador);	

     }catch(Exception exp) {
         System.out.println(exp.getMessage());
         exp.printStackTrace();
         Thread.sleep(5000);
         
     }
	 
	}
	
	@And("Ingresar pestana solicitud para evaluar")
	public void Ingresar_pestana_solicitud_para_evaluar() throws Throwable {
		   page=new EvaluarExperienciaPrestadorPage(elemento);
		   Thread.sleep(5000);
		   page.permisosDeny();
		   Thread.sleep(5000);
		   page.clickSolicitud();
		   Thread.sleep(5000);
	}
	
	@When("click solicitud a evaluar")
	public void click_solicitud_a_evaluar() throws Throwable {
		   page=new EvaluarExperienciaPrestadorPage(elemento);
		   Thread.sleep(5000);
		   page.clickSeleccionaSolicitudEvaluar();
		   Thread.sleep(5000);
	}
		
	@Then("Hacer click en boton evaluar experiencia")
	public void hacer_click_en_boton_evaluar_experiencia() throws Throwable {
		   page=new EvaluarExperienciaPrestadorPage(elemento);
		   Thread.sleep(5000);
		   page.permisosDeny();
		   Thread.sleep(5000);
		   page.clickEvaluarExperiencia();
		   Thread.sleep(5000);
	}


	@And("Evaluar experiencia prestador")
	public void evaluar_experiencia_prestador() throws Throwable {
		page=new EvaluarExperienciaPrestadorPage(elemento);
		page.EvaluarExperiencia("Esta es una descripcion");
		Thread.sleep(5000);
		driver.quit();
	}

}