package padraoDeProjeto;

public class IncrementalSingleton {

	private static IncrementalSingleton uniqueInstance;
	private static int count = 0;
	private int numero;

	private IncrementalSingleton() {
		numero = ++count;
	}

	public static IncrementalSingleton getInstance() {
		if (uniqueInstance == null) {
			uniqueInstance = new IncrementalSingleton();
		}
		return uniqueInstance;
	}

	public String toString() {
		return "Incremental " + numero;
	}
}
