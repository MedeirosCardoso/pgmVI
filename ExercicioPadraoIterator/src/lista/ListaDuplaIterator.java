package lista;

import interfaces.MeuIterator;

public class ListaDuplaIterator implements MeuIterator {

	private final ListaDupla lista;
	private NoListaDupla atual;
	private int index;

	public ListaDuplaIterator(ListaDupla lista) {
		this.lista = lista;
		this.atual = lista.getPrim();
		index = 0;
	}

	@Override
	public NoListaDupla next() {
		NoListaDupla temp = null;
		if (hasNext()) {
			temp = atual;
			atual = atual.getProx();
			index++;
		}
		return temp;
	}

	@Override
	public boolean hasNext() {
		return atual != null;
	}

	@Override
	public NoListaDupla previous() {
		NoListaDupla temp = null;
		if (hasPrevius()) {
			temp = atual;
			atual = atual.getAnt();
			index--;
		}
		return temp;
	}

	@Override
	public boolean hasPrevius() {
		return atual != null;
	}

	@Override
	public int nextIndex() {
		return index;
	}

	@Override
	public int previousIndex() {
		return index;
	}

}
