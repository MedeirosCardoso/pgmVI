package valueBehavior;;

public class DefinirValorComEdificacao implements ComportamentoDefinirValor {
	public float definirValor() {
		float valor = 0;
		
		int valorEdificacao =  1000;
		switch ('A') {
		case 'A':
			valor =  3000 + valorEdificacao;
			break;
		case 'B':
			valor = 1000 + valorEdificacao;
			break;
		default:
			valor = 500 + valorEdificacao;
			break;
		}
		return valor;
	}
}
