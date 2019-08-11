package app;

import client.Casa;
import client.Terreno;

public class Principal {

	public static void main(String[] args) {
		Casa c = new Casa('A',1,1);
		c.informarValorImovel();
		
		Terreno t = new Terreno('A',2,2);
		t.informarValorImovel();
	}

}
