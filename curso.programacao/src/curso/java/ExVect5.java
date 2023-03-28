package curso.java;

import java.util.Locale;
import java.util.Scanner;

public class ExVect5 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        int n = input("Quantos números você vai digitar? ");

        int[] numeros = new int[n];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = input("Digite um número: ");
        }
        System.out.println();
        System.out.println("Números pares:");
        int cont = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                cont++;
                System.out.print(numeros[i] + " ");
            }
        }
        System.out.println();
        System.out.println("\nQuantidade de pares = " + cont);

        int maior = 0;
        int posicao = 0;
        for (int i = 0; i < numeros.length; i++){
            if (numeros[i] > maior){
                maior = numeros[i];
                posicao = i;
            }
        }
        System.out.println("\nMaior valor = " + maior);
        System.out.println("Posição do maior valor = " + posicao);
    }

    static int input(String msg) {
        System.out.print(msg);
        return new Scanner(System.in).nextInt();
    }
}
