package interfaces;

import lista.NoListaDupla;

public interface MeuIterator {
	public NoListaDupla next();

	public boolean hasNext();

	public NoListaDupla previous();

	public boolean hasPrevius();

	public int nextIndex();

	public int previousIndex();
}
