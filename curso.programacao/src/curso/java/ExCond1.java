package curso.java;

import java.util.Scanner;

public class ExCond1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        int numero = sc.nextInt();
        if (numero<0){
            System.out.println("Este número é negativo!");
        }
        else {
            System.out.println("Este número é positivo!");
        }
    }
}
