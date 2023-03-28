package curso.java.retangulo.application;

import curso.java.retangulo.entities.Rectangle;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rectangle width and height:");

        Rectangle retangulo = new Rectangle();
        retangulo.width = sc.nextDouble();
        retangulo.height = sc.nextDouble();

        System.out.println(retangulo);
    }
}
