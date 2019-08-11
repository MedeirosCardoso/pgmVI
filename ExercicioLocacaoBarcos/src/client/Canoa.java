package client;

import propulsionBehavior.PropulsaoRemo;

public class Canoa extends Barco{
	public Canoa() {
		setPropulsao(new PropulsaoRemo());
	}
}
