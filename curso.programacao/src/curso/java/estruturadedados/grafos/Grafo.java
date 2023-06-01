package curso.java.estruturadedados.grafos;

public class Grafo {
    private final int MAX_VERTICES = 20;
    private final int INFINITO = 1000000;
    private Vertice listaVertice[];
    private int matriz[][];
    private int numVertices;
    private int numFechados;
    private DistanciaEstimada menor[];
    private int verticeAtual;
    private int distParaAtual;

    public Grafo() {
        listaVertice = new Vertice[MAX_VERTICES];
        matriz = new int[MAX_VERTICES][MAX_VERTICES];
        numVertices = 0; // inicia número de vértices como 0
        numFechados = 0;  // inicia com nenhum vértice fechado
        for (int y = 0; y < MAX_VERTICES; y++) { // inicializa matriz com infinito
            for (int x = 0; x < MAX_VERTICES; x++) {
                matriz[x][y] = INFINITO;
            }
        }
        menor = new DistanciaEstimada[MAX_VERTICES];
    }

    public void adicVertice(String rotulo) {
        numVertices++;
        listaVertice[numVertices] = new Vertice(rotulo);
    }

    public void adicAresta(int inicio, int fim) {
        matriz[inicio][fim] = 1;
        matriz[fim][inicio] = 1;
    }

    private int pegaMinimo() { // pega o índice com a menor distância
        int minimo = INFINITO;
        int indice = 0;
        for (int j = 1; j < numVertices; j++) { // acessa cada vértice
            if (!listaVertice[j].getVisitado() && menor[j].getDistancia() < minimo) {
                // se for menor que o anterior, marca como menor
                minimo = menor[j].getDistancia();
                indice = j;
            }
        }
        return indice;
    }

    private void ajustaMenor() { // ajusta o vetor com os caminhos mais curtos
        int coluna = 1; // pula o vértice inicial
        while (coluna < numVertices) { // percorre as colunas
            if (listaVertice[coluna].getVisitado()) {
                // se vértice já está fechado, pula a coluna
                coluna++;
                continue;
            }
            // calcula a distância para uma entrada de menor[]
            int atualParaMargem = matriz[verticeAtual][coluna];
            int inicioParaMargem = distParaAtual + atualParaMargem;
            int menorDistancia = menor[coluna].getDistancia();
            if (inicioParaMargem < menorDistancia) {
                menor[coluna].setPaiVertice(verticeAtual);
                menor[coluna].setDistancia(inicioParaMargem);
            }
            coluna++;
        }
    }

    private void mostraMenor() { // mostra o menor caminho encontrado
        for (int j = 0; j < numVertices; j++) { // mostra o conteúdo de menor[]
            System.out.print(listaVertice[j].getRotulo() + " =");
            if (menor[j].getDistancia() == INFINITO) {
                System.out.print("inf");
            } else {
                System.out.print(menor[j].getDistancia());
            }
            String pai = (String) listaVertice[menor[j].getPaiVertice()].getRotulo();
            System.out.print(" (" + pai + ") ");
        }
        System.out.println(" ");
    }

    public void menorCaminho() { // encontra o menor caminho
        int inicio = 0; // começa pelo vértice 0
        listaVertice[inicio].foiVisitado(); // primeiro vértice marcado como fechado
        numFechados = 1; // inclui o vértice inicial como fechado
        for (int j = 0; j <= numVertices; j++) { // transfere as distâncias para o vetor menor
            // distância armazenada na matriz de adjacências
            int distancia = matriz[inicio][j];
            // pai recebe inicio=0 e a distância
            menor[j] = new DistanciaEstimada(inicio, distancia);
        }
        while (numFechados < numVertices) {
            int indiceParaMinimo = pegaMinimo();
            int minimaDistancia = menor[indiceParaMinimo].getDistancia();
            if (minimaDistancia == INFINITO) { // existe vértice não encontrado
                System.out.println("Existem vértices não endereçados");
                break;
            } else {
                verticeAtual = indiceParaMinimo;
                distParaAtual = menor[indiceParaMinimo].getDistancia();
            }
            listaVertice[verticeAtual].foiVisitado(); // marca vértice atual como fechado
            numFechados++; // incrementa o número de vértices fechados
            ajustaMenor();
        }
        mostraMenor(); // mostra o conteúdo de menor[]
        numFechados = 0; // limpa o número de vértices fechados para a próxima busca
        for (int j = 0; j < numVertices; j++) {
            listaVertice[j].naoFoiVisitado();
        }
    }

    /*
    public void displayVertice(int v) {
        //método para exibir um determinado vértice System.out.print(listaVertice[v].getRotulo());
    }

    public void DFS() { // pesquisa em profundidade
        Pilha p = new Pilha();
        listaVertice[0].foiVisitado(); // indica que o primeiro vértice foi visitado
        mostraVertice(0); // mostra o primeiro vértice
        p.push(0); // coloca na pilha

        while (!p.eVazia()) {  // pega um vértice adjacente ainda não visitado para colocar na pilha
            int v = pegaVerticeNaoVisitado((int) p.topo());
            if (v == -1) { // se não encontrou, tira um da pilha
                p.pop();
            } else { // encontrou um vértice não visitado
                listaVertice[v].foiVisitado(); // marca como visitado
                mostraVertice(v); // mostra o vértice na tela
                p.push(v); // coloca na pilha
            }
        } // a pilha está vazia, basta resetar todas as marcações
        for (int j = 0; j < numVertices; j++) // reset flags
            listaVertice[j].naoFoiVisitado();
    }
    */
    private int pegaVerticeNaoVisitado(int v) {
        for (int j = 0; j < numVertices; j++) {
            if (matriz[v][j] == 1 && listaVertice[j].getVisitado() == false) {
                return j;
            }
        }
        return -1;
    }
    /*
    public void BFS() { // pesquisa em largura no grafo
        Fila f = new Fila();
        listaVertice[0].foiVisitado(); // indica que o primeiro vértice foi visitado
        mostraVertice(0); // mostra o primeiro vértice
        f.insere(0); // insere no final da fila
        int v2;
        while (!f.eVazia()) { // até que a fila seja vazia
            int v1 = (int) f.remove(); //remove o vértice do início da fila até que não haja mais adjacente não visitado
            while ((v2 = pegaVerticeNaoVisitado(v1)) != -1) { // pegue um
                listaVertice[v2].foiVisitado(); // marca como visitado
                mostraVertice(v2); // mostra o vértice na tela
                f.insere(v2); // insere no final da fila
            }
        }// a fila está vazia, basta resetar todas as marcações
        for (int j = 0; j < numVertices; j++) // reset flags
            listaVertice[j].naoFoiVisitado();
    }
     */

}
