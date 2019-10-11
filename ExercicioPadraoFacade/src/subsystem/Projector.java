package subsystem;

public class Projector {

	DvdPlayer dvdPlayer;

	public Projector() {

	}

	public void on() {
		System.out.println("Projetor on");
	}

	public void off() {
		System.out.println("Projetor off");
	}

	public void tvMode() {
		System.out.println("Modo TV");
	}

	public void wideScreenMode() {
		System.out.println("Modo widescreen");
	}
}
