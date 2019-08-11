package client;

import flyBehavior.VoarNao;
import quackBehavior.Mudo;

public class RedheadPato extends Pato{
	public RedheadPato() {
		setComportamentoVoar(new VoarNao());
		setComportamentoQuack(new Mudo());
	}
}
