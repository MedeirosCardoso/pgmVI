package client;

import propulsionBehavior.PropulsaoVela;

public class BarcoAvela extends Barco{
	public BarcoAvela() {
		setPropulsao(new PropulsaoVela());
	}
}
