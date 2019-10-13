package subsystem;

public class CdPlayer {

	Amplifier amplifier;

	public CdPlayer() {

	}

	public void on() {
		System.out.println("CD player on");
	}

	public void off() {
		System.out.println("CD player off");
	}

	public void eject() {
		System.out.println("Ejetar");
	}

	public void pause() {
		System.out.println("CD player pausado");
	}

	public void play(String titulo) {
		System.out.println("Play CD " + titulo);
	}

	public void play(int posicao) {
		System.out.println("Play CD " + posicao);
	}

	public void stop() {
		System.out.println("CD player parado.");
	}
}
