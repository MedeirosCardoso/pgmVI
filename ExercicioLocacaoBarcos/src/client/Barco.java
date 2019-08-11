package client;

import propulsionBehavior.ComportamentoPropulsao;

public abstract class Barco {
	private ComportamentoPropulsao propulsao;

	public ComportamentoPropulsao getPropulsao() {
		return propulsao;
	}

	public void setPropulsao(ComportamentoPropulsao propulsao) {
		this.propulsao = propulsao;
	}

	public void imprimirPropulsao() {
		getPropulsao().informarPropulsao();
	}

	public void imprimirEmbarcacao() {
		System.out.println(getClass().getSimpleName());
	}
}
