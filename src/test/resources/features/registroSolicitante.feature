Feature: Verificar funcionalidad de registro de Solicitante

  Scenario: Validar registro de Solicitante
    Given Abrir app
    And Ir al registro del Solicitante
    When Completar el formulario de registro del solicitante
    And hacer click en boton registrar
    Then Ir a sitio de login
