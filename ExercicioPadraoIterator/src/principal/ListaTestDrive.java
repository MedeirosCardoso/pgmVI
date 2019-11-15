package principal;

import interfaces.MeuIterator;
import lista.ListaDupla;

public class ListaTestDrive {

	public static void main(String[] args) {
		ListaDupla lista = new ListaDupla();
		lista.add(1);
		lista.add(2);
		lista.add(3);
		System.out.println(lista);

		System.out.println("-------------------------------");

		MeuIterator iterador = lista.createIterator();
		System.out.println(iterador.next());
		System.out.println(iterador.next());
		System.out.println("Next Index: " + iterador.nextIndex());
		System.out.println(iterador.previous());
		System.out.println(iterador.previous());
		System.out.println("Previous Index: " + iterador.previousIndex());
	}

}
