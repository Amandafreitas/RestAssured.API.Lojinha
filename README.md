# AutomacaoAPI_RestAssured-and-Junit
Primeiros passos com API Rest Automation usando RestAssured e JUnit

## Test Cases:
### 1. Validar que não deve ser possível cadastrar um produto com valor 0.00

  Dado que eu queira cadastrar um produto    
  Quando o valor do produto é 0.00   
  Então deve ser exibida a mensagem de erro "O valor do produto deve estar entre R$ 0,01 e R$ 7.000,00"   

### 2. Validar que não deve ser possível cadastrar um produto com valor 7000.01
   
 Dado que eu queira cadastrar um produto   
 Quando o valor do produto é 7000.01   
 Então deve ser exibida a mensagem de erro "O valor do produto deve estar entre R$ 0,01 e R$ 7.000,00"  
