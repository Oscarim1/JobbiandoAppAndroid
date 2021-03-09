Feature: Verificar funcionalidad de crear peticion de servicio

  Scenario: Validar crear peticion de servicio
    Given Completar login solicitante y entrar
    * Buscar servicio en inicio
    * Hacer click en un servicio
    * Hacer click en boton solicitar servicio
    When Ingresar datos de la peticion
    Then Generar peticion de servicio
