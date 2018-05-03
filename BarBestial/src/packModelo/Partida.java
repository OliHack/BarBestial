package packModelo;

public class Partida {

	private static Partida miPartida;
	private EnumColor turnoColor;

	public EnumColor getTurnoColor() {
		return turnoColor;
	}

	private Partida() {
	}

	public void cambiarTurno() {
		switch (turnoColor) {
		case ROJO:
			turnoColor = EnumColor.AMARILLO;
			break;
		case AZUL:
			turnoColor = EnumColor.VERDE;
			break;
		case VERDE:
			turnoColor = EnumColor.ROJO;
			break;
		case AMARILLO:
			turnoColor = EnumColor.AZUL;
			break;
		default:
			break;
		}

	}

	/**
	 * Inicializa la partida dada una lista de nombres para los jugadores
	 *
	 * @param pNombres
	 *            lista de nombres de los jugadores
	 */
	public void inicializarPartida(String[] pNombres) {
		CartasEnJuego.getCartasEnJuego().inicializar();
		ListaJugador.getListaJugador()
				.add(JugadorFactory.getJugadorFactory().crearJugador(pNombres[0], EnumColor.AZUL));

		ListaJugador.getListaJugador()
				.add(JugadorFactory.getJugadorFactory().crearJugador(pNombres[1], EnumColor.VERDE));
		ListaJugador.getListaJugador()
				.add(JugadorFactory.getJugadorFactory().crearJugador(pNombres[2], EnumColor.ROJO));
		ListaJugador.getListaJugador()
				.add(JugadorFactory.getJugadorFactory().crearJugador(pNombres[3], EnumColor.AMARILLO));
		BarBestial.getBarBestial().inicializar();
		Calle.getCalle().inicializar();
		turnoColor = EnumColor.ROJO; // Inicializamos a color rojo
	}

	public static Partida getPartida() {
		if (Partida.miPartida == null) {
			Partida.miPartida = new Partida();
		}
		return Partida.miPartida;
	}

}