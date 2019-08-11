package client;

import valueBehavior.DefinirValorSemEdificacao;

public class Terreno extends Imovel {

	public Terreno(char localizacao, float espaco, int comodos) {
		super(localizacao, espaco, comodos);
		setValorImovel(new DefinirValorSemEdificacao());
	}

}
