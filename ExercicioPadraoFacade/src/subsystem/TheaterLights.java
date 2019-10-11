package subsystem;

public class TheaterLights {

	public TheaterLights() {

	}

	public void on() {
		System.out.println("Luzes on");
	}

	public void off() {
		System.out.println("Luzes off");
	}

	public void dim(int level) {
		System.out.println("Luzes escurecendo para " + level + "%");
	}
}