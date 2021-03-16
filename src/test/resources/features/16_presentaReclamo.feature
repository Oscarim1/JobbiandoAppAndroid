@Ciclo1
Feature: Verificar funcionalidad presenta reclamo

  Scenario: Validar presenta reclamo
    Given Rellena el formulario de login del solicitante y entrar
    And Ingresar a cuenta
    When click solicitudes terminadas
    Then Hacer click en solicitud finalizada
    And Presentar reclamo