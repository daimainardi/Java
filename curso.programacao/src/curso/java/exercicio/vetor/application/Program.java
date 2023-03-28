package curso.java.exercicio.vetor.application;

import curso.java.exercicio.vetor.entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número de produtos: ");
        int n = sc.nextInt();
        Product[] vect = new Product[n];

        System.out.println("Digite o nome e preço de cada produto: ");

        for (int i = 0; i < vect.length; i++) {
            sc.nextLine();
            String name = sc.nextLine();
            double price = sc.nextDouble();
            vect[i] = new Product(name, price);
        }
        double sum = 0.0;
        for (int i = 0; i < vect.length; i++) {
            sum += vect[i].getPrice();
        }
        double avg = sum/ vect.length;
        System.out.printf("Média dos preços: %.2f%n", avg);

    }
}
