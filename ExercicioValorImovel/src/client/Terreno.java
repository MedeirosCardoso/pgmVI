package client;

import valueBehavior.DefinirValorSemEdificacao;

public class Terreno extends Imovel {

	public Terreno(char localizacao, float espaco) {
		setLocalizacao(localizacao);
		setEspaco(espaco);
		setValorImovel(new DefinirValorSemEdificacao());
	}

}
