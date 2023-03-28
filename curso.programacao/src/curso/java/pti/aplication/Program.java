package curso.java.pti.aplication;

import curso.java.pti.entities.Ponto;

public class Program {
    public static void main(String[] args) {
        Ponto pontoA = new Ponto(1, 1);
        Ponto pontoB = new Ponto(1, 4);

        boolean verificaIguais = pontoA.pontosIguais(pontoB);
        System.out.println("Pontos iguais? " + verificaIguais);

        double distanciaPontos = pontoA.calcularDistancia(pontoB);
        System.out.printf("Distância = %.2f%n", distanciaPontos);

    }

}

