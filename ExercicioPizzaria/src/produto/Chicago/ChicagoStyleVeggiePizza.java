package produto.Chicago;

import produto.Pizza;

public class ChicagoStyleVeggiePizza extends Pizza {

	public ChicagoStyleVeggiePizza() {
		setName("pizza vegetariana ao estilo Chicago");
		setDough("Massa extra fina");
		setSauce("Molho de mostarda");
		toppings.add("Tomate seco, mussarela, palmito");
	}
	
	public void bake() {
		System.out.print("Asse por 15 minutos a 250 °C");
	}
}
