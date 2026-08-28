## Selenium automation last version

01/11/2023
#### A ideia desse projeto é usar a ultima versão possível das dependências.

### Gerar relatório
- execute no terminal o comando allure serve allure-results

- Para gerar o relatorio o teste deve ser executado com a classe Runner
- Caso o teste seja executado usando o arquivo feature o teste será executado normalmente porém não será gerado o relatorio.


### Executar o projeto por linha de comando
- mvn clean test -Dcucumber.options="--tags @google"

