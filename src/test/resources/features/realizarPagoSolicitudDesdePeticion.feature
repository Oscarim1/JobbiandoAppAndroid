Feature: Verificar funcionalidad de pago solicitud desde una peticion

  Scenario: Validar realizar pago solicitud desde una peticion
    Given Completar login de solicitante y entrar
    * Entrar en pestana Solicitud
    * Entrar en pestana En Proceso
    * Hacer click en una solicitud en espera de pago
    When Ingresar datos de pago
    Then Realizar el pago de la solicitud

