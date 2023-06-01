package curso.java.estruturadedados.arvorebinaria;

public class No {
    private long id; // identificador do elemento
	private Object elemento; // armazena o elemento
	private No esq; // aponta p/ filho esquerdo
	private No dir; // aponta p/ filho direito

	public No (long id, Object elemento, No esq, No dir) {
		this.id = id;
		this.elemento = elemento;
		this.esq = esq;
		this.dir = dir;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Object getElemento() {
		return elemento;
	}

	public void setElemento(Object elemento) {
		this.elemento = elemento;
	}

	public No getEsq() {
		return esq;
	}

	public void setEsq(No esq) {
		this.esq = esq;
	}

	public No getDir() {
		return dir;
	}

	public void setDir(No dir) {
		this.dir = dir;
	}
}
