
public class Produtor implements Runnable {
	private static final int DELAY = 1000;
	private Buffer buffer;
	private int valor;
	private int cont;

	public Produtor(Buffer buffer, int valor, int cont) {
		this.buffer = buffer;
		this.valor = valor;
		this.cont = cont;
	}

	@Override
	public void run() {
		try {
			for (int i = 1; i <= cont; i++) {
				buffer.inserir(valor);
				Thread.sleep(DELAY);
			}
		} catch (InterruptedException exception) {
		}
	}

}
