package adapter;

import adaptee.WmaFormat;
import target.FormatoAudio;

public class WmaFormatAdapter implements FormatoAudio {

	WmaFormat wmaFormat;

	public WmaFormatAdapter(WmaFormat wmaFormat) {
		this.wmaFormat = wmaFormat;
	}

	@Override
	public void abrir(String arquivo) {
		wmaFormat.setFile(arquivo);
		wmaFormat.open();
	}

	@Override
	public void reproduzir() {
		wmaFormat.setLocation(0);
		wmaFormat.play();
	}

	@Override
	public void parar() {
		wmaFormat.stop();
		wmaFormat.setFile(null);
	}

}
