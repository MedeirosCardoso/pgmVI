package produto.NY;

import produto.Pizza;

public class NYStyleCheesePizza extends Pizza {

	public NYStyleCheesePizza() {
		setName("NY Style sauce and Cheese Pizza");
		setDough("Thin Crust Dough");
		setSauce("Marinara Sauce");
		toppings.add("Grated Reggiano Cheese");
	}

	public void box() {
		System.out.println("Place pizza in official NY box");
	}
}
