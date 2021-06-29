@Ciclo1
Feature: Verificar funcionalidad resuelve reclamo

  Scenario: Validar resuelve reclamo
	    Given Rellena el formulario de login del admin y entrar
	    And Ingresar a filtrar reclamo
	    When Seleccionar al usuario al que se le resolvera el reclamo
	    And hacer click en resolver reclamo
	    Then resolver reclamo