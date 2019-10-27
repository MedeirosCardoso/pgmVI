package machine;

import stateConcreto.ComCredito;
import stateConcreto.Esgotado;
import stateConcreto.SemCredito;
import stateConcreto.Vencedor;
import stateConcreto.Vendido;
import stateInterface.Estado;

public class MaquinaDeBolinhas {

	Estado semCredito;
	Estado comCredito;
	Estado esgotado;
	Estado vendido;
	Estado vencedor;

	Estado estado;
	int count = 0;

	public MaquinaDeBolinhas(int numeroBolinhas) {
		this.semCredito = new SemCredito(this);
		this.comCredito = new ComCredito(this);
		this.vendido = new Vendido(this);
		this.esgotado = new Esgotado(this);
		this.vencedor = new Vencedor(this);

		this.count = numeroBolinhas;
		if (numeroBolinhas > 0) {
			this.estado = this.semCredito;
		} else {
			this.estado = this.comCredito;
		}
	}

	public void inserirMoeda() {
		estado.inserirMoeda();

	}

	public void ejetarMoeda() {
		estado.ejetarMoeda();

	}

	public void virarManivela() {
		estado.virarManivela();
		estado.entregar();
	}

	public void liberarBolinha() {
		System.out.println("Bolinha liberada");
		if (count != 0) {
			count -= 1;
		}
	}

	public Estado getSemCredito() {
		return semCredito;
	}

	public void setSemCredito(Estado semCredito) {
		this.semCredito = semCredito;
	}

	public Estado getComCredito() {
		return comCredito;
	}

	public void setComCredito(Estado comCredito) {
		this.comCredito = comCredito;
	}

	public Estado getEsgotado() {
		return esgotado;
	}

	public void setEsgotado(Estado esgotado) {
		this.esgotado = esgotado;
	}

	public Estado getVendido() {
		return vendido;
	}

	public void setVendido(Estado vendido) {
		this.vendido = vendido;
	}

	public Estado getVencedor() {
		return vencedor;
	}

	public void setVencedor(Estado vencedor) {
		this.vencedor = vencedor;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	@Override
	public String toString() {
		String estoque = "Estoque de bolinhas: " + getCount() + " bolinhas";
		String maq = "Maquina de Bolinhas modelo #2004 \n";
		if (getCount() == 1) {
			maq += estoque.substring(0, estoque.length() - 1);
		}else {
			maq += estoque.substring(0, estoque.length());
		}

		return getEstado() + "\n" + maq;
	}

}
