package client;

import valueBehavior.DefinirValorComEdificacao;

public class Apartamento extends Imovel {

	public Apartamento(char localizacao, float espaco, int comodos) {
		super(localizacao, espaco, comodos);
		setValorImovel(new DefinirValorComEdificacao());
	}

}
