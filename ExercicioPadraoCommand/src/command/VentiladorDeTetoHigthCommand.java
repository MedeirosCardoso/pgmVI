package command;

import interfaceCommand.Command;
import receiver.VentiladorDeTeto;

public class VentiladorDeTetoHigthCommand implements Command {

	VentiladorDeTeto ventiladorDeTeto;

	public VentiladorDeTetoHigthCommand(VentiladorDeTeto ventiladorDeTeto) {
		this.ventiladorDeTeto = ventiladorDeTeto;
	}

	@Override
	public void execute() {
		this.ventiladorDeTeto.higthSpeed();
	}

	@Override
	public void undo() {
		this.ventiladorDeTeto.off();
	}

}
