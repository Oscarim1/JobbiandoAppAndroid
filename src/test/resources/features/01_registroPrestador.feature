@Ciclo1
Feature: Validar la funcionalidad de registro de Prestador

  Scenario: Validar registro de Prestador
    Given Abrir app prestador
    And Ir al registro del Prestador
		When Completar el formulario de registro del prestador
    And hacer click en boton registrar prestador
    Then Ir a sitio de login prestador