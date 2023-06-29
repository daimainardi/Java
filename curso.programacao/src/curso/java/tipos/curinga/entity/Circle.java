package curso.java.tipos.curinga.entity;

public class Circle implements Shape{
    final Double PI = 3.14;
    private Double radius;

    public Circle(Double radius) {
        this.radius = radius;
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return PI * Math.pow(radius, 2);
    }
}
