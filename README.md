# Sistema de Gerenciamento de Conta Bancária

Este é um sistema simples de gerenciamento de conta bancária em Java. Ele permite que o cliente consulte o saldo, faça transferências e receba valores em uma conta do tipo **Corrente**.

## Funcionalidades

- **Consultar Saldo**: Exibe o saldo atual da conta.
- **Transferir Valor**: Permite transferir um valor de uma conta, verificando se há saldo suficiente.
- **Receber Valor**: Permite receber um valor e adicionar ao saldo da conta.
- **Sair**: Finaliza o programa.

## Como Executar

1. Certifique-se de ter o **Java** instalado na sua máquina.
   
2. Copie o código para um arquivo com a extensão `.java` (por exemplo, `Main.java`).

3. Compile o arquivo usando o seguinte comando no terminal:
   ```bash
   javac Main.java
   ```

4. Execute o programa:
   ```bash
   java Main
   ```

5. O programa irá exibir as informações iniciais do cliente e apresentar um menu de opções para consultar saldo, transferir valores, receber valores ou sair.

## Exemplo de Execução

Quando o programa é executado, ele exibe as informações iniciais do cliente e um menu de opções:

```bash
********************************************************************
Dados iniciais do Cliente:
                           
Nome:           Edimaique Maciel
Tipo conta:     Corrente
Saldo Inicial:  R$ 1600.00
********************************************************************

** Digite sua opção **

1 - Consultar Saldo
2 - Transferir valor
3 - Receber valor
4 - Sair
```

### Consultar Saldo
Se o usuário escolher a opção 1, o saldo atualizado será exibido:

```bash
O saldo atualizado é: 1600.0
```

### Transferir Valor
Se o usuário escolher a opção 2, será solicitado que ele insira o valor a ser transferido. Se o saldo for suficiente, o saldo será atualizado, caso contrário, será exibida uma mensagem de erro:

```bash
Qual o valor que deseja transferir?
500
Novo saldo: R$ 1100.0
```

### Receber Valor
Se o usuário escolher a opção 3, será solicitado que ele insira o valor a ser recebido, e o saldo será atualizado:

```bash
Digite o valor a receber:
300
Novo saldo: R$ 1400.0
```

### Sair
Se o usuário escolher a opção 4, o programa será encerrado com a mensagem "saindo...".

## Estrutura do Código

1. **Variáveis Iniciais**: São declaradas as informações do cliente, como nome, tipo de conta e saldo inicial.
2. **Loop de Menu**: O programa exibe um menu com opções para o usuário escolher até que ele selecione a opção de sair.
3. **Operações**: Dependendo da opção escolhida, o programa realiza operações como consultar saldo, transferir valor ou receber valor.
4. **Validação de Saldo**: Quando o usuário tenta transferir um valor maior que o saldo disponível, o programa impede a transação e exibe uma mensagem de erro.

## Requisitos

- **Java 11** ou superior.

## Licença

Este projeto está licenciado sob os termos da licença MIT. Veja o arquivo [LICENSE](LICENSE) para mais detalhes.
