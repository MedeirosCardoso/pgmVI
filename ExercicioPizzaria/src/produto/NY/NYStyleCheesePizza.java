package produto.NY;

import produto.Pizza;

public class NYStyleCheesePizza extends Pizza {

	public NYStyleCheesePizza() {
		setName("pizza de queijo ao estilo NY");
		setDough("Massa grossa");
		setSauce("Molho marinara");
		toppings.add("Queijo reggiano ralado");
	}

	public void box() {
		System.out.println("Coloque a pizza na caixa oficial da loja de NY" + "\n");
	}
}
