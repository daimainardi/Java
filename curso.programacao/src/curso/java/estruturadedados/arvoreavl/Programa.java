package curso.java.estruturadedados.arvoreavl;

public class Programa {
    public static void main(String[] args) {
        ArvoreAVL a = new ArvoreAVL(); // cria a arvore binaria de busca
		a.insereAVL(31, "31");
		a.insereAVL(18, "18");
		a.insereAVL(40, "40");
		a.insereAVL(12, "12");
		a.insereAVL(21, "21");
		//a.insereAVL(20,"20");  // pg 69 apostila
		a.insereAVL(15,"15");  // pg 75 apostila
		a.imprimeElementosArvore();
		System.out.println("--------impressao Com Recuo-----------------");
		a.auximp();

		System.out.println("\n\n");

    }
}
