package curso.java;

import java.util.Locale;
import java.util.Scanner;
public class Exercicio3 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double raio = sc.nextDouble();
        double raioQuadrado = Math.pow(raio,2);
        double area = 3.14159 * raioQuadrado;
        System.out.printf("A=%.4f%n", area);
        sc.close();
    }
}
