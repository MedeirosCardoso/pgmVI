package subsystem;

public class Amplifier {

	Tuner tuner;
	DvdPlayer dvdPlayer;
	CdPlayer cdPlayer;

	public Amplifier() {

	}

	public void on() {
		System.out.println("Amplificador on");
	}

	public void off() {
		System.out.println("Amplificador off");
	}

	public void setCd(CdPlayer cd) {
		System.out.println("Configurado para CD player ");
	}

	public void setDvd(DvdPlayer dvd) {
		System.out.println("Configurado para DVD player ");
	}

	public void setStereoSound() {
		System.out.println("Definido áudio Stereo");
	}

	public void setSurroundSound() {
		System.out.println("Definido áudio Surround");
	}

	public void setTuner(Tuner radio) {
		System.out.println("Configurado para Rádio ");
	}

	public void setVolume(int volume) {
		System.out.println("Configurado no volume " + volume);
	}
}
