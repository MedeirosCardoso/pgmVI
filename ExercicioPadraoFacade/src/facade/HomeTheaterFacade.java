package facade;

import subsystem.Amplifier;
import subsystem.CdPlayer;
import subsystem.DvdPlayer;
import subsystem.PopcornPopper;
import subsystem.Projector;
import subsystem.Screen;
import subsystem.TheaterLights;
import subsystem.Tuner;

public class HomeTheaterFacade {

	Amplifier amplifier;
	CdPlayer cdPlayer;
	DvdPlayer dvdPlayer;
	Tuner tuner;
	PopcornPopper popcornPopper;
	Projector projector;
	Screen screen;
	TheaterLights theaterLights;

	public HomeTheaterFacade(Amplifier amplifier, CdPlayer cdPlayer, DvdPlayer dvdPlayer, Tuner tuner,
			PopcornPopper popcornPopper, Projector projector, Screen screen, TheaterLights theaterLights) {
		this.amplifier = amplifier;
		this.cdPlayer = cdPlayer;
		this.dvdPlayer = dvdPlayer;
		this.tuner = tuner;
		this.popcornPopper = popcornPopper;
		this.projector = projector;
		this.screen = screen;
		this.theaterLights = theaterLights;
	}

	public void watchMovie(String filme) {
		System.out.println("Prepare-se para assistir a um filme...");
		this.popcornPopper.on();
		this.popcornPopper.pop();
		this.theaterLights.dim(10);
		this.screen.up();
		this.projector.on();
		this.projector.wideScreenMode();
		this.amplifier.on();
		this.amplifier.setDvd(dvdPlayer);
		this.amplifier.setSurroundSound();
		this.amplifier.setVolume(5);
		this.dvdPlayer.on();
		this.dvdPlayer.play(filme);

	}

	public void endMovie() {
		System.out.println("Desligar o cinema...");
		this.popcornPopper.off();
		this.theaterLights.on();
		this.screen.down();
		this.projector.off();
		this.amplifier.off();
		this.dvdPlayer.stop();
		this.dvdPlayer.eject();
		this.dvdPlayer.off();
	}

	public void listenToCd(String cd) {
		System.out.println("Prepare-se para ouvir uma música...");
		this.amplifier.on();
		this.amplifier.setCd(cdPlayer);
		this.amplifier.setSurroundSound();
		this.amplifier.setVolume(10);
		this.cdPlayer.on();
		this.cdPlayer.play(cd);
	}

	public void endCd() {
		System.out.println("Desligar CD player...");
		this.amplifier.off();
		this.cdPlayer.stop();
		this.cdPlayer.off();
	}

	public void listenToRadio(float estacao) {
		System.out.println("Prepare-se para ouvir o rádio...");
		this.amplifier.on();
		this.amplifier.setTuner(tuner);
		this.amplifier.setSurroundSound();
		this.amplifier.setVolume(10);
		this.tuner.on();
		this.tuner.setFm();
		this.tuner.setFrequency(estacao);
	}

	public void endRadio() {
		System.out.println("Desligar rádio...");
		this.amplifier.off();
		this.tuner.off();
	}
}
