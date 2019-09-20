package principal;

import criadoras.ChicagoPizzaStore;
import criadoras.NYPizzaStore;
import criadoras.PizzaStore;
import produto.Pizza;

public class App {

	public static void main(String[] args) {
		PizzaStore nyStore = new NYPizzaStore();
		PizzaStore chicagoStore = new ChicagoPizzaStore();

		Pizza pizza = nyStore.orderPizza("queijo");

		pizza = chicagoStore.orderPizza("pepperoni");

		pizza = nyStore.orderPizza("vegetariana");

		pizza = chicagoStore.orderPizza("molusco");

	}

}
