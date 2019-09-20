package produto.Chicago;

import produto.Pizza;

public class ChicagoStyleCheesePizza extends Pizza {

	public ChicagoStyleCheesePizza() {
		setName("pizza de queijo prato estilo Chicago");
		setDough("Massa extra grossa");
		setSauce("Molho de tomate ameixa");
		toppings.add("Queijo mussarela ralado");
	}
	
	public void cut() {
		System.out.print("Cortar a pizza em fatias quadradas");
	}

}
