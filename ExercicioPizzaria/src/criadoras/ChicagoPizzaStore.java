package criadoras;

import produto.Pizza;
import produto.Chicago.ChicagoStyleCheesePizza;
import produto.Chicago.ChicagoStyleClamPizza;
import produto.Chicago.ChicagoStylePepperoniPizza;
import produto.Chicago.ChicagoStyleVeggiePizza;

public class ChicagoPizzaStore extends PizzaStore {

	@Override
	protected Pizza createPizza(String type) {
		if (type.equals("cheese")) {
			return new ChicagoStyleCheesePizza();
		} else if (type.equals("veggie")) {
			return new ChicagoStyleVeggiePizza();
		} else if (type.equals("clam")) {
			return new ChicagoStyleClamPizza();
		} else if (type.equals("pepperoni")) {
			return new ChicagoStylePepperoniPizza();
		} else
			return null;
	}

}
