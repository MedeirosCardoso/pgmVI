package stateConcreto;

import machine.MaquinaDeBolinhas;
import stateInterface.Estado;

public class Esgotado implements Estado {

	MaquinaDeBolinhas maquinaDeBolinhas;

	public Esgotado(MaquinaDeBolinhas maquinaDeBolinhas) {
		this.maquinaDeBolinhas = maquinaDeBolinhas;
	}

	@Override
	public void inserirMoeda() {
		System.out.println("A maquina está vazia");
	}

	@Override
	public void ejetarMoeda() {
		System.out.println("A Moeda não foi inserida");
	}

	@Override
	public void virarManivela() {
		System.out.println("A manivela foi acionada, mas a maquina está vazia!");
	}

	@Override
	public void entregar() {
		System.out.println("Bolinha não entregue");
	}

	@Override
	public String toString() {
		return "Maquina de bolinhas sem bolinhas";
	}

}
