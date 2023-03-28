package curso.java;

import java.util.Locale;
import java.util.Scanner;

public class ExVect11 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        int n = Integer.parseInt(input("Quantas pessoas serão digitadas? "));

        double[] altura = new double[n];
        char[] genero = new char[n];

        for (int i = 0; i < n; i++) {
            altura[i] = Double.parseDouble(input("Altura da " + (i + 1) + "a pessoa: "));
            genero[i] = input("Gênero da " + (i + 1) + "a pessoa: ").charAt(0);
        }
        double maioraltura = 0;
        double menoraltura = altura[0];
        for (int i = 0; i < n; i++) {
            if (altura[i] > maioraltura) {
                maioraltura = altura[i];
            } else if (altura[i] < menoraltura) {
                menoraltura = altura[i];
            }
        }
        System.out.printf("Menor altura = %.2f%n", menoraltura);
        System.out.printf("Maior altura = %.2f%n", maioraltura);

        double somaAlturas = 0;
        int quantMulheres = 0;
        for (int i = 0; i < n; i++) {
            if (genero[i] == 'F') {
                quantMulheres++;
                somaAlturas += altura[i];
            }
        }
        double media = somaAlturas / quantMulheres;
        System.out.printf("Média das alturas das mulheres = %.2f%n", media);

        int quantHomens = 0;
        for (int i = 0; i < n; i++) {
            if (genero[i] == 'M') {
                quantHomens++;
            }
        }
        System.out.println("Numero de homens = " + quantHomens);
    }

    static String input(String msg) {
        System.out.print(msg);
        return new Scanner(System.in).nextLine();
    }
}
