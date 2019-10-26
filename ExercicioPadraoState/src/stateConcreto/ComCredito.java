package stateConcreto;

import machine.MaquinaDeBolinhas;
import stateInterface.Estado;

public class ComCredito implements Estado {

	MaquinaDeBolinhas maquinaDeBolinhas;

	public ComCredito(MaquinaDeBolinhas maquinaDeBolinhas) {
		this.maquinaDeBolinhas = maquinaDeBolinhas;
	}

	@Override
	public void inserirMoeda() {
		System.out.println("Moeda já foi inserida!");

	}

	@Override
	public void ejetarMoeda() {
		System.out.println("Moeda devolvida");
		maquinaDeBolinhas.setEstado(maquinaDeBolinhas.getSemCredito());

	}

	@Override
	public void virarManivela() {
		System.out.println("A manivela foi acionada");
		maquinaDeBolinhas.setEstado(maquinaDeBolinhas.getVendido());

	}

	@Override
	public void entregar() {
		System.out.println("Bolinha não entregue");
	}

	@Override
	public String toString() {
		return "Maquina de bolinhas com moeda inserida";
	}

}
