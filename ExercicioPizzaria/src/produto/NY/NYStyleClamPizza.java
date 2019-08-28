package produto.NY;

import produto.Pizza;

public class NYStyleClamPizza extends Pizza{
	public NYStyleClamPizza() {
		setName("NY Style Clam Pizza");
		setDough("Thin Crust Dough");
		setSauce("White Sauce");
		toppings.add("Oregano and Tomato");
	}
	
	public void bake() {
		System.out.println("Bake for 15 minutes at 300");
	}
}
