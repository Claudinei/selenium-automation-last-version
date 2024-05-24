#language: pt


Funcionalidade: Pesquisa

  Contexto:
    Dado que estou na home do google

  @google
  Cenário: Pesquisar no google Selenium
    Quando preencho o texto "Praia Enseada Guarujá" para pesquisa
    E clico no botao pesquisar
    Entao visualizo o resultado da pesquisa

  Cenário: Pesquisar no google appium
    Quando preencho o texto "Praia de Santos" para pesquisa
    E clico no botao pesquisar
    Entao visualizo o resultado da pesquisa