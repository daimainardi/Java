package curso.java;

import java.util.Locale;
import java.util.Scanner;

public class ExVect4 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

//        System.out.print("Quantas pessoas serão digitadas? ");
//        int n = sc.nextInt();//

        int n = Integer.parseInt(input("Quantas pessoas serão digitadas? "));

        String[] nomes = new String[n];
        int[] idades = new int[n];
        double[] alturas = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Dados da " + (i + 1) + "a pessoa:");
//            System.out.print("Nome: ");
//            sc.nextLine();
//            nomes[i] = sc.nextLine();
            nomes [i] = (input("Nome: "));
//            System.out.print("Idade: ");
//            idades[i] = sc.nextInt();
            idades[i] = Integer.parseInt(input("Idade: "));
//            System.out.print("Altura: ");
//            alturas[i] = sc.nextDouble();
            alturas[i] = Double.parseDouble((input("Altura: ")));

        }
        double soma = 0;
        for (int i = 0; i < n; i++) {
            soma += alturas[i];
        }
        double media = soma / n;
        System.out.println();
        System.out.printf("Altura média: %.2f%n", media);

        int cont = 0;
        for (int i = 0; i < n; i++) {
            if (idades[i] < 16) {
                cont++;
            }

        }
        double percent = (double) cont / n * 100.0;
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", percent);


        for (int i = 0; i < n; i++) {
            if (idades[i] < 16) {
                System.out.println(nomes[i]);
            }
        }
        sc.close();
    }
    static String input(String msg){
        System.out.print(msg);
        return new Scanner(System.in).nextLine();
    }
}
