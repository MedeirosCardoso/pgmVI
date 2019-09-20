package produto.NY;

import produto.Pizza;

public class NYStyleClamPizza extends Pizza{
	public NYStyleClamPizza() {
		setName("pizza de molusco estilo NY");
		setDough("Massa fina");
		setSauce("Molho branco");
		toppings.add("Moluscos e oregano");
	}
	
	public void bake() {
		System.out.println("Asse por 15 minutos a 300 °C");
	}
}
