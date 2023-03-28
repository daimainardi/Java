package curso.java;

import java.util.Scanner;

public class ExRepet10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroLinhas = sc.nextInt();
        for (int i = 1; i <= numeroLinhas; i++) {
            int quadrado = (int) Math.pow(i, 2);
            int cubo = (int) Math.pow(i, 3);
            System.out.printf("%d %d %d%n", i , quadrado , cubo);
        }

    }
}
