package criadoras;

import produto.Pizza;

public abstract class PizzaStore {
	
	public Pizza orderPizza(String tipo) {
		Pizza pizza;

		pizza = createPizza(tipo);

		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();

		return pizza;
	}

	protected abstract Pizza createPizza(String tipo);
}
