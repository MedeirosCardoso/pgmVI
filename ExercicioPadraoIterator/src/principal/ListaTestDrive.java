package principal;

import interfaces.MeuIterator;
import lista.ListaDupla;
import lista.NoListaDupla;

public class ListaTestDrive {

	public static void main(String[] args) {
		ListaDupla lista = new ListaDupla();
		System.out.println(lista);
		lista.add(1);
		lista.add(2);
		lista.add(3);
		System.out.println(lista);
		System.out.println("Tamanho da Lista " + lista.size());

		System.out.println("-------------------------------");

		MeuIterator iterador = lista.createIterator();
		while (iterador.hasNext()) {
			NoListaDupla no = iterador.next();
			System.out.println(no);
		}
		System.out.println("Posição do Atual: "+iterador.nextIndex());
	}

}
