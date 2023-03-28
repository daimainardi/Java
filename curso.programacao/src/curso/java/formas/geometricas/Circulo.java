package curso.java.formas.geometricas;

public class Circulo extends FormaGeometrica2D {
    public Circulo(int x, int y) {
        super(x, y);
    }

    public double areaCirculo() {
        int raio = super.getX()/ 2;
        return 3.14 * Math.pow(raio, 2);
    }
    @Override
    public String toString() {
        return String.format("Area do circulo = %.2f%n", areaCirculo());
    }
}
