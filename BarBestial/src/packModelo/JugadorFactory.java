package packModelo;

public class JugadorFactory {

	private static JugadorFactory miJugadorFactory;

	private JugadorFactory() {
	}

	/**
	 * Crea un jugador segun el nombre y el color
	 *
	 * @param pNombre
	 * @param pColor
	 */
	public Jugador crearJugador(String pNombre, EnumColor pColor) {
		Jugador player = null;
		player = new IA(pColor);
		switch (pColor) {
		case ROJO:
			player = new Jugador(pNombre, pColor);
			break;
		case AMARILLO:
			player = new IA(pColor);
			break;
		case AZUL:
			player = new IA(pColor);
			break;
		case VERDE:
			player = new IA(pColor);
			break;
		default:
			break;
		}
		return player;
	}

	public static JugadorFactory getJugadorFactory() {
		if (JugadorFactory.miJugadorFactory == null) {
			JugadorFactory.miJugadorFactory = new JugadorFactory();
		}
		return JugadorFactory.miJugadorFactory;
	}

}