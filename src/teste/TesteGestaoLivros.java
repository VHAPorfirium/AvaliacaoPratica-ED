package teste;

import classe.FilaEncadeada;
import classe.ListaEncadeadaSimples;
import classe.Livro;

public class TesteGestaoLivros {
        public static void main(String[] args) {
                System.out.println("=== SISTEMA DE GESTÃO DE LIVROS ===\n");

                ListaEncadeadaSimples<Livro> lista = new ListaEncadeadaSimples<>();
                FilaEncadeada<Livro> fila = new FilaEncadeada<>();

                System.out.println("1. CADASTRANDO LIVROS...");
                lista.inserir(new Livro(1, "O Senhor dos Anéis", "Fantasia"));
                lista.inserir(new Livro(2, "1984", "Ficção Científica"));
                lista.inserir(new Livro(3, "Dom Casmurro", "Literatura Brasileira"));
                lista.inserir(new Livro(4, "Harry Potter", "Fantasia"));
                lista.inserir(new Livro(5, "A Revolução dos Bichos", "Ficção Política"));

                fila.enfileirar(new Livro(1, "O Senhor dos Anéis", "Fantasia"));
                fila.enfileirar(new Livro(2, "1984", "Ficção Científica"));
                fila.enfileirar(new Livro(3, "Dom Casmurro", "Literatura Brasileira"));
                fila.enfileirar(new Livro(4, "Harry Potter", "Fantasia"));
                fila.enfileirar(new Livro(5, "A Revolução dos Bichos", "Ficção Política"));

                System.out.println("Livros cadastrados com sucesso!\n");

                System.out.println("2. LISTANDO TODOS OS ELEMENTOS:");
                System.out.println("\n--- LISTA ENCADEADA SIMPLES ---");
                lista.listar();
                System.out.println("\n--- FILA ENCADEADA ---");
                fila.listar();

                System.out.println("\n3. TESTANDO BUSCAS COM MEDIÇÃO DE DESEMPENHO:");

                System.out.println("\n--- Busca por ID (ID = 3) ---");
                long inicioLista = System.nanoTime();
                Livro resultadoLista = lista.buscar(3);
                long fimLista = System.nanoTime();
                long tempoLista = fimLista - inicioLista;

                long inicioFila = System.nanoTime();
                Livro resultadoFila = fila.buscar(3);
                long fimFila = System.nanoTime();
                long tempoFila = fimFila - inicioFila;

                System.out.println(
                                "Resultado na Lista: " + (resultadoLista != null ? resultadoLista.toString()
                                                : "Não encontrado"));
                System.out.println("Tempo na Lista: " + tempoLista + " nanosegundos");
                System.out
                                .println("Resultado na Fila: " + (resultadoFila != null ? resultadoFila.toString()
                                                : "Não encontrado"));
                System.out.println("Tempo na Fila: " + tempoFila + " nanosegundos");

                System.out.println("\n--- Busca por Nome (Nome = 'Harry Potter') ---");
                inicioLista = System.nanoTime();
                resultadoLista = lista.buscar("Harry Potter");
                fimLista = System.nanoTime();
                tempoLista = fimLista - inicioLista;

                inicioFila = System.nanoTime();
                resultadoFila = fila.buscar("Harry Potter");
                fimFila = System.nanoTime();
                tempoFila = fimFila - inicioFila;

                System.out.println(
                                "Resultado na Lista: " + (resultadoLista != null ? resultadoLista.toString()
                                                : "Não encontrado"));
                System.out.println("Tempo na Lista: " + tempoLista + " nanosegundos");
                System.out
                                .println("Resultado na Fila: " + (resultadoFila != null ? resultadoFila.toString()
                                                : "Não encontrado"));
                System.out.println("Tempo na Fila: " + tempoFila + " nanosegundos");

                System.out.println("\n4. TESTANDO REMOÇÕES:");

                System.out.println("\n--- Removendo elemento do índice 2 da Lista ---");
                Livro removidoLista = lista.remover(2);
                System.out.println(
                                "Elemento removido da Lista: "
                                                + (removidoLista != null ? removidoLista.toString() : "Nenhum"));

                System.out.println("\n--- Removendo elemento da Fila (FIFO) ---");
                Livro removidoFila = fila.desenfileirar();
                System.out.println("Elemento removido da Fila: "
                                + (removidoFila != null ? removidoFila.toString() : "Nenhum"));

                System.out.println("\n5. ESTRUTURAS APÓS REMOÇÃO:");
                System.out.println("\n--- LISTA ENCADEADA SIMPLES ---");
                lista.listar();
                System.out.println("\n--- FILA ENCADEADA ---");
                fila.listar();

                System.out.println("\n6. ESTATÍSTICAS FINAIS:");
                System.out.println("Tamanho da Lista: " + lista.tamanho());
                System.out.println("Tamanho da Fila: " + fila.tamanho());
                System.out.println("Lista vazia: " + lista.vazia());
                System.out.println("Fila vazia: " + fila.vazia());

                System.out.println("\n=== TESTE CONCLUÍDO ===");
        }
}
