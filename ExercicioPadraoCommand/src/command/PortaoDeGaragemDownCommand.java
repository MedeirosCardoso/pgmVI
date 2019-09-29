package command;

import interfaceCommand.Command;
import receiver.PortaoDeGaragem;

public class PortaoDeGaragemDownCommand implements Command {

	PortaoDeGaragem portaoDeGaragem;

	public PortaoDeGaragemDownCommand(PortaoDeGaragem portaoDeGaragem) {
		this.portaoDeGaragem = portaoDeGaragem;
	}

	@Override
	public void execute() {
		this.portaoDeGaragem.down();
	}

	@Override
	public void undo() {
		this.portaoDeGaragem.up();
	}

}
