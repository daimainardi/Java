package curso.java.formas.geometricas;

public class Quadrado extends FormaGeometrica2D {

    public Quadrado(int x, int y) {
        super(x, y);
    }

    public double areaQuadrado (){
       return super.getX() * super.getY();
   }

    @Override
    public String toString() {
        return String.format("Area do quadrado = %.2f%n", areaQuadrado());
    }
}
