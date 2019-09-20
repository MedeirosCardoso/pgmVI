package produto.Chicago;

import produto.Pizza;

public class ChicagoStylePepperoniPizza extends Pizza {

	public ChicagoStylePepperoniPizza() {
		setName("pizza de pepperoni estilo Chicago");
		setDough("Massa fina");
		setSauce("Molho de tomate");
		toppings.add("Salame italiano");
	}

	public void box() {
		System.out.println("Coloque a pizza na caixa oficial da loja de Chicago" + "\n");
	}
}
