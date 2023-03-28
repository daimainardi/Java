package curso.java;

import java.util.Scanner;

public class ExVect2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos números você vai digitar? ");
        int n = sc.nextInt();
        int [] vect = new int[n];
        for (int i = 0; i < vect.length; i++){
            System.out.print("Digite um número: ");
            vect [i] = sc.nextInt();
        }
        System.out.println("Números negativos: ");
        for (int numeroInteiro : vect) {
            if (numeroInteiro < 0) {
                System.out.println(numeroInteiro);
            }

        }

    }
}
