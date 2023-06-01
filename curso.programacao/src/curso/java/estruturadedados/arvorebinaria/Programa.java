package curso.java.estruturadedados.arvorebinaria;

public class Programa {
    public static void main(String[] args) {
        ArvoreBinaria a = new ArvoreBinaria();

		a.insereElemento(10,"A");
		a.insereElemento(5,"B");
		a.insereElemento(15,"C");
		a.insereElemento(2,"D");
		a.insereElemento(7,"E");
		a.insereElemento(12,"F");
		a.insereElemento(6,"G");
		a.insereElemento(8,"H");

		a.imprimeElementosArvore();
		System.out.println("Altura: "+a.alturaArvore());

		System.out.println("--------impressao Com Recuo-----------------");
		a.imprimeArvore();

		System.out.println("numero total de nos na àrvore: " + a.quantidadeNos());

		System.out.println("numero de nos esquerda: " + a.quantidadeNosEsquerda());


	}
}
