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
		
	}

	public void endMovie() {
		System.out.println("Desligar o cinema...");
	}

	public void listenToCd() {

	}

	public void endCd() {

	}

	public void listenToRadio() {

	}

	public void endRadio() {

	}
}
