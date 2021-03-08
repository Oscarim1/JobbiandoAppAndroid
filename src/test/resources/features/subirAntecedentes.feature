Feature: Verificar funcionalidad de subir antecedentes de Prestador

  Scenario: Validar Antecedente de Prestador
    Given Completar login y entrar
    * Hacer click en pestana Cuenta
    * Hacer click en pestana Enviar Antecedentes
    When Hacer click en Selecionar Imagen
    And Hacer click en Subir Imagen
    Then Hacer click en boton Subir Antecedentes
