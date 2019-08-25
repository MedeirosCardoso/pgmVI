package component;

public abstract class Beverage {
	private String description;
	private char size;

	public abstract double cost();

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public char getSize() {
		return size;
	}

	public void setSize(char size) {
		this.size = size;
	}

	public void mostraValor(Beverage bebida) {
		System.out.printf("%s %s%.2f \n", bebida.getDescription(), "$", bebida.cost());
	}
}
