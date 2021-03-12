@Ciclo1
Feature: Verificar funcionalidad de evaluar experiencia de servicio por parte del solicitante

  Scenario: Validar evaluacion de experiencia por parte del solicitante
    Given Completar login del Solicitante y entrar
    * Click en la pestana Solicitud
    * Click en la pestana En Proceso
    * Click en boton Evaluar Experiencia
    When Completen datos de evaluacion
    Then Click en Enviar Evaluacion
