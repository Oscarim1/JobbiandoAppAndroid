Feature: Verificar funcionalidad de registro de Prestador

  Scenario: Validar registro de Prestador
    Given Abrir app
    And Ir al registro del Prestador
		When Completar el formulario de registro del prestador
    And hacer click en boton registrar
    Then Ir a sitio de login