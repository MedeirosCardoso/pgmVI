package adaptee;

public class WmaPlay implements WmaFormat {

	protected String arquivo;
	protected int posicao;

	public void setFile(String arquivo) {
		this.arquivo = arquivo;
	}

	public void open() {
		System.out.println("Arquivo " + this.arquivo + " aberto!");
	}

	public void setLocation(int posicao) {
		this.posicao = posicao;
	}

	public void play() {
		System.out.println("Iniciado na posição " + this.posicao + " a reprodução do " + this.arquivo);
	}

	public void stop() {
		System.out.println("Parada a reprodução do " + this.arquivo);
	}

	public String getArquivo() {
		return arquivo;
	}
}
