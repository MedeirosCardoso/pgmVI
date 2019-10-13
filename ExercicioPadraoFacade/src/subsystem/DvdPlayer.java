package subsystem;

public class DvdPlayer {

	Amplifier amplifier;

	public DvdPlayer() {
	
	}

	public void on() {
		System.out.println("DVD player on");
	}

	public void off() {
		System.out.println("DVD player off");
	}

	public void eject() {
		System.out.println("Ejetar DVD");
	}

	public void pause() {
		System.out.println("DVD player pausado");
	}

	public void play(String titulo) {
		System.out.println("Play dvd " + titulo);
	}

	public void play(int posicao) {
		System.out.println("Play dvd " + posicao);
	}

	public void setSurroundAudio() {
		System.out.println("Definido áudio Surround");
	}

	public void setTwoChannelAudio() {
		System.out.println("Definido áudio de dois canais");
	}

	public void stop() {
		System.out.println("DVD player parado.");
	}

}
