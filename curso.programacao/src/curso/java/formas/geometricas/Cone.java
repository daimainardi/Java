package curso.java.formas.geometricas;

public class Cone extends FormaGeometrica3D {
    public Cone(int x, int y, int z) {
        super(x, y, z);
    }

    public double volumeCone() {
        int raio = getX() / 2;
        return  (3.14 * Math.pow(raio, 2) * getY()) / 3;
    }
    @Override
    public String toString() {
        return String.format("Volume da esfera = %.2f%n", volumeCone());
    }
}
