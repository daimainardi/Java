package curso.java;

import java.util.Scanner;

public class ExCond3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite dois valores inteiros:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a % b == 0 || b % a == 0){
            System.out.println("São Multiplos");
        }
        else{
            System.out.println("Não são Multiplos");
        }
    }
}
