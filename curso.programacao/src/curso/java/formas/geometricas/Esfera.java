package curso.java.formas.geometricas;

public class Esfera extends FormaGeometrica3D {
    public Esfera(int x, int y, int z) {
        super(x, y, z);
    }

    public double volumeEsfera() {
        int raio = super.getX() / 2;
        return (4 * 3.14 * Math.pow(raio, 3) / 3);
    }
    @Override
    public String toString() {
        return String.format("Volume da esfera = %.2f%n", volumeEsfera());
    }
}
