Feature: Verificar funcionalidad de generar solicitud de servicio

  Scenario: Validar generar solicitud de servicio
    Given Completar login rol solicitante y entrar 
    And Se ingresa a pestana Servicios
    And Se selecciona una categoria para realizar la solicitud
    When Se completen los datos de la solicitud
    Then Hacer click en publicar solicitud

