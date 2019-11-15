package lista;

public class ListaDupla {
	private NoListaDupla prim;
	private NoListaDupla ultimo;

	public ListaDupla() {
		this.prim = null;
		this.ultimo = null;
	}

	public NoListaDupla getPrim() {
		return prim;
	}

	public NoListaDupla getUltimo() {
		return ultimo;
	}

	public void add(Integer valor) {
		NoListaDupla novo = new NoListaDupla(valor);
		if (isEmpty()) {
			this.prim = novo;
			this.ultimo = novo;
		} else {
			this.ultimo.setProx(novo);
			novo.setAnt(this.ultimo);
			this.ultimo = novo;
		}
	}

	public boolean isEmpty() {
		return this.prim == null;
	}

	public void clear() {
		this.prim = null;
		this.ultimo = null;
	}

	public int size() {
		if (isEmpty()) {
			return 0;
		}
		int i = 0;
		NoListaDupla atual = this.prim;
		while (atual != null) {
			i++;
			atual = atual.getProx();
		}
		return i;
	}

	public ListaDuplaIterator createIterator() {
		return new ListaDuplaIterator(this);
	}

	@Override
	public String toString() {
		String s = "Lista: ";
		for (NoListaDupla atual = prim; atual != null; atual = atual.getProx()) {
			s = s + atual.toString() + " ";
		}
		return s;
	}
}
