package command;

import interfaceCommand.Command;
import receiver.PortaoDeGaragem;

public class PortaoDeGaragemUpCommand implements Command {

	PortaoDeGaragem portaoDeGaragem;

	public PortaoDeGaragemUpCommand(PortaoDeGaragem portaoDeGaragem) {
		this.portaoDeGaragem = portaoDeGaragem;
	}

	@Override
	public void execute() {
		this.portaoDeGaragem.up();
	}

	@Override
	public void undo() {
		this.portaoDeGaragem.down();
	}

}
