package stateConcreto;

import machine.MaquinaDeBolinhas;
import stateInterface.Estado;

public class Vendido implements Estado {

	MaquinaDeBolinhas maquinaDeBolinhas;

	public Vendido(MaquinaDeBolinhas maquinaDeBolinhas) {
		this.maquinaDeBolinhas = maquinaDeBolinhas;
	}

	@Override
	public void inserirMoeda() {
		System.out.println("Aguarde a maquina entregar a bolinha...");
	}

	@Override
	public void ejetarMoeda() {
		System.out.println("Não é possivel ejetar a moeda, a manivela foi acionada!");
	}

	@Override
	public void virarManivela() {
		System.out.println("Manivela já foi acionada, a maquina não entregará outra bolinha!");
	}

	@Override
	public void entregar() {
		System.out.println("Uma bolinha entregue");
		maquinaDeBolinhas.liberarBolinha();
		if (maquinaDeBolinhas.getCount() > 0) {
			maquinaDeBolinhas.setEstado(maquinaDeBolinhas.getSemCredito());
		} else {
			System.out.println("Maquina está sem bolinhas!");
			maquinaDeBolinhas.setEstado(maquinaDeBolinhas.getEsgotado());
		}

	}
	
	@Override
	public String toString() {
		return "Maquina de Bolinhas realizou a entrega de uma bolinha";
	}

}
