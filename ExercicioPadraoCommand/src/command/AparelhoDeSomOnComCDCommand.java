package command;

import interfaceCommand.Command;
import receiver.AparelhoDeSom;

public class AparelhoDeSomOnComCDCommand implements Command {

	AparelhoDeSom aparelhoDeSom;

	public AparelhoDeSomOnComCDCommand(AparelhoDeSom aparelhoDeSom) {
		this.aparelhoDeSom = aparelhoDeSom;
	}

	@Override
	public void execute() {
		this.aparelhoDeSom.on();
		this.aparelhoDeSom.setCD();
		this.aparelhoDeSom.setVolume(11);
	}

	@Override
	public void undo() {
		this.aparelhoDeSom.off();
	}

}
