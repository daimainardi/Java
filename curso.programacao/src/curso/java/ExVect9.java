package curso.java;

import java.util.Scanner;

public class ExVect9 {
    public static void main(String[] args) {
        int n = Integer.parseInt(input("Quantas pessoas você vai digitar? "));

        String[] nome = new String[n];
        int[] idade = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Dados da " + (i + 1) + "a pessoa:");
            nome[i] = input("Nome: ");
            idade[i] = Integer.parseInt(input("Idade: "));
        }

        int maioridade = 0;
        int posicaomaior = 0;
        for (int i = 0; i < n; i++) {
            if (idade[i] > maioridade) {
                maioridade = idade[i];
                posicaomaior = i;
            }
        }
        System.out.println("Pessoa mais velha: " + nome[posicaomaior]);
    }

    static String input(String msg) {
        System.out.print(msg);
        return new Scanner(System.in).nextLine();
    }
}
