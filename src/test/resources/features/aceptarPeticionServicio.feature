Feature: Verificar funcionalidad de aceptar una peticion de servicio

  Scenario: Validar aceptar una peticion de servicio
    Given Completar login del prestador y entrar
    And Ingresar a pestana Servicios 
    And Ingresar a pestana Peticiones
    When Se seleccione una peticion
    Then Hacer click en boton aceptar peticion