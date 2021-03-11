Feature: Verificar funcionalidad de iniciar trabajos solicitud servicio

  Scenario: Validar iniciar trabajos solicitud servicio
    Given Completar el formulario de login y entrar
    And Ingresar a asignar Servicios
    And Ingresar a pestana Solicitud
    When Seleccione una solicitud
    Then Hacer click en boton avanzar de estado a en camino
    And Hacer click en avanzar de estado a ejecutando servicios