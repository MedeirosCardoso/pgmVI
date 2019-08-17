package valueBehavior;

import client.Imovel;

public class DefinirValorSemEdificacao implements ComportamentoDefinirValor {

	public float definirValor(Imovel imovel) {
		float valor = 0;

		switch (imovel.getLocalizacao()) {
		case 'A':
			valor = 1500 * imovel.getEspaco();
			break;
		case 'B':
			valor = 750 * imovel.getEspaco();
			break;
		default:
			valor = 200 * imovel.getEspaco();
			break;
		}
		return valor;
	}
}
