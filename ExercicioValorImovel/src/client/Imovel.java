package client;

import valueBehavior.ComportamentoDefinirValor;

public abstract class Imovel {
	private int comodos;
	private float espaco;
	private char localizacao;
	private ComportamentoDefinirValor valorImovel;

	public Imovel(char localizacao, float espaco, int comodos) {
		this.comodos = comodos;
		this.espaco = espaco;
		this.localizacao = localizacao;
	}

	public int getComodos() {
		return comodos;
	}

	public void setComodos(int comodos) {
		this.comodos = comodos;
	}

	public float getEspaco() {
		return espaco;
	}

	public void setEspaco(float espaco) {
		this.espaco = espaco;
	}

	public char getLocalizacao() {
		return localizacao;
	}

	public void setLocalizacao(char localizacao) {
		this.localizacao = localizacao;
	}

	public ComportamentoDefinirValor getValorImovel() {
		return valorImovel;
	}

	public void setValorImovel(ComportamentoDefinirValor valorImovel) {
		this.valorImovel = valorImovel;
	}
	
	public void informarValorImovel() {
		System.out.println(getValorImovel().definirValor());
	}
}
