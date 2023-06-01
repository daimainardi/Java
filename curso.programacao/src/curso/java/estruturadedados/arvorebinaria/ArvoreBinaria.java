package curso.java.estruturadedados.arvorebinaria;

import java.util.ArrayList;

public class ArvoreBinaria {
    private No raiz;

    public ArvoreBinaria() {
        this.raiz = null;
    }

    public void insereElemento(long id, Object elemento) {

        No novoNo = new No(id, elemento, (No) null, (No) null);
        if (raiz == null) {
            raiz = novoNo;
        } else {
            No atual = raiz;
            No pai;
            while (true) {
                pai = atual;
                if (id < atual.getId()) { // vai inserir à esquerda
                    atual = atual.getEsq();
                    if (atual == null) { // pode inserir à esquerda
                        pai.setEsq(novoNo);
                        return;
                    } // se não é nulo, vai tentar o próximo filho
                } else { // vai inserir à direita
                    atual = atual.getDir();
                    if (atual == null) { // pode inserir à direita
                        pai.setDir(novoNo);
                        return;
                    }
                }
            }
        }
    }

    private void preFixado(No atual) {
        if (atual != null) {
            System.out.println("Id: " + atual.getId() + " Elemento: " + atual.getElemento());
            preFixado(atual.getEsq());
            preFixado(atual.getDir());
        }
    }

    private void posFixado(No atual) {
        if (atual != null) {
            posFixado(atual.getEsq());
            posFixado(atual.getDir());
            System.out.println("Id: " + atual.getId() + " Elemento: " + atual.getElemento());
        }
    }

    private void simFixado(No atual) {
        if (atual != null) {
            simFixado(atual.getEsq());
            System.out.println("Id: " + atual.getId() + " Elemento: " + atual.getElemento());
            simFixado(atual.getDir());
        }
    }

    public void imprimeElementosArvore() {
        System.out.println("--------impressao PreFixado-----------------");
        preFixado(raiz);
        //System.out.println("--------impressao PosFixado------------------");
        //posFixado(raiz);
        //System.out.println("--------impressao SimFixado------------------");
        //simFixado(raiz);
    }

    private long calcAltura(No atual, long altura) {
        if (atual != null) {
            long esquerda = calcAltura(atual.getEsq(), altura) + 1;
            long direita = calcAltura(atual.getDir(), altura) + 1;
            if (esquerda > direita) {
                return altura + esquerda;
            } else {
                return altura + direita;
            }
        }
        return altura;
    }

    public long alturaArvore() {
        long altura = 0;
        return calcAltura(raiz, altura);
    }

    private void imprimirArvore(No atual, int numeroNos) {
        String tabulacao = "";
        for (int i = 1; i <= numeroNos; i++) {
            tabulacao += "\t";
        }
        if (atual != null) {
            numeroNos++;
            System.out.println(tabulacao + atual.getId());
            imprimirArvore(atual.getEsq(), numeroNos);
            imprimirArvore(atual.getDir(), numeroNos);

        } else {
            System.out.println(tabulacao + "-");
        }
    }

    public void imprimeArvore() {
        imprimirArvore(raiz, 0);
    }

    public int quantidadeNos() {
        return quantidadeNos(raiz);
    }

    private int quantidadeNos(No raiz) {
        if (raiz == null) {
            return 0;
        }
        int quantidadeNosEsquerda = quantidadeNos(raiz.getEsq());
        int quantidadeNosDireita = quantidadeNos(raiz.getDir());
        return quantidadeNosEsquerda + quantidadeNosDireita + 1;
    }

    private int contarNosEsquerda(No atual, ArrayList<No> listaNosEsquerda) {
        if (atual != null) {
            contarNosEsquerda(atual.getEsq(), listaNosEsquerda);
            contarNosEsquerda(atual.getDir(), listaNosEsquerda);
        }
        try {
            if (atual.getEsq() != null) {
            listaNosEsquerda.add(atual.getEsq());
        }
        }
        catch (NullPointerException e){
        }
        return listaNosEsquerda.size();
    }

    public int quantidadeNosEsquerda() {
        No atual = this.raiz;
        ArrayList <No> listaNosEsquerda = new ArrayList<>();
        return contarNosEsquerda(atual, listaNosEsquerda);
    }

}
