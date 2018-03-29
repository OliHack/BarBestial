package packModelo;

public class JugadorFactory {

	private static JugadorFactory miJugadorFactory;

	private JugadorFactory() {
	}

	public static JugadorFactory getJugadorFactory() {
		if (miJugadorFactory==null) {
			miJugadorFactory= new JugadorFactory();
		}
		return miJugadorFactory;
	}

	/**
	 * Crea un jugador segun  el nombre y el color
	 * 
	 * @param pNombre
	 * @param pColor
	 */
	public Jugador crearJugador(String pNombre, EnumColor pColor) {
		return new Jugador(pNombre,pColor);
	}

}