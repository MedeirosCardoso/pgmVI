package concreteCommand;

import interfaceCommand.Command;
import receiver.LuzDaSala;
import receiver.LuzDoQuarto;

public class LuzOnCommand implements Command {
	LuzDaSala luz1;
	LuzDoQuarto luz2;

	public LuzOnCommand(LuzDaSala luz) {
		this.luz1 = luz;
	}

	public LuzOnCommand(LuzDoQuarto luz) {
		this.luz2 = luz;
	}

	@Override
	public void execute() {
		if (luz1 == null) {
			luz2.on();
		} else {
			luz1.on();
		}
	}

}
