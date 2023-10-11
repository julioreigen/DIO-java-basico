## Fixando os Conhecimentos

Exercícios:

1. Operações Básicas com Set
2. Pesquisa em Set
3. Ordenação nas Set

## Operações Básicas com Set

### 1. Conjunto de Convidados

Crie uma classe chamada "[ConjuntoConvidados](https://github.com/julioreigen/DIO-java-basico/blob/main/src/edu/julio/collections/set/basico/ConjuntoConvidados.java)" 
que possui um conjunto de objetos do tipo "[Convidado](https://github.com/julioreigen/DIO-java-basico/blob/main/src/edu/julio/collections/set/basico/Convidado.java)" como atributo. Cada convidado possui atributos como nome e código
do convite. Implemente os seguintes métodos:

- `adicionarConvidado(String nome, int codigoConvite)`: Adiciona um convidado ao conjunto.
- `removerConvidadoPorCodigoConvite(int codigoConvite)`: Remove um convidado do conjunto com base no código do convite.
- `contarConvidados()`: Conta o número total de convidados no Set.
- `exibirConvidados()`: Exibe todos os convidados do conjunto.


### 2. Conjunto de Palavras Únicas

Crie uma classe chamada "[ConjuntoPalavrasUnicas](https://github.com/julioreigen/DIO-java-basico/blob/main/src/edu/julio/collections/set/basico/ConjuntoPalavrasUnicas.java)" que possui um conjunto de palavras únicas como atributo. Implemente os seguintes métodos:

- `adicionarPalavra(String palavra)`: Adiciona uma palavra ao conjunto.
- `removerPalavra(String palavra)`: Remove uma palavra do conjunto.
- `verificarPalavra(String palavra)`: Verifica se uma palavra está presente no conjunto.
- `exibirPalavrasUnicas()`: Exibe todas as palavras únicas do conjunto.

----

## Pesquisa em Set

### 1. Agenda de Contatos

Crie uma classe chamada "[AgendaContatos](https://github.com/julioreigen/DIO-java-basico/blob/main/src/edu/julio/collections/set/pesquisa/AgendaContatos.java)" que possui um conjunto de objetos do tipo "[Contato](https://github.com/julioreigen/DIO-java-basico/blob/main/src/edu/julio/collections/set/pesquisa/Contato.java)" como atributo. Cada contato possui atributos como nome e número de telefone. Implemente os seguintes métodos:

- `adicionarContato(String nome, int numero)`: Adiciona um contato à agenda.
- `exibirContatos()`: Exibe todos os contatos da agenda.
- `pesquisarPorNome(String nome)`: Pesquisa contatos pelo nome e retorna um conjunto com os contatos encontrados.
- `atualizarNumeroContato(String nome, int novoNumero)`: Atualiza o número de telefone de um contato específico.

### 2. Lista de Tarefas

Crie uma classe chamada "[ListaTarefas](https://github.com/julioreigen/DIO-java-basico/blob/main/src/edu/julio/collections/set/pesquisa/ListaTarefas.java)" que possui um conjunto de objetos do tipo "[Tarefa](https://github.com/julioreigen/DIO-java-basico/blob/main/src/edu/julio/collections/set/pesquisa/Tarefa.java)" como atributo. Cada tarefa possui um atributo de descrição e um atributo booleano para indicar se a tarefa foi concluída ou não. Implemente os seguintes métodos:

- `adicionarTarefa(String descricao)`: Adiciona uma nova tarefa ao Set.
- `removerTarefa(String descricao)`: Remove uma tarefa do Set conforme a descrição, se estiver presente.
- `exibirTarefas()`: Exibe todas as tarefas da lista de tarefas.
- `contarTarefas()`: Conta o número total de tarefas na lista de tarefas.
- `obterTarefasConcluidas()`: Retorna um Set com as tarefas concluídas.
- `obterTarefasPendentes()`: Retorna um Set com as tarefas pendentes.
- `marcarTarefaConcluida(String descricao)`: Marca uma tarefa como concluída conforme a descrição.
- `marcarTarefaPendente(String descricao)`: Marca uma tarefa como pendente conforme a descrição.
- `limparListaTarefas()`: Remove todas as tarefas da lista de tarefas.

---

## Ordenação em Set

### 1. Cadastro de Produtos

Crie uma classe chamada "[CadastroProdutos](https://github.com/julioreigen/DIO-java-basico/blob/main/src/edu/julio/collections/set/ordenacao/CadastroProdutos.java)" que possui um conjunto de objetos do tipo "[Produto](https://github.com/julioreigen/DIO-java-basico/blob/main/src/edu/julio/collections/set/ordenacao/Produto.java)" como atributo. Cada produto possui atributos como nome, cod, preço e quantidade. Implemente os seguintes métodos:

- `adicionarProduto(long cod, String nome, double preco, int quantidade)`: Adiciona um produto ao cadastro.
- `exibirProdutosPorNome()`: Exibe todos os produtos do cadastro em ordem alfabética pelo nome.
- `exibirProdutosPorPreco()`: Exibe todos os produtos do cadastro em ordem crescente de preço.

### 2. Lista de Alunos

Crie uma classe chamada "[GerenciadorAlunos](https://github.com/julioreigen/DIO-java-basico/blob/main/src/edu/julio/collections/set/ordenacao/GerenciadorAlunos.java)" que irá lidar com uma lista de [alunos](https://github.com/julioreigen/DIO-java-basico/blob/main/src/edu/julio/collections/set/ordenacao/Aluno.java). Cada aluno terá atributos como nome, matrícula e nota. Implementaremos os seguintes métodos:

- `adicionarAluno(String nome, Long matricula, double media)`: Adiciona um aluno ao conjunto.
- `removerAluno(long matricula)`: Remove um aluno ao conjunto a partir da matrícula, se estiver presente.
- `exibirAlunosPorNome()`: Exibe todos os alunos do conjunto em ordem alfabética pelo nome.
- `exibirAlunosPorNota()`: Exibe todos os alunos do conjunto em ordem crescente de nota.
- `exibirAlunos()`: Exibe todos os alunos do conjunto.
