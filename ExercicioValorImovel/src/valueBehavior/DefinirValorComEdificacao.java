package valueBehavior;

import client.Imovel;

public class DefinirValorComEdificacao implements ComportamentoDefinirValor {
	public float definirValor(Imovel imovel) {
		float valor = 0;
		int valorEdificacao = 1000 * imovel.getComodos();

		switch (imovel.getLocalizacao()) {
		case 'A':
			valor = (3000 * imovel.getEspaco()) + valorEdificacao;
			break;
		case 'B':
			valor = (1000 * imovel.getEspaco()) + valorEdificacao;
			break;
		default:
			valor = (500 * imovel.getEspaco()) + valorEdificacao;
			break;
		}
		return valor;
	}
}
