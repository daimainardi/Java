package curso.java;

import java.util.Scanner;

public class ExVect6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = input("Quantos valores vai ter cada vetor? ");

        System.out.println("Digite os valores do vetor A:");
        int[] vetora = new int[n];
        for (int i = 0; i < vetora.length; i++) {
            vetora[i] = input("");
        }

        System.out.println("Digite os valores do vetor B:");
        int[] vetorb = new int[n];
        for (int i = 0; i < vetorb.length; i++) {
            vetorb[i] = input("");

        }
        System.out.println("Vetor resultante: ");
        int soma = 0;
        for (int i = 0; i < vetorb.length; i++) {
            soma = vetora[i] + vetorb[i];
            System.out.println(soma);
        }

    }

    static int input(String msg) {
        System.out.print(msg);
        return new Scanner(System.in).nextInt();
    }
}
