package app;

import java.util.ArrayList;

import client.DecoyPato;
import client.MallardPato;
import client.Pato;
import client.RedheadPato;
import client.RubberPato;

public class Principal {

	public static void main(String[] args) {

		ArrayList<Pato> lagoa = new ArrayList<Pato>();
		lagoa.add(new MallardPato());
		lagoa.add(new RedheadPato());
		lagoa.add(new RubberPato());
		lagoa.add(new DecoyPato());

		for (Pato l : lagoa) {
			l.exibir();
			l.realizarVoo();
			l.realizarQuack();
			System.out.println("------------------------------");
		}
	}
}
