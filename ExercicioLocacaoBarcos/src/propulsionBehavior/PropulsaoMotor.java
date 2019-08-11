package propulsionBehavior;

public class PropulsaoMotor implements ComportamentoPropulsao {

	@Override
	public void informarPropulsao() {
		System.out.println("Movido a motor!");
	}
}
