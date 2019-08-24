package decorator;

import component.Beverage;

public class Milk extends CondimentDecorator {
	Beverage beverage;

	public Milk(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Milk";
	}

	public char getSize() {
		return beverage.getSize();
	}

	@Override
	public double cost() {
		double custo = beverage.cost();
		switch (beverage.getSize()) {
		case 'P':
			custo += .10;
			break;
		case 'M':
			custo += .15;
			break;
		default:
			custo += .20;
			break;
		}
		return custo;
	}
}
