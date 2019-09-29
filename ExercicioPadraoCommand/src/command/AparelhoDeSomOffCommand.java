package command;

import interfaceCommand.Command;
import receiver.AparelhoDeSom;

public class AparelhoDeSomOffCommand implements Command {

	AparelhoDeSom aparelhoDeSom;

	public AparelhoDeSomOffCommand(AparelhoDeSom aparelhoDeSom) {
		this.aparelhoDeSom = aparelhoDeSom;
	}

	@Override
	public void execute() {
		this.aparelhoDeSom.off();
	}

	@Override
	public void undo() {
		this.aparelhoDeSom.on();
	}

}
