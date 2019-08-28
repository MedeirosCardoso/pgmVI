package criadoras;

import produto.Pizza;
import produto.NY.NYStyleCheesePizza;
import produto.NY.NYStyleClamPizza;
import produto.NY.NYStylePepperoniPizza;
import produto.NY.NYStyleVeggiePizza;

public class NYPizzaStore extends PizzaStore {

	@Override
	protected Pizza createPizza(String type) {
		if (type.equals("cheese")) {
			return new NYStyleCheesePizza();
		} else if (type.equals("veggie")) {
			return new NYStyleVeggiePizza();
		} else if (type.equals("clam")) {
			return new NYStyleClamPizza();
		} else if (type.equals("pepperoni")) {
			return new NYStylePepperoniPizza();
		} else
			return null;
	}

}
