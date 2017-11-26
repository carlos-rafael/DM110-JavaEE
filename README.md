#DM 110- Java EE

Exercício de fixação da primeira aula da disciplina Java EE da pós graduação do INATEL.

Descrição do escopo do projeto:
Defina a interface de serviço REST para uma calculadora de duas operações no projeto API (calculadora-api-0.1-SNAPSHOT.jar).

Faça a implementação serviço REST de calculadora projeto core (calculadora-core-0.1-SNAPSHOT.jar).

Detalhes da interface REST:

Somar:
URL: <context-root>/rest/calc/sum
Método: GET
Parâmetros:
first (parâmetro de query)
second (parâmetro de query)
Resposta: JSON com os parâmetros e o resultado ( { "first": "1", "second": "2", "result": "3" } ).

Subtrair:
URL: <context-root>/rest/calc/subtract
Método: POST
Parâmetros:
first (parâmetro de formulário)
second (parâmetro de formulário)
Resposta: JSON com os parâmetros e o resultado ( { "first": "1", "second": "2", "result": "-1" } ).
