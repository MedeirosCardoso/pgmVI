package app;

import java.util.ArrayList;

import client.Apartamento;

import client.Casa;
import client.Imovel;
import client.Terreno;

public class Principal {

	public static void main(String[] args) {
		ArrayList<Imovel> imoveis = new ArrayList<Imovel>();
		
		imoveis.add(new Casa('A',100,5));
		imoveis.add(new Apartamento('B',60,4));
		imoveis.add(new Terreno('C',300));
		
		for (Imovel i : imoveis) {
			i.informarValorImovel();
			System.out.println("------------------------------");
		}
	}

}
