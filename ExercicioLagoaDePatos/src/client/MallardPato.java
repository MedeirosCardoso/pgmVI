package client;

import flyBehavior.VoarComAsas;
import quackBehavior.Quack;

public class MallardPato extends Pato {
	public MallardPato() {
		setComportamentoVoar(new VoarComAsas());
		setComportamentoQuack(new Quack());
	}
}
