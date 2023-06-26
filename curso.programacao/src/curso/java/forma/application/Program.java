package curso.java.forma.application;

import curso.java.forma.entities.Circle;
import curso.java.forma.entities.Rectangle;
import curso.java.forma.entities.AbstractShape;
import curso.java.forma.entities.enums.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<AbstractShape> shapeList = new ArrayList<>();

        System.out.print("Enter the number of shapes: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Shape #" + (i + 1) + " data:");
            System.out.print("Rectangle or circle (r/c)? ");
            char ch = sc.next().charAt(0);
            System.out.print("Color (BLACK/BLUE/RED/WHITE): ");
            Color color = Color.valueOf(sc.next());
            if (ch == 'r') {
                System.out.print("Width: ");
                Double width = sc.nextDouble();
                System.out.print("Height: ");
                Double height = sc.nextDouble();
                AbstractShape shape = new Rectangle(color, width, height);
                shapeList.add(shape);
            } else {
                System.out.print("Radius: ");
                Double radius = sc.nextDouble();
                AbstractShape shape = new Circle(color, radius);
                shapeList.add(shape);
            }
        }
        System.out.println("Shape areas:");
        for (AbstractShape shape : shapeList) {
            System.out.printf("%.2f%n", shape.area());
        }
    }
}
