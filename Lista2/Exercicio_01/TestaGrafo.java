package Exercicio_01;

public class TestaGrafo {
    public static void main(String[] args) throws Exception {

        Grafo grafo = new Grafo();

        Menu menuDoGrafo = new Menu();

        // Adição de ARESTAS para o VÉRTICE (1)

        grafo.adicionarAresta(1, 2);
        grafo.adicionarAresta(1, 5);

        // Adição de ARESTAS para o VÉRTICE (2)

        grafo.adicionarAresta(2, 1);
        grafo.adicionarAresta(2, 3);
        grafo.adicionarAresta(2, 4);
        grafo.adicionarAresta(2, 5);

        // Adição de ARESTAS para o VÉRTICE (3)

        grafo.adicionarAresta(3, 2);
        grafo.adicionarAresta(3, 4);    

        // Adição de ARESTAS para o VÉRTICE (4)

        grafo.adicionarAresta(4, 2);
        grafo.adicionarAresta(4, 5);
        grafo.adicionarAresta(4, 3);

        // Adição de ARESTAS para o VÉRTICE (5)

        grafo.adicionarAresta(5, 4);
        grafo.adicionarAresta(5, 1);
        grafo.adicionarAresta(5, 2);

        menuDoGrafo.menu(grafo);

    }
}
