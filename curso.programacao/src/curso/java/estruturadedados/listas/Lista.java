package curso.java.estruturadedados.listas;

public class Lista {
    private No inicio;

    public Lista() {
        this.inicio = null;
    }

    public void insereInicio(Object elemento) {

        No novoNo = new No(elemento, null); // passo 1 da figura 3
        novoNo.setProximo(this.inicio); // passo 2 da figura 3
        this.inicio = novoNo; // passo 3 da figura 3
    }

    public Object removeInicio() {
        No auxiliar = this.inicio; // passo 1 da figura 4
        this.inicio = auxiliar.getProximo(); // passo 2 da figura 4
        return auxiliar.getElemento(); // passo 3 da figura 4
    }

    public void imprimeLista() {
        No auxiliar = this.inicio;
        System.out.println("Inicio da Lista Ligada");
        while (auxiliar != null) {
            System.out.println(auxiliar.getElemento());
            auxiliar = auxiliar.getProximo();
        }
        System.out.println("Final da Lista Ligada");
    }

    public Object buscaElemento(long posicao) {
        No auxiliar = this.inicio;
        while ((posicao > 0) && (auxiliar != null)) {
            if (posicao == 1) {
                return auxiliar.getElemento();
            }
            posicao--;
            auxiliar = auxiliar.getProximo();
        }
        return null; // a lista não possui elemento na posição indicada
    }

    public void liberaLista() {
        while (inicio != null) {
            inicio = inicio.getProximo();
            // o garbage collector de Java libera automaticamente o nó eliminado
        }
    }
}
