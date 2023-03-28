package curso.java;

import java.util.Scanner;

public class ExFuncao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("digite 3 números:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int numeroMaior = maior(a, b, c );
        print(numeroMaior);
    }
    private static void print(int numeroMaior) {
        System.out.println("O maior número é : "+ numeroMaior);
    }
    private static int maior(int a, int b, int c) {
        int maior;
        if (a > b && a > c){
            maior = a;
        }
        else if(b > c){
            maior = b;
        }
        else{
            maior = c;
        }
        return maior;
    }
}
