package curso.java;

import java.util.Locale;
import java.util.Scanner;

public class ExVect10 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        int n = Integer.parseInt(input("Quantos alunos serão digitados? "));

        String[] nome = new String[n];
        double[] nota1 = new double[n];
        double[] nota2 = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Digite nome, primeira e segunda nota do " + (i + 1) + "o aluno:");
            nome[i] = input("");
            nota1[i] = Double.parseDouble(input(""));
            nota2[i] = Double.parseDouble(input(""));
        }
        System.out.println("Alunos aprovados:");

        double media = 0;
        String aluno = "";
        for (int i = 0; i < n; i++) {
            media = (nota1[i] + nota2[i]) / 2;
            aluno = nome[i];
            if (media >= 6.0) {
                System.out.println(aluno);
            }
        }
    }

    static String input(String msg) {
        System.out.print(msg);
        return new Scanner(System.in).nextLine();
    }
}
