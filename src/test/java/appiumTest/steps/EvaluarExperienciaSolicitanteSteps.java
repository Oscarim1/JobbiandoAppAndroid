package appiumTest.steps;
import appiumTest.BaseTest;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import dataProviders.ConfigFileReader;
import dataProviders.RegistroData;
import io.appium.java_client.MobileElement;
import pages.EvaluarExperienciaSolicitantePage;

public class EvaluarExperienciaSolicitanteSteps extends BaseTest {
	static ConfigFileReader configFileReader= new ConfigFileReader(appiumON);
	EvaluarExperienciaSolicitantePage page=null;
	MobileElement elemento=null;
	@Given("Completar login del Solicitante y entrar")
	public void completar_login_del_Solicitante_y_entrar() throws Throwable {
		 try{
			 openApp(configFileReader.getappPackageSolicitante(),configFileReader.getappActivitySolicitante());
			 Thread.sleep(20000);
			 page = new EvaluarExperienciaSolicitantePage(elemento);		
			 RegistroData.datosSolicitantes(appiumON,false);
			 RegistroData.datosPrestadores(appiumON,false);
			 Thread.sleep(20000);
			 page.enterCorreo(RegistroData.emailSolicitante);
			 page.clickOcultarTeclado();		
			 page.enterContrasena(RegistroData.passSolicitante);
			 page.clickOcultarTeclado();
			 page.clickEntrar();
	     }catch(Exception exp) {
	         System.out.println(exp.getMessage());
	         exp.printStackTrace();
	         Thread.sleep(5000);   
	     	}
	}
	@And("Click en la pestana Solicitud")
	public void click_en_la_pestana_Solicitud() throws Throwable {
		 page = new EvaluarExperienciaSolicitantePage(elemento);	
		 page.clickPestanaSolicitud();
	}
	@And("Click en la pestana En Proceso")
	public void click_en_la_pestana_En_Proceso() throws Throwable {
		 page = new EvaluarExperienciaSolicitantePage(elemento);	
		 page.clickPestanaEnProceso();
	}
	@And("Click en boton Evaluar Experiencia")
	public void click_en_boton_Evaluar_Experiencia() throws Throwable {
		 page = new EvaluarExperienciaSolicitantePage(elemento);	
		 page.clickEvaluarExperiencia();
	}
	@When("Completen datos de evaluacion")
	public void completen_datos_de_evaluacion() throws Throwable {
		page=new EvaluarExperienciaSolicitantePage(elemento);	
		page.enterDescripcion("Descripcion prueba");
		page.clickOcultarTeclado2();
		page.clickSeleccionarCriterio();
		page.clickCriterio();
		page.clickEnviarEvaluacion();
	}
	@Then("Click en Enviar Evaluacion")
	public void click_en_Enviar_Evaluacion() throws Throwable {
		page=new EvaluarExperienciaSolicitantePage(elemento);
		page.clickEnviarEvaluacion();
		driver.quit();
	}
}
