
public class Consumidor implements Runnable {

	private static final int DELAY = 1000;
	private Buffer buffer;
	private int cont;

	public Consumidor(Buffer buffer, int cont) {
		this.buffer = buffer;
		this.cont = cont;
	}

	@Override
	public void run() {
		try {
			for (int i = 1; i <= cont; i++) {
				System.out.println("Removendo " + buffer.remover());
				Thread.sleep(DELAY);
			}
		} catch (InterruptedException exception) {
		}

	}

}
