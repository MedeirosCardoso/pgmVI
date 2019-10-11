package subsystem;

public class DvdPlayer {

	Amplifier amplifier;

	public DvdPlayer() {

	}

	public void on() {
		System.out.println("DVDplayer on");
	}

	public void off() {
		System.out.println("DVDplayerr off");
	}

	public void eject() {
		System.out.println("ejetar");
	}

	public void pause() {
		System.out.println("DVDplayer pausado");
	}

	public void play(String titulo) {
		System.out.println("Play dvd" + titulo);
	}

	public void play(int posicao) {
		System.out.println("Play dvd " + posicao);
	}

	public void setSurroundAudio() {
		System.out.println("Definido áudio surround");
	}

	public void setTwoChannelAudio() {
		System.out.println("Definido áudio de dois canais");
	}

	public void stop() {
		System.out.println("DVDplayer parado");
	}

}
