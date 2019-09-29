package receiver;

public class Luz {

	private String comodo;

	public Luz(String comodo) {
		this.comodo = comodo;
	}

	public void on() {
		System.out.println("A luz da " + comodo + " está acesa");
	}

	public void off() {
		System.out.println("A luz da " + comodo + " está apagada");
	}
}
