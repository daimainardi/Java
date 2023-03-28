package curso.java.formas.geometricas;

public abstract class FormaGeometrica3D extends FormaGeometrica2D {
    private int z;

    public FormaGeometrica3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    public int getZ() {
        return z;
    }

}
