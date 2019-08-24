package component;

public class HouseBlend extends Beverage {
	public HouseBlend(char size) {
		setDescription("House Blend Coffee");
		setSize(size);
	}

	@Override
	public double cost() {
		double custo = 0;
		switch (getSize()) {
		case 'P':
			custo = .45;
			break;
		case 'M':
			custo = .65;
			break;
		default:
			custo = .89;
			break;
		}
		return custo;
	}

}
