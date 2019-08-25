package decorator;

import component.Beverage;

public class Whip extends CondimentDecorator {
	Beverage beverage;

	public Whip(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Whip";
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
			custo += .03;
			break;
		case 'M':
			custo += .07;
			break;
		default:
			custo += .12;
			break;
		}
		return custo;
	}
}
