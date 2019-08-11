package client;

import propulsionBehavior.PropulsaoRemo;

public class Jangada extends Barco{
	public Jangada() {
		setPropulsao(new PropulsaoRemo());
	}
}
