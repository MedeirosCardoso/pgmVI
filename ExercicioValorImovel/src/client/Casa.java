package client;

import valueBehavior.DefinirValorComEdificacao;

public class Casa extends Imovel {

	public Casa(char localizacao, float espaco, int comodos) {
		super(localizacao, espaco, comodos);
		setValorImovel(new DefinirValorComEdificacao());
	}
}
