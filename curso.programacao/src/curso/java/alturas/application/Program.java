package curso.java.alturas.application;

import curso.java.alturas.entities.Pessoas;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantas pessoas serão digitadas: ");
        int n = sc.nextInt();

        Pessoas[] vetPessoas = new Pessoas[n];
        for (int i = 0; i< vetPessoas.length; i++){
            System.out.println("Dados da " + (i + 1) + "a pessoa:");
            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            System.out.print("Altura: ");
            double altura = sc.nextDouble();
            vetPessoas [i] = new Pessoas(nome, idade, altura);
        }
        double somaAlturas = 0.0;
        for (int i = 0; i < vetPessoas.length; i++){
            somaAlturas += vetPessoas[i].getAltura();
        }
        double mediaAlturas = somaAlturas/ vetPessoas.length;
        System.out.printf("Altura média: %.2f%n", mediaAlturas);

        int cont = 0;
        for (int i = 0; i < vetPessoas.length; i++){
            if (vetPessoas[i].getIdade() < 16){
                cont ++;
            }
        }
        double porcentagem = (cont * 100.0)/n;
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", porcentagem);

        for (int i = 0; i < vetPessoas.length; i++){
            if (vetPessoas[i].getIdade() < 16){
                System.out.println(vetPessoas[i].getNome());
            }
        }
    }
}
