package subsystem;

public class CdPlayer {

	Amplifier amplifier;

	public CdPlayer() {

	}

	public void on() {
		System.out.println("Cdplayer on");
	}

	public void off() {
		System.out.println("Cdplayer off");
	}

	public void eject() {
		System.out.println("ejetar");
	}

	public void pause() {
		System.out.println("Cdplayer pausado");
	}

	public void play(String titulo) {
		System.out.println("Play cd " + titulo);
	}

	public void play(int posicao) {
		System.out.println("Play cd " + posicao);
	}

	public void stop() {
		System.out.println("Cdplayer parado");
	}
}
