package cliente;

import facade.HomeTheaterFacade;
import subsystem.Amplifier;
import subsystem.CdPlayer;
import subsystem.DvdPlayer;
import subsystem.PopcornPopper;
import subsystem.Projector;
import subsystem.Screen;
import subsystem.TheaterLights;
import subsystem.Tuner;

public class HomeTheaterTestDrive {

	public static void main(String[] args) {

		Amplifier amp = new Amplifier();
		CdPlayer cd = new CdPlayer();
		DvdPlayer dvd = new DvdPlayer();
		Tuner tuner = new Tuner();
		Projector projetor = new Projector();
		TheaterLights luzes = new TheaterLights();
		Screen tela = new Screen();
		PopcornPopper pipoqueira = new PopcornPopper();

		HomeTheaterFacade facade = new HomeTheaterFacade(amp, cd, dvd, tuner, pipoqueira, projetor, tela, luzes);
		facade.watchMovie("O Jogo da Imitação");
		facade.endMovie();
		
		System.out.println("\nSequência listenToCd / endCD\n");
		facade.listenToCd("Top Hits 2019");
		facade.endCd();
		
		System.out.println("\nSequência listenToRadio / endRadio\n");
		facade.listenToRadio(102.7f);
		facade.endRadio();
	}

}
