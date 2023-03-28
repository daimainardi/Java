package curso.java;

import java.util.Scanner;

public class Matrizes2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o número de linhas e de colunas:");
        int numeroLinhas = sc.nextInt();
        int numeroColunas = sc.nextInt();

        int[][] matriz = new int[numeroLinhas][numeroColunas];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }
        int x = sc.nextInt();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == x) {
                    System.out.println("posição " + i + "," + j + ":");
                    if (i > 0) {
                        System.out.println("acima: " + matriz[i - 1][j]);
                    }
                    if (j > 0) {
                        System.out.println("esquerda: " + matriz[i][j - 1]);
                    }
                    if (j < matriz[i].length - 1) {
                        System.out.println("direita: " + matriz[i][j + 1]);
                    }
                    if (i < matriz.length - 1) {
                        System.out.println("abaixo: " + matriz[i + 1][j]);
                    }
                }
            }
        }

    }
}
