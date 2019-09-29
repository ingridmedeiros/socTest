#Author: Ingrid Medeiros
@tag
Feature: Estimar FAP

  @tag1
  Scenario: O usuario realiza a estimativa FAP atraves do formulario
    Given Eu preciso acessar a pagina Recursos > FAP
    When Informar os campos obrigatorios
    Then Clicar no botão Estimar FAP
    And Visualizar o resultado da estimativa FAP
