package packModelo;

import java.util.Collection;
import java.util.Iterator;

public class ListaJugador {

	private Collection<Jugador> ListaJugador;
	private static ListaJugador miListaJugador;

	private ListaJugador() {
	}

	/**
	 * 
	 * @param pJugador
	 */
	public void add(Jugador pJugador) {
		ListaJugador.add(pJugador);
	}

	/**
	 * 
	 * @param pJugador
	 */
	public void del(Jugador pJugador) {
		// TODO - implement ListaJugador.del
		throw new UnsupportedOperationException();
	}

	/**
	 * nos dice si hay un jugador con ese color en la lista
	 * @param pColor
	 */
	public boolean comprobarColor(String pColor) {
		// TODO - implement ListaJugador.comprobarColor
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param pCant
	 */
	public void inicializar(int pCant) {
		// TODO - implement ListaJugador.inicializar
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param pCol
	 */
	public Jugador getJugador(EnumColor pCol) {
		// TODO - implement ListaJugador.getJugador
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param pNombre
	 * @param pPunt
	 */
	public void actualizarPuntuacionJugador(String pNombre, int pPunt) {
		// TODO - implement ListaJugador.actualizarPuntuacionJugador
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param pNombre
	 */
	public boolean comprobarJugador(String pNombre) {
		// TODO - implement ListaJugador.comprobarJugador
		throw new UnsupportedOperationException();
	}

	public static ListaJugador getListaJugador() {
		if (miListaJugador==null) {
			miListaJugador = new ListaJugador();
		}
		return miListaJugador;
	}

	public Iterator<Jugador> getIterator() {
		return ListaJugador.iterator();
	}

}