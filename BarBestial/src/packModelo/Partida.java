package packModelo;

public class Partida {

	private static Partida miPartida;
	private EnumColor turnoColor;

	private Partida() {
	}
	
	/**
	 * Inicializa la partida dada una lista de nombres para los jugadores
	 * 
	 * @param pNombres lista de nombres de los jugadores
	 */
	public void inicializarPartida(String[] pNombres) {
		CartasEnJuego.getCartasEnJuego().inicializar();
		ListaJugador.getListaJugador().add(JugadorFactory.getJugadorFactory().crearJugador(pNombres[0],EnumColor.AMARILLO));
		ListaJugador.getListaJugador().add(JugadorFactory.getJugadorFactory().crearJugador(pNombres[1],EnumColor.AZUL));
		ListaJugador.getListaJugador().add(JugadorFactory.getJugadorFactory().crearJugador(pNombres[2],EnumColor.ROJO));
		ListaJugador.getListaJugador().add(JugadorFactory.getJugadorFactory().crearJugador(pNombres[3],EnumColor.VERDE));
		BarBestial.getBarBestial().inicializar();
		Calle.getCalle().inicializar();
	}

	public static Partida getPartida() {
		if (miPartida == null){
			miPartida = new Partida();
		}
		return miPartida;
	}

	public void cambiarTurno() {
		// TODO - implement Partida.cambiarTurno
		throw new UnsupportedOperationException();
	}

	public boolean comprobarCartas() {
		// TODO - implement Partida.comprobarCartas
		throw new UnsupportedOperationException();
	}

	public void revisarCola() {
		// TODO - implement Partida.revisarCola
		throw new UnsupportedOperationException();
	}

}