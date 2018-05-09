package packModelo;

import java.util.Random;

public class Ia extends Jugador {
	private final Random rand;

	public Ia(EnumColor pColor) {
		super("IA" + pColor.toString(), pColor);
		rand = new Random();
	}

	@Override
	public boolean echarCarta(int pCual) {
		return super.echarCarta(pCual);
	}
}
