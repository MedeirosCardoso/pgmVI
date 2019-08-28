package produto.Chicago;

import produto.Pizza;

public class ChicagoStylePepperoniPizza extends Pizza {

	public ChicagoStylePepperoniPizza() {
		setName("Chicago Style sauce and Pepperoni Pizza");
		setDough("Thin Crust Dough");
		setSauce("White Sauce");
		toppings.add("Tomato and onion");
	}
	
	public void box() {
		System.out.print("Place pizza in official Chicago box");
	}
}
