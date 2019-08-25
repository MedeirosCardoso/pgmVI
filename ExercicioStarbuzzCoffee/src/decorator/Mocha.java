package decorator;

import component.Beverage;

public class Mocha extends CondimentDecorator {
	Beverage beverage;

	public Mocha(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Mocha";
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
			custo += .12;
			break;
		case 'M':
			custo += .17;
			break;
		default:
			custo += .22;
			break;
		}
		return custo;
	}
}
