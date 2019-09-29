#Author:Ingrid Medeiros
@tag
Feature: Busca
  Eu como usuario, desejo encontrar uma noticia no blog do site https://ww2.soc.com.br.

  @tag1
  Scenario: O usuario busca uma noticia no blog
    Given Eu preciso acessar o blog do site
    When Informar o termo a ser buscado
    Then Finalizar a busca 
    And Apresentar o resultado da pesquisa
