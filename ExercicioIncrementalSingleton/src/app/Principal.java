package app;

import padraoDeProjeto.IncrementalPublic;
import padraoDeProjeto.IncrementalSingleton;

public class Principal {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			IncrementalPublic incPublic = new IncrementalPublic();
			System.out.println(incPublic);
		}

		System.out.println("--------------------------");

		for (int i = 0; i < 10; i++) {
			IncrementalSingleton incSing = IncrementalSingleton.getInstance();
			System.out.println(incSing);
		}
	}

}
