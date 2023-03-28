package curso.java.triangulo.application;

import curso.java.triangulo.entities.Triangle;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the measure of triangle x:");
        Triangle triangleX = new Triangle(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());

        System.out.println("Enter the measure of triangle y:");
        Triangle triangleY = new Triangle(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());

        double areaX = area(triangleX.getSideA(), triangleX.getSideB(), triangleX.getSideC());
        double areaY = area(triangleY.getSideA(), triangleY.getSideB(), triangleY.getSideC());
        char max = max(areaX, areaY);
        print(areaX, areaY, max);
    }

    public static double area(double a, double b, double c) {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
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
