package component;

public class Decaf extends Beverage {
	public Decaf(char size) {
		setDescription("Decaf Coffee");
		setSize(size);
	}

	@Override
	public double cost() {
		double custo = 0;
		switch (getSize()) {
		case 'P':
			custo = .55;
			break;
		case 'M':
			custo = .85;
			break;
		default:
			custo = 1.05;
			break;
		}
		return custo;
	}

}
