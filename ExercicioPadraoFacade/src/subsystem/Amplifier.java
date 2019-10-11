package subsystem;

public class Amplifier {

	Tuner tuner;
	DvdPlayer dvdPlayer;
	CdPlayer cdPlayer;

	public Amplifier() {

	}

	public void on() {
		System.out.println("Amplifier on");
	}

	public void off() {
		System.out.println("Amplifier off");
	}

	public void setCd(CdPlayer cd) {
		System.out.println("Configurado para CD player " + cd);
	}

	public void setDvd(DvdPlayer dvd) {
		System.out.println("Configurado para DVD player " + dvd);
	}

	public void setStereoSound() {
		System.out.println("Definido áudio Stereo");
	}

	public void setSurroundSound() {
		System.out.println("Definido áudio surround");
	}

	public void setTuner(Tuner radio) {
		System.out.println("Configurado para rádio " + radio);
	}

	public void setVolume(int volume) {
		System.out.println("Configurado no volume " + volume);
	}
}
