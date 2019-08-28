package produto.Chicago;

import produto.Pizza;

public class ChicagoStyleVeggiePizza extends Pizza {

	public ChicagoStyleVeggiePizza() {
		setName("Chicago Style veggie Pizza");
		setDough("Thin Crust Dough");
		setSauce("Sauce");
		toppings.add("Sharedded Mozzarella Cheese");
	}
	
	public void bake() {
		System.out.print("Bake for 15 minutes at 250");
	}
}
