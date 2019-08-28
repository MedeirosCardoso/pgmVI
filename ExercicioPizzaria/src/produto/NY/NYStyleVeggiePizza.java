package produto.NY;

import produto.Pizza;

public class NYStyleVeggiePizza extends Pizza{
	public NYStyleVeggiePizza() {
		setName("NY Style veggie Pizza");
		setDough("Thin Crust Dough");
		setSauce("Sauce");
		toppings.add("Sharedded Mozzarella Cheese");
	}
	public void cut() {
		System.out.println("Cutting the pizza into square slices");
	}
}
