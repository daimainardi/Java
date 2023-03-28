package curso.java;

import java.util.Scanner;

public class ExRepet3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;
        while (numero != 4) {
            if (numero == 1) {
                alcool = alcool + 1;
            } else if (numero == 2) {
                gasolina = gasolina + 1;
            } else if (numero == 3) {
                diesel = diesel + 1;
            }
            numero = sc.nextInt();
        }
        System.out.println("MUITO OBRIGADA");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);
    }

}
