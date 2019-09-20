package padraoDeProjeto;

public class IncrementalPublic {
	private static int count = 0;
	private int numero;

	public IncrementalPublic() {
		numero = ++count;
	}

	public String toString() {
		return "Incremental " + numero;
	}
}
