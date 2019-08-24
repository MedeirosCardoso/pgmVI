package principal;

import component.Beverage;
import component.DarkRoast;
import component.Espresso;
import component.HouseBlend;
import decorator.Milk;
import decorator.Mocha;
import decorator.Whip;

public class App {

	public static void main(String[] args) {
		/*Beverage bebida = new Espresso();
		System.out.printf("%s %s %.2f \n", bebida.getDescription(), "$", bebida.cost());
*/
		Beverage bebida1 = new DarkRoast('G');
		bebida1 = new Milk(bebida1);
		
		bebida1 = new Milk(bebida1);
		bebida1 = new Milk(bebida1);
	
		//bebida1 = new Mocha(bebida1);
		System.out.printf("%s %s %.2f \n", bebida1.getDescription(), "$", bebida1.cost());
/*
		Beverage bebida2 = new HouseBlend();
		bebida2 = new Milk(bebida2);
		bebida2 = new Mocha(bebida2);
		bebida2 = new Whip(bebida2);
		System.out.printf("%s %s %.2f \n", bebida2.getDescription(), "$", bebida2.cost());
	*/
	}

}
