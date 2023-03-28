package curso.java.formas.geometricas;

public class Programa {
    public static void main(String[] args) {
       Quadrado quadrado = new Quadrado(4,4);
        double areaQuadrado = quadrado.areaQuadrado();
        System.out.println(quadrado);

        Triangulo triangulo = new Triangulo(3, 5);
        double areaTriangulo = triangulo.areaTriangulo();
        System.out.println(triangulo);

        Circulo circulo = new Circulo(3,4);
        double areaCirculo = circulo.areaCirculo();
        System.out.println(circulo);

        Esfera esfera = new Esfera(4, 4, 4 );
        double volumeEsfera = esfera.volumeEsfera();
        System.out.println(esfera);

        Cubo cubo = new Cubo(2, 2, 2);
        double volumeCubo = cubo.volumeCubo();
        System.out.println(cubo);

        Cone cone = new Cone(3,6, 5);
        double volumeCone = cone.volumeCone();
        System.out.println(cone);
    }
}
