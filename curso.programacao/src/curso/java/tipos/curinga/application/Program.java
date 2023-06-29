package curso.java.tipos.curinga.application;

import curso.java.tipos.curinga.entity.Circle;
import curso.java.tipos.curinga.entity.Rectangle;
import curso.java.tipos.curinga.entity.Shape;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        List<Shape> myShapes = new ArrayList<>();
        myShapes.add(new Rectangle(3.0,2.0));
        myShapes.add(new Circle(2.0));

        List<Circle> myCircle = new ArrayList<>();
        myCircle.add(new Circle(2.0));
        myCircle.add(new Circle(3.0));

        System.out.println("Total area: " + totalArea(myShapes));

    }
    public static double totalArea(List<? extends Shape>list){
        double sum = 0.0;
        for (Shape shape: list) {
            sum += shape.area();
        }
        return sum;
    }
}
