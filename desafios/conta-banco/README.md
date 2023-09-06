## Sintaxe - [Desafio (PT-BR)](https://github.com/julioreigen/DIO-java-basico/blob/main/conta-banco/src/ContaTerminal.java)
#### Desafio proposto por: [Gleyson Sampaio](https://github.com/glysns)
Vamos exercitar todo o conteúdo apresentado no módulo de Sintaxe codificando o seguinte cenário.

1. Crie o projeto `ContaBanco` que receberá dados via terminal contendo as características de conta em banco conforme atributos abaixo:
2. Dentro do projeto, crie a classe [`ContaTerminal.java`](https://github.com/julioreigen/DIO-java-basico/blob/main/conta-banco/src/ContaTerminal.java) para realizar toda a codificação do nosso programa.

###### Revise sobre regras de declaração de variáveis

| Atributo     | Tipo    | Exemplo       |
|--------------|---------|---------------|
| Numero       | Inteiro | 1021          |
| Agencia      | Texto   | 067-8         |
| Nome Cliente | Texto   | MARIO ANDRADE |
| Saldo        | Decimal | 237.48        |

###### Revise sobre terminal, main args e a classe Scanner
3. Permita que os dados sejam inseridos via terminal sendo que o usuário receberá a mensagem de qual informação será solicitada, exemplo:

* Programa: "Por favor, digite o número da Agência !"
* Usuário: 1021 *(depois ENTER para o próximo campo)*

###### Revise sobre concatenação e classe String com método concat

4. Depois de todas as informações terem sido inseridas, o sistema deverá exibir a seguinte mensagem:

*"Olá [Nome Cliente], obrigado por criar uma conta em nosso banco, sua agência é [Agencia], conta [Numero] e seu saldo [Saldo] já está disponível para saque".*

Os campos em [ ] devem ser alterados pelas informações que forem inseridas pelos usuários.


## Syntax - [Challenge (EN-US)](https://github.com/julioreigen/DIO-java-basico/blob/main/conta-banco/src/PaymentTerminal.java)
#### Challenge proposed by: [Gleyson Sampaio](https://github.com/glysns)
Let's practice all the content presented in the Syntax module by coding the following scenario.

1. Create the `conta-banco` project that will receive data via terminal containing the bank account characteristics according to the attributes below:
2. Inside the project, create the [`PaymentTerminal.java`](https://github.com/julioreigen/DIO-java-basico/blob/main/conta-banco/src/PaymentTerminal.java) class to carry out all the orders for our program.

###### Review on variable declaration rules

| Attribute   | Type     | Example       |
|-------------|----------|---------------|
| Number      | Integer  | 1021          |
| Agency      | Text     | 067-8         |
| Client Name | Text     | MÁRIO ANDRADE |
| Balance     | Decimals | 237.48        |

###### Review about terminal, main arguments and the Scanner class
3. Allow the data to be entered via the terminal and the user will receive a message with which information will be requested, example:

* Program: "Please enter the Agency number!"
* User: 1021 *(then ENTER for the next field)*

###### Review about concatenation and String class with concat method

4. After all information has been entered, the system should display the following message:

*"Hello [Customer Name], thank you for creating an account at our bank, your SWIFT code is [Branch], account [Number] and your balance [Balance] is ready to be withdrawn".*

The fields in [ ] must be changed by the information that was entered by the users.
