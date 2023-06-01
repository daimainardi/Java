package curso.java.estruturadedados.arvoreavl;

public class No {
    private long id;
    private Object elemento;
    private No esq;
    private No dir;
    private No pai; //aponta para o pai do nó
    private long b; //balanceamento do NO

    public No(long id, Object elemento, No esq, No dir) {
        this.id = id;
        this.elemento = elemento;
        this.esq = esq;
        this.dir = dir;
        this.b = 0; //inicia o nó balanceado com 0
        this.pai = null; //inicia o pai sempre vazio
    }

    public String toString() {
        return Long.toString(getId());
// return ″Id:″+Long.toString(getId())+″ B:″+Long.toString(getB());
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getId() {
        return this.id;
    }

    public void setElemento(Object elemento) {
        this.elemento = elemento;
    }

    public Object getElemento() {
        return elemento;
    }

    public void setEsq(No esq) {
        this.esq = esq;
    }

    public No getEsq() {
        return esq;
    }

    public void setDir(No dir) {
        this.dir = dir;
    }

    public No getDir() {
        return dir;
    }

    public void setB(long b) {
        this.b = b;
    }

    public long getB() {
        return b;
    }

    public void setPai(No pai) {
        this.pai = pai;
    }

    public No getPai() {
        return pai;
    }
}
