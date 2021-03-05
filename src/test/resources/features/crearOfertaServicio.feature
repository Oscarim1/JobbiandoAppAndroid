Feature: Verificar funcionalidad de crear oferta de servicio

  Scenario: Validar crear oferta de servicio
    Given Completar login prestador y entrar
    And Hacer click en pestana Servicios
    When Hacer click en boton agregar servicio 
    And Ingresar datos del servicio
    Then Hacer click en boton registrar servicio

