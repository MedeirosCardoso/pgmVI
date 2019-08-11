package valueBehavior;

public class DefinirValorSemEdificacao implements ComportamentoDefinirValor {

	public float definirValor() {
		float valor = 0;
		switch ('B') {
		case 'A':
			valor = 1500;
			break;
		case 'B':
			valor = 750;
			break;
		default:
			valor = 200;
			break;
		}
		return valor;
	}
}
