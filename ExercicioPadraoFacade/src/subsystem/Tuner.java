package subsystem;

public class Tuner {

	Amplifier amplifier;

	public Tuner() {

	}

	public void on() {
		System.out.println("Radio on");
	}

	public void off() {
		System.out.println("Radio off");
	}

	public void setAm() {
		System.out.println("Configurado modo AM");
	}

	public void setFm() {
		System.out.println("Configurado modo FM");
	}

	public void setFrequency(float frequency) {
		System.out.println("Configurado na frequência " + frequency);
	}
}
