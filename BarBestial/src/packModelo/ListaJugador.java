package packModelo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ListaJugador {

	private static ListaJugador			miListaJugador;
	private final Collection<Jugador>	miLista;

	private ListaJugador() {
		miLista = new ArrayList<Jugador>();
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
	 * @param pJugador
	 */
	public void add(Jugador pJugador) {
		miLista.add(pJugador);
	}

	public boolean comprobarCartas() {
		boolean comprueba = false;
		Iterator<Jugador> lista = this.miLista.iterator();
		while (lista.hasNext()) {
			if (lista.next().comprobarCartas() == false) {
				comprueba = false;
				break;
			} else {
				comprueba = true;
			}
		}
		if (comprueba) {
			System.out.println(" Todos los jugadores se han quedado sin cartas. Fin del juego.");
		}
		return comprueba;
	}

	/**
	 * nos dice si hay un jugador con ese color en la lista
	 *
	 * @param pColor
	 */
	public boolean comprobarColor(String pColor) {
		// TODO - implement ListaJugador.comprobarColor
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

	/**
	 *
	 * @param pJugador
	 */
	public void del(Jugador pJugador) {
		// TODO - implement ListaJugador.del
		throw new UnsupportedOperationException();
	}

	public Iterator<Jugador> getIterator() {
		return miLista.iterator();
	}

	/**
	 *
	 * @param pCol
	 */
	public Jugador getJugador(EnumColor pCol) {
		Jugador nuevo = null;
		boolean enc = false;
		Iterator<Jugador> lista = miLista.iterator();
		while (lista.hasNext() && !enc) {
			nuevo = lista.next();
			if (nuevo.getColor() == pCol) {
				enc=true;
			}
		}
		return nuevo;
	}
	
	public int getNumJug() {
		return miLista.size();
	}

	/**
	 *
	 * @param pCant
	 */
	public void inicializar(int pCant) {
		// TODO - implement ListaJugador.inicializar

		
		throw new UnsupportedOperationException();
	}

	public static ListaJugador getListaJugador() {
		if (ListaJugador.miListaJugador == null) {
			ListaJugador.miListaJugador = new ListaJugador();
		}
		return ListaJugador.miListaJugador;
	}

}