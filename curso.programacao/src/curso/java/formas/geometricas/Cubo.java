package curso.java.formas.geometricas;

public class Cubo extends FormaGeometrica3D {
    public Cubo(int x, int y, int z) {
        super(x, y, z);
    }

    public double volumeCubo() {
        int arestas = getX() * getY() * getZ();
        return Math.pow(arestas, 3);
    }
    @Override
    public String toString() {
        return String.format("Volume do cubo = %.2f%n", volumeCubo());
    }
}
