package curso.java.triangulo2.application;

import curso.java.triangulo2.entities.Triangle;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Triangle x = new Triangle();
        Triangle y = new Triangle();

        System.out.println("Enter the measure of triangle x:");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("Enter the measure of triangle y:");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double areaX = x.area();
        double areaY = y.area();
        char max = max(areaX, areaY);
        print(areaX, areaY, max);
    }

    public static char max(double areaX, double areaY) {
        char larger;
        if (areaX > areaY) {
            larger = 'x';
        } else {
            larger = 'y';
        }
        return larger;
    }

    public static void print(double areaX, double areaY, char max) {
        System.out.printf("Triangle X area: %.4f%n", areaX);
        System.out.printf("Triangle Y area: %.4f%n", areaY);
        System.out.println("Larger area: " + max);
    }
}
