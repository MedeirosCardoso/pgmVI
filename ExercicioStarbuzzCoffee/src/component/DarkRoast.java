package component;

public class DarkRoast extends Beverage {

	public DarkRoast(char size) {
		setDescription("Dark Roast Coffee - "+size);
		setSize(size);
	}

	@Override
	public double cost() {
		double custo = 0;
		switch (getSize()) {
		case 'P':
			custo = .49;
			break;
		case 'M':
			custo = .69;
			break;
		default:
			custo = .99;
			break;
		}
		return custo;
	}

}
