Dupla: Victor Hugo Aguiar Porfiro e Kaique Granato

# AvaliacaoPratica-ED
Repositorio para fazer a avalição da diciplina de Estrutura de dados 2025/02

# Sistema de Gestão de Livros - Estruturas de Dados

Este projeto implementa um sistema de gestão de cadastros de livros utilizando duas estruturas de dados diferentes: Lista Encadeada Simples e Fila Encadeada.

## Estrutura do Projeto

```
src/
├── iClasse/           # Interfaces
│   ├── ILivro.java
│   ├── IListaEncadeada.java
│   └── IFilaEncadeada.java
├── classe/            # Implementações
│   ├── Livro.java
│   ├── No.java
│   ├── ListaEncadeadaSimples.java
│   └── FilaEncadeada.java
├── teste/             # Classe de teste
│   └── TesteGestaoLivros.java
└── App.java           # Classe principal
```

## Funcionalidades

### Classe Livro
- **ID**: Identificador único 
- **Nome**: Título do livro 
- **Categoria**: Gênero do livro 

### Estruturas de Dados Implementadas

#### 1. Lista Encadeada Simples
- Inserção no final
- Remoção por índice
- Busca por ID ou nome
- Listagem de todos os elementos

#### 2. Fila Encadeada
- Enfileirar
- Desenfileirar
- Busca por ID ou nome
- Listagem de todos os elementos

### Operações Suportadas
- ✅ Inserir novos elementos
- ✅ Remover elementos
- ✅ Buscar por ID
- ✅ Buscar por nome
- ✅ Medição de tempo de execução das buscas
- ✅ Listagem de todos os elementos

## Como Executar

### Pré-requisitos
- Java JDK 21

### Compilação e Execução

1. **Compilar o projeto:**
   ```bash
   javac -d bin -cp src src/App.java
   ```

2. **Executar o programa:**
   ```bash
   java -cp bin App
   ```

## Saída Esperada

O programa irá:
1. Cadastrar 5 livros nas duas estruturas
2. Listar todos os elementos de cada estrutura
3. Realizar buscas por ID e nome com medição de tempo
4. Remover elementos das estruturas
5. Mostrar as estruturas após as remoções
6. Exibir estatísticas finais

## Tecnologias Utilizadas

- **Java**: Linguagem de programação
- **Estruturas de Dados**: Lista Encadeada Simples e Fila Encadeada
- **Padrão TAD**: Tipo Abstrato de Dados com interfaces e implementações separadas
