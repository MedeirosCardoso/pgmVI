package cliente;

import adaptee.WmaPlay;
import adapter.WmaFormatAdapter;
import target.FormatoAudio;

public class AudioPlay {

	public static void main(String[] args) {

		WmaPlay reproduzirWma = new WmaPlay();

		FormatoAudio wmaAdapter = new WmaFormatAdapter(reproduzirWma);

		wmaAdapter.abrir("audioABC.wma");
		wmaAdapter.reproduzir();
		wmaAdapter.parar();

	}

}
