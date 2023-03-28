package curso.java;

import java.util.Scanner;

public class Matrizes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tamanho = sc.nextInt();
        int[][] matriz = new int[tamanho][tamanho];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }

        System.out.println("Elementos da diagonal principal: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i] == matriz[j]) {
                    System.out.print(matriz[i][j] + " ");
                }
            }
        }
        // ou do jeito mais fácil:
        // for (int i = 0; i < matriz.length; i++) {
        //      System.out.println(matriz[i][i] + ", ");

        System.out.println();
        int cont = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] < 0) {
                    cont++;
                }
            }
        }
        System.out.print("Números negativos: " + cont);
    }
}



