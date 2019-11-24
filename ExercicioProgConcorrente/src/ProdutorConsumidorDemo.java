import java.util.Random;

public class ProdutorConsumidorDemo {

	public static void main(String[] args) {
		Random valor = new Random();

		Buffer buffer = new Buffer(30);
		final int REPETIR = 10;
		final int THREADS = 2;

		for (int i = 1; i <= THREADS; i++) {
			Produtor p = new Produtor(buffer, valor.nextInt(11), REPETIR);
			Consumidor c = new Consumidor(buffer, REPETIR);
			Thread tp = new Thread(p);
			Thread tc = new Thread(c);

			tp.start();
			tc.start();
		}
	}

}
