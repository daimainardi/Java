package curso.java.estruturadedados.grafos;

public class Programa {
    public static void main(String[] args) {

        Grafo g = new Grafo();
// inserção dos vértices
        g.adicVertice("A"); // será índice 0
        g.adicVertice("B"); // será índice 1
        g.adicVertice("C"); // será índice 2
        g.adicVertice("D"); // será índice 3
        g.adicVertice("E"); // será índice 4
        g.adicVertice("F"); // será índice 5
        g.adicVertice("G"); // será índice 6
// inserção das arestas
        g.adicAresta(0, 1); // AB 50
        g.adicAresta(0, 3); // AD 80
        g.adicAresta(1, 2); // BC 60
        g.adicAresta(1, 3); // BD 90
        g.adicAresta(2, 4); // CE 40
        g.adicAresta(3, 2); // DC 20
        g.adicAresta(3, 4); // DE 70
        g.adicAresta(4, 1); // EB 50
        g.adicAresta(5, 6); // FG 20

        System.out.println("Menor Caminho");
        g.menorCaminho();

        //System.out.print("DFS - Vertices visitados: ");
        // g.DFS(); // pesquisa em profundidade
        //System.out.print("BFS - Vertices visitados: ");
        // g.BFS(); // pesquisa em largura
    }
}
