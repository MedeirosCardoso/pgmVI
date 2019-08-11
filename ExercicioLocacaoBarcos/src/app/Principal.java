package app;

import java.util.ArrayList;

import client.Barco;
import client.BarcoAvela;
import client.Bateira;
import client.Canoa;
import client.Iate;
import client.Jangada;

public class Principal {

	public static void main(String[] args) {
		ArrayList<Barco> marina = new ArrayList<Barco>();
		marina.add(new Bateira());
		marina.add(new Iate());
		marina.add(new Canoa());
		marina.add(new Jangada());
		marina.add(new BarcoAvela());

		for (Barco b : marina) {
			b.imprimirEmbarcacao();
			b.imprimirPropulsao();
			System.out.println("------------------------------");
		}
	}

}
