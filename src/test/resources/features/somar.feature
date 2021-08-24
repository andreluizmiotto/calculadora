# language: pt

Funcionalidade: Realizar a soma de dois ou mais valores

  Cenario: Somando dois numeros validos
    Dado um numero valido
    Quando realiza a operacao somar com outro numero valido
    Entao retorna o valor resultante da operacao

  Cenario: Somando o valor dos itens de um pedido
    Dado um item de 10.0 reais
    E um item de 25.0 reais
    E um item de 65.50 reais
    Quando realiza a operacao calcular
    Entao retorna o valor 100.50

  Esquema do Cenario: Somando dois valores
    Dado o valor <parcela1>
    Quando somado ao valor <parcela2>
    Entao retorna a soma <resultado>

    Exemplos:
      | parcela1 | parcela2 | resultado |
      |   15.0   |   35.0   |    50.0   |
      |   2.75   |   5.66   |    8.41   |
      | 10000.0  |  999.99  | 10999.99  |
      |   150.0  |  -150.0  |    0.0    |
