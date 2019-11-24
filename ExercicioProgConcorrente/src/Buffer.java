import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Buffer {

	protected int[] pilha;
	protected int index;
	private Lock trava;
	private Condition pilhaCheia;

	public Buffer(int tamanho) {
		this.pilha = new int[tamanho];
		this.index = 0;
		this.trava = new ReentrantLock();
		this.pilhaCheia = trava.newCondition();
	}

	public void inserir(int valor) throws InterruptedException {
		trava.lock();
		try {
			try {
				System.out.println("Inserindo o valor " + valor);
				pilha[index] = valor;
				index++;
				System.out.println(toString());
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Pilha cheia!");
				pilhaCheia.await();
			}
		} finally {
			trava.unlock();
		}

	}

	public int remover() {
		int valor = 0;
		trava.lock();
		try {
			try {
				index--;
				valor = pilha[index];
				pilha[index] = 0;
				pilhaCheia.signalAll();
			} catch (ArrayIndexOutOfBoundsException e) {
				index = 0;
				System.out.println("Não é possivel remover a pilha ja esta vazia!");
			}
		} finally {
			trava.unlock();
		}

		return valor;
	}

	@Override
	public String toString() {
		String s = "";
		for (int i = 0; i < pilha.length; i++) {
			if (index == 0) {
				s = "vazia";
			} else if (pilha[i] > 0) {
				s += pilha[i] + " ";
			}
		}
		return "Buffer [ " + s + " ]";
	}
}
