Feature: Verificar funcionalidad evaluar experiencia del prestador

  Scenario: Validar evaluar experiencia del prestador
    Given Rellena el formulario de login del prestador y entrar
    And Ingresar pestana solicitud para evaluar
    When click solicitud a evaluar
    Then Hacer click en boton evaluar experiencia
    And Evaluar experiencia prestador