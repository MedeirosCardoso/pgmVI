package client;

import flyBehavior.ComportamentoVoar;
import quackBehavior.ComportamentoQuack;

public abstract class Pato {
	private ComportamentoVoar comportamentoVoar;
	private ComportamentoQuack comportamentoQuack;

	public ComportamentoVoar getComportamentoVoar() {
		return comportamentoVoar;
	}

	public void setComportamentoVoar(ComportamentoVoar comportamentoVoar) {
		this.comportamentoVoar = comportamentoVoar;
	}

	public ComportamentoQuack getComportamentoQuack() {
		return comportamentoQuack;
	}

	public void setComportamentoQuack(ComportamentoQuack comportamentoQuack) {
		this.comportamentoQuack = comportamentoQuack;
	}

	public void nadar() {
		
	}

	public void exibir() {
		System.out.println(getClass().getSimpleName());
	}

	public void realizarQuack() {
		getComportamentoQuack().quack();
	}

	public void realizarVoo() {
		getComportamentoVoar().voar();
	}
}
