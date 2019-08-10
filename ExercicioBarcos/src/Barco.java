
public abstract class Barco {
	protected ComportamentoPropulsao propulsao;
	
	
	public void imprimirPropulsao() {
		propulsao.informarPropulsao();
	}
	
	public void trocarPropulsao(ComportamentoPropulsao p) {
		propulsao = p;
	}

}
