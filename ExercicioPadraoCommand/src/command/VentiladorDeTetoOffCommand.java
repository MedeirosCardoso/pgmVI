package command;

import interfaceCommand.Command;
import receiver.VentiladorDeTeto;

public class VentiladorDeTetoOffCommand implements Command {

	VentiladorDeTeto ventiladorDeTeto;

	public VentiladorDeTetoOffCommand(VentiladorDeTeto ventiladorDeTeto) {
		this.ventiladorDeTeto = ventiladorDeTeto;
	}

	@Override
	public void execute() {
		this.ventiladorDeTeto.off();
	}

	@Override
	public void undo() {
		this.ventiladorDeTeto.higthSpeed();
	}

}
