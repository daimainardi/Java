package curso.java.aluguel.application;

import curso.java.aluguel.entities.Aluguel;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Aluguel [] vetorAluguel = new Aluguel[10];
        System.out.print("Quantos inquilinos deseja cadastrar?");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i ++){
            System.out.println("Aluguel #" + i + ":");
            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.next();
            System.out.print("Quarto: ");
            int numeroQuarto = sc.nextInt();

            vetorAluguel[numeroQuarto] = new Aluguel(nome, email);
        }
        System.out.println("Quartos alugados:");
        for (int i = 0; i < vetorAluguel.length; i ++){
            if (vetorAluguel[i] != null){
                System.out.println(i + ": " + vetorAluguel[i]);
            }
        }
    }
}
