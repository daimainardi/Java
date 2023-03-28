package curso.java;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {
    public static void main (String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o número do funcionário:");
        int numero = sc.nextInt();
        System.out.println("Digite o número de horas trabalhadas:");
        int horas = sc.nextInt();
        System.out.println("Qual o valor por hora trabalhada:");
        double valor = sc.nextDouble();
        double salario = horas * valor;
        System.out.printf("NUMBER = %d%nSALARY = U$ %.2f%n", numero, salario);
        sc.close();
    }
}
