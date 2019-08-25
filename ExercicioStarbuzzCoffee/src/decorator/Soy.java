package decorator;

import component.Beverage;

public class Soy extends CondimentDecorator {
	Beverage beverage;

	public Soy(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Soy";
	}

	@Override
	public char getSize() {
		return beverage.getSize();
	}

	@Override
	public double cost() {
		double custo = beverage.cost();
		switch (beverage.getSize()) {
		case 'P':
			custo += .05;
			break;
		case 'M':
			custo += .10;
			break;
		default:
			custo += .15;
			break;
		}
		return custo;
	}
}
