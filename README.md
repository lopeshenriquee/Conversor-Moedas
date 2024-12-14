# Conversor de Moeda

Este é um simples conversor de moedas, onde é possível realizar a conversão de valores entre diferentes moedas utilizando uma API externa para obter as taxas de câmbio.

## Funcionalidades

- **Conversão de Moedas:** Permite converter um valor de uma moeda para outra com base nas taxas de câmbio mais recentes.
- **Validação de Moedas:** A aplicação valida se as moedas inseridas são válidas (3 letras maiúsculas, como "USD", "BRL", etc.).
- **Interatividade:** Após cada conversão, o usuário pode optar por realizar outra conversão ou sair do programa.

## Tecnologias Utilizadas

- **Java**: A linguagem principal usada para o desenvolvimento do conversor de moedas.
- **API ExchangeRate-API**: Usada para obter as taxas de conversão entre as moedas.
- **Scanner**: Para capturar entradas do usuário no terminal.

## Como Usar

1. Clone este repositório:
    ```bash
    git clone https://github.com/seu-usuario/conversor-moeda.git
    ```

2. Compile e execute o projeto:
    - Se você estiver utilizando um IDE como IntelliJ ou Eclipse, basta executar o arquivo `Main.java`.
    - Se estiver usando a linha de comando, execute:
      ```bash
      javac Main.java
      java Main
      ```

3. Siga as instruções na tela:
    - O programa pedirá para você inserir a moeda base (por exemplo, "USD") e a moeda de destino (por exemplo, "BRL").
    - Após isso, você poderá inserir o valor que deseja converter.

4. O programa exibirá a conversão do valor inserido para a moeda de destino.



