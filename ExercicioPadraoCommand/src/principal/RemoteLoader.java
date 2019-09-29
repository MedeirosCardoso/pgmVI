package principal;

import command.AparelhoDeSomOffCommand;
import command.AparelhoDeSomOnComCDCommand;
import command.LuzOffCommand;
import command.LuzOnCommand;
import command.PortaoDeGaragemDownCommand;
import command.PortaoDeGaragemUpCommand;
import command.VentiladorDeTetoHigthCommand;
import command.VentiladorDeTetoOffCommand;
import invoker.RemoteControl;
import receiver.AparelhoDeSom;
import receiver.Luz;
import receiver.PortaoDeGaragem;
import receiver.VentiladorDeTeto;

public class RemoteLoader {

	public static void main(String[] args) {

		RemoteControl remoteControl = new RemoteControl();

		AparelhoDeSom aparelhoDeSom = new AparelhoDeSom();
		Luz luzDaCozinha = new Luz("cozinha");
		Luz luzDaSala = new Luz("sala");
		PortaoDeGaragem portaoDeGaregem = new PortaoDeGaragem();
		VentiladorDeTeto ventiladorDeTeto = new VentiladorDeTeto();

		AparelhoDeSomOnComCDCommand aparelhoDeSomOn = new AparelhoDeSomOnComCDCommand(aparelhoDeSom);
		AparelhoDeSomOffCommand aparelhoDeSomOff = new AparelhoDeSomOffCommand(aparelhoDeSom);

		LuzOnCommand luzOnQuarto = new LuzOnCommand(luzDaCozinha);
		LuzOffCommand luzOffQuarto = new LuzOffCommand(luzDaCozinha);

		LuzOnCommand luzOnSala = new LuzOnCommand(luzDaSala);
		LuzOffCommand luzOffSala = new LuzOffCommand(luzDaSala);

		PortaoDeGaragemUpCommand portaoDeGaragemUp = new PortaoDeGaragemUpCommand(portaoDeGaregem);
		PortaoDeGaragemDownCommand portaoDeGaragemDown = new PortaoDeGaragemDownCommand(portaoDeGaregem);

		VentiladorDeTetoHigthCommand ventiladorOn = new VentiladorDeTetoHigthCommand(ventiladorDeTeto);
		VentiladorDeTetoOffCommand ventiladorOff = new VentiladorDeTetoOffCommand(ventiladorDeTeto);

		remoteControl.setCommand(0, luzOnQuarto, luzOffQuarto);
		remoteControl.setCommand(1, luzOnSala, luzOffSala);
		remoteControl.setCommand(2, ventiladorOn, ventiladorOff);
		remoteControl.setCommand(3, portaoDeGaragemUp, portaoDeGaragemDown);
		remoteControl.setCommand(4, aparelhoDeSomOn, aparelhoDeSomOff);

		System.out.println(remoteControl.toString());

		remoteControl.onButtonWasPushed(0);
		remoteControl.offButtonWasPushed(0);
		remoteControl.onButtonWasPushed(1);
		remoteControl.offButtonWasPushed(1);
		remoteControl.onButtonWasPushed(2);
		remoteControl.offButtonWasPushed(2);
		remoteControl.onButtonWasPushed(4);
		remoteControl.offButtonWasPushed(4);
		remoteControl.onButtonWasPushed(3);
		remoteControl.offButtonWasPushed(3);
		
		remoteControl.undoButtonsWasPushed();
	}

}
