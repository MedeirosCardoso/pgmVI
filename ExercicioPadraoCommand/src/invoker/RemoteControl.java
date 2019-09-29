package invoker;

import command.NoCommand;
import interfaceCommand.Command;

public class RemoteControl {

	Command[] onCommands;
	Command[] offCommands;
	Command undoCommand;

	public RemoteControl() {
		this.onCommands = new Command[7];
		this.offCommands = new Command[7];

		Command noCommand = new NoCommand();

		for (int i = 0; i < offCommands.length; i++) {
			this.onCommands[i] = noCommand;
			this.offCommands[i] = noCommand;
		}

		this.undoCommand = noCommand;
	}

	public void setCommand(int slot, Command onCommand, Command offCommand) {
		this.onCommands[slot] = onCommand;
		this.offCommands[slot] = offCommand;
	}

	public void onButtonWasPushed(int slot) {
		this.onCommands[slot].execute();
		this.undoCommand = this.onCommands[slot];
	}

	public void offButtonWasPushed(int slot) {
		this.offCommands[slot].execute();
		this.undoCommand = this.offCommands[slot];
	}

	public void undoButtonsWasPushed() {
		this.undoCommand.undo();
	}

	@Override
	public String toString() {
		String banner = "\n------ Controle Remoto -------\n";
		String slots = "";
		for (int i = 0; i < onCommands.length; i++) {
			slots += "[slot " + i + "] " + onCommands[i].getClass().getName() + "    "
					+ offCommands[i].getClass().getName() + "\n";
		}

		return banner + slots;
	}
}

