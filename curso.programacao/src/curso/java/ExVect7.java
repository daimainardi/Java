package curso.java;

import java.util.Locale;
import java.util.Scanner;

public class ExVect7 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        int n = Integer.parseInt (input("Quantos elementos vai ter o vetor? "));

        double[] vetor = new double[n];
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = Double.parseDouble(input("Digite um número: "));
        }
        double soma = 0;
        for (double v : vetor) {
            soma += v;
        }
        double media = soma/n;
        System.out.printf("Media do vetor = %.3f%n", media);

        System.out.println("Elementos abaixo da média:");
        for (double v : vetor) {
            if (v < media) {
                System.out.println(v);
            }
        }
    }

    static String input(String msg) {
        System.out.print(msg);
        return new Scanner(System.in).nextLine();
    }
}
