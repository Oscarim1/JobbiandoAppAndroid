Feature: Verificar funcionalidad de aceptar solicitud de servicio

  Scenario: Validar aceptar solicitud de servicio
    Given Completar login rol prestador y entrar 
    When Se selecciona una solicitud de la misma categoria
    Then Hacer click en realizar solicitud
