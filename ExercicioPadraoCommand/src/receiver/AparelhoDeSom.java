package receiver;

public class AparelhoDeSom {
	public void on() {
		System.out.println("O aparelho de som está ligado");
	}

	public void off() {
		System.out.println("O aparelho de som está desligado");
	}

	public void setCD() {
		System.out.println("O aparelho de som está configurado para entrada de CD");
	}

	public void setDVD() {
		System.out.println("O aparelho de som está configurado para entrada de DVD");
	}

	public void setRadio() {
		System.out.println("O aparelho de som está configurado para Radio");
	}

	public void setVolume(int vol) {
		System.out.println("Volume do aparelho de som está definido como " + vol);
	}
}
