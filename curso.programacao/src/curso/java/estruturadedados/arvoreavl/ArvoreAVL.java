package curso.java.estruturadedados.arvoreavl;

public class ArvoreAVL {
    private No raiz;

    public ArvoreAVL() {
        this.raiz = null;
    }

    public void insereAVL(long id, Object elemento) {
        No novoNo = new No(id, elemento, null, null);
        insere(raiz, novoNo);
    }

    private void insere(No atual, No novo) {
        if (atual == null) { //árvore vazia, insere na raiz
            this.raiz = novo;
            return;
        }
        if (novo.getId() < atual.getId()) { // vai inserir à esquerda
            if (atual.getEsq() == null) { // achou a posição, basta inserir
                atual.setEsq(novo);
                novo.setPai(atual);
                avaliaBalanceamento(atual);
            } else { // continua buscando resursivamente à esquerda
                insere(atual.getEsq(), novo);
            }
        } else {
            if (novo.getId() > atual.getId()) { // vai inserir à direita
                if (atual.getDir() == null) { // achou a posição, basta inserir
                    atual.setDir(novo);
                    novo.setPai(atual);
                    avaliaBalanceamento(atual);
                } else { // continua buscando resursivamente à direita
                    insere(atual.getDir(), novo);
                }
            } else {
                return; // achou o elemento igual, nada inserido
            }
        }
    }

    private void avaliaBalanceamento(No atual) {
        calcBalanceamento(atual); //calcula o indicador B do nó atual
        long b = atual.getB();
        System.out.println("Valor de B: " + b);
        if (b == -2) { // b=-2 indica que a subárvore direita ficou maior
            if (altura(atual.getEsq().getEsq()) >= altura(atual.getEsq().getDir())) {  //testa netos esq
                atual = rotacaoDir(atual); //subárvore esquerda do neto é maior, rotação simples
            } else {
                atual = duplaRotacaoDir(atual); //rotação dupla
            }
        } else {
            if (b == 2) { // b=2 indica que a subárvore esquerda ficou maior
                if (altura(atual.getDir().getDir()) >= altura(atual.getDir().getEsq())) {  //testa netos dir
                    atual = rotacaoEsq(atual); //subárvore direita do neto é maior, rotação simples
                } else {
                    atual = duplaRotacaoEsq(atual); //rotação dupla
                }
            }
        }
        if (atual.getPai() != null) {
            avaliaBalanceamento(atual.getPai()); //vai testar o balanceamento do pai
        } else {
            this.raiz = atual; //senão atual passa a ser a raiz
        }
    }

    private void calcBalanceamento(No no) { //calcular o indicador B
        no.setB(altura(no.getDir()) - altura(no.getEsq()));
    }

    private long altura(No atual) {
        if (atual == null) { //se o nó está vazio sempre retorna -1
            return -1;
        }
        if ((atual.getEsq() == null) && (atual.getDir() == null)) {
            return 0;
        } else {
            if (atual.getEsq() == null) {
                return 1 + altura(atual.getDir());
            } else {
                if (atual.getDir() == null) {
                    return 1 + altura(atual.getEsq());
                } else {
                    return 1 + Math.max(altura(atual.getEsq()), altura(atual.getDir()));
                }
            }
        }
    }

    private No rotacaoEsq(No inicial) {
        No dir = inicial.getDir(); //salva apontamento do novo pai após rotação
        dir.setPai(inicial.getPai());
        inicial.setDir(dir.getEsq()); //Neto esquerdo do filho direito passa a ser filho direito
        if (inicial.getDir() != null) {
            inicial.getDir().setPai(inicial);
        }
        dir.setEsq(inicial); //filho esquerdo passa a ser pai
        inicial.setPai(dir);
        if (dir.getPai() != null) { //acerta os apontamentos do novo pai
            if (dir.getPai().getDir() == inicial) {
                dir.getPai().setDir(dir);
            } else if (dir.getPai().getEsq() == inicial) {
                dir.getPai().setEsq(dir);
            }
        }
        calcBalanceamento(inicial); //calcula os novos indicadores de balanceamento
        calcBalanceamento(dir);
        return dir;
    }

    private No rotacaoDir(No inicial) {
        No esq = inicial.getEsq(); //salva apontamento do novo pai após rotação
        esq.setPai(inicial.getPai());
        inicial.setEsq(esq.getDir()); //Neto direito do filho esquerdo passa a ser filho esquerdo
        if (inicial.getEsq() != null) {
            inicial.getEsq().setPai(inicial);
        }
        esq.setDir(inicial); //filho esquerdo passa a ser pai
        inicial.setPai(esq);
        if (esq.getPai() != null) { //acerta os apontamentos do novo pai
            if (esq.getPai().getDir() == inicial) {
                esq.getPai().setDir(esq);
            } else if (esq.getPai().getEsq() == inicial) {
                esq.getPai().setEsq(esq);
            }
        }
        calcBalanceamento(inicial);
        calcBalanceamento(esq);
        return esq;
    }

    private No duplaRotacaoDir(No inicial) {
        inicial.setEsq(rotacaoEsq(inicial.getEsq())); // rotaciona o filho esquerdo para a esquerda
        return rotacaoDir(inicial); // e depois rotaciona a árvore à direita
    }

    private No duplaRotacaoEsq(No inicial) {
        inicial.setDir(rotacaoDir(inicial.getDir())); // rotaciona o filho direito para a direita
        return rotacaoEsq(inicial); // depois rotaciona a árvore à esquerda
    }
    private void preFixado(No atual) {
		if (atual != null) {
			System.out.println("Id: " + atual.getId() + " Elemento: " + atual.getElemento());
			preFixado(atual.getEsq());
			preFixado(atual.getDir());
		}
	}
    public void imprimeElementosArvore() { //impressão dos elementos da arvore
		System.out.println("--------impressao PreFixado-----------------");
		preFixado(raiz);
        //System.out.println("--------impressao PosFixado-----------------");
        //posFixado(raiz);
        //System.out.println("--------impressao SimFixado-----------------");
        //simfixado(raiz);
	}
    //impressão da arvore
    private void imp(No atual, long n) {
		String tab = "";
		for (long i = 1; i <= n; i++) {
			tab += "\t";
		}
		if (atual != null) {
			n++;
			System.out.println(tab + atual.getId());
			imp(atual.getEsq(), n);
			imp(atual.getDir(), n);

		} else {
			System.out.println(tab + " * sem filho");
		}
	}

	public void auximp() {
		long n = 0;
		imp(raiz, n);
	}

}
