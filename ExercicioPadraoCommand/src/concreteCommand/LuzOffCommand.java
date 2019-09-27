package concreteCommand;

import interfaceCommand.Command;
import receiver.LuzDaSala;
import receiver.LuzDoQuarto;

public class LuzOffCommand implements Command {
	LuzDaSala luz1;
	LuzDoQuarto luz2;

	public LuzOffCommand(LuzDaSala luz) {
		this.luz1 = luz;
	}

	public LuzOffCommand(LuzDoQuarto luz) {
		this.luz2 = luz;
	}

	@Override
	public void execute() {
		if (luz1 == null) {
			luz2.off();
		} else {
			luz1.off();
		}
	}

}
