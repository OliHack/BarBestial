package packModelo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ListaJugador {

	private static ListaJugador miListaJugador;
	private final Collection<Jugador> miLista;

	private ListaJugador() {
		miLista = new ArrayList<Jugador>();
	}

	public int manoSize(EnumColor pColor) {
		return getJugador(pColor).manoSize();
	}

	public String getImgPath(EnumColor pColor, int pos) {
		return getJugador(pColor).getImgPath(pos);
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
			if (!lista.next().comprobarCartas()) {
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

	public void robarMazo(EnumColor pColor) {
		getJugador(pColor).robarMazo();
	}

	public boolean echarCarta(EnumColor pColor, int pos) {
		return getJugador(pColor).echarCarta(pos);
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
				enc = true;
			}
		}
		return nuevo;
	}

	public int getNumJug() {
		return miLista.size();
	}

	public static ListaJugador getListaJugador() {
		if (ListaJugador.miListaJugador == null) {
			ListaJugador.miListaJugador = new ListaJugador();
		}
		return ListaJugador.miListaJugador;
	}

}