package stateConcreto;

import machine.MaquinaDeBolinhas;
import stateInterface.Estado;

public class SemCredito implements Estado {

	MaquinaDeBolinhas maquinaDeBolinhas;

	public SemCredito(MaquinaDeBolinhas maquinaDeBolinhas) {
		this.maquinaDeBolinhas = maquinaDeBolinhas;
	}

	@Override
	public void inserirMoeda() {
		System.out.println("Moeda inserida");
		maquinaDeBolinhas.setEstado(maquinaDeBolinhas.getComCredito());
	}

	@Override
	public void ejetarMoeda() {
		System.out.println("A Moeda não foi inserida");
	}

	@Override
	public void virarManivela() {
		System.out.println("A manivela foi acionada, mas não foi inserida a moeda");
	}

	@Override
	public void entregar() {
		System.out.println("A manivela foi acionada, mas não foi inserida a moeda");

	}

	@Override
	public String toString() {
		return "Maquina de bolinhas aguardando moeda";
	}

}
