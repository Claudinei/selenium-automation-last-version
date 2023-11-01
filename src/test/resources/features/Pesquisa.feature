#language: pt

@google
Funcionalidade: Pesquisa

  Contexto:
    Dado que estou na home do google

  Cenário: Pesquisar no google Selenium
    Quando preencho o texto "Selenium" para pesquisa
    E clico no botao pesquisar
    Entao visualizo o resultado da pesquisa

  Cenário: Pesquisar no google appium
    Quando preencho o texto "appium" para pesquisa
    E clico no botao pesquisar
    Entao visualizo o resultado da pesquisa