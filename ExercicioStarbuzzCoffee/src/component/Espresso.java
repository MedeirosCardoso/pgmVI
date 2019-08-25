package component;

public class Espresso extends Beverage {
	public Espresso(char size) {
		setDescription("Espresso coffee - "+size);
		setSize(size);
	}

	@Override
	public double cost() {
		double custo = 0;
		switch (getSize()) {
		case 'P':
			custo = .99;
			break;
		case 'M':
			custo = 1.49;
			break;
		default:
			custo = 1.99;
			break;
		}
		return custo;
	}

}
