import java.util.ArrayList;

public class ExercicioBarcos {

	public static void main(String[] args) {
		
		ArrayList<Barco> barcos = new ArrayList<Barco>();
		barcos.add(new Bateira());
		barcos.add(new Jangada());
		
		for(Barco b: barcos) {
			b.imprimirPropulsao();
		}
		
		System.out.println("---------------------------------");
		
		barcos.get(0).trocarPropulsao(new PropulsaoRemo());

		for(Barco b: barcos) {
			b.imprimirPropulsao();
		}
		
		
	}

}
