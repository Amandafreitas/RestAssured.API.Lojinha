# AutomacaoAPI_RestAssured-and-Junit
Primeiros passos com API Rest Automation usando RestAssured e JUnit

Test Cases:
1. Validar que o valor 0.00 não é permitido
  Dado que eu queira cadastrar um produto
  Quando o valor do produto é 0.00
  Então deve ser exibida a mensagem de erro "O valor do produto deve estar entre R$ 0,01 e R$ 7.000,00"

2. Validar que o valor 7000.01 não é permitido
 Dado que eu queira cadastrar um produto
 Quando o valor do produto é 7000.01
 Então deve ser exibida a mensagem de erro "O valor do produto deve estar entre R$ 0,01 e R$ 7.000,00"
