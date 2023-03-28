package curso.java;

import java.util.Locale;
import java.util.Scanner;

public class ExVect1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = sc.nextInt();
        double[] vect = new double[numero];

        System.out.println("Digite as alturas: ");
        for (int i = 0; i < numero; i++) {
            vect[i] = sc.nextDouble();
        }
        double soma = 0.0;
        for (int i = 0; i < numero; i++) {
            soma += vect[i];
        }
        double media = soma / numero;
        System.out.printf("Altura média: %.2f%n", media);
    }
}
