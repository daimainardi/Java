package curso.java.excecao.exercicio1.application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        method1();
        System.out.println("End of program");

    }

    public static void method1 () {
        System.out.println("***Method1 start***");
        method2();
        System.out.println("***Method1 end***");
    }
    public static void method2() {
        System.out.println("***Method2 start***");
        Scanner sc = new Scanner(System.in);
        try {
            String[] vect = sc.nextLine().split(" ");
            int position = sc.nextInt();
            System.out.println(vect[position]);
        } catch (ArrayIndexOutOfBoundsException array) {
            System.out.println("Invalid position!");
            array.printStackTrace();
            sc.next();
        } catch (InputMismatchException input) {
            System.out.println("Input error");
        }
        System.out.println("***Method2 end***");
    }
}
