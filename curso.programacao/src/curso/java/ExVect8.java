package curso.java;

import java.util.Locale;
import java.util.Scanner;

public class ExVect8 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        int n = input("Quantos elementos vai ter o vetor? ");

        int[] vetor = new int[n];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = input("Digite um número: ");
        }
        double soma = 0;
        int npares = 0;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 == 0) {
                soma += vetor[i];
                npares++;
            }
        }
        if (npares == 0) {
            System.out.println("Nenhum número par");
        } else {
            double media = soma / npares;
            System.out.printf("Média dos pares = %.1f", media);
        }

    }

    static int input(String msg) {
        System.out.print(msg);
        return new Scanner(System.in).nextInt();
    }
}
