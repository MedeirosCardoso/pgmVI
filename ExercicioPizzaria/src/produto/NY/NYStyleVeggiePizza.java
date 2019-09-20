package produto.NY;

import produto.Pizza;

public class NYStyleVeggiePizza extends Pizza{
	public NYStyleVeggiePizza() {
		setName("pizza vegetariana ao estilo de NY");
		setDough("Massa extra fina");
		setSauce("Molho branco light");
		toppings.add("Tomate seco, rucula");
	}
	public void cut() {
		System.out.println("Cortar a pizza em fatias quadradas");
	}
}
