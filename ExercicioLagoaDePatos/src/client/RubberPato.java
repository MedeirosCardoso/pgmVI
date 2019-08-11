package client;

import flyBehavior.VoarComAsas;
import quackBehavior.Rangido;

public class RubberPato extends Pato{
	public RubberPato() {
		setComportamentoVoar(new VoarComAsas());
		setComportamentoQuack(new Rangido());
	}
}
