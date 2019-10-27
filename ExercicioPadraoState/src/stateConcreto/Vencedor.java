package stateConcreto;

import machine.MaquinaDeBolinhas;
import stateInterface.Estado;

public class Vencedor implements Estado {

	MaquinaDeBolinhas maquinaDeBolinhas;

	public Vencedor(MaquinaDeBolinhas maquinaDeBolinhas) {
		this.maquinaDeBolinhas = maquinaDeBolinhas;
	}

	@Override
	public void inserirMoeda() {
		System.out.println("Aguarde a maquina entregar a bolinha");
	}

	@Override
	public void ejetarMoeda() {
		System.out.println("A manivela foi acionada");
	}

	@Override
	public void virarManivela() {
		System.out.println("Manivela já foi acionada, a maquina não entregará outra bolinha!");
	}

	@Override
	public void entregar() {
		System.out.println("Vencedor recebera duas bolinhas!");
		maquinaDeBolinhas.liberarBolinha();
		if (maquinaDeBolinhas.getCount() == 0) {
			maquinaDeBolinhas.setEstado(maquinaDeBolinhas.getEsgotado());
		} else {
			maquinaDeBolinhas.liberarBolinha();
			if (maquinaDeBolinhas.getCount() > 0) {
				maquinaDeBolinhas.liberarBolinha();
				maquinaDeBolinhas.setEstado(maquinaDeBolinhas.getSemCredito());
			} else {
				maquinaDeBolinhas.setEstado(maquinaDeBolinhas.getEsgotado());
			}
		}
	}

	@Override
	public String toString() {
		return "Maquina de Bolinhas realizou a entrega de duas bolinhas ao vencedor!";
	}
}
