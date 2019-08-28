package produto.Chicago;

import produto.Pizza;

public class ChicagoStyleCheesePizza extends Pizza {

	public ChicagoStyleCheesePizza() {
		setName("Chicago Style Dep Dish Cheese Pizza");
		setDough("Extra Thick Crust Dough");
		setSauce("Plum Tomato Sauce");
		toppings.add("Shredded Mozzarella Cheese");
	}
	
	public void cut() {
		System.out.print("Cutting the pizza into square slices");
	}

}
