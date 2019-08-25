package principal;

import component.Beverage;
import component.DarkRoast;
import component.Decaf;
import component.Espresso;
import component.HouseBlend;
import decorator.Milk;
import decorator.Mocha;
import decorator.Soy;
import decorator.Whip;

public class App {

	public static void main(String[] args) {
		Beverage bebida = new Espresso('G');
		bebida.mostraValor(bebida);

		Beverage bebida1 = new DarkRoast('M');
		bebida1 = new Milk(bebida1);
		bebida1 = new Milk(bebida1);
		bebida1 = new Mocha(bebida1);
		bebida1.mostraValor(bebida1);

		Beverage bebida2 = new HouseBlend('P');
		bebida2 = new Milk(bebida2);
		bebida2 = new Mocha(bebida2);
		bebida2 = new Whip(bebida2);
		bebida2.mostraValor(bebida2);
		
		Beverage bebida3 = new Decaf('G');
		bebida3 = new Soy(bebida3);
		bebida3.mostraValor(bebida3);
	}

}
