package curso.java;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o código da peça 1, número de peças e o valor unitário:");
        int codigoPeca1;
        int numeroPeca1;
        double valorPeca1;
        codigoPeca1 = sc.nextInt();
        numeroPeca1 = sc.nextInt();
        valorPeca1 = sc.nextDouble();
        System.out.println("Digite o código da peça 2, número de peças e o valor unitário:");
        int codigoPeca2;
        int numeroPeca2;
        double valorPeca2;
        codigoPeca2 = sc.nextInt();
        numeroPeca2 = sc.nextInt();
        valorPeca2 = sc.nextDouble();
        double total = numeroPeca1 * valorPeca1 + numeroPeca2 * valorPeca2;
        System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);

    }
}
