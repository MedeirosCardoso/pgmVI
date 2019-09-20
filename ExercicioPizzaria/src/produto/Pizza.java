package produto;

import java.util.ArrayList;

public abstract class Pizza {
	private String name;
	private String dough;
	private String sauce;
	protected ArrayList<String> toppings = new ArrayList<String>();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDough() {
		return dough;
	}

	public void setDough(String dough) {
		this.dough = dough;
	}

	public String getSauce() {
		return sauce;
	}

	public void setSauce(String sauce) {
		this.sauce = sauce;
	}

	public void prepare() {
		System.out.println("Preparando " + getName());
		System.out.println("Jogando massa..." + getDough());
		System.out.println("Adicionando molho..." + getSauce());
		System.out.println("Adicionando coberturas: ");
		for (int i = 0; i < toppings.size(); i++) {
			System.out.println(" " + toppings.get(i));
		}
	}

	public void bake() {
		System.out.println("Asse por 25 minutos a 350 °C");
	}

	public void cut() {
		System.out.println("Cortar a pizza em fatias diagonais");
	}

	public void box() {
		System.out.println("Coloque a pizza na caixa oficial da pizzaria" + "\n");
	}
}
