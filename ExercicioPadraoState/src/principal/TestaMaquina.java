package principal;

import machine.MaquinaDeBolinhas;

public class TestaMaquina {

	public static void main(String[] args) {
		MaquinaDeBolinhas maquinaDeBolinhas = new MaquinaDeBolinhas(1);
		
		maquinaDeBolinhas.inserirMoeda();
		maquinaDeBolinhas.virarManivela();
		
		maquinaDeBolinhas.virarManivela();

	}

}
