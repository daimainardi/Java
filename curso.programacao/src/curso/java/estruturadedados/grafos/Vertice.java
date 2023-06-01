package curso.java.estruturadedados.grafos;

public class Vertice {
    private String rotulo; //rótulo de cada vértice
    private boolean visitado; //indica se o vértice foi visitado

    public Vertice(String rotulo) {
        this.rotulo = rotulo;
        this.visitado = false;
    }

    public String toString() {
        return rotulo;
    }

    public void setRotulo(String rotulo) {
        this.rotulo = rotulo;
    }

    public Object getRotulo() {
        return rotulo;
    }

    public void foiVisitado() {
        this.visitado = true;
    }

    public void naoFoiVisitado() {
        this.visitado = false;
    }

    public boolean getVisitado() {
        return visitado;
    }
}
