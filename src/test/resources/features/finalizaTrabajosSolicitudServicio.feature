@Ciclo1
Feature: Verificar funcionalidad de finalizar trabajos solicitud servicio

  Scenario: Validar finalizar trabajos solicitud servicio
    Given Rellena el formulario de login y entrar
    And Ingresar pestana Solicitud
    When click solicitud a finalizar
    Then Hacer click en boton avanzar a terminado
    