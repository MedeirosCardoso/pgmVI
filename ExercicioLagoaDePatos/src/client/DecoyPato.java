package client;

import flyBehavior.VoarNao;
import quackBehavior.Quack;

public class DecoyPato extends Pato{
	public DecoyPato() {
		setComportamentoVoar(new VoarNao());
		setComportamentoQuack(new Quack());
	}
}
