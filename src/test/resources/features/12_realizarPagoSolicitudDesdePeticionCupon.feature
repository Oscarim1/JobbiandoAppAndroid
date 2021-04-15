@Ciclo1
Feature: Verificar funcionalidad de pago solicitud desde una peticion con Cupon

  Scenario: Validar realizar pago solicitud desde una peticion con cupon
    Given Completar login para pagar con cupon
    * En pestana Solicitud para pagar
    * En pestana En Proceso para pagar
    * Click en una solicitud en espera de pago para pagarla
    When Seleccionar pago con cupon
    Then Realizar el pago de la solicitud con cupon

