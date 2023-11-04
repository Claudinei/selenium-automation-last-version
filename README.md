# selenium-automation-last-version

01/11/2023
- A ideia desse projeto é usar a ultima versão possível das dependências.


Para gerar o relatório execute o segundo comando allure serve allure-results

Obs:. Para gerar o relatorio o teste deve ser executado com a classe Runner caso o teste seja executado usando o arquivo feature o teste será executado normalmente porém não será gerado o relatorio.

Para executar o projeto por linha de comando: mvn clean test -Dcucumber.options="--tags @google"