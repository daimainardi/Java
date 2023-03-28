package curso.java.formas.geometricas;

public class Triangulo extends FormaGeometrica2D {
    public Triangulo(int x, int y) {
        super(x, y);
    }

    public double areaTriangulo() {
        return (double) super.getX() * super.getY() / 2;
    }
    @Override
    public String toString() {
        return String.format("Area do triangulo = %.2f%n", areaTriangulo());
    }

}

