package principal;

import machine.MaquinaDeBolinhas;

public class TestaMaquina {

	public static void main(String[] args) {
		
		MaquinaDeBolinhas maquinaDeBolinhas = new MaquinaDeBolinhas(5);
		System.out.println(maquinaDeBolinhas);
		System.out.println("---------------------");
		
		maquinaDeBolinhas.inserirMoeda();
		maquinaDeBolinhas.virarManivela();
		System.out.println(maquinaDeBolinhas);
		
		System.out.println("---------------------");
		
		maquinaDeBolinhas.inserirMoeda();
		maquinaDeBolinhas.virarManivela();
		maquinaDeBolinhas.inserirMoeda();
		maquinaDeBolinhas.virarManivela();
		maquinaDeBolinhas.inserirMoeda();
		maquinaDeBolinhas.virarManivela();
		maquinaDeBolinhas.inserirMoeda();
		maquinaDeBolinhas.virarManivela();
		System.out.println(maquinaDeBolinhas);
	}

}
