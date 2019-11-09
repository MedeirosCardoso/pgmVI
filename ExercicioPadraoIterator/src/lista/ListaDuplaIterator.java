package lista;

import interfaces.MeuIterator;

public class ListaDuplaIterator implements MeuIterator {

	private final ListaDupla lista;
	private NoListaDupla atual;

	public ListaDuplaIterator(ListaDupla lista) {
		this.lista = lista;
		this.atual = lista.getPrim();
	}

	@Override
	public NoListaDupla next() {
		NoListaDupla temp = null;
		if (hasNext()) {
			temp = atual;
			atual = atual.getProx();
		}
		return temp;
	}

	@Override
	public boolean hasNext() {
		return atual != null;
	}

	@Override
	public NoListaDupla previous() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean hasPrevius() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int nextIndex() {
		if (this.atual.getAnt() == null) {
			return 0;
		}
		int index = 0;
		NoListaDupla tmp = lista.getPrim();
		while (tmp.getInfo() != atual.getInfo()) {
			index++;
			tmp = tmp.getProx();
		}
		return index;
	}

	@Override
	public int previousIndex() {
		// TODO Auto-generated method stub
		return 0;
	}

}
