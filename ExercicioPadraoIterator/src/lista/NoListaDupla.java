package lista;

public class NoListaDupla {

	private NoListaDupla ant;
	private Integer info;
	private NoListaDupla prox;

	public NoListaDupla(Integer valor) {
		this.info = valor;
		this.ant = null;
		this.prox = null;
	}

	public Integer getInfo() {
		return info;
	}

	public void setInfo(Integer info) {
		this.info = info;
	}

	public NoListaDupla getAnt() {
		return ant;
	}

	public void setAnt(NoListaDupla ant) {
		this.ant = ant;
	}

	public NoListaDupla getProx() {
		return prox;
	}

	public void setProx(NoListaDupla prox) {
		this.prox = prox;
	}

	@Override
	public String toString() {
		return info.toString();
	}

}
