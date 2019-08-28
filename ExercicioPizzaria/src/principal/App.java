package principal;

import java.util.ArrayList;

import criadoras.ChicagoPizzaStore;
import criadoras.NYPizzaStore;
import criadoras.PizzaStore;
import produto.Pizza;

public class App {

	public static void main(String[] args) {
		ArrayList<Pizza> entrega = new ArrayList<>();
		
		PizzaStore nyStore = new NYPizzaStore();
		PizzaStore chicagoStore = new ChicagoPizzaStore();
		
		Pizza pizza = nyStore.orderPizza("cheese");
		entrega.add(nyStore.orderPizza("cheese"));
		System.out.println("-----------------------");
		pizza = chicagoStore.orderPizza("pepperoni"); 

	}

}
