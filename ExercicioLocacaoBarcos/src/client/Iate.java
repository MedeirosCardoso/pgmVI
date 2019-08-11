package client;

import propulsionBehavior.PropulsaoMotor;

public class Iate extends Barco{
	public Iate() {
		setPropulsao(new PropulsaoMotor());
	}
}
